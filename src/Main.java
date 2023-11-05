import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Allanazarov", "Allan", "Timurovich", 1, 50000);
        employees[1] = new Employee("Abdullayeva", "Aysel'", "Maxsadovna", 2, 45000);
        employees[2] = new Employee("Gubaydulin", "Abdulla", "Kronovich", 2, 52000);
        employees[3] = new Employee("Allanazarova", "Dinara", "Timurovna", 4, 48000);
        employees[4] = new Employee("Akimov", "Ilkhom", "Adil'janovich", 1, 55000);
        employees[5] = new Employee("Koshman", "Oleg", "Vladimirovch", 3, 51000);
        employees[6] = new Employee("Vasser", "Polina", "KrimNashevna", 4, 35000);
        employees[7] = new Employee("Rakhimova", "Mokhinur", "Sodaluvovna", 5, 30000);
        employees[8] = new Employee("Vilkova", "Anastasiya", "Rokovna", 5, 41000);
        employees[9] = new Employee("Shoman", "Svetlana", "Nevskaya", 3, 33000);

        makeString(employees);

        int totalSalary = calculateTotalSalary(employees);
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalary);

        Employee minSalaryEmployee = minSalary(employees);
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee.getSurname() + " " + minSalaryEmployee.getName() + " " + minSalaryEmployee.getPatronymic() + " С заработной платой - " + minSalaryEmployee.getSalary());

        Employee maxSalaryEmployee = maxSalary(employees);
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee.getSurname() + " " + maxSalaryEmployee.getName() + " " + maxSalaryEmployee.getPatronymic() + " С заработной платой - " + maxSalaryEmployee.getSalary());

        int averageSalary = calculateAverageCosts(employees);
        System.out.println("Среднее затраты на зарплаты: " + averageSalary);

        String emps = getSNP(employees);
        System.out.println(emps);
    }


    public static void makeString(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static int calculateTotalSalary(Employee[] employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static Employee minSalary(Employee[] employees) {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee maxSalary(Employee[] employees) {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static int calculateAverageCosts(Employee[] employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        int averageSalary = totalSalary / employees.length;
        return averageSalary;
    }

    public static String getSNP(Employee[] employees) {
        String[] emps = new String[employees.length];
        int i = 0;
        System.out.println("Ф. И. О. всех сотрудников:");
        for (Employee employee : employees) {
            emps[i] = employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic();
            i++;
        }
        return Arrays.toString(emps);
    }

}