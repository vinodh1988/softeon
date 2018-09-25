abstract class NoObject
{
   public void show(){
     System.out.println("No object Class Method...!!!");
   }
}

class Mediator
{
  public void test(NoObject obj){
     obj.show();
  }
}