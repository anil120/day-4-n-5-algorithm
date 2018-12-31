package com.function.utilities;
import java.util.Scanner;

public class utility
{

	
		static Scanner s = new Scanner(System.in);
		public static int getInt()
		{
			int i =s.nextInt();
			return i;
		}
		public static double getDouble()
		{
			double j =s.nextDouble();
			return j;
		}
		public static float getFloat()
		{
			float k=s.nextFloat();
			return k;
		}
		public static String getString()
		{
			String l=s.next();
			return l;
		}
		public static void insert(int[] a)
		{
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=s.nextInt();
			}
		}
		public static void insertString(String[] a)
		{
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=s.next();
			}
		}
		public static void bubblesort()
		{ 
			System.out.println("enter arr size");
			int arrsize= s.nextInt();
			int a[]= new int[arrsize];
			System.out.println("enter arr elements");
			for(int k =0;k<=arrsize-1;k++)
			{
				a[k]=s.nextInt();
			}
			int temp=0;
			for(int c=1;c<=a.length-1;c++)
			{
				for(int i=0;i<=a.length-2;i++)
				{
					if(a[i]>a[i+1])
					{
						temp=a[i];
						a[i]=a[i+1];
						a[i+1]=temp;
					}
				}
			}
			for(int j =0;j<=a.length-1;j++)
			{
				System.out.print(a[j]+" ");
			}
		}
		public static void gamblerstake()
		{
			System.out.println("enter stake");
			int stake =s.nextInt();
			System.out.println("enter goal");
			int goal=s.nextInt();
			System.out.println("enter number of try");
			int number=s.nextInt();
			int win=0;
			int loss =0;
			for(int i=0;i<=number;i++)
			{
				double d=Math.random();
				while(stake!=goal && stake!=0)
				{
				    if(d<0.5)
				    {
					    stake++;
					    win++;
				    }
				    else
				    {
				    	stake--;
				    	loss++;
				    }
				}
				
			}
			System.out.println("no. of win = " + win);
			System.out.println("win percentage is "+ (win/(win + loss))*100);
			System.out.println("loss percentage is "+ (loss/(win + loss))*100);
		}
		public static void insertionSort()
		{
			System.out.println("enter arr size");
			int arrsize=s.nextInt();
			int[] a =new int[arrsize];
			System.out.println("enter arr elements");
			for(int i=0;i<arrsize;i++)
			{
				a[i]=s.nextInt();
			}
			int temp;
			int k;
			for(int j=1;j<arrsize;j++)
			{
				temp=a[j];
				k=j;
				while(k>0 && a[k-1]>temp)
				{
					a[k]=a[k-1];
					k-=1;
				}
				a[k]=temp;
			}
			for(int i =0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}// TODO Auto-generated method stub
		public static void anagram1()
		{
			Scanner s = new Scanner(System.in);
			int temp= 0;
			System.out.println("enter first string");
			String s1= s.next();
			System.out.println("enter second string");
			String s2=s.next();
			String s3 = s1.toUpperCase();
			String s4 = s2.toUpperCase();
			if(s1.length()==s2.length())
			{
				for(int i= 0;i<=s3.length()-1;i++)
				{
					for(int j=0;j<=s4.length()-1;j++)
					{
						if(s3.charAt(i)==s4.charAt(j))
						{
							temp++;
							break;
						}
					}
				}
				if(temp==s1.length())
				{
					System.out.println(s1+" is a anagram of " + s2);
				}
				else
				{
					System.out.println(s1 +" is not a anagram of" + s2);
				}
			}
			else
			{
				System.out.println(s1+" is not a anagram of"+ s2);
			}
		}
		public static void temperatureConversion()
		{
			double c,f=0;
		    int value =s.nextInt();
		    switch(value)
		    {
		    case 1: System.out.println("enter celsius value");
		    		double temp1=s.nextDouble();
		    		f=(temp1 * 9/5) + 32 ;
		    		System.out.println("converted temperature in farenheit is"+ f);
		    		break;
		    case 2:System.out.println("enter farenheit value");
		    	   double temp2=s.nextDouble();
		    	   c=(temp2 - 32) * 5/9; 
		    	   System.out.println("converted temperature in farenheit is"+ c);
		    	   break;
		    	   default : System.out.println("invalid ");
		    }
		}
		public static void payment()
		{
			System.out.println("enter the principal amount");
			int p=s.nextInt();
			System.out.println("enter no. of years");
			int y=s.nextInt();
			System.out.println("enter the interest rate");
			double r=s.nextDouble();
			double n= 12*y;
			double a=r/(12*100);
			double payment= (p*a)/(1-Math.pow(1+a, -n));
			System.out.println(payment);
		}
		public  static void stringSort()
		{
			String[] a= {"adb","bdc","cda","ghr","xvu","bxf"};
			String temp=null;
			for(int c=0;c<=a.length-1;c++)
			{
				for(int i=0;i<=a.length-2;i++)
				{
					if(a[i].compareTo(a[i+1])>0)
					{
						temp=a[i];
						a[i]=a[i+1];
						a[i+1]=temp;
					}
				}
				
			}
			for(int j=0;j<=a.length-1;j++)
			{
				System.out.print(a[j]+" ");
			}
			
		}
		public static void notes(int rupees)
		{
			int[] a= { 1000,500,100,50,10,5,2,1 };
			int note=0;
			for(int i=0;i<a.length;i++)
			{
				if(rupees/a[i]>0)
				{
					System.out.println("no. of notes of "+a[i]+" is "+rupees/a[i]);
					note = note + (rupees/a[i]);
					rupees=rupees%a[i];
				}
			}	
			System.out.println("no. of notes are "+ note);
		}
		public  static void binOutput(int n)
		{
				while(n>0)
				{
					int i=n%2;
					n=n/2;
			System.out.print(i);
				}
		}
		public static void dayOfWeek(int day,int month,int year)
		{
			String array[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			int y0= year-(14-month)/12;
			int x=y0+y0/4-y0/100+y0/400;
			int m0=month + 12 *((14 - month )/12) - 2;
			int d0=(day+x+31*m0/12)%7;
			System.out.println(array[d0]+ " is the day on " +day+"/"+month+"/"+year);
		}
		public static void sqrt(double c)
		{
			double epsilon= 1e-15;
			double t=c;
			if(c>0)
			{
				 while (Math.abs(t - c/t) > epsilon*t) 
				 {
					 t = (c/t + t)/2.0;
				 }
			}
			System.out.println(t);
		}
		public static void searchInt(int[] b,int v)
		{
			int count=0;
			for(int i =0;i<b.length;i++)
			{
				if(b[i]==v)
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println("integer is present inside the array");
			}
			else
			{
				System.out.println("integer is  not present inside the array");
			}
		}
		public static void searchString(String[] b,String v)
		{
			int count =0;
			for(int i =0;i<b.length;i++)
			{
				if(b[i].equalsIgnoreCase(v))
				{
					count++;
				}
			}
				if(count>0)
				{
					System.out.println("string is present inside array");
				}
				else
				{
					System.out.println("string is not present inside array");
				}
			
		}
}
