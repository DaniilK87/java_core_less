package homework3.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Опишите класс руководителя, наследник от сотрудника.
 * Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
 * чтобы он мог поднять заработную плату всем, кроме руководителей.
 * В основной программе создайте руководителя и поместите его в общий массив сотрудников.
 * Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Manager("Руководитель1",  100_000));
        employeeList.add(new Manager("Руководитель2",  120_000));
        employeeList.add(new Employee("Сотрудник1", 40_000));
        employeeList.add(new Employee("Сотрудник2", 50_000));
        employeeList.add(new Employee("Сотрудник3", 60_000));

        System.out.println(employeeList);


        for(Employee e: employeeList) {
            Manager.upSalary(e, 10_000);
        }

        System.out.println(employeeList);


    }
}
