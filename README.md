# testpackages  

## JAVAC
javac -d /c/testpackages/classes src/com/shapes/*  

javac <- compiler command  
-d <- flag used to mark destination of compiled class files  


/c/testpackages/classes <- highest folder - for example if classes/ is specified the src package is com.shapes classes/com/shapes will be created and the .class files of that class will be deposited inside of it.  


src/com/shapes/* <- the path to the package of the files to be compiled - asterisk only compiles .java files within /shapes - if there is a subfolder like /shapes/quadrangles it would not compile those.  
  
  
javac -d classes -classpath /c/testpcakages/classes src/com/Driver.java  
  
	same as above - but -classpath flag is required with top-level classes/ directory  
	packages need to be compiled in the order of their dependecies and will pull the information they need from the .class files  
		driver imports  
			com.shapes.Circle;  
			com.shapes.Square;  
			com.words.Word;  

	Driver needs these files/packages to be pre-compiled before it can compile, which is the reason the -	classpath flag is needed.  
## JAVA
java -classpath /c/testpackages/classes com.abc.Driver  

java <- run java program command  
-classpath <- specifies that a specific class will be loaded contained within the following class path  
/c/testpackages/classes <- arg for -classpath flag telling top level location of where subdirectory of target .class file is  
com.driver.Driver <- specific .class to load is contained within:  
		/c/testpackages/classes/com/driver/Driver  
		  
	-classpath /c/testpackages/classes com.driver.Driver
