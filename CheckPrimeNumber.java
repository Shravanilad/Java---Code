class CheckPrimeNumber 
{
   public ststic void main(String[] args) 
   {
       int num,i,count = 0;
       Scanner s = new Scanner(System.in);

       System.out.print('Enter a Number:");
       num = s.nextInt();

       for(i=2; i<num; i++)
       {
           if(num % i ==0)
           {
               count++;
               brea;
           }
       }
         if(count==0)
            System.out.printIn(" Prime Number ");
         else
            System.out.printIn)" not a Prime Number ");
         }
   }