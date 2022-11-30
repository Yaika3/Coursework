import java.util.ArrayList;

public class Employee {
    String name;
    String surname;
    String patronymic;
    int department;
    int salary;
    private int ArrayList;
    int id = ArrayList;
    ArrayList<Integer> list = new ArrayList<>();



    public int getArrayList(){
        return id;
    }


    public Employee (String surname,String name,String patronymic, int department,int salary){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public int getDepartment(){
        return department;
    }
    public int getSalary(){
        return salary;
    }







    public void setDepartment(int department){
        this.department = department;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

}
