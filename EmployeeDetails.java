
  import java.util.Scanner;
  class Employee{

  private String id;
  private String name;
  private double sal;
  private int age;

  public void reading(){

  Scanner sc=new Scanner(System.in);
  
 System.out.println("Enter id in String formate:");
 id=sc.next();

   System.out.println("Enter name in String formate:");
 name=sc.next();
 
  System.out.println("Enter sal in double formate:");
   sal=sc.nextDouble();

  System.out.println("Enter age in int formate:");
 age=sc.nextInt();

  
        }
        public  void displaydetails(){
  
         System.out.println("display all employee details");
    
           System.out.println("===========================");

           System.out.println("emp Id is: "+id);
            
             System.out.println("emp  Name is: "+name);
  
               System.out.println("emp Salary is: "+sal);
           
                 System.out.println("emp Age is: "+age);

   }

  }

   class EmployeeDetails{

    public static void main(String[]args){
    
   Employee e=new Employee();
   
   e.reading();
   
  e.displaydetails();
   

   
   }
  
  }






