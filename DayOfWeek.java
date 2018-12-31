package pack3;
import com.function.utilities.utility;
public class DayOfWeek 
{
	public static void main(String[] args) 
	{
	 System.out.println("enter day");
	 int day=utility.getInt();
	 System.out.println("enter month");
	 int month=utility.getInt();
	 System.out.println("enter year");
	 int year=utility.getInt();
	 utility.dayOfWeek(day, month, year);
	}
}
