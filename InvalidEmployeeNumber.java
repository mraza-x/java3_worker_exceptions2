/**
Mohammed Raza
CSC 236 - Lab1 # 3 (Invalid Employee Number Exception)
*/

public class InvalidEmployeeNumber extends Exception

{

	public InvalidEmployeeNumber()
	{
		super("Error: Invalid Employee Number Entered");
	}

	public InvalidEmployeeNumber(String strMessage)
	{
		super(strMessage);
	}
}
