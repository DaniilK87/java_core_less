package homework3.Task1;


import java.util.Date;

/**
 * Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
 * представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.compare(new Date(2023-11-22), new Date(2023-11-23));
    }
}
