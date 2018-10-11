package com.pilot.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableCreator {
	public static void main(String[] args) throws Exception {
		if(args.length < 1) {
			System.out.println("arguments: annotated classes");
			System.exit(0);
		}
		for(String className : args) {
			System.out.println("className:" + Class.forName(className));
			Class<?> cl = Class.forName(className);
			DBTable dbTable = cl.getAnnotation(DBTable.class);
			System.out.println("dbTable:" +dbTable);
			if(dbTable == null){
				System.out.println("No DBTable annotations in class " + className);
				continue;
			}
			String tableName = dbTable.name();
			// If the name is empty, use the Class name:
			if(tableName.length() < 1){
				tableName = cl.getName().toUpperCase();
			}
			List<String> columnDefs = new ArrayList<String>();
			for(Field field : cl.getDeclaredFields()){
				String columnName = null;
				
				/*
				 * 
				 * By default, annotations are not available to reflection. 
				 * In order to do so, you need to change the retention policy, i.e.

					@Retention(RetentionPolicy.RUNTIME)
					public @interface Anno {}    
					The various retention policies can be found in the Javadoc. 
					The default (for mysterious reasons that nobody seems to know) is CLASS
				 */
				Annotation[] anns = field.getDeclaredAnnotations();
				if(anns.length < 1){
					continue; // Not a db table column					
				}
				if(anns[0] instanceof SQLInteger){
					SQLInteger sInt = (SQLInteger) anns[0];
					// Use field name if name not specified
					if(sInt.name().length() < 1){
						columnName = field.getName().toUpperCase();
					}else{
						columnName = sInt.name();
					}
					columnDefs.add(columnName + " INT" + getConstraints(sInt.constraints()));
				}
				if(anns[0] instanceof SQLString){
					SQLString sString = (SQLString) anns[0];
					// Use field name if name not specified.
					if(sString.name().length() < 1){
						columnName = field.getName().toUpperCase();
					}else{
						columnName = sString.name();
					}
					columnDefs.add(columnName + " VARCHAR("+ sString.value() + ")" +
					getConstraints(sString.constraints()));
				}
				StringBuilder createCommand = new StringBuilder("CREATE TABLE " + tableName + "(");
				for(String columnDef : columnDefs){
					createCommand.append("\n     " + columnDef + ",");
				}
				//Remove trailing comma
				String tableCreate = createCommand.substring(0, 
						createCommand.length() - 1) + ");";
				System.out.println("Table Creation SQL for " + className + " is ;\n" + tableCreate);
			}
		}
		System.exit(0);
	}

	private static String getConstraints(Constraints con) {
		String constraints = "";
		if (!con.allowNull()) {
			constraints += " NOT NULL";
		}
		if (con.primaryKey()) {
			constraints += " PRIMARY KEY";
		}
		if (con.unique()) {
			constraints += " UNIQUE";
		}
		return constraints;
	}
}
