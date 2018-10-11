package com.pilot.generic;

//: object/GenericTutorial.java
import java.util.*;

/** The first Thinking in java tutorial examply
 * Displays a string and System out list.
 * @author jojo.zhao
 * @author www.seaSpray.net
 * @version 1.0
 *
 */
public class GenericTutorial {

	public GenericTutorial(){
		
	}
	
	/** Entry point to class & application
	 * 
	 * @param args array of string arguments
	 * @throws exceptions No exceptions thrown
	 */
	public static void main( String [] args ) {
		System.out.println( "Hello World!");
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	} 
}
/* Output:
Hello World!
-- listing properties --
java.runtime.name=Java(TM) SE Runtime Environment
sun.boot.library.path=C:\Program Files\Java\jre1.8.0_91\bin
java.vm.version=25.91-b14
java.vm.vendor=Oracle Corporation
java.vendor.url=http://java.oracle.com/
path.separator=;
java.vm.name=Java HotSpot(TM) 64-Bit Server VM
file.encoding.pkg=sun.io
user.script=
user.country=US
sun.java.launcher=SUN_STANDARD
sun.os.patch.level=Service Pack 1
java.vm.specification.name=Java Virtual Machine Specification
user.dir=C:\work\affiliationWorkspace\Pilot
java.runtime.version=1.8.0_91-b14
java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment
java.endorsed.dirs=C:\Program Files\Java\jre1.8.0_91\lib...
os.arch=amd64
java.io.tmpdir=C:\Users\JOJO~1.ZHA\AppData\Local\Temp\
line.separator=

java.vm.specification.vendor=Oracle Corporation
user.variant=
os.name=Windows 7
sun.jnu.encoding=Cp1252
java.library.path=C:\Program Files\Java\jre1.8.0_91\bin...
java.specification.name=Java Platform API Specification
java.class.version=52.0
sun.management.compiler=HotSpot 64-Bit Tiered Compilers
os.version=6.1
user.home=C:\Users\jojo.zhao
user.timezone=
java.awt.printerjob=sun.awt.windows.WPrinterJob
file.encoding=UTF-8
java.specification.version=1.8
user.name=jojo.zhao
java.class.path=C:\work\affiliationWorkspace\Pilot\bin
java.vm.specification.version=1.8
sun.arch.data.model=64
java.home=C:\Program Files\Java\jre1.8.0_91
sun.java.command=com.pilot.generic.GenericTutorial
java.specification.vendor=Oracle Corporation
user.language=en
awt.toolkit=sun.awt.windows.WToolkit
java.vm.info=mixed mode
java.version=1.8.0_91
java.ext.dirs=C:\Program Files\Java\jre1.8.0_91\lib...
sun.boot.class.path=C:\Program Files\Java\jre1.8.0_91\lib...
java.vendor=Oracle Corporation
file.separator=\
java.vendor.url.bug=http://bugreport.sun.com/bugreport/
sun.cpu.endian=little
sun.io.unicode.encoding=UnicodeLittle
sun.desktop=windows
sun.cpu.isalist=amd64
jojo.zhao
C:\Program Files\Java\jre1.8.0_91\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:/Program Files/Java/jre1.8.0_91/bin/server;C:/Program Files/Java/jre1.8.0_91/bin;C:/Program Files/Java/jre1.8.0_91/lib/amd64;C:\ProgramData\Oracle\Java\javapath;C:\Program Files (x86)\Java\jre1.8.0_73\bin;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Intel\WiFi\bin\;C:\Program Files\Common Files\Intel\WirelessCommon\;C:\Program Files\Lenovo\Fingerprint Manager Pro\;C:\Program Files\Diskeeper Corporation\ExpressCache\;C:\Program Files\TortoiseGit\bin;C:\apps\sonar-runner-dist-2.1\sonar-runner-2.1/bin;C:\Program Files (x86)\Skype\Phone\;C:\Program Files (x86)\Heroku\bin;C:\Program Files\nodejs\;C:\Program Files\nodejs\;C:\Program Files (x86)\Git\bin;C:\Users\jojo.zhao\AppData\Roaming\npm;C:\Eclipse-64xLuna;;.
*////:~
