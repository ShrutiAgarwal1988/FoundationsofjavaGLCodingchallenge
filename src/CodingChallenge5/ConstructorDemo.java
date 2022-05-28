package CodingChallenge5;

public class ConstructorDemo {
	
public ConstructorDemo()
{
	System.out.println("I am default constructor");
}
public ConstructorDemo(int a,float b,String name,char letter)
{
	System.out.println("I am parameterized Constructor");
	int resultofint=a*a;
	float resfl=b*b;
	System.out.println("product of a is"+resultofint);
	System.out.println("product of b is"+resfl);
	System.out.println("name is"+name);
	System.out.println("char is"+letter);
}

public void Observations()
{
	System.out.println("these are the observations");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorDemo obj;
obj=new ConstructorDemo();
obj=new ConstructorDemo(4,0.0f,"shruti",'a');
obj.Observations();
	}

}
