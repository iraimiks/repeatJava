package lv.timeChallenge1;

public class timeChalangesMethode {
    private static final String INVALID_VALUE_MESSAGE = "INVALID value";
    public static void main(String[] args) {
        System.out.println(getDurationString(50,30));
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(30003));
    }
    private static String getDurationString(int min, int secods){
        if((min < 0)||((secods < 0 )|| (secods > 59))){
           return INVALID_VALUE_MESSAGE;
        }
        int houre = min /60;
        long remainingMinutes = min % 60;

        String hoursString = houre + "h ";
        if(houre < 10){
            hoursString = "0" + hoursString;
        }
        String minuteString = remainingMinutes + "h ";
        if(remainingMinutes < 10){
            minuteString = "0" + minuteString;
        }
        String secondsString = secods + "s";
        if(secods < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minuteString + " " +  secondsString + " ";
    }
    private static String getDurationString(int secods){
        if(secods < 0){
            return INVALID_VALUE_MESSAGE ;
        }
        int minute = secods /60;
        int remainingSecods = secods % 60;
        return getDurationString(minute, remainingSecods);
    }


}
