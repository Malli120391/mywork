/*class Developement1{

  private int a,b;

  public Developement1(int a, int b){

 this.a=a;
 this.b=b;
}

 public void task(){
  
 int res=a+b;
  System.out.println("your result is: "+res);

}
 public void task(int...x){

  int add=0;
 for(int a:x){

 add=add+a;
}

System.out.println("your update result is: "+add);

}
}

class VarArgsClient{

 public static void main(String[]args){

   Developement1 d=new Developement1(10,20);
  
  d.task();
  
 d.task(11,22,33);
 d.task(100,200,300,400);

 d.task
(54,534,5,34,5,345,43,5,34,5,34,543,5,43,5,43,5,34,5,34,
53,45,34,5,3,45,34,5,34,53,4534,5,34,5,34,534,5,34,5,43
5,34,534,5,34,543);

}
 
}
*/

class Developement
 {
private int a,b;

 public Developement(int a,int b)
  {
 this.a=a;
 this.b=b;
  }

  public void task() // start developement
  {
  int res=  a+b;
 System.out.println(" u r res:"+res);
  }

 public void task(int...x) // updation are a bit of different 
but similary functionalaties addon
  {
 
 int add=0;
  for(int a:x)
   {
  add=add+a;
   }
System.out.println(" u r updated res:"+add); 

 }


 }// closing app



class VarArgsClient1
 {
   public static void main(String[]args)
  {
Developement d=new Developement(10,20);
d.task();
d.task(11,22,33);// int...x => int x[]={11,22,33};

d.task(100,200,300,400);//int...x => int x[]=
{100,200,300,400};

d.task
(54,534,5,34,5,345,43,5,34,5,34,543,5,43,5,43,5,34,5,34,
53,45,34,5,3,45,34,5,34,53,4534,5,34,5,34,534,5,34,5,43
5,34,534,5,34,543);
  }
 }

