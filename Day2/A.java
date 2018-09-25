class A{
    
  static {
    System.out.println("A Static");
  }
  {
    System.out.println("Local A");
  }
  static{
    System.out.println("Second unit static A");
  }
  A(){
    System.out.println("A");
  }
}