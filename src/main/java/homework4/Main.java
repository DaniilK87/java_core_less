package homework4;


/**
 * 1.В класс покупателя добавить перечисление с гендерами,
 * добавить в сотрудника свойство «пол» со значением созданного перечисления. Добавить геттеры, сеттеры.
 * 2.Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля),
 * написать метод, принимающий массив сотрудников,
 * поздравляющий всех сотрудников с Новым Годом, женщин с 8 марта, а мужчин с 23 февраля, если сегодня соответствующий день.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = {
                new Employee(Gender.MAN, "Сотрудник_1"),
                new Employee(Gender.WOMAN, "Сотрудница_2"),
                new Employee(Gender.WOMAN, "Сотрудница_3"),
                new Employee(Gender.MAN, "Сотрудник_4")
        };

//        Manager.isHoliday(employeeArray,Holiday.MARCH_8.getHolidayDate());
//        Manager.isHoliday(employeeArray,Holiday.FEBRUARY_23.getHolidayDate());
        Manager.isHoliday(employeeArray,Holiday.NEW_YEAR.getHolidayDate());



    }
}
