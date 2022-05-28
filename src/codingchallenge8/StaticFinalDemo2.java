package codingchallenge8;

public class StaticFinalDemo2 {
final int var2=10; //memory is allocated only once but value on iteration changes
int var1=10;
void method1() {
	var1++; //everytime new memory is created with same value
	System.out.println("value of integer type 1:"+var1);
}

void method2()
{
	var2++; //showing error as final var value cannot be changed
	System.out.println("value of final variable:"+var2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticFinalDemo2 obj=new StaticFinalDemo2();
StaticFinalDemo2 obj1=new StaticFinalDemo2();
StaticFinalDemo2 obj2=new StaticFinalDemo2();
obj.method1();
obj1.method1();
obj2.method1();


obj.method2();
obj1.method2();
obj2.method2();
	}

}
