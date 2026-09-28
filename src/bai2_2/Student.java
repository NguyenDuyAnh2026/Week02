package bai2_2;

public class Student {
    private String name;
    private int id;
    private String email;
    private double gpa;

    public Student(){};

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Student(String name, int id, String email, double gpa){
        this.name = name;
        this.id = id;
        this.email = email;
        setGpa(gpa);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setEmail(String email){
        this.email =email;
    }
    public  String getEmail(){
        return email;
    }

    public void setGpa(double gpa){
        if(gpa < 0 || gpa > 4){
            System.out.println("Invalid");
        }
        else{
            this.gpa = gpa;
        }
    }

    public void display(){
        System.out.println("MSV: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Nguyen Duy Anh");
        s1.setEmail("duyanh.uet.vnu@gmail.com");
        s1.setGpa(3.64);
        s1.setId(24020385);
        s1.display();

        System.out.println("----------------------");

        Student s2 = new Student(24020375, "Nguyen Trong Cao");
        s2.display();

        System.out.println("----------------------");

        Student s3 = new Student("Nguyen Hoang Anh",
                24020589, "hoanganhn@gmail.com", 4.5);
        s3.display();
    }

}
