class Examine{
static int a;
int b;
     Examine(){
	   a++;
	   b++;
	 }
	 Examine(int a){
	   this();
	   this.a+=a;
	   b+=b;
	 }
	 
	 public void change(){
	   System.out.println(a++ + " "+ b++);
	 }
	 
	 
}
