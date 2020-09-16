class A
 {
private int a,b,c;
private char x;

  public A()
  {
 a=10;
 b=20;
  }
  public A(int a,int b, int c)
  {
  this.a=a;
 this.b=b;
 this.c=c;
  }

  public A(char x,int b)
  {
   this.x=x;
  this.b=b;
   }
  public void task1()
  {
 System.out.println(" a value is :"+a);
 System.out.println(" b value is :"+b);
  }
  public void task2()
  {
 System.out.println(" a value is :"+a);
 System.out.println(" b value is :"+b);
 System.out.println(" c value is :"+c);

  }
  public void task3()
  {

 System.out.println(" x value is :"+x);
 System.out.println(" b value is :"+b);
  } 

 }// closing A


class B extends A
 {
public B()
  {
 super();
  }
  public B(int x, int y, int z)
  {
 super(x,y,z);
  }
public B(char x, int b)
  {
 super(x,b);
  }

 }

class InheritTech1_B
 {
 public static void main(String[]args)
  {
B b=new B();
 b.task1();

B b2=new B(100,200,300);
b2.task2();

B b3=new B('H',10000);
b3.task3();
  }
 }
 
