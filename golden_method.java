package numeric; // it must be your folder name, write here the folder name



public class golden_method // change the class name, your file name is the class name.
{
	
	public static double func(double a) {
		
		return (Math.PI*a*a/2)+(0.002)/(a); // write your own function here.
		}
	
	public static double goldenfunc(double a, double c) {
		double R=0.618033;
		double result;
		double d = c-a;
		double b1 = a+d*R;
		double b2 = a+d*R*R;
		while (true) {
			if(Math.abs(d)>0.0001){
				if(func(b2)<func(b1)) {
					c=b1;
					d = c-a;
					b1 = a+d*R*R;
					b2= a+d*R*R*R;}
				else{
					a=b2;
					d = c-a;
					b1= a+d*R*R;
					b2 = a+d*R*R*R;}}
			else{
				result = b1;
				break;}}	
			return result ;} 
	public static void main(String[] args) {
		System.out.print(goldenfunc(0.01, 0.2));

	}}
