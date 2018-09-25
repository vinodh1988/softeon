class A{
	
	public void display(){Common.call("display A");}
	public void display1(){Common.call("display1 A");}
	
}

class B extends A{
	
	public void display(){Common.call("display B");}
	public void display2(){Common.call("display2 B");}
	public void display3(){Common.call("display3 B");}
}

class C extends B{
	public void display3() {Common.call("display3 c");	}
	public void display4() {Common.call("display4 c");    }
}

class Main{
	public static void main(String n[]){
		B obj=new C();
		obj.display();   //Display B
		obj.display1();  // display1 A
		obj.display2();  //display 2 B
		obj.display3(); // display3 c
	}
	
}