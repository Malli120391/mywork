abstract class ProjectManager{

 public void task1(){
}
}
//empty..

 public abstract void task2(){
}


  class Developer extends projectManager{

  public void task1(){

  System.out.println("task-1 is completed");
}
  public void task2(){

System.out.println("task-2 is completed");

}

}


class Clients{

public static void main(String[]args){

  ProjectManager p=new Developer();

  p.task1();
  p.task2();
}

}

