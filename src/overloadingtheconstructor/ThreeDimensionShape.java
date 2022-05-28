package overloadingtheconstructor;

public class ThreeDimensionShape {
double width,height,depth;
ThreeDimensionShape()
{
	//doesnt accept any parameter
	//constructor defined when no dimension is specified
	width=height=depth=0;
}
ThreeDimensionShape(double length)
{
	//when only length is specified that is cube;
	
	width=height=depth=length;
}
ThreeDimensionShape(double w,double h,double d)
{
	width=w;
	height=h;
	depth=d;
}
double volume()
{
	return width*height*depth;
}
}
