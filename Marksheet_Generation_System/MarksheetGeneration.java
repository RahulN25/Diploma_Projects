import java.util.*;

class student
{
	public static void main(String args[])
	{
		int i, Total;
		float Percentage;
		String Rank,a,b,c,d,e;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter How Many Students Marksheet You want : ");
		int n = num.nextInt();

			for(i = 0; i<n; i++)
			{
				System.out.println("STUDENT NO - "  +(i+1));
				System.out.println();

				Scanner input = new Scanner(System.in);
				System.out.println("Enter The Name Of The Student : ");
				String Name = input.nextLine();
				
				Scanner input1 = new Scanner(System.in);
				System.out.println("Enter marks Aquired in Object Oriented Programming : ");
				int OOP = input1.nextInt();

				Scanner input2 = new Scanner(System.in);
				System.out.println("Enter marks Aquired in Data Structure Using 'C' : ");
				int DSU = input2.nextInt();
				
				Scanner input3 = new Scanner(System.in);
				System.out.println("Enter marks Aquired in Computer Graphics : ");
				int CGR = input3.nextInt();

				Scanner input4 = new Scanner(System.in);
				System.out.println("Enter marks Aquired in Database Management System  : ");
				int DMS = input1.nextInt();	

				Scanner input5 = new Scanner(System.in);
				System.out.println("Enter marks Aquired in Digital Techniques : ");
				int DT = input5.nextInt();
				
				System.out.println();
				System.out.println("----------------------------------------------------------------");
				System.out.println();				
				System.out.println("         MAHARASHTRA STATE BOARD OF TECHNICAL EDUCATION         ");
				System.out.println();
				System.out.println("----------------------------------------------------------------");
				System.out.println();
				System.out.println("                  PIMPRI CHINCHWAD POLYTECHNIC                  ");
				System.out.println();
				System.out.println("                     EXAMINATION WINTER 2019                    ");
				System.out.println("                         THIRD SEMESTER                         ");
				System.out.println();
				System.out.println("________________________________________________________________");
				System.out.println();
				System.out.println("Name OF Student : MR./MS." +Name);
				System.out.println();
				System.out.println("TITLE OF COURSES                                 TOTAL MARKS");
				System.out.println("________________________________________________________________");

				System.out.println("                                               MAX.|OBT.|STATUS");
				
				if(OOP<35)
				{ 
					a = "Fail";
				}
				else
				{
					a = "Pass";
				}

				System.out.println("OBJECT ORIENTED PROGRAMMING                    100 |"+OOP+"   |"+a);
				System.out.println("                                                   |    |");

				if(DSU<35)
				{ 
					b = "Fail";
				}
				else
				{
					b = "Pass";
				}
				
				System.out.println("DATA STRUCTURE USING 'C'                       100 |"+DSU+"   |"+b);
				System.out.println("                                                   |    |");
				
				if(CGR<35)
				{ 
					c = "Fail";
				}
				else
				{
					c = "Pass";
				}
				
				System.out.println("COMPUTER GRAPHICS                              100 |"+CGR+"   |"+c);
				System.out.println("                                                   |    |");

				if(DMS<35)
				{ 
					d = "Fail";
				}
				else
				{
					d = "Pass";
				}

				System.out.println("DATABASE MANAGEMENT SYSTEM                     100 |"+DMS+"   |"+d);
            			System.out.println("                                                   |    |");

				if(DT<35)
				{ 
					e = "Fail";
				}
				else
				{
					e = "Pass";
				}

				System.out.println("DIGITAL TECHNIQUES                             100 |"+DT+"   |"+e);
				System.out.println("                                                   |    |");

				Total = OOP + DSU + CGR + DMS + DT;
				Percentage = Total*100/500;
				
				System.out.println("________________________________________________________________");
				System.out.println("                                                   |    |");
				System.out.println("PERCENTAGE : "+Percentage+"%"+"                            TOTAL | "+Total+" |");
				
				System.out.println();
				

				if(OOP<35 || DSU<35 || CGR<35 || DMS<35 || DT<35)
				{
					Rank = "Fail";
				}
				else if(Percentage<35)
				{
					Rank = "Third Class";
				}
				else if(Percentage>35 && Percentage<60)
				{
					Rank = "Second Class";
				}
				else if(Percentage>60 && Percentage<70)
				{
					Rank = "First Class";
				}
				else
				{
					Rank = "First Class With Distinction";
				}

				System.out.println("________________________________________________________________");
				System.out.println();
				System.out.println("                                        "+Rank);
					 		
			}

			
	}

}
