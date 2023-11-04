import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Allanazarov","Allan","Timurovich",1,50000);
        employees[1] = new Employee("Abdullayeva","Aysel'","Maxsadovna",2,45000);
        employees[2] = new Employee("Gubaydulin","Abdulla","Kronovich",2,52000);
        employees[3] = new Employee("Allanazarova","Dinara","Timurovna",4,48000);
        employees[4] = new Employee("Akimov","Ilkhom","Adil'janovich",1,55000);
        employees[5] = new Employee("Koshman","Oleg","Vladimirovch",3,51000);
        employees[6] = new Employee("Vasser","Polina","KrimNashevna",4,35000);
        employees[7] = new Employee("Rakhimova","Mokhinur","Sodaluvovna",5,30000);
        employees[8] = new Employee("Vilkova","Anastasiya","Rokovna",5,41000);
        employees[9] = new Employee("Shoman","Svetlana","Nevskaya",3,33000);

        makeString(employees);

        calculateTotalSalary(employees);

        minSalary(employees);

        maxSalary(employees);

        calculateAverageCosts(employees);

        getSNP(employees);


    }


    public static void makeString(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static void calculateTotalSalary(Employee[] employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalary);
    }

    public static void minSalary(Employee[] employees) {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee.getSurname() + " " + minSalaryEmployee.getName() + " " + minSalaryEmployee.getPatronymic() + " С заработной платой - " + minSalaryEmployee.getSalary());
    }

    public static void maxSalary(Employee[] employees) {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee.getSurname() + " " + maxSalaryEmployee.getName() + " " + maxSalaryEmployee.getPatronymic() + " С заработной платой - " + maxSalaryEmployee.getSalary());
    }

    public static void calculateAverageCosts(Employee[] employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        int averageSalary = totalSalary / employees.length;
        System.out.println("Среднее затраты на зарплаты: " + averageSalary);
    }

    public static void getSNP(Employee[] employees) {
        System.out.println("Ф. И. О. всех сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
        }
    }





}
