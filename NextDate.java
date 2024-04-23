import java.util.Calendar;
import java.util.GregorianCalendar;

public class NextDate {

    public static String getNextDate(int day, int month, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        int nextDay = calendar.get(Calendar.DAY_OF_MONTH);
        int nextMonth = calendar.get(Calendar.MONTH) + 1;
        int nextYear = calendar.get(Calendar.YEAR);
        
        return nextDay + "/" + nextMonth + "/" + nextYear;
    }

    public static void main(String[] args) {
        // Đoạn mã test ví dụ, bạn có thể thử với các giá trị khác.
        System.out.println("Ngày kế tiếp của 31/12/2023 là: " + getNextDate(31, 12, 2023));
    }
}

