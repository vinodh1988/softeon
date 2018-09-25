class A{
private int a;
  A(){System.out.println("super");}
  A(int a){
    this.a=a;
  }
  public void display(){System.out.println("AAAAAAAAAAAAAAAAA");}
  public void display1(){System.out.println("UUUUUUUUUAAAAAAAAAA");}
  
  
}
class B extends A{
private int b;
  B(int b){
   super(b);
   this.b=b;
  }
  public void display(){System.out.println("BBBBBBBBBBBB");}
  public void display2(){System.out.println("BBBBUUUUUUUU");}
}

class C 
{
public static void main(String n[])
	{ 
		A obj=new B(20);
		obj.display1();
		obj.display();
		//obj.display2();
	}
}