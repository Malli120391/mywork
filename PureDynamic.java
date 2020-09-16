
import java.util.Scanner;

interface Travel
{
 void bookSeats();
}

 class Meghana implements Travel
{
public void bookSeats()
{
System.out.println("Welcome to Meghana Travels");
System.out.println("u selected 2 seats from Hydreabed to Nagayalanka");
}
}

class Oranage implements Travel
{
public void bookSeats()
{
System.out.println("Welcome to Oranage Travels");
System.out.println("u selected 2 seats from Hydreabed to Ssss");

}
}

 class SLNS implements Travel
{
public void bookSeats()
{
System.out.println("Welcome to SLNS Travels");
System.out.println("u selected 2 seats from Hydreabed to Nagapur");
}
}
  

  class ServiceProvider
 {
public static Travel redBus(String select)

{
if(select.equals("Meghana"))
{
 return new Meghana();
}
 else if(select.equals("Oranage"))
{
return new Oranage();
}
else if(select.equals("SLNS"))
{
 return new SLNS();

}
else 
{
return null;
}
}
}

 class PureDynamic 
{
 public static void main(String[]args)
{
 String select;
 
Scanner sc=new Scanner(System.in);  
System.out.println("available Travel");
System.out.println("1.Meghana");
System.out.println("2.Oranange");
System.out.println("3.SLNS");
System.out.println("select requires Travel:");
   select=sc.next();

  Travel t;
  
  t=ServiceProvider.redBus(select);
  t.bookSeats();
}
}








