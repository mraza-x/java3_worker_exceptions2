/**
Mohammed Raza
CSC 236 - Lab1 # 3 (class2)
*/

public class ProductionWorker extends Employee
{
   private int shift;
   private double payrate;

   public ProductionWorker()
   {   super();

	   shift = 0;
	   payrate = 0;
   }


   public ProductionWorker(String n, String d, int i, int s, double pr)
   {  super(n,d,i);

	  shift = s;
	  payrate = pr;
   }


   public void setShift(int s)
   {
      shift = s;

      try
	  	   	  	  {
	  	   	  		  if (shift != 1 || shift != 2)
	  	   	  	  	  throw new InvalidShift();
	  	   	  	  }

	  	   	  	  catch (InvalidShift e)
	  	   	  	  {

	  	   	  	  	System.out.println("Error: " + e.toString());

	  	   	  	  }




   }


   public void setPayRate(double pr)
   {
      payrate = pr;
   }



   public int getShift()
   {

	   	  return shift;


   }

   public double getPayRate()
   {
	  	  try
	  	  {
	  		  if (payrate < 0)
	  	  	  throw new InvalidPayRate();
	  	  }

	  	  catch (InvalidPayRate e)
	  	  {

	  	  	System.out.println("Error: " + e.toString());

	  	  }

	  	  finally
	  	  {
	  	  	  return payrate;
		  }
   }

   public String toString()
   {
	   String str = " ";
	   return str;
   }


}
