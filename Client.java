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

/*project execution for client */

class Client
 {
     public static void main(String[]args)
  {
ProjectManager p=new Developer();
 p.task(5);
  }
 }

