package Unit_01;

/*
 * the wrapper class in java provides the mechanism to convert primitive into object and obj
 * why ?
 * Because we want to use predefined methods of those objects
 * - boolean data types ->Boolean obj; -> obj.toString();
 */
public class P4_task02_WrapperClassesInJava {
	 
	public static void main(String[] args) {
		int a=20;
		String s = "" + a + "";
		
		Integer i =Integer.valueOf(a);//converting int into integr into explicitly
		Integer j= a;//autoboxing, now compiler will write Integer.valueof(a) internally
		
	    System.out.println(a + "" +i +"" +j);
	    System.out.println(i.toString());
	    
	    //a.toString can not be done due to a is int not object
	    
	    // Autoboxing: converting primitives into objects
	    
	    byte b=10;
	    Byte byteobj=b;
	    
	    System.out.println(byteobj);
	    
	    //unboxing: Convering Objects to Primitive
	    byte bytevalue= byteobj;
	    System.out.println(bytevalue);
	}
}