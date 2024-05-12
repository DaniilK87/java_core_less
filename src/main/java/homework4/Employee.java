package homework4;



public class Employee {

    private final Gender gender;

    private String name;

    public Employee(Gender gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "пол=" + gender +
                ", имя='" + name + '\'' +
                '}';
    }
}
