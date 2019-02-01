import java.util.Scanner;
abstract class Reserve
{
	public int max1=75;
	public int max2=125;
	public int max3=175;
	public int err=0;
	static int pno[]=new int[275];
	String name[]=new String[275];
	int age[]=new int[275];
	int cl[]=new int[275];
	String phno[]=new String[275];
	 int pcount=0;
	 int pnum=1;
	int c;
	int t;
	Scanner s=new Scanner(System.in);
	
	
}
class PassengerInfo extends Reserve{
	void info(int c,int t)
	{
		for(int i=0;i<t;i++)
		{
			try {
			System.out.println("_________________________________________________");
			pno[pcount]=pnum;
				
			System.out.println("Passenger number : "+pnum);
			System.out.print("Enter the name : ");
			name[pcount]=s.next();
			System.out.print("Enter the age : ");
			cl[pcount]=c;
			age[pcount]=s.nextInt();
			System.out.print("Enter the phone number : ");
			phno[pcount]=s.next();
			pcount++;
			pnum++;
			System.out.println("_________________________________________________");
			System.out.println();
		}
			catch(Exception e)
			{
				System.out.println("\t\t\tEnter the proper input ");
				System.out.println("Exception found"+e);
				System.exit(0);
			}
		}  
	}
	void displayAvailable()
	{
		System.out.println("\t\t*************************");
		System.out.println("\t\tNumber of tickets Available\n");
		System.out.println("\t\tAC class      : "+max1);
		System.out.println("\t\tFIRST class   : "+max2);
		System.out.println("\t\tSLEEPER class : "+max3);
		System.out.println("\t\t*************************");
	}
}

class Book extends PassengerInfo
{
	void booking()
	{
		
		int ticketavail=0;
			System.out.println();
			System.out.println("Please enter the class of ticket");
			System.out.println("Class 1. AC\nClass 2. First\nClass 3. Sleeper");
			System.out.print("Enter the class option here:");
			c=s.nextInt();
			System.out.print("Enter the number of tickets:");
			t=s.nextInt();
		if(c==1 && max1>=t)
		{
			ticketavail=1;
		}
		if(c==2 && max2>=t)
		{
			ticketavail=1;
		}
		if(c==3 && max3>=t)
		{
			ticketavail=1;
		}
		if(ticketavail==1)
		{
			super.info(c,t);
			System.out.println("\t\t\t******TICKETS SUCCESSFULLY BOOKED*****");
			if(c==1)
		{
			max1-=t;
			System.out.println("\tRs.1500 per head.\n");
			System.out.println("\t\t******************************");
			System.out.println("\t\t    Please Pay Rs."+(t*1500));			
			System.out.println("\t\t******************************");
		}
		else if(c==2)
		{
			max2-=t;
			System.out.println("\tRs.1200 per head.\n");
			System.out.println("\t\t******************************");
			System.out.println("\t\t    Please Pay Rs."+(t*1200));			
			System.out.println("\t\t******************************");
		}
		else if(c==3)
		{
			max3-=t;
			System.out.println("\tRs.1000 per head.\n");
			System.out.println("\t\t******************************");
			System.out.println("\t\t    Please Pay Rs."+(t*1000));			
			System.out.println("\t\t******************************");
		}
		System.out.println("\n\t\t\t(: HAPPY JOURNEY :)\n");
		}
		else
		{
			System.out.println("\t\t**********Tickets unavailable************");
		}
		
	}
}
	class SearchPassenger extends Book
	{
	void searchPassenger()
	{
		int psgfound=0;
		System.out.print("Enter the Passenger number to search:");
		int p=s.nextInt();
		for(int i=0;i<pcount;i++)
		{
			if(pno[i]==p)
			{
				System.out.println("\nPassenger Detail is found...\n");
				psgfound=1;
				System.out.println("\t<------------------------------------------>");
				System.out.println("\t\tPassenger number : "+pno[i]);
				System.out.println("\t\tNAME  : "+name[i]);
				System.out.println("\t\tCLASS : "+cl[i]);
				System.out.println("\t\tAGE   : "+age[i]);
				System.out.println("\t\tPh.No : "+phno[i]);
				System.out.println("\t<------------------------------------------>");
			}
		}
		if(psgfound==0)
		{
			System.out.println("No such passenger is found ...");
		}
	}
	}
	class PassengerDetails extends SearchPassenger
	{
	void displayList()
    {
		System.out.println();
		System.out.println();
    	System.out.println("\t\t*** Passenger List in \"AC\" class ***");
    	System.out.println("-----------------------------------------------------------------------------------------");
    	System.out.println("\t\tPsg.No\t\tNAME\t\t\tAGE\t\tPh.No");
    	System.out.println("-----------------------------------------------------------------------------------------");
    	for(int i=0;i<pcount;i++)
    	{
    		if(cl[i]==1)
    		{
    			System.out.println("\t\t"+pno[i]+"\t\t"+name[i]+"\t\t\t"+age[i]+"\t\t"+phno[i]);
    		}
    	}
    	System.out.println("-----------------------------------------------------------------------------------------");
    	System.out.println();
    	System.out.println();
    	System.out.println("\t\t*** Passenger List in \"FIRST\" class ***");
    	System.out.println("-----------------------------------------------------------------------------------------");
    	System.out.println("\t\tPsg.No\t\tNAME\t\t\tAGE\t\tPh.No");
    	System.out.println("-----------------------------------------------------------------------------------------");
    	for(int i=0;i<pcount;i++)
    	{
    		if(cl[i]==2)
    		{
    			System.out.println("\t\t"+pno[i]+"\t\t"+name[i]+"\t\t\t"+age[i]+"\t\t"+phno[i]);
    		}
    	}
    	System.out.println("-----------------------------------------------------------------------------------------");
    	System.out.println();
    	System.out.println();
    	System.out.println("\t\t*** Passenger List in \"SLEEPER\" class ***");
    	System.out.println("-----------------------------------------------------------------------------------------");
    	System.out.println("\t\tPsg.No\t\tNAME\t\t\tAGE\t\tPh.No");
    	System.out.println("-----------------------------------------------------------------------------------------");
    	for(int i=0;i<pcount;i++)
    	{
    		if(cl[i]==3)
    		{
    			System.out.println("\t\t"+pno[i]+"\t\t"+name[i]+"\t\t\t"+age[i]+"\t\t"+phno[i]);
    		}
    		
    	}
    	System.out.println("-----------------------------------------------------------------------------------------");
    }
	}
	
	interface Booking
{
	public void cancelling();
}
class CancelTicket extends PassengerDetails implements Booking
{
		@Override
	public void cancelling()
	{
		int clas=0;
		int psgfound=0;
		System.out.print("\tEnter the Passenger number to cancel the reservation :");
		int p=s.nextInt();
		for(int i=0;i<pcount;i++)
		{
			if(pno[i]==p)
			{
				System.out.println("\n\t\t******Passenger Detail is found and the reservation is cancelled******\n");
				psgfound=1;				
				pno[i]=0;
				name[i]=null;
				clas=cl[i];		
				cl[i]=0;
				age[i]=0;
				phno[i]=null;
			}
		}
		if(psgfound==0)
		{
			System.out.println("No such passenger is found ...");
		}
		if(clas==1)
		{
			max1++;
			System.out.println("\t\t\t*****----Cancellation charges 5% from Original fair----******\n");
			System.out.println("\t\t\t._._._._._.AC class Original fair=1500._._._._._.\n");
			System.out.println("\t\t\t**********  Rs.75(5%) is cancellation charge  **********");
			System.out.println("\n\t\t   ***********  Please collect your refund amount Rs.1425  ***********\n");
			
		}
		if(clas==2)
		{
			max2++;
			System.out.println("\t\t\t*****----Cancellation charges 5% from Original fair----******\n");
			System.out.println("\t\t\t._._._._._.FIRST class Original fair=1200._._._._._.\n");
			System.out.println("\t\t\t**********  Rs.60(5%) is cancellation charge  **********");
			System.out.println("\n\t\t   ***********  Please collect your refund amount Rs.1140  ***********\n");
			
		}
		if(clas==3)
		{
			max3++;
			System.out.println("\t\t\t*****----Cancellation charges 5% from Original fair----******\n");
			System.out.println("\t\t\t._._._._._.SLEEPER class Original fair=1000._._._._._.\n");
			System.out.println("\t\t\t**********  Rs.50(5%) is cancellation charge  **********");
			System.out.println("\n\t\t   ***********  Please collect your refund amount Rs.950  ***********\n");
		}
	}	
}

