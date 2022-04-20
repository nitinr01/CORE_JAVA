package unit_01;

/*
 *- There are 50 keywords in java
 *-words with reserved meaning to compiler
 *48 in use, 2 keywords goto* and const* are for future use
 *They do not have meaning defined yet
 */

/*
 * -Keywords cannot be used as identifiers in java
 * -variable name
 * -function name
 * -class
 * -object
 */



//Write a java program to demonstrate the errors occurred when trying to use 
//keywords as identifiers

public class P2_Task01_KeywordsInJava {

	public static void main(String[] args) {
		
		//variable name
		int double =12;  
		//Syntax error on token "double", invalid VariableDeclaratorId
		
		//function name
		int new()
		{
			//sysout[ctrl+space]
			System.out.println("hello world");
			return 0;
		}
		//Syntax error on token "double", invalid VariableDeclaratorId
		
		
		//object name
		ABC class = new ABC();
		//object name can never be any keyword in java

	}

}


//class name
//class name can never be any keyword in java
class int
{
	void display()
	{
		System.out.println("Another class");
	}
}//Syntax error on token "double", invalid VariableDeclaratorId

class ABC
{
	void display()
	{
		System.out.println("Another class");
	}
}package Unit_01;

public class P2_Task01_KeywordsInJava {


	public static void main(String[] args) {
		int double = 12;
		
		//function name
		int new() {
			System.out.println("\nhello world\n");
			 return 0;
		}
		
		//class name[given below]
		
		//object
		//object name can never be any keyword in java
		
		ABC int =new ABC();

	}

}
//class name can never be any keywords in java
class int{
	void display() {
		System.out.println("\nanother class\n");
	}
}

class ABC{
	void display() {
		System.out.println("\nanother class\n");
	}
}	
	
}
