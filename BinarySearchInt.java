package pack3;
import com.function.utilities.utility;
public class BinarySearchInt
{
	public static void main(String[] args) 
	{
		System.out.println("enter array size");
		int arrsize=utility.getInt();
		int[] a=new int[arrsize];
		System.out.println("enter array elements");
		utility.insert(a);
		System.out.println("enter integer u want to search");
		int s=utility.getInt();
		utility.searchInt(a, s);
	}
}
