/**
Mohammed Raza
CSC 236 - Lab1 # 3 (Invalid Shift Exception)
*/

public class InvalidShift extends Exception

{

	public InvalidShift()
	{
		super("Error: Invalid Shift Entered");
	}

	public InvalidShift(String strMessage)
	{
		super(strMessage);
	}
}