// using operator
class demoint
{
	public static void main(String [] args)
	{
		int a=10,b=20,add,sub,multi,div,mod,base = 3, exponent = -4;
		add=a+b;
		sub=a-b;
		multi=a*b;
		div=b/a;
		mod=b%a;
		System.out.println("a+b="+add);
		System.out.println("a-b="+sub);
		System.out.println("a*b="+multi);
		System.out.println("b/a="+div);
		System.out.println("b%a="+mod);
	//to calculate the power of the function	
        double result = Math.pow(base, exponent);

        System.out.println("Answer = " + result);
	}
}
