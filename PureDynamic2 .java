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
public static Travel redBus(String selcet)

{
if(select.equals("Meghana"))
{
 return new Meghana();
}
 else if(select.equals("Oranage"));
{
return new Oranage();
}
else if(select.equals("SLNS"));
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
 public static void main(Stirng[]args)
{
 String select;
 
  scanner sc=new scanner(System.out);  
 System.out.println("available Travel");
  System.out.println("1.Meghana");
  System.out.println("2.Oranage");
  System.out.println("3.SLNS");
   System.out.println("select requires Travel:");
   select=sc.next();

  Travel t;
  
  t=ServiceProvider.redBus(select);
  t.bookSeats();
}
}








