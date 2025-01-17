package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Constant {
    public static String ip = "54.206.38.9";
    public static int port = 11111;

    public static String AUTO_PATH = "";
    public static long MONITOR_SECOND = 60;
    public static DateTimeFormatter DATE_TIME = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static ArrayList<String> appointmentStatus = new ArrayList<>(Arrays.asList("UNCONFIRMED","CONFIRMED","CANCELLED"));

    public static boolean updateAppointment = true;
    public static boolean updateDoctor = true;
    public static boolean updateHospital = true;
    //public static boolean updateAppointment = false;
}
