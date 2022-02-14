package services;

import java.util.Calendar;

public class WeekDay {

    public static Calendar currentDate = Calendar.getInstance();
    public static int currentDay = currentDate.get(Calendar.DAY_OF_WEEK);

    public static boolean itsFriday(){

        if(currentDay == Calendar.FRIDAY){ // 6 = Friday
            return true;
        }
        return false;
    }

    public static int daysUntilFriday(){

        int daysUntilFriday = Calendar.FRIDAY - currentDay;

        if(daysUntilFriday == -1){
            return 6;
        }

        return daysUntilFriday;
    }

    public static String getDay(int day){

        switch (day){
            case 1: return "Sunday (Sun's day)";
            case 2: return "Monday (Moon's day)";
            case 3: return "Tuesday (Tiu's day)";
            case 4: return "Wednsday (Woden's day)";
            case 5: return "Thursday (Small friday)";
            case 6: return "Friday (Freya’s day)";
            case 7: return "Saterday (Saturn’s day)";
            default:
                return "Unknown day";
        }
    }

}
