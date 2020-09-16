//Desing 
abstract class BankProject // govt proj
 {
private int regno;
private final static int gst=3;


  public BankProject(int regno)
  {
 this.regno=regno;
  }

  public void ur_regno()
  {
 /*this is concre methods and these methods are good to write logics for instance/non static var.. */

System.out.println(" u r regno is :"+regno);

  }

  public abstract void openAccount();
  public abstract void intrest();

  public final static void ur_gst()
  {
 /*this is final,static  methods and these methods are good to write logics for final,static var.. */
 
System.out.println(" u r paying gst to govt is:"+gst);
  }

 }// closing govt


// imepelementation

class ICICIBank extends BankProject
 { 
   public  ICICIBank(int regno)
   {
 super(regno);
   }

   public void openAccount()
  {
  System.out.println(" welcome to icicibank");
 System.out.println(" plze open account in icicibank");
  }
  public void intrest()
  {
 System.out.println("  u take loans from icici with 5%");
  }


 
}


class HDFCBank extends BankProject
  {
   public HDFCBank(int regno)
   {
 super(regno);
   }  
   public void openAccount()
  {
  System.out.println(" welcome to HDFCbank");
 System.out.println(" u must open account in HDFCbank");
  }
  public void intrest()
  {
 System.out.println("  u take loans from HDFC with 10%");
  }

 }
 

 // execution


class BankClient
 {
  public static void main(String[]args)
  {
BankProject.ur_gst();

System.out.println("------------");
BankProject p1=new  ICICIBank(1111);
p1.ur_regno();
p1.openAccount();
p1.intrest();

System.out.println("=============");

BankProject p2=new  HDFCBank(2222);
p2.ur_regno();
p2.openAccount();
p2.intrest();

  }
 }

