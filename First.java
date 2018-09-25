
class Test{
  public static void main(String w[]){
       String n=new String("Gary");
	   String n1="Gary";
	   String n2="Gary";
	   String n3[]={"Gary","Robert"};
	   
	   System.out.println(w[0].equals(w[1]));
	   System.out.println(w[0].hashCode());
	   System.out.println(w[1].hashCode());
	   
	   System.out.println(w[0]);
	   System.out.println(n2==n3[0]);
	   System.out.println(w[0]==n3[0]);
	   System.out.println(w[0]==n1);
	   System.out.println(n1==n2);
	   System.out.println(n1==n);
	   
	   
  
  }
}
/*
exception runtime
true true true
false true true
false true false
true true false
*/


