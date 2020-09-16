class FirstJavaApp
{
  int a = 10;

  int b = 20;
  
  int c;

void add(){

  c=a+b;

 System.out.println("ur value is: "+c);

}
void sub(){

  c=a-b;

 System.out.println("ur value is: "+c);

}
void task(){

  c=a>b ? a:b ;

 System.out.println("ur greatest value is: "+c);

}


 public static void main(String[] args){

  FirstJavaApp f=new  FirstJavaApp();
  
  f.add();
  f.sub();
  f.task();

}
}



