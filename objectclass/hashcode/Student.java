import java.util.Objects;
class Student
{
	int sid;
	String sName;
	Student(int sid,String sName)
	{
		this.sid=sid;
		this.sName=sName;
	}

//	public int hashcode()
	//{
	//	return Objects.hash(sid,sName);
//	}
	public static void main(String[] args) 
	{
		Student s1 = new Student(3,"abbhii");
		Student s2 = new Student(3,"abbhii");
		System.out.println(s1.);
		System.out.println(s2.hashcode());
	}
}

