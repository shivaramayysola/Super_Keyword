public class Student
{
	private int sno;
	private String sname;
	private String  course;
	
	public Student(int sno,String sname,String course)
	{
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		@Override
		public int hashCode()

		{
					return sno;
		}
		
	}
}