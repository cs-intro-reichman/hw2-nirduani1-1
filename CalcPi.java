public class CalcPi {
	public static void main(String [] args) { 
	    int times = Integer.parseInt(args[0]);
		double sum = 0.0;
		for(int i = 0; i<times; i++){
			sum = sum + Math.pow(-1, i)*(1.0/(2*i+1));
		}
		System.out.println("pi according to Java: "+ Math.PI);
		System.out.println("pi, approximated:     "+ sum*4); 
	}
}
