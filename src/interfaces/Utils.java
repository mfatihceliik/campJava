package interfaces;

public class Utils {
    public static void runLoggers(Logger[] loggers, String message){
        for(int i = 0; i < loggers.length; i++) {
            loggers[i].Add(message);
        }
    }
}
