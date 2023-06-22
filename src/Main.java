public class Main {
    private static Employee[] empl = new Employee[10];


    public static void main(String[] args) {
        empl[0] = new Employee("Fam1 Name1 SName1", 1, 25500f);
        empl[1] = new Employee("Fam2 Name2 SName2", 1, 31450f);
        empl[2] = new Employee("Fam3 Name3 SName3", 2, 40200f);
        empl[3] = new Employee("Fam4 Name4 SName4", 2, 26000f);
        empl[4] = new Employee("Fam5 Name5 SName5", 3, 26500f);
        empl[5] = new Employee("Fam6 Name6 SName6", 3, 27000f);
        empl[6] = new Employee("Fam7 Name7 SName7", 4, 27500f);
        empl[7] = new Employee("Fam8 Name8 SName8", 4, 28000f);
        empl[8] = new Employee("Fam9 Name9 SName9", 5, 28500f);
        empl[9] = new Employee("Fam10 Name10 SName10", 5, 29000f);
        for (Employee print : empl) {
            System.out.println(print);
        }
        System.out.println("Сумма трат за месяц составила " + calculateSumSalary() + " рублей.");
        System.out.println("Минимальная зарплата у сотрудника - " + findMinSalary());
        System.out.println("Максимальная зарплата у сотрудника - " + findMaxSalary());
        System.out.println("Средняя зарплата сотрудников - " + calculateAverageSalary());
        System.out.println(callFIO());
    }

    public static float calculateSumSalary() {
        float sum = 0;
        for (Employee employee : empl) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static float calculateAverageSalary() {
        return calculateSumSalary() / empl.length;
    }

    public static Employee findMinSalary() {
        Employee min = empl[0];
        for (Employee employee : empl) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public static Employee findMaxSalary() {
        Employee max = empl[0];
        for (Employee employee : empl) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public static String callFIO() {
        String fio = "";
        for (Employee employee : empl) {
            fio += employee.getFio() + " ";
        }
        return fio;
    }
}