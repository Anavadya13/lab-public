class TestException extends Throwable
{
	TestException()
	{
		super("Custom exception");
	}
}

class CustomException
{
	public static void main(String[] args)
	{
		try
		{
			throw new TestException();
		}
		catch(TestException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Program going to finish");
		}
	}
}

