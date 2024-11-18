public class Cheers {
        public static void main(String[] args){
                String word = args[0];
                String upperCaseWord = word.toUpperCase();
                String problem = "AEFHILMNORSX";
                int times = Integer.parseInt(args[1]);

                for(int i = 0; i<upperCaseWord.length(); i++){
                        char letter = upperCaseWord.charAt(i);
                        if(problem.indexOf(letter) != -1){
                              System.out.println("Give me a  " + letter + ": " + letter + "!");}
                        else {System.out.println("Give me an " + letter + ": " + letter + "!");}
                }
                
                        System.out.println("What does that spell?");
                        for(int j = 0; j<times; j++){System.out.println(upperCaseWord+ "!!!");}         
                
        }
}  
