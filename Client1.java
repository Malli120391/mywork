/* project Design  from lead's */
class ProjectManager
 {
   public void task(int x)
   {
 // empty.. waiting for implementaions
   }
 }

/* project implementation from developer */

class Developer extends ProjectManager
  {
 public void task(int x)
   {
   System.out.println(" x sqrt root is :"+Math.sqrt(x));
   System.out.println(" project sucess");
   }
  }


class Developer2 extends Developer
  {
 public void task(int x) // updation are chanages
   {
   System.out.println(" x  cube is :"+(x*x*x));
   System.out.println(" project modified");
   }
 public void task(int x, int y) // updation add on 
   {
  int res=    x+y;
  System.out.println("ur add on updation are :"+res);
   }
  
  }

/*project execution for client */

class Client1
 {
     public static void main(String[]args)
  {
 // current execution

ProjectManager p=new Developer2();
 p.task(5);
 // p.task(10,20);// error

Developer2 d=new Developer2();
 d.task(10,20); 

// backup

ProjectManager p2=new Developer();
  p2.task(5);
  }
 }

