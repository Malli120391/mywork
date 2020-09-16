  
   import java.util.Scanner;
    class Employee{

   private String id;
   private String name;
   private double sal;
   private int age;

  private static String cname="Microsoft";

   public  Employee(String id, String name, double sal, int age){
   
  this.id=id;
  this.name=name;
  this.sal=sal;
  this.age=age;
   
}

  public void details(){

  System.out.println("D E T A I L S");
  
   System.out.println("===============");
  
 System.out.println("emp id is: "+id);

 System.out.println("emp name is: "+name);
  
  System.out.println("emp salary is: "+sal);
  
  System.out.println("emp age is: "+age);
  
}
 
 public static void commrqu(){

  System.out.println("cname name is for all:" +cname);
}
 
}

 class OOPT04{

  public static void main(String[]args){

   String id;
   String name;
   double sal;
   int age;
   Scanner sc=new Scanner(System.in);

   System.out.println("enter id in string formate:");
   id=sc.next();
  
   System.out.println("enter name in string formate:");
   name=sc.next();
  
  System.out.println("enter salary in Double formate:");
   sal=sc.nextDouble();

  System.out.println("enter age in Int formate:");
   age=sc.nextInt();

   Employee.commrqu();
   
   Employee e=new  Employee(id,name,sal,age);
   
  e.details();
  
 Employee e1=new  Employee("M5","MalleswaraRao",100000.00,27);
   
  e1.details();


 Employee e2=new  Employee("M8","MR",200000.00,28);
   
  e2.details();
  

}
}




