class Caller{
  static public void main(String n[]){
     
    C obj=new C();
	obj.set("B",new A());
	obj.call("A");
  }
}