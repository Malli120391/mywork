class Test
{
public void task1(int x, int y)
{
 int res=x+y;
System.out.println("ur res: "+res);
}
public int task2(int x , int y)
{
int res=x+y;
return res;
}
}
 class Impnote
 {

 public static void main(String[]args)
{
 Test t=new Test();
  t.task1(10,20);
 System.out.println("ur op is : " +t.task2(100,200));

 int x=t.task2(11,22);
System.out.println(" ur OP is: "+(x+x));

}

}



