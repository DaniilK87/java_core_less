package homework3.Task2;

public class Manager extends Employee{


    public Manager(String name, int salary) {
        super(name, salary);
    }

    public static void upSalary(Employee employee, int bonus) {
        if (employee.getName().contains("Руководитель")) bonus = 0;
        int oldSalary = employee.getSalary();
        employee.setSalary(oldSalary + Manager.setBonus(bonus));
    }

    private static int setBonus(int bonus) {
        return bonus;
    }
}
