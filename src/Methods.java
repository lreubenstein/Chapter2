/*
 * Displays a "Hello World!" message on the screen
 */
//           Class name
public class Methods {

	// constructor
	public Methods() {
		// TODO Auto-generated constructor stub
	}
//  public vs.       no return
//  private          value       method name      arguments - input
	public static    void        main            (String[] args) 
	{//matching curly braces {}
		// TODO Auto-generated method stub
		System.out.println("Hello World");  //each statement ends with ;
		int a=methodone(5);
		System.out.println(a);

	}//matching curly braces {}
	
	//second method
	public static int methodone(int x)
	{
		int y;
		y=x+1;
		System.out.println("method one");
		return y;
		
	}

}
