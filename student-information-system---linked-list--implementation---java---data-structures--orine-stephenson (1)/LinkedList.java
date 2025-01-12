// Rorron Clarke, February 27, 2023, LinkedList.java


import java.awt.List;

public class LinkedList 
{
	private Node head; // head points to the first element in the list
	
	// Default Constructor
	public LinkedList()// creating an empty list
	{
		head = null;
	}
	
	// Primary Constructor
	public LinkedList(Node head)
	{
		this.head = head; // create a list with one element
	}
	
	// Getters and Setters
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	
	// InsertAtFront Method
	public void InsertAtFront(Student dataToInsert)
	{
		Node temp; // declaring temp as a reference(pointer) to the memory address of the node
		temp = new Node(); // calling the default constructor and attempting to reserve memory for temp
		
		if(temp != null)
		{
			temp.setData(dataToInsert); // set the data of the new node
			temp.setNextNode(null);// set the link portion to point to null
			
			if(head == null)// if list is empty
			{
				head = temp;
			}
			else // if the list was not empty
			{
				temp.setNextNode(head); // point temp next node to the head
				head = temp;
			}
		}
		else // if memory was not allocated successfully
		{
			System.err.println("Error. The list is full (out of memory).  The list can not add a new node. ");
		}
	}// End of InsertAtFront Method
	
	// InsertAtBack Method
	public void InsertAtBack(Student dataToInsert)
	{
		Node temp1; // use temp1 to add to the list
		Node temp2; // use temp2 (pointer) reference to assist in traversing the list
		
		temp1 = new Node(); //intitializing temp1 using the default constructor
	
		if(temp1 != null)
		{
			temp1.setData(dataToInsert);// setting the data of the new node.
			temp1.setNextNode(null); // set the link portion of the node to point to null.
			
			if(head == null) // if the list is empty.
			{
				head = temp1; // setting head to point to the new node to be added to the list
			}
			else // if the was not empty
			{
				temp2 = head; //initalize temp node to point to the first element in the list
				
				while(temp2.getNextNode() != null) // while we are not at the last node in the list
				{
					temp2 = temp2.getNextNode();// we are moving the current node temp2 to it's next Node.
				}
				temp2.setNextNode(temp1);// set the link portion of the last node to point to the nexw node we are trying to add to the list
				
			}
		}
		else // if memory was not allocated successfull
		{
			System.err.println("Error. List is full, it can not add a new node. ");
		}
	}// End of InsertATBack Method
	
	
	// Inserting at the back using the attributes from the student class
	public void InsertAtBack(int idNum, String fName, String lName, float gpa)
	{
		Node temp1 = new Node(idNum, fName, lName, gpa); // initializing temp1 using the primary constructor
		
		if(temp1 != null)// if memory was allocated successfully
		{
			if(head == null)// if the list is empty.
			{
				head = temp1; // set head to point to the new node to be added to the list
			}
			else // if the list was not empty
			{
				Node temp2 = head; // initializing temp node to point to the first element in the list
			
				while(temp2.getNextNode() != null) // while we are not at the last node in the list 
				{
					temp2.getNextNode(); // move the current node (temp2) to it's next node
				}
				temp2.setNextNode(temp1); // set the link portion (nextNode) of the last node to point to the new node that we trying to add to the list
			}
		}
		else // if memory was not allocated successfully
		{
			System.err.println("Error. List is full (out of memory), can not add a new node");
		}
	}  // End of the InsertAtBack Method using attributes from student class

	
	// Adding the Count Node Method
	public int CountNode()
	{
		int count = 0; // initializing counter 
		Node curr = head; // initializing curr to point to the first element in the list
		
		while(curr != null) // while curr is not empty
		{
			count++; // incrementing counter count = count +1 //count = 0 +1
			curr = curr.getNextNode(); // pointing curr to the next node in list
		}
		return count;
	}// End of CountNode method
	
	
	// Method to search for a node within the list
	public boolean SearchForNode(int key) // Searching for idNum of the specific student
	{
		boolean isFound = false; // initialize isFound to "false"
		
		Node curr = head; //pointing curr to the first element in the list
		
		while(curr != null) // while curr is pointing to a node in the list
		{
			if(curr.getData().getIdNum() == key) // if the curr node has the data we are searching for
			{
				isFound = true; // set the boolean to true. Indicating that the element is found.
				break; // jump out of the look
			}
			curr = curr.getNextNode(); // pointing to nextNode in the list until we find the key we are searching for 
		}
		return isFound;
	} // End of SearchforNode Method
	
	// // Display list Method
	public void DisplayList()
	{
		Node curr = head; // point curr to the first element in the list
		
		while(curr != null) // while the list is not empty.
		{
			System.out.println("Student Data is : "+ curr.getData().ToString()+ " - ");
			curr = curr.getNextNode(); // point curr to the next node in the list
		}
		System.out.println(" End of list. ");
	}// End of DisplayList Method
	
	// IsEmpty Method
	public boolean IsEmpty()
	{
		if(head == null) // if the list is empty
		{
			return true; // return true if the list is empty
		}
			return false; // the list is empty
	}// end of IsEmpty Method
	
	// IsFull Method
	public boolean IsFull()
	{
		Node temp = new Node(); // attempting to reserve space for a new node
		
		if(temp != null)
		{
			temp = null; // deleting temp , deallocating the memory for temp
			return false;
		}
		return true;
	} // end of IsFull Method
	
	// DeleteNode Method
	public Student DeleteNode(int key)// accepting an idNum as argument
	{
		Student dataToReturn = new Student(); // calling the default constructor of student class
		
		if(!IsEmpty())
		{
			Node curr = head; // pointing curr to the first element in the list
			Node prev = null;
			
			while(curr != null) 
			{
				if(curr.getData().getIdNum() == key)// if the curr node has the data
				{
					if(curr == head) // if curr is point to the  ( if we are deleting the first node in the list
					{
						head = head.getNextNode(); // point head to it's next node
					}
					else
					{
						prev.setNextNode(curr.getNextNode());// setting the next node of the prev next node to the curr next node
					}
					dataToReturn = curr.getData(); // capture data from node to be deleted
					curr = null;
					break; // jump out of the look
				}
				prev = curr;
				curr = curr.getNextNode(); //point curr to it's next node
			}
		}
		else
		{
			System.err.println("Error.list full.		");
		}
		return dataToReturn;
	} // End of DeleteNode Method
	
}