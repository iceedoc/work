public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Степанов Павел Олегович", 1, 70000);
        employees[1] = new Employee("Степанов Олег Михайлович", 2, 90000);
        employees[2] = new Employee("Степанова Олеся Сергеевна", 3, 80000);
        employees[3] = new Employee("Степанова Ольга Павловна", 1, 40000);
        employees[4] = new Employee("Сазонова Татьяна Павловна", 4, 35000);
        employees[5] = new Employee("Степанова Александра Олеговна", 5, 45000);
        employees[6] = new Employee("Гришунина Ирина Витальевна", 2, 20000);
        employees[7] = new Employee("Тимошенко Марина Николаевна", 3, 25000);
        employees[8] = new Employee("Степанова Ева Павловна", 4, 20000);
        employees[9] = new Employee("Степанов Никита Олегович", 5, 100000);

        printAllEmployees();
        System.out.println("Сумма затрат на ЗП в месяц: " + calculateTotalSalary());
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Среднее значение зарплат: " + calculateAverageSalary());
        printAllEmployeeNames();

        employees[0].setDepartment(2);
        System.out.println("Новый отдел сотрудника " + employees[0].getFullName() + ": " + employees[0].getDepartment());
        employees[0].setSalary(95000);
        System.out.println("Новая зарплата сотрудника " + employees[0].getFullName() + ": " + employees[0].getSalary());

        Employee duplicate = new Employee("Степанов Павел Олегович", 1, 70000);
        System.out.println("Сравнение сотрудника 1 и нового сотрудника: " + employees[0].equals(duplicate));
        System.out.println("hashCode сотрудника 1: " + employees[0].hashCode());
        System.out.println("hashCode нового сотрудника: " + duplicate.hashCode());
    }

    public static void printAllEmployees() {
        System.out.println("Список всех сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
    }

    public static double calculateTotalSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        return calculateTotalSalary() / employees.length;
    }

    public static void printAllEmployeeNames() {
        System.out.println("ФИО всех сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
        System.out.println();
    }
}
