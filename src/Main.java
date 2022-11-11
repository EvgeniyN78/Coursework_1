public class Main {

    public static Employee[] employees = new Employee[10];

    public static void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployerWithMinSalary() {
        Employee result = employees[0];
        int minSalary = (int) employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = (int) employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployerWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = (int) employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = (int) employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static void printFullNameEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }

    }


    public static void main(String[] args) {

        employees[0] = new Employee("Aleshin V.S.", 1, 400000);
        employees[1] = new Employee("Antonov P.S.", 1, 200000);
        employees[2] = new Employee("Barsookof A.U.", 2, 250000);
        employees[3] = new Employee("Grachev S.B.", 2, 180000);
        employees[4] = new Employee("Carpov D.V.", 2, 220000);
        employees[5] = new Employee("Fedin U.A.", 3, 240000);
        employees[6] = new Employee("Smirnoff A.U.", 3, 210000);
        employees[7] = new Employee("Begunov A.V.", 4, 350000);
        employees[8] = new Employee("Shumov S.K.", 5, 370000);
        employees[9] = new Employee("Lukin A.R.", 5, 390000);

        System.out.println("a. Получить список всех сотрудников со всеми имеющимися по ним данными " +
                "(вывести в консоль значения всех полей (toString)).");
        printEmployee();

        System.out.println();
        System.out.println("b. Посчитать сумму затрат на зарплаты в месяц.");
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateTotalSalary());

        System.out.println();
        System.out.println("c. Найти сотрудника с минимальной зарплатой.");
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployerWithMinSalary());

        System.out.println();
        System.out.println("d. Найти сотрудника с максимальной зарплатой.");
        System.out.println("Сотрудник с макимальной зарплатой:  " + findEmployerWithMaxSalary());

        System.out.println();
        System.out.println("e. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b). ");
        System.out.println("Среднее занчение зарплат: " + calculateTotalSalary() / employees.length);

        System.out.println();
        System.out.println("f. Получить Ф. И. О. всех сотрудников (вывести в консоль)");
        printFullNameEmployees();
    }
}
