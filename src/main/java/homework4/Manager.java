package homework4;

import java.util.Calendar;
import java.util.Objects;

public class Manager {

    public static void isHoliday(Employee [] employeesArray, Calendar today) {
        for (Employee employee : employeesArray) {
            if (employee.getGender() == Gender.WOMAN && Objects.equals(today, Holiday.MARCH_8.getHolidayDate())) {
                System.out.println(employee.getName() + " " + "поздравляю с 8 марта");
            }
            if (employee.getGender() == Gender.MAN && Objects.equals(today, Holiday.FEBRUARY_23.getHolidayDate())) {
                System.out.println(employee.getName() + " " + "поздравляю с 23 февраля");
            }
            if (Objects.equals(today, Holiday.NEW_YEAR.getHolidayDate())) {
                System.out.println(employee.getName() + " " + "c Новым Годом");
            }
            System.out.println("---------------------------------");
        }
    }
}
