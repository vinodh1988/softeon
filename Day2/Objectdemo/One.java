class One{
    public void show(){
	 System.out.println("O N E");
	}

}
class Two{
	
	public static void main(String n[]){
	     Object a=new Object();
		 One b=new One();
		 Object c=new One();
		// a=b;
		 //b=(One)c;
		 b=(One)a;
	}
}
