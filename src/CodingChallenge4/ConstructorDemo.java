package CodingChallenge4;

public class ConstructorDemo {
ConstructorDemo()
{
	System.out.println("this is default constructor");
	
}
//creating parameterized constructor
ConstructorDemo(int age,String position)
{
	System.out.println("age is"+age);
	System.out.println("position is"+position);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorDemo obj=new ConstructorDemo();
obj=new ConstructorDemo(33,"associate");

	}

}

