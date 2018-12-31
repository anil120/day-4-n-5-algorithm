package pack3;
import com.function.utilities.utility;
public class BinarySearchString 
{
	public static void main(String[] args) 
	{
		System.out.println("enter arr size");
		int arrsize=utility.getInt();
		String[] c=new String[arrsize];
		System.out.println("ENTER ARR ELEMENTS");
		utility.insertString(c);
		System.out.println("enter String u want to search");
		String sw=utility.getString();
		utility.searchString(c,sw);
	}

}
