class A{
  public void show(){System.out.println("A");}
}

class B extends A{
  public void show(){System.out.println("B");}
}

class C{
   A a;
   B b;
   
   public void set(String x,Object p){
       if(x.equals("A")) a=(A)p;
	   else b=(B)p;
   }
   public void call(String x){
	   if(x.equals("A")) a.show();
	   else b.show();
   }
   
}