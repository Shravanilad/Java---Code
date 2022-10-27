public class ScannerDouble 
{    
    public static void main(String args[])
    {       
        double value;  
        Scanner scan = new Scanner(System.in);       
        System.out.print("Enter the numeric value : ");  
        value = scan.Double();  
        System.out.println("Double value : " + value +" \nTwice value : " + 2.0*value );  
        scan.close();  
      }    
}  




