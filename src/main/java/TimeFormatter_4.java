import java.util.Arrays;
import java.util.stream.Collectors;

public class TimeFormatter_4 {

    public static void main(String[] args) {
        System.out.println(formatDuration(1036360000));
        System.out.println(formatDuration(3736));
        System.out.println(formatDuration(86400));
        System.out.println(formatDuration(60));
        System.out.println(formatDuration(120));
        System.out.println(formatDuration(3600));

    }

    private static int S_PER_MIN = 60;
    private static int S_PER_HR = 60 * S_PER_MIN;
    private static int S_PER_DAY = 24 * S_PER_HR;
    private static int S_PER_YR = 365 * S_PER_DAY;

    public static String formatDuration(int sec) {

        return Arrays.stream(new String[]{
                formatTime("year", sec/S_PER_YR),
                formatTime("day", sec%S_PER_YR/S_PER_DAY),
                formatTime("hour", sec%S_PER_DAY/S_PER_HR),
                formatTime("minute", sec%S_PER_HR/S_PER_MIN),
                formatTime("second", sec%S_PER_MIN/60)})
                .filter(s -> !s.equals(""))
                .collect(Collectors.joining(", "))
                .replaceAll(", (?!\\d+\\w.+?,)", " and ");
    }

    static String formatTime(String date, int n) {
        return n == 0 ? "" : String.format("%d %s%s", n, date, n == 1 ? "" : "s");
    }
}
