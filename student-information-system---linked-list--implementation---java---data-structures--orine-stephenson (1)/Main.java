

public class Main
{

	public static void main(String[] args) 
	{
		// Creating objects using the primary construtor of the Student (data) class
		Student stud1 = new Student(567, "Akinlabi", "Hendricks", 3.25f);
		Student stud2 = new Student(577,"Benjamin", "Robinson", 3.87f);
		Student stud3 = new Student(587,"Renae", "Beckford",3.61f);
		Student stud4 = new Student(597, "Shavaun", "Palmer",3.91f);
		Student stud5 = new Student(607,"Tanea","Bacas", 4.0f);
		Student stud6 = new Student(617,"Tasheka", "Baboram", 4.2f);
		
		// declare an empty listedlist using the default constructor
		LinkedList list = new LinkedList();
		
		// Check to see if the list is empty or not
		System.out.println("Checking if list is empty : "+list.IsEmpty());
		
		System.out.println("\n************************************\n");
		
		// Check to see if the list is empty or not
		System.out.println("Checking if list is Full : "+list.IsFull());
				
		System.out.println("\n************************************\n");
		
		// Check to see if the list is empty or not
		System.out.println("Number of elements in list is : "+list.CountNode());
		
		list.InsertAtBack(stud1);
		list.InsertAtBack(stud2);
		list.InsertAtBack(stud3);
		list.DisplayList();
		
		System.out.println("\n************************************\n");
		
		// Check to see if the list is empty or not
				System.out.println("Checking if list is empty : "+list.IsEmpty());
				
				System.out.println("\n************************************\n");
				
				// Check to see if the list is empty or not
				System.out.println("Checking if list is Full : "+list.IsFull());
						
				System.out.println("\n************************************\n");
				
				// Check to see if the list is empty or not
				System.out.println("Number of elements in list is : "+list.CountNode());
		
		
	}

}