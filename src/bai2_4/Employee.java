package bai2_4;

public class Employee{
    private String name;
    private MyDate birthday ;

    public Employee(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public Employee(Employee other) {
        this.name = other.name;
        this.birthday = new MyDate(other.birthday);
    }

    public MyDate getBirthday(){
        return birthday;
    }
    public void setBirthday(MyDate birthday){
        this.birthday = birthday;
    }

    @Override
    public String toString(){
        return name + " - " + birthday;
    }

    public static void main(String[] args){
        Employee em1 = new Employee("Kien", new MyDate(10, 12, 2001));
        Employee em2 = new Employee(em1); // copy;

        em1.getBirthday().setDate(21, 2, 2000);
        System.out.println("Emp1: " + em1.getBirthday());
        System.out.println("Emp2: " + em2.getBirthday());
        System.out.println("Emp1: " + em1);
        System.out.println("Emp2: " + em2);
    }
}