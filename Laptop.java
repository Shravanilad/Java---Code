class Laptop
{

   psvm(String[] args)
   {
   Laptop 11 = new Laptop(10);
   Laptop 12 = new Laptop(10, 16);
   }


   double screensize;
   int ram;
   int hdd;

   static String devive_genre = "Electronics";

   Laptop(double d)
   {
   screensize = 11;
   }

   Laptop(double ss, int r)
   {
   screensize = 11;
   ram = 8;
   }

   Laptop(double ss, int r, int h)
   {
   screensize = 11;
   ram = 8;
   hdd = 256;
   }

   void displyDataLaptop()
   {
   SopIn(screensize + " " + ram + " " + hdd);
   }
}
   