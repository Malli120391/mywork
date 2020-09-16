class Developement
 
{



private int a,b,c; // req 


private String d,x;



public Developement() // constructor  //8
 
{
 
 a=10;
 
 b=20;

 }

public Developement(int a,int b, int c)
 
{

this.a=a;

this.b=b;

this.c=c;

 
}

public Developement(int a,int b, int c,String d)

 {
 
this.a=a;
 
this.b=b;

 this.c=c;
 
this.d=d;
 
}


public Developement(String x, int b, int c) 

 {

this.x=x;

this.b=b;

this.c=c;


 }


public  void task1() // implem..
  
{
  
int res= a+b;
  
System.out.println(" a value is :"+a);
 
 System.out.println(" b value is :"+b);
  
System.out.println(" u res is:"+res);

 
 }
 
public void task2()
 
 {
 
 System.out.println(" a value is :"+a);
  
System.out.println(" b value is :"+b);
 
 System.out.println(" c value is :"+c);
 
 int res=a+b+c;

 
 System.out.println("  u res:"+res);

  
}

 public void task3()
 
 {

 
 System.out.println(" a value is :"+a);
 
 System.out.println(" b value is :"+b);

  System.out.println(" c value is :"+c);

  System.out.println(" d value is :"+d);
  

  }

 
public void task4()
 
{

 System.out.println(" x values is :"+x);
 
System.out.println(" b values is :"+b);

 System.out.println(" c values is :"+c);

 
}
 
}// closing app/class




class OOPS31
 {



public static void main(String[]args)
 
 
{
 // execution part


Developement d=new Developement();

 
d.task1();




Developement d2=new Developement(11,22,33);


d2.task2();




Developement d3=new Developement("ravi",100,200);


d3.task4();




  

}

}


 
