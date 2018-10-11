package com.pilot.annotation;

public @interface Uniqueness {
	Constraints constraints() default @Constraints(unique=true);
}
