package codingchallenge8;

public class StaticFinalDemo {
static int var2=10; //memory is allocated only once but value on iteration changes
int var1=10;
void method1() {
	var1++; //everytime new memory is created with same value
	System.out.println("value of integer type 1:"+var1);
}

void method2()
{
	var2++;
	System.out.println("value of static variable:"+var2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticFinalDemo obj=new StaticFinalDemo();
StaticFinalDemo obj1=new StaticFinalDemo();
StaticFinalDemo obj2=new StaticFinalDemo();
obj.method1();
obj1.method1();
obj2.method1();


obj.method2();
obj1.method2();
obj2.method2();
	}

}
