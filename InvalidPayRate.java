/**
Mohammed Raza
CSC 236 - Lab1 # 3 (Invalid Pay Rate Exception)
*/

public class InvalidPayRate extends Exception

{

	public InvalidPayRate()
	{
		super("Error: Invalid Pay Rate Entered");
	}

	public InvalidPayRate(String strMessage)
	{
		super(strMessage);
	}
}
