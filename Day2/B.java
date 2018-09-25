class B extends A{
  static {
    System.out.println("B Static");
  }
  {
    System.out.println("Local B");
  }
  static{
    System.out.println("Second unit static B");
  }
  B(){
    System.out.println("B");
  }
  static void display(){
	  System.out.println("B display");
  }
}
class Test {
	static{
	  System.out.println("Test");	
	  
	}
	public static void main(String n[]) 
	throws Exception{
		Class.forName("A");
	}}