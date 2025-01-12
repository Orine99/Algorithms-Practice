// Rorron Clarke, February 27, 2023, Student.java


public class Student 
{
	private int idNum;
	private String fName;
	private String lName;
	private float gpa;
	
	// Default Constructor
	public Student()
	{
		idNum =0;
		fName = "";
		lName = "";
		gpa = 0.0f;
	}
	
	// Primary Constructor 
	public Student(int idNum, String fName, String lName, float gpa)
	{
		this.idNum = idNum;
		this.fName = fName;
		this.lName = lName;
		this.gpa = gpa;
	}
	
	// Copy Constructor 
	public Student(Student stu)
	{
		this.idNum = stu.idNum;
		this.fName = stu.fName;
		this.lName = stu.lName;
		this.gpa = stu.gpa;
	}
	
	// Getters and setters 

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	
	// ToString Method
	public String ToString()
	{
		String outPut;
		
		outPut = "<-||Student Information is - Id Number : "+idNum+", Name : "+fName+" "+lName+", GPA: "+gpa +"||->";
		System.out.println(outPut);
		return outPut;
	}
}// End of Student class