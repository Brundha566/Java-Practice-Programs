//Demo : Single Inheritance
class Base             //Super Class
{
	int x,y;			//Data Members 
	void getd()			//Method
	{
		x=10;
		y=20;
	}
}

class Deriv extends Base //Sub Class ==> Deriv --> Deriving Super Class ==> Base
{
	int sum;      //Data member
	void calc()
	{
		sum=x+y;  //x and y members of base class---> Base
		System.out.println("X Value = "+x);  
		System.out.println("Y Value = "+y);
		System.out.println("Result = "+sum);
	}
}


public class Single_Inr 
{
	public static void main(String ar[])
	{
		//Create a Object only for Derived Class==>Deriv
		Deriv obj = new Deriv();
	
		obj.getd(); //Using Derived class object,accessing base class method
		obj.calc();
	}
	
}
