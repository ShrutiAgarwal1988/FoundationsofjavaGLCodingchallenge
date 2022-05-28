package overloadingtheconstructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreeDimensionShape obj1=new ThreeDimensionShape();
ThreeDimensionShape obj2=new ThreeDimensionShape(8);
ThreeDimensionShape obj3=new ThreeDimensionShape(5,6,7);

//calculating volume of cube


System.out.println("volume of cube is"+obj2.volume());
//calculating volume of cuboid when no dimensions are given

System.out.println("volume of cuboid when no dimensions are given"+obj1.volume());
//calculating volume of cuboid when all dimensions are given

System.out.println("volume of cuboid when all 3 dimensions are given"+obj3.volume());

	}

}
