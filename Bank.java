class Bank
{      
  int getRateOfInterest()
  {
    return 0;
    }  
  }

    //Creating child classes.
  
class Sbi extends Bank
{
   int getRateOfInterest()
   {
      return 7%;
      }  
    }  
  
class Icici extends Bank
{  
  int getRateOfInterest()
  {
    return 9%;
    }  
  } 
 
class Axis extends Bank
{
  
  int getRateOfInterest()
  {
    return 8%;
    }  
  }
  
   //Test class to create objects and call the methods  
   class Test2
   {
  
     public static void main(String args[])
    {
  
      Sbi s=new Sbi();     
      Icici i=new Icici();  
      Axis a=new Axis();
  
     System.out.println("Sbi Rate of Interest: "+s.getRateOfInterest());  
     System.out.println("Icici Rate of Interest: "+i.getRateOfInterest());  
     System.out.println("Axis Rate of Interest: "+a.getRateOfInterest());  
    }  
}