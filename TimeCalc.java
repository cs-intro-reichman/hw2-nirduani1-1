public class TimeCalc {
    public static void main(String[] args) {
        String time = args [0];
        int minutesToAdd = Integer.parseInt(args[1]);
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        if(hours>12){hours = hours-12;}
        int totalMinutes = hours*60 + minutes + minutesToAdd;
        int totalHours = totalMinutes/60;
        int newHours = totalHours%24;
        int newMinutes = totalMinutes-(totalHours*60);
        if(newHours<=12){
            if(newMinutes<10){System.out.println("0" + newHours + ":0" + newMinutes);}
            else{System.out.println("0" + newHours + ":" +newMinutes );}
            }
        else{
            if(newMinutes<10){System.out.println(newHours + ":0" + newMinutes);}
            else{System.out.println(newHours + ":" + newMinutes);}
        }
    }
}
