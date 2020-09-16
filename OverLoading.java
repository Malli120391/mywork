 class Developement{

  private int a,b;

  public Developement(int a, int b){

 this.a=a;
 this.b=b;
}

 public void task(){
  
 int res=a+b;
  System.out.println("your result is: "+res);

}
  public void task(int x, int y, int z){
  
  int res=x+y+z;

  System.out.println("your updated result is: "+res);
   
 //int res=x+y+z;
}

 public void task(int x, int y, int z, int k){

  int res=x+y+z+k;
 
  System.out.println("your again updated result is: "+res);
 
  //int res=x+y+z+k;

}
}

class OverLoading{

 public static void main(String[]args){

   Developement d=new Developement(10,20);
  
  d.task();
  
 d.task(10,20,30);
 d.task(40,50,60,70);

}
 
}

