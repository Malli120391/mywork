class Developement{

private int a;

private static int b=20;

 public Developement(){

   a=10;
}

 public void task1(){

  System.out.println("a value is:" +a);
  System.out.println("b value is:" +b);
  
}

   public static void task2(){

  //System.out.println("a value is :"+a);//error
  
   Developement d=new Developement();
   
   System.out.println("a value is :"+d.a);

  System.out.println("b value is :"+b);

}

}

  class TestSatatic1{

  public static void main(String[]args){

   Developement d=new Developement();

  d.task1();
 Developement.task2();

}

}

 
