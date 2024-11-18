public class Collatz {
	public static void main(String args[]) {
            int n = Integer.parseInt(args[0]);
            for(int i = 0; i<n; i++){
				int ceed = 1 +i; int iterations=1;
		    	do{
				   System.out.print(ceed + " ");
				   if(ceed%2==0){ceed = ceed/2;}
				   else{ceed = (ceed*3)+1;}
				   iterations++;
				}while(ceed != 1); 	

			    if(ceed == 1){System.out.print(ceed);}
				System.out.print(" (" + iterations + ")");
				System.out.println();

		    }   
		    System.out.print("Every one of the first " + n + " hailstone sequences reached 1.");	

	}
}
