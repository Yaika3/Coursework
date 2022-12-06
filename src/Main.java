

public class Main {
    private static Employee[] employees = new Employee[10];
    public static int sum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }
    public static void printEmployeeList() {
        System.out.println("Список всех сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static Employee minSalary() {
        int minSalary = employees[0].getSalary();
        Employee employeeMinSalary = employees[0];
        for (Employee value : employees) {
            if (value != null) {
                if (minSalary > value.getSalary()) {
                    minSalary = value.getSalary();
                    employeeMinSalary = value;
                }
            }
        }
        return employeeMinSalary;
    }
    public static Employee maxSalary(){
        int maxSalary = employees[0].getSalary();
        Employee employeeMaxSalary = employees[0];
        for (Employee value : employees){
            if (value !=null){
                if (maxSalary < value.getSalary()){
                    maxSalary = value.getSalary();
                    employeeMaxSalary = value;
                }
            }
        }
        return employeeMaxSalary;
    }
    public static void main(String[] args) {
        employees[0] = new Employee("Быков", "Алексей", "Анатольевич", 1, 30_000);
        employees[1] = new Employee("Попов", "Олег", "Викторович", 1, 40_000);
        employees[2] = new Employee("Хитрый", "Игорь", "Валентонович", 2, 149_000);
        employees[3] = new Employee("Алексеев", "Максим", "Петрович", 2, 47_000);
        employees[4] = new Employee("Матрица", "Евгений", " Игревич", 3, 50_000);
        employees[5] = new Employee("Золотой", "Виктор", "Олегович", 3, 55_000);
        employees[6] = new Employee("Честный", "Кирилл", "Максимович", 4, 48_000);
        employees[7] = new Employee("ДобрыйВечер", "Валерий", "Алексендрович", 4, 32_000);
        employees[8] = new Employee("Осторожный", "Владимир", "Дмитриевич", 5, 100_000);
        employees[9] = new Employee("Главный", "Дмитрий", "Илларионович", 5, 150_000);

        System.out.println(sum());
        printEmployeeList();
        System.out.println("Сотрудник с минимальной зарплатой" + minSalary());
        System.out.println("Сотрудник с максимальной зарплатой " + maxSalary());
    }
}


