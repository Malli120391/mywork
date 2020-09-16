class ExistedProject
{
private int a,b;

public ExistedProject(int a, int b)
{
this.a=a;
this.b=b;
}
public void task1()
{
System.out.println("a value is:"+a);
System.out.println("b value is:"+b);
}
}

class NewProject extends ExistedProject
{
public NewProject(int a, int b)
{
super(a,b);
}

}
class InheritanceTech11_A
{
public static void main(String[]args)
{
NewProject n=new NewProject(10,20);
n.task1();

}

}



