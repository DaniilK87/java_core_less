package homework3.Task1;

import java.util.Date;

public class Employee {

    public void compare(Date d1, Date d2) {
        int result = d1.compareTo(d2);
        switch (result) {
            case -1 : System.out.println("Первая дата больше второй"); break;
            case 0 : System.out.println("Одинаковые даты"); break;
            case 1 : System.out.println("Первая дата меньше второй"); break;
        }
    }
}
