import java.util.TimeZone;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Current_Time {
    
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("IST"));
        System.out.println("Current time is " + sdf.format(new Date()));
    
}
}