public class RailwayReservation
{
	static void heading()
	{
		System.out.println();
		System.out.println("\t\t#############################################################");
		System.out.println("\t\t##########                                        ###########");
		System.out.println("\t\t*******    RAILWAY RESERVATION FOR CEG EXPRESS    *********");
		System.out.println("\t\t*******     <--- (Chennai to CEG)--->            *********");
		System.out.println("\t\t##########                                        ###########");
		System.out.println("\t\t#############################################################");
	}
	public static void main(String[] args)
	{
		int flag=1;
		Scanner sc=new Scanner(System.in);
		int op;
		CancelTicket b=new CancelTicket();
		heading();
		while(flag==1)
		{	
			System.out.println("\n\t\t\t<><><><><><><><><><><><><><><><><><><>\n");
			System.out.println("\t\t\t\t\t HOME");
			System.out.println("\t\t\t\t\t^^^^^^");
			System.out.println("\t\t\t1.Ticket Booking\n\t\t\t2.Ticket Cancellation\n\t\t\t3.Searching a Passenger\n\t\t\t4.Display Reservaton Chart\n\t\t\t5.Display No. of Tickets Available\n\t\t\t6.Exit");
			System.out.println("\t\t\t<><><><><><><><><><><><><><><><><><><>\n");
			System.out.print("\tEnter the option:");
			op=sc.nextInt();
			{
				switch(op)
				{
					case 1:
						b.booking();
						break;
					case 2:
						b.cancelling();
						break;
					case 3:
						b.searchPassenger();
						break;
					case 4:
						b.displayList();
						break;
					case 5:
						b.displayAvailable();
						break;
					case 6:
						System.out.println("\t\t*********   EXIT   ***********");
						break;
					default:
						System.out.println("Enter a valid option");	
						break;
				}
			}
				if(op!=6)
				{
					System.out.println("press 1 to go back to HOME");
					System.out.print("Enter here: ");
					flag=sc.nextInt();
					
				}
				else
				{
					break;
				}
			
		}	
	}
}
