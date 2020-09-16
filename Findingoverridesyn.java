class Superclass{

public void task1(){

System.out.println("task-1 is Super");
}
 
}
 class Subclass extends Superclass{
 
 public void task1(){

 System.out.println("task-1 is Sub");
}

}

  class Findingoverridesyn{

   public static void main(String[]args){

   Superclass s=new Subclass();
   
   s.task1();

  Subclass ss=(Subclass) new Superclass();

  ss.task1();
}
}



