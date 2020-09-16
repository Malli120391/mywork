class ExistedProj
 {
  public void task1()
  {
 System.out.println(" task-1 from super");
  }
 public void task2()
  {
 System.out.println(" task-2-from super");
  }

 }



class NewProj extends ExistedProj
 {
 public void task3()
  {
 System.out.println(" task-3 from sub");
  }

 public void task1()
  {
 System.out.println(" task-1from sub");
  }

 }

class InheritTech2
 {
  public static void main(String[]args)
  {
NewProj n=new NewProj();
n.task1();
n.task2();
n.task3();
n.task1();

  }
 }

