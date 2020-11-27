/*
-Project 3
-Kai South, Michael Hancock, Winston Riley, Courtney Than
-(TA Notes) -
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;
import java.math.RoundingMode;
import java.text.DecimalFormat;


class Project3 {
	public static void main(String[] args) {
		String option;
		
		//Student1 [] Student1 = new Student1[100];
		
		//make sure to cast to the correct object type with ((Student1)p)
		ArrayList<Person1> people = new ArrayList<Person1>();

		System.out.println("\t\t\t\t\tWelcome to my Personal Management Program");
		System.out.println("Choose one of the options: \n");
		
		//called option menu and selection switch every while not exit condition
		do {
		option = menu();
		
		
  		switch (option)
  		{
	  		//Add a new Faculty11 member
	  		case "1":
	  			
	  			System.out.println("Enter the Faculty's info:\n");
	  			System.out.print("\tName of the Faculty: ");
	  			String userFacName = new Scanner(System.in).nextLine();
	  			
	  			System.out.print("\n\tID: ");
	  			String userFacID = new Scanner(System.in).nextLine();
	  			
	  			System.out.print("\n\tRank: ");
	  			String userFacRank = new Scanner(System.in).nextLine();
	  			
	  			while (!userFacRank.equalsIgnoreCase("Professor"))
	  			{
		  			if(userFacRank.equalsIgnoreCase("Adjunct"))
		  			{
		  				userFacRank = "Adjunct";
		  				break;
		  			}
		  			else if(userFacRank.equalsIgnoreCase("Professor"))
		  			{
		  				userFacRank = "Professor";
		  				break;
		  			}
	  				
	  				System.out.printf("\n\t\tSorry entered rank (%s) is invalid\n", userFacRank);
	  				
	  				System.out.print("\n\tInput Rank again: ");
		  			userFacRank = new Scanner(System.in).nextLine();
		  			
		  			
	  			}
	  			
	  			System.out.print("\n\tDepartment: ");
	  			String userFacDepart = new Scanner(System.in).nextLine();
	  			
	  			while (!userFacDepart.equalsIgnoreCase("Mathematics"))
	  			{
		  			if(userFacDepart.equalsIgnoreCase("Engineering"))
		  			{
		  				userFacDepart = "Engineering";
		  				break;
		  			}
		  			else if(userFacDepart.equalsIgnoreCase("Physics"))
		  			{
		  				userFacDepart = "Physics";
		  				break;
		  			}
		  			else if(userFacDepart.equalsIgnoreCase("Mathematics"))
		  			{
		  				userFacDepart = ("Mathematics");
		  				break;
		  			}
	  				
	  				System.out.printf("\n\t\tSorry entered department (%s) is invalid\n", userFacDepart);
	  				
	  				System.out.print("\n\tInput Department again: ");
		  			userFacDepart = new Scanner(System.in).nextLine();
		  			
	  			}

	  			System.out.println("\n\nThanks!\n");
	  			
	  			
	  			
	  			people.add(new Faculty1(userFacName, userFacID, userFacRank, userFacDepart));
	  			break;
	  		
	  		//Add a new Student1
	  		case "2":
	  			
	  			
	  			System.out.print("Enter the Student's info: "); 
	  			
	  			System.out.print("\n\n\tName of Student: ");
	  			String name = new Scanner(System.in).nextLine();
	  			
	  			System.out.print("\n\tID: ");
	  			String id = new Scanner(System.in).nextLine();
	  			
	  			System.out.print("\n\tGpa: ");
	  			double gpa = new Scanner(System.in).nextDouble();
	  			
	  			System.out.print("\n\tCredit hours: ");
	  			int hours = new Scanner(System.in).nextInt();
	  			
	  			System.out.println("\n\nThanks!\n");
	  			
	  			people.add(new Student1(name, id, gpa, hours));
	  			//Student1s.add(new Student1(name, id, gpa, hours));
	  			
	  			
	  			break;
	  		
	  		//Print tuition invoice for a Student1
	  		case "3":
	  			boolean foundStud = false;
	  			
	  			System.out.print("\tEnter the Student's id: ");
	  			String Student1Id = new Scanner(System.in).nextLine();
	  			
	  			
	  			if(people.isEmpty())
	  			{
	  				System.out.println("\nSorry-there are no people in the list!\n\n\n");
	  			}
	  			for(Person1 p: people)
	  			//for(Student1 p: Student1s)
	  			{
	  				//add a print method to print the id of the Student1s
	  				//System.out.println(p.getID());
	  				
	  				//test if get id is working
	  				//System.out.println(p.getID());
	  				if((p.getClass() == Student1.class) && p.getID().equalsIgnoreCase(Student1Id))
	  				{
	  					//change this to correct stuff
	  					((Student1)p).printInvoice();
	  					foundStud = true;
	  					break;
	  				}
	  				else
	  				{
	  					continue;
	  				}
	  				
	  			}
	  			if(!foundStud)
	  			{
	  				System.out.println("\nSorry-Student not found!\n\n\n");
	  			}
	  			break;
	  		
	  		//Print information of a Faculty11
	  		case "4":
	  			boolean foundFac = false;
	  			System.out.print("\tEnter the Faculty's id: ");
	  			String userPrintID = new Scanner(System.in).nextLine();
	  			
	  			for(Person1 p: people) {
		  			if((p.getClass() == Faculty1.class) &&(userPrintID).equalsIgnoreCase(p.getID()))
		  			{
		  				((Faculty1)p).printFaculty11();
		  				
		  				/*System.out.println("\nFaculty11 found:");
		  				System.out.println("\n\t-------------------------------------------------------------------------------------------------------------------------------------");
		  				System.out.printf("\n\t%s", p.getFullName());
		  				System.out.printf("\n\n\t%s Department, %s\n", ((Faculty11)p).getFacDepart(), ((Faculty11)p).getFacRank());
		  				System.out.println("\n\t-------------------------------------------------------------------------------------------------------------------------------------\n");
		  				*/
		  				foundFac = true;
		  				break;
		  			}
		  			else {
		  				continue;
		  			}
	  			}
	  			
	  			if(!foundFac)
	  			{
	  				System.out.printf("\n\tSorry %s doesn't exist\n\n\n", userPrintID);
	  			}
	  			break;
	  		
	  		//exit program
	  		case "5":
	  			System.out.println("\tGoodbye!");
	  			break;
	  			
	  		default:
	  			System.out.println("Invalid entry- please try again\n\n");
	  			break;
	  			
  		
  		}		
		
		//exit condition
		}while (!option.equals("5"));
		
	}
	

	//menu of the main selection
  	private static String menu()
    {
  		//option to return
  		String option;

			// gets input
			new Scanner(System.in);


			// Title sequence

			System.out.println("1- Add a new Faculty member");
			System.out.println("2- Add a new Student");
			System.out.println("3- Print tuition invoice for a Student");
			System.out.println("4- Print information of a Faculty");
			System.out.println("5- Exit Program\n");

			//get the user selection
			System.out.print("\tEnter your selection: ");
			option = new Scanner(System.in).nextLine();

			//formatting
			System.out.print("\n\n");
			
			//return out the selection
			return option;
    }
  	
}
  		
//====================================================================================
//====================================================================================

  	abstract class Person1 {
  		
  		//required things for Student1 and Faculty11 
  		private String fullName;
  		private String ID;
  		
  		
  		public void Person1()
  		{
  			fullName = "";
  			ID = "";
  			
  		}
  		
  		public String getFullName() {
  			return fullName;
  		}
  		
  		public void setFullName(String fullName) {
  			this.fullName = fullName;
  		}
  		
  		public String getID() {
  			return ID;
  		}
  		
  		public void setID(String iD) {
  			ID = iD;
  		}
  		

  		
  		
  	}

  	

  //====================================================================================
  //====================================================================================
  	
  	class Faculty1 extends Person1{
  		private String Faculty1Depart;
  		private String Faculty1Rank;
  		
  		//default constructor
  		public Faculty1()
  		{
  			super();
  			Faculty1Depart = "";
  			Faculty1Rank = "";
  			
  		}
  		
  		//constructor
  		public Faculty1 (String userFacName, String userFacID, String userFacRank, String userFacDepart)
  		{
  			super.setFullName(userFacName);
  			super.setID(userFacID);
  			Faculty1Depart = userFacDepart;
  			Faculty1Rank = userFacRank;
  		}
  		
  		public String getFacName()
  		{
  			return super.getFullName();
  		}
  		
  		public String getFacID()
  		{
  			return super.getID();
  		}
  		
  		public String getFacRank()
  		{
  			return Faculty1Rank;
  		}
  		
  		public String getFacDepart()
  		{
  			return Faculty1Depart;
  		}
  		
  		public void printFaculty11()
  		{
  				System.out.println("\nFaculty found:");
  				System.out.println("\n\t-------------------------------------------------------------------------------------------------------------------------------------");
  				System.out.printf("\n\t%s", getFullName());
  				System.out.printf("\n\n\t%s Department, %s\n", getFacDepart(), getFacRank());
  				System.out.println("\n\t-------------------------------------------------------------------------------------------------------------------------------------\n");

  		}
  		
  		
  	}


  //====================================================================================
  //====================================================================================
  	
  	//class that handles the Student1s
  	class Student1 extends Person1{
  		
  		private double GPA;
  		private int numCreditHours;
  		NumberFormat myFormat = NumberFormat.getInstance();
  		
  		
  		//default constructor
  		public Student1()
  		{
  			super.setFullName("");
  			super.setID("");
  			this.GPA = 0.0;
  			this.numCreditHours = 0;
  			
  		}
  		
  		//constructor
  		public Student1(String name, String ID, double GPA, int numCreditHours)
  		{
  			super.setFullName(name);
  			super.setID(ID);
  			this.GPA = GPA;
  			this.numCreditHours = numCreditHours;
  		}
  		
  		
  		
  		
  		
  		//gets the full name of the Person1 this class represents
  		@Override
  		public String getFullName() {
  			// TODO Auto-generated method stub
  			return super.getFullName();
  		}
  		
  		//set the name of the Student1 class
  		@Override
  		public void setFullName(String fullName) {
  			// TODO Auto-generated method stub
  			super.setFullName(fullName);
  		}
  		
  		//gets the id of the Person1 class associated with this object
  		@Override
  		public String getID() {
  			return super.getID();
  		}
  		
  		
  		//set the id of the Student1 class
  		@Override
  		public void setID(String iD) {
  			// TODO Auto-generated method stub
  			super.setID(iD);
  		}

  		public double getGPA() {
  			return GPA;
  		}

  		public void setGPA(double gPA) {
  			GPA = gPA;
  		}

  		public int getNumCreditHours() {
  			return numCreditHours;
  		}

  		public void setNumCreditHours(int numCreditHours) {
  			this.numCreditHours = numCreditHours;
  		}
  		
  		public void printInvoice()
  		{
  				System.out.println("\tHere is the tuition invoice for " + getFullName());
  				System.out.println("\n\n\t---------------------------------------------------------------------------");
  				System.out.println("\n\t" + getFullName() + "                    " + getID());
  				System.out.println("\n\tCredit Hours: " + getNumCreditHours() + "  ($236.45/credit hour)");
  				System.out.println("\n\tFees: $52" );
  				
  				System.out.print("\n\n\n\n\tTotal payment: $ " + myFormat.format(Student1_calculations())  + " ");
  				if ((getGPA()) >= 3.85) {
  					System.out.printf("\t25%% off discout applied");
  				} else {
  					System.out.printf("($0 discount applied)");
  				}
  				System.out.println("\n\n\t---------------------------------------------------------------------------");
  		}
  		
  		public double Student1_calculations() 
  		{
  			double total_payment;
  			double credit_hours =getNumCreditHours();
  			total_payment =(236.45 * credit_hours);
  				if (getGPA() >= 3.85) 
  				{
  					total_payment = total_payment * .75;
  				}
  			total_payment= ((Math.round(total_payment * 100.0)/100.0) +52.0);
  			return total_payment;
  				
  		}
  			
  	}
	

