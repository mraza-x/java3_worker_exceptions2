/**
Mohammed Raza
CSC 236 - Lab1 # 3 (class1)
*/

public class Employee
{
   public String name;
   public int id;
   public String date;

   public Employee()
   {
	   name = " ";
	   id = 0;
	   date = " ";
   }

   public Employee(String n, String d, int i)
   {
	  name = n;
	  id = i;
	  date = d;
   }


   public void setName(String n)
   {
      name = n;
   }


   public void setEmployeeNumber(int i)
   {
      id = i;
   }

   public void setHireDate(String d)
   {
      date = d;
   }



   public String getName()
   {
      return name;
   }

   public int getEmployeeNumber()
   {
	  try
	  {
		  if (id < 0 || id > 9999)
	  	  throw new InvalidEmployeeNumber();
	  }

	  catch (InvalidEmployeeNumber e)
	  {

	  	System.out.println("Error: " + e.toString());

	  }

	  finally
	  {
	  	  return id;
	  }
   }


   public String getHireDate()
   {
      return date;
   }


   public void isValidEmpNum()
   {

   }

   public String toString()
   {
	   String str = " ";
	   return str;
   }


}
