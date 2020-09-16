class Develop{

 private int a;

 private static int b = 20;

public Develop(){

 a=10;
}

 public void task1(){

  System.out.println("a value is:"+a);
  System.out.println("a value is:"+b);

}

  public static void task2(){

  //System.out.println("a value is:"+a);//invalid
  
  Develop d=new Develop();
  System.out.println("a value is:"+d.a);

  System.out.println("a value is:"+b);

}

}

class StaticTest{

public static void main(String[]args){

   Develop d=new Develop();

  d.task1();

 Develop.task2();
}

}
  