import java.util.Scanner;


 
class  Employee // application
 
{

private String id;  //declaration 
                     //requirements

private String name;


private double sal;


private int age;


private String cname;




public Employee(String id,String name, double sal,int age,String cname)  // intilization
 
{

 this.id=id;
  
this.name=name;

 this.sal=sal;

  this.age=age;
 
this.cname=cname;
 
}

 
 
 public  void details() // implementation.

 {
 
 System.out.println(" D E T I A  L S");
 
 System.out.println("============");
  
System.out.println(" emp id is :"+id);
 
 System.out.println(" emp name is :"+name);
 
 System.out.println(" emp salary is :"+sal);
 
 System.out.println(" emp age is :"+age);
 
 System.out.println(" emp cmp name is :"+cname);


 }



 }

// closing project





class OoPT4
 {
 

 public static void main(String[]args)
  {



String id;           // referncial variable

String name;

double sal;

int age;

String cname;




Scanner sc=new Scanner(System.in);



 

System.out.println(" enter id in String format:");
 
id=sc.next();



 System.out.println(" enter name in String  format:");

name=sc.next();

 

System.out.println(" enter sal in double format:");

sal=sc.nextDouble();

 

System.out.println(" enter age in interger format:");

age=sc.nextInt();



 System.out.println(" enter cmp name in String format:");

cname=sc.next();







 // execution
 


Employee e=new  Employee(id,name,sal,age,cname); //call by refernce

e.details();



 

Employee e2=new  Employee("w33", "rani",2000.0,12,"TCS"); // call by values

e2.details();


 

Employee e3=new  Employee("w44", "ramu",3000.0,13,"TCS");

e3.details();

 
 }

 }


