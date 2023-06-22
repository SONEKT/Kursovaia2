public class Employee {
    private String fio;
    private int department;
    private float salary;
    private int id;

    private static int counter = 1;

    public Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public int getId() {
        return this.id;
    }

    public String getFio() {
        return this.fio;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setFIO(String fio) {
        this.fio = fio;
    }

    public void setDepartment(int dept) {
        this.department = dept;
    }

    public void setSalary(float sal) {
        this.salary = sal;
    }

    @Override
    public String toString() {
        return "ФИО: " + fio + " Отдел: " + department + " Зарплата: " + salary;
    }
}