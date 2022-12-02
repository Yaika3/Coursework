import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] Employee = new Employee[10];
        Employee[0] = new Employee("Быков", "Алексей", "Анатольевич", 1, 30_000);
        System.out.println("Быков = " + Employee[0].getCounter() + " " + Employee[0].getSurname() + " " + Employee[0].getName() + " " + Employee[0].getPatronymic() + " " + "Работает в отделе " + Employee[0].getDepartment() + " зарплата - " + Employee[0].getSalary());
        Employee[1] = new Employee("Попов", "Олег", "Викторович", 1, 40_000);
        System.out.println("Попов = " + Employee[1].getCounter() + " " + Employee[1].getSurname() + " " + Employee[1].getName() + " " + Employee[1].getPatronymic() + " " + "Работает в отделе " + Employee[1].getDepartment() + " зарплата - " + Employee[1].getSalary());
        Employee[2] = new Employee("Хитрый", "Игорь", "Валентонович", 2, 149_000);
        System.out.println("Хитрый = " + Employee[2].getCounter() + " " + Employee[2].getSurname() + " " + Employee[2].getName() + " " + Employee[2].getPatronymic() + " " + "Работает в отделе " + Employee[2].getDepartment() + " зарплата - " + Employee[2].getSalary());
        Employee[3] = new Employee("Алексеев", "Максим", "Петрович", 2, 47_000);
        System.out.println("Алексеев = " + Employee[3].getCounter() + " " + Employee[3].getSurname() + " " + Employee[3].getName() + " " + Employee[3].getPatronymic() + " " + "Работает в отделе " + Employee[3].getDepartment() + " зарплата - " + Employee[3].getSalary());
        Employee[4] = new Employee("Матрица", "Евгений", " Игревич", 3, 50_000);
        System.out.println("Матрица = " + Employee[4].getCounter() + " " + Employee[4].getSurname() + " " + Employee[4].getName() + " " + Employee[4].getPatronymic() + " " + "Работает в отделе " + Employee[4].getDepartment() + " зарплата - " + Employee[4].getSalary());
        Employee[5] = new Employee("Золотой", "Виктор", "Олегович", 3, 55_000);
        System.out.println("Золотой = " + Employee[5].getCounter() + " " + Employee[5].getSurname() + " " + Employee[5].getName() + " " + Employee[5].getPatronymic() + " " + "Работает в отделе " + Employee[5].getDepartment() + " зарплата - " + Employee[5].getSalary());
        Employee[6] = new Employee("Честный", "Кирилл", "Максимович", 4, 48_000);
        System.out.println("Честный = " + Employee[6].getCounter() + " " + Employee[6].getSurname() + " " + Employee[6].getName() + " " + Employee[6].getPatronymic() + " " + "Работает в отделе " + Employee[6].getDepartment() + " зарплата - " + Employee[6].getSalary());
        Employee[7] = new Employee("ДобрыйВечер", "Валерий", "Алексендрович", 4, 32_000);
        System.out.println("ДобрыйВечер = " + Employee[7].getCounter() + " " + Employee[7].getSurname() + " " + Employee[7].getName() + " " + Employee[7].getPatronymic() + " " + "Работает в отделе " + Employee[7].getDepartment() + " зарплата - " + Employee[7].getSalary());
        Employee[8] = new Employee("Осторожный", "Владимир", "Дмитриевич", 5, 100_000);
        System.out.println("Осторожный = " + Employee[8].getCounter() + " " + Employee[8].getSurname() + " " + Employee[8].getName() + " " + Employee[8].getPatronymic() + " " + "Работает в отделе " + Employee[8].getDepartment() + " зарплата - " + Employee[8].getSalary());
        Employee[9] = new Employee("Главный", "Дмитрий", "Илларионович", 5, 150_000);
        System.out.println("Главный = " + Employee[9].getCounter() + " " + Employee[9].getSurname() + " " + Employee[9].getName() + " " + Employee[9].getPatronymic() + " " + "Работает в отделе " + Employee[9].getDepartment() + " зарплата - " + Employee[9].getSalary());

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add(" Быков = " + Employee[0].getCounter() + " " + Employee[0].getSurname() + " " + Employee[0].getName() + " " + Employee[0].getPatronymic() + " " + "Работает в отделе " + Employee[0].getDepartment() + " зарплата - " + Employee[0].getSalary());
        System.out.println(fruits);


        int sum = 0;
        for (int i = 0; i < Employee.length; i++) {
            if (Employee[i] != null ){
                if (Employee[i].getSalary() > sum){
                    sum = Employee[i].getSalary();
                }


        }
        }
        for ( int i = 0; i < Employee.length; i++){
            if (Employee[i] != null){
                if (sum == Employee[i].getSalary()){
                    System.out.println("У сотрудника " + Employee[i].getSurname()+ " "+ Employee[i].getName() + " " + Employee[i].getPatronymic()+ "Самая большая зарплата "+ " "+ Employee[i].getSalary());
                }
            }
        }


    }


















}