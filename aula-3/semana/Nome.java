import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Nome {   
    public static void main (String[] args){  
        Calendar cal = new GregorianCalendar();
        System.out.println(weekDay(cal));
    }  

    public static String weekDay(Calendar cal) {
        return new DateFormatSymbols().getWeekdays()	[cal.get(Calendar.DAY_OF_WEEK)];
    } 
}