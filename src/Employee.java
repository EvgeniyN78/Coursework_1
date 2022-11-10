import java.util.Objects;

public class Employee {

    public static int count = 0;
    String fullName;
    int department;
    double salary;
    public int idEmployee;

        public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        count++;
        idEmployee = count;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return idEmployee == employee.idEmployee && fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, idEmployee);
    }

    @Override
    public String toString() {
        return "Id: " + idEmployee +
                "; fullName: " + fullName +
                "; department: " + department +
                "; salary: " + salary +
                ";";
    }
}
