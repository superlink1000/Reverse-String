import java.util.Scanner;

public class Reverse 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a string to have it reversed");
		
		String input = kb.next();
		
		int x = 0;
		int y = input.length() - 1;		
		
		while (y >= x)
		{
			char a = input.charAt(y);
			y--;
			System.out.print(a);
		}
	}
}