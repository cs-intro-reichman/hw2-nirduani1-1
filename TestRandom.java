public  class  TestRandom {
	public static void main(String[]  args) {
		int t = Integer.parseInt(args[0]);
		int big = 0; int small = 0; int i = 0;
		do{double x = Math.random();
		   i++;
		   if(x>0.5){big = big +1;}
		   else{small = small + 1;}}
		   while (i<t); 
		   System.out.println("> 0.5: " + big + " times");
		   System.out.println("<= 0.5: " + small + " times");
		   if((big != 0)&&(small != 0)){
		   System.out.println("Ratio: " + (double)small/big);}
		   
		}
	}
