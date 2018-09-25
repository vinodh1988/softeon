
class Main {
	
	public static void main(String n[]){
		
		
		Mediator obj=new Mediator();
		obj.test(new NoObject(){
			public void show(){
				System.out.println("YESSSSSSSSSSSS");
			}
		});
	}
}