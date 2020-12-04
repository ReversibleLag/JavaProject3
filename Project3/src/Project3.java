/*
-Project 3
-Kai South, Michael Hancock, Winston Riley, Courtney Than
-(TA Notes) -
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.io.PrintWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

class Project3 {
	public static int z;
	public static int q;
	public static void main(String[] args) {

		PrintWriter report = null;
		try {
			File Report = new File("report.dat");
			FileWriter fw = new FileWriter(Report, true);
			report = new PrintWriter(fw);
			
//			
//		Faculty F = new Faculty();
//		Student S = new Student();
		String option;

		
		Report = new File("report.dat");
		try {
			report = new PrintWriter(Report);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Student [] Student = new Student[100];
		
		//make sure to cast to the correct object type with ((Student)p)
		ArrayList<Person> people = new ArrayList<Person>();

		System.out.println("\t\t\t\t\tWelcome to my Personal Management Program");
		System.out.println("\tChoose one of the options: \n");
		
		//called option menu and selection switch every while not exit condition
		do {
		option = menu();
		
		
  		switch (option)
  		{
	  		//Add a new Faculty member
	  		case "1":
	  			System.out.println("Enter the Faculty's info:\n");
	  			System.out.print("\t\tName of the Faculty: ");
	  			String userFacName = new Scanner(System.in).nextLine();
	  			
	  			System.out.print("\n\t\tID: ");
	  			String userFacID = new Scanner(System.in).nextLine();
	  			
	  			try
	  			{
  					if(userFacID.length() != 6)
  					{
  						throw new InputMismatchException();
  					}
		  			if(!Character.isLetter(userFacID.charAt(0)))
	  				{
	  					throw new InputMismatchException();
	  				}
	  				if(!Character.isLetter(userFacID.charAt(1)))
	  				{
	  					throw new InputMismatchException();
	  				}
	  				if(!Character.isDigit(userFacID.charAt(2)))
	  				{
	  					throw new InputMismatchException();
	  				}
	  				if(!Character.isDigit(userFacID.charAt(3)))
	  				{
	  					throw new InputMismatchException();
	  				}
	  				if(!Character.isDigit(userFacID.charAt(4)))
	  				{
	  					throw new InputMismatchException();
	  				}
	  				if(!Character.isDigit(userFacID.charAt(5)))
	  				{
	  					throw new InputMismatchException();
	  				}
	  			}
  				catch(InputMismatchException e)
  				{
  					System.out.println("\n\tSorry Invalid id format-It has to be LetterLetterDigitDigitDigitDigit\n");
  					break;
  				}
	  			System.out.print("\n\t\tRank: ");
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
	  				
	  				System.out.printf("\n\t\t\tSorry entered rank (%s) is invalid\n", userFacRank);
	  				
	  				System.out.print("\n\t\tInput Rank again: ");
		  			userFacRank = new Scanner(System.in).nextLine();
		  			
		  			
	  			}
	  			
	  			System.out.print("\n\t\tDepartment: ");
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
	  				
	  				System.out.printf("\n\t\t\tSorry entered department (%s) is invalid\n", userFacDepart);
	  				
	  				System.out.print("\n\t\tInput Department again: ");
		  			userFacDepart = new Scanner(System.in).nextLine();
		  			
	  			}

	  			System.out.println("\n\n\tThanks!\n");
	  			
	  			
	  			
	  			people.add(new Faculty(userFacName, userFacID, userFacRank, userFacDepart));
	  			z+=1;
	  			break;
	  		
	  		//Add a new Student
	  		case "2":
	  			
	  			
	  			System.out.print("Enter the Student's info: "); 
	  			
	  			System.out.print("\n\n\t\tName of Student: ");
	  			String name = new Scanner(System.in).nextLine();
	  			
	  			
  				System.out.print("\n\t\tID: ");
  				String id = new Scanner(System.in).nextLine();
  				
  				try {
  					if(id.length() != 6)
  					{
  						throw new InputMismatchException();
  					}
	  				if( !Character.isLetter(id.charAt(0)))
	  				{
	  					throw new InputMismatchException();
	  				}
	  				if( !Character.isLetter(id.charAt(1)))
	  				{
	  					throw new InputMismatchException();
	  				}
	  				if( !Character.isDigit(id.charAt(2)))
	  				{
	  					throw new InputMismatchException();
	  				}
	  				if(!Character.isDigit(id.charAt(3)))
	  				{
	  					throw new InputMismatchException();
	  				}
	  				if(!Character.isDigit(id.charAt(4)))
	  				{
	  					throw new InputMismatchException();
	  				}
	  				if(!Character.isDigit(id.charAt(5)))
	  				{
	  					throw new InputMismatchException();
	  				}
	  				
	  				
  				}
  				catch(InputMismatchException e)
  				{
  					System.out.println("\n\tSorry Invalid id format-It has to be LetterLetterDigitDigitDigitDigit\n");
  					break;
  				}
  				
  				try
  				{
  					System.out.print("\n\t\tGpa: ");
		  			double gpa = new Scanner(System.in).nextDouble();
		  			
		  			System.out.print("\n\t\tCredit hours: ");
		  			int hours = new Scanner(System.in).nextInt();
		  			
		  			System.out.println("\n\n\tThanks!\n");
		  			
		  			people.add(new Student(name, id, gpa, hours));
		  			//Students.add(new Student(name, id, gpa, hours));
		  			
		  			z+=1;
		  			break;
  				}
  				catch(InputMismatchException e)
  				{
  					System.out.println("\nSorry Invalid format - Double or Integer only\n");
  					break;
  				}
	  			
	  		
	  		//Print tuition invoice for a Student
	  		case "3":
	  			boolean foundStud = false;
	  			
	  			System.out.print("\tEnter the Student's id: ");
	  			String StudentId = new Scanner(System.in).nextLine();
	  			

	  				if(people.isEmpty())
		  			{
		  				System.out.println("\nSorry-there are no people in the list!\n\n\n");
		  				break;
		  			}	

	  			for(Person p1: people)
	  			//for(Student p: Students)
	  			{
	  				//add a print method to print the id of the Students
	  				//System.out.println(p.getID());
	  				
	  				//test if get id is working
	  				//System.out.println(p.getID());
	  				if((p1.getClass() == Student.class) && p1.getID().equalsIgnoreCase(StudentId))
	  				{
	  					//change this to correct stuff
	  					((Student)p1).printInvoice();
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
	  		
	  		//Print information of a Faculty
	  		case "4":
	  			boolean foundFac = false;
	  			System.out.print("\t\tEnter the Faculty's id: ");
	  			String userPrintID = new Scanner(System.in).nextLine();
	  			
	  			System.out.print("\n");
	  			
	  			for(Person p1: people) {
		  			if((p1.getClass() == Faculty.class) &&(userPrintID).equalsIgnoreCase(p1.getID()))
		  			{
		  				((Faculty)p1).printFaculty();
		  				
		  				/*System.out.println("\nFaculty found:");
		  				System.out.println("\n\t-------------------------------------------------------------------------------------------------------------------------------------");
		  				System.out.printf("\n\t%s", p.getFullName());
		  				System.out.printf("\n\n\t%s Department, %s\n", ((Faculty)p).getFacDepart(), ((Faculty)p).getFacRank());
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
	  			System.out.println("\n");
	  			System.out.print("\tWould you like to create the report? (Y/N): ");
	  			Scanner sc = new Scanner(System.in);
	  			String reportPrint = sc.nextLine();
	  			if (reportPrint.equals("Y") || reportPrint.equals("y") ) {
	  				Date date = new Date();
	  				SimpleDateFormat format = new SimpleDateFormat("MM-dd-yy");
	  				
	  				report.println("\t\tReport created on " + format.format(date));
	  				report.println("Faculty Members (sorted by Department)");
	  				report.println("--------------------------------------");
	  				for (int i = 0; i < z; i++)
	  				{
	  					if(!people.get(i).isStudent()) {
	  						q+=1;
	  					report.printf("\t%d. %s\n", q, (((Faculty) people.get(i)).getFacName()));
		  				report.printf("\tID: %s\n", (((Faculty) people.get(i)).getFacID()));
		  				report.printf("\t%s, %s\n", (((Faculty) people.get(i)).getFacRank()), ((Faculty) people.get(i)).getFacDepart());

	  					}
	  				}
	  				report.println("\nStudents");
	  				report.println("-----------");
	  				q = 0;
	  				for (int i = 0; i < z; i++)
	  				{
	  					if(people.get(i).isStudent()) {
	  					q+=1;
	  					report.printf("\t%d. %s\n", q, ((Student) people.get(i)).getFullName());
		  				report.printf("\tID: %s\n", ((Student) people.get(i)).getID());
		  				report.printf("\tGpa: %.2f\n", ((Student) people.get(i)).getGPA());
		  				report.printf("\tCredit hours: %d\n", ((Student) people.get(i)).getNumCreditHours());
	  					}
	  				}
	  			} else {
	  				System.out.println("Thanks! Goodbye!");
	  				return;
	  			}
	  			report.flush();
//			try {
//				((Closeable) Report).close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	  			
	  			System.out.println("\tYour file has been created!");
	  			System.out.println("\tGoodbye!");
	  			break;
	  			
	  		default:
	  			System.out.println("\tInvalid entry- please try again\n\n");
	  			break;
	  			
  		
  		}		
		
		//exit condition
		}while (!option.equals("5"));} catch (IOException e) {
		     e.printStackTrace();
		  } finally {
			  if (report != null) {
			  report.close();  
			  }
		  }
		
	}
	



	//menu of the main selection
  	private static String menu()
    {
  		//option to return
  		String option;

			// gets input
			new Scanner(System.in);


			// Title sequence

			System.out.println("\t1- Add a new Faculty member");
			System.out.println("\t2- Add a new Student");
			System.out.println("\t3- Print tuition invoice for a Student");
			System.out.println("\t4- Print information of a Faculty");
			System.out.println("\t5- Exit Program\n");

			//get the user selection
			System.out.print("\t\tEnter your selection: ");
			option = new Scanner(System.in).nextLine();

			//formatting
			System.out.print("\n");
			
			//return out the selection
			return option;
    }
  	
}
  		
//====================================================================================
//====================================================================================

  	abstract class Person {
  		
  		//required things for Student and Faculty 
  		private String fullName;
  		private String ID;
  		
  		
  		public void Person()
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
  		
  		public boolean isStudent() {
  			return false;
  		}
  		

  		
  		
  	}

  	

  //====================================================================================
  //====================================================================================
  	
  	class Faculty extends Person{
  		private String FacultyDepart;
  		private String FacultyRank;
  		
  		//default constructor
  		public Faculty()
  		{
  			super();
  			FacultyDepart = "";
  			FacultyRank = "";
  			
  		}
  		
  		//constructor
  		public Faculty (String userFacName, String userFacID, String userFacRank, String userFacDepart)
  		{
  			String lowercaseStringDept = userFacDepart.toLowerCase();
  			userFacDepart = lowercaseStringDept;
  			
  			String lowercaseStringRank = userFacRank.toLowerCase();
  			userFacRank = lowercaseStringRank;
  			super.setFullName(userFacName);
  			super.setID(userFacID);
  			FacultyDepart = userFacDepart;
  			FacultyRank = userFacRank;
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
  			return FacultyRank;
  		}
  		
  		public String getFacDepart()
  		{
  			return FacultyDepart;
  		}
  		
  		public void printFaculty()
  		{
  				System.out.println("\n\tFaculty found:");
  				System.out.println("\n\t\t-------------------------------------------------------------------------------------------------------------------------------------");
  				System.out.printf("\n\t\t%s", getFullName());
  				System.out.printf("\n\n\t\t%s Department, %s\n", getFacDepart(), getFacRank());
  				System.out.println("\n\t\t-------------------------------------------------------------------------------------------------------------------------------------\n");

  		}
  		@Override
  		public boolean isStudent() {
  			return false;
  		}
  		
  		
  	}


  //====================================================================================
  //====================================================================================
  	
  	//class that handles the Students
  	class Student extends Person{
  		
  		private double GPA;
  		private int numCreditHours;
  		NumberFormat myFormat = NumberFormat.getInstance();
  		
  		
  		//default constructor
  		public Student()
  		{
  			super.setFullName("");
  			super.setID("");
  			this.GPA = 0.0;
  			this.numCreditHours = 0;
  			
  		}
  		
  		//constructor
  		public Student(String name, String ID, double GPA, int numCreditHours)
  		{
  			super.setFullName(name);
  			super.setID(ID);
  			this.GPA = GPA;
  			this.numCreditHours = numCreditHours;
  		}
  		
  		
  		
  		
  		
  		//gets the full name of the Person this class represents
  		@Override
  		public String getFullName() {
  			// TODO Auto-generated method stub
  			return super.getFullName();
  		}
  		
  		//set the name of the Student class
  		@Override
  		public void setFullName(String fullName) {
  			// TODO Auto-generated method stub
  			super.setFullName(fullName);
  		}
  		
  		//gets the id of the Person class associated with this object
  		@Override
  		public String getID() {
  			return super.getID();
  		}
  		
  		
  		//set the id of the Student class
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
  				
  				System.out.print("\n\n\n\n\tTotal payment: $ " + myFormat.format(Student_calculations())  + " ");
  				if ((getGPA()) >= 3.85) {
  					System.out.printf("\t25%% off discout applied");
  				} else {
  					System.out.printf("($0 discount applied)");
  				}
  				System.out.println("\n\n\t---------------------------------------------------------------------------");
  		}
  		
  		public double Student_calculations() 
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
  		@Override
  		public boolean isStudent() {
  			return true;
  		}
  			
  	}
	
  	//====================================================================================
    //====================================================================================
  	
