package codingchallenge7;

public class Area {
final double pi=3.14d;
double result=0.0d,radius=5.0d;
void AreaOfCircle()
{
	result=pi*radius*radius;
	System.out.println("area of circle is"+result);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Area obj=new Area();
obj.AreaOfCircle();
	}

}
