public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double grade;

    public Student(String firstName, String lastName, int age, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
    }

    public String getFirstName(){
        return  firstName;
    }

    public  String getLastName() {
        return  lastName;
    }

    public  int getAge(){
        return age;
    }

    public double getGrade(){
        return grade;
    }


    public String toString(){
        return  "firstName=" + firstName +
                " lastName=" + lastName +
                " age = " + age +
                " averageGrade=" + grade;

        }





}


