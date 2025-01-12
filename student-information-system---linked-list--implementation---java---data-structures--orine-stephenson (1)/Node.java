public class Node 
{
	private Student data; // Data Portion of the node
	private Node nextNode; // link to the next node within the list
	
	// Default Constructor
	public Node()
	{
		data = new Student();// (Composition) - initializing the student attibutes by calling the default constructor
		nextNode = null;
	}
	//Primary Constructor 1
	public Node(Student data, Node nextNode)
	{
		data = new Student(data); // calling the copy constuctor of the student class
		this.nextNode = nextNode;
	}
	
	// Primary Constructor 2
	public Node(Student data)
	{
		data= new Student(data);// this.data = data;
		this.nextNode = null; // setting the next node to null
	}
	
	//Primary Constructor 3
	public Node(int idNum, String fName, String lName, float gpa)
	{
		data = new Student(idNum, fName, lName, gpa);
		this.nextNode = null;
	}
	
	// Copy Constructor
	public Node(Node obj)
	{
		this.data = obj.data;
		this.nextNode = obj.nextNode;
	}
	
	// Getters and setters
	public Student getData() {
		return data;
	}
	public void setData(Student data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}// End of Node Class