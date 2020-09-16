interface ProjectManager1
{
int a=10;
void task1();
void task2();
}
interface ProjectManager2
{
int b=20;
void task3();
void task4();
}

//implementation

class Developer implements ProjectManager1,ProjectManager2
{
public void task1()
{
System.out.println("task-1 is completed");
}
public void task2()
{
System.out.println("task-2 is completed");
}
public void task3()
{
System.out.println("task-3 is completed");
}
public void task4()
{
System.out.println("task-4 is completed");
}
}

//execution

class InterfaceDemo
{
 public static void main(String[]args)
{
 ProjectManager1 p1=new Developer();
 p1.task1();
 p1.task2();
System.out.println("u req:"+Developer.a);
System.out.println("---------------------");
ProjectManager2 p2=new Developer();
 p2.task3();
 p2.task4();
System.out.println("u req:"+Developer.b);

}
}




