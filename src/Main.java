public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Aleshin V.S.", 1, 400000.00);
        employees[1] = new Employee("Antonov P.S.", 1, 200000.00);
        employees[2] = new Employee("Barsookof A.U.", 2, 250000.00);
        employees[3] = new Employee("Grachev S.B.", 2, 180000.00);
        employees[4] = new Employee("Carpov D.V.", 2, 220000.00);
        employees[5] = new Employee("Fedin U.A.", 3, 240000.00);
        employees[6] = new Employee("Smirnoff A.U.", 3, 210000.00);
        employees[7] = new Employee("Begunov A.V.", 4, 350000.00);
        employees[8] = new Employee("Shumov S.K.", 5, 370000.00);
        employees[9] = new Employee("Lukin A.R.", 5, 390000.00);

        System.out.println("a. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).");

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        System.out.println();
        System.out.println("b. Посчитать сумму затрат на зарплаты в месяц.");

        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = employees[i].getSalary() + sum;
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);

        System.out.println();
        System.out.println("c. Найти сотрудника с минимальной зарплатой.");

        double minSalary = 10000000.00;
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.print("Минимальная зарплата: " + minSalary);
        for (int i = 0; i < employees.length; i++) {
            if (minSalary == employees[i].getSalary()) {
                System.out.println(", у сотрудника: " + employees[i].getFullName());
            }
        }

        System.out.println();
        System.out.println("d. Найти сотрудника с максимальной зарплатой.");

        double maxSalary = 0.00;
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.print("Максимальная зарплата: " + maxSalary);
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary == employees[i].getSalary()) {
                System.out.println(", у сотрудника: " + employees[i].getFullName());
            }
        }

        System.out.println();
        System.out.println("e. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b). ");

        System.out.println("Среднее занчение зарплат: " + sum / employees.length);

        System.out.println();
        System.out.println("f. Получить Ф. И. О. всех сотрудников (вывести в консоль)");

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }
}