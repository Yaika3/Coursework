

public class Employee {
    String name;
    String surname;
    String patronymic;
    int department;
    int salary;
    int id;

    private static int counter = 0;







    public Employee (String surname,String name,String patronymic, int department,int salary){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id= counter;
        counter++;



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
    public  int getCounter(){
        return counter;

    }







    public void setDepartment(int department){
        this.department = department;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }








}

