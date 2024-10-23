public class Main extends Object {

    public static void main(String[] args) {
        Student valentino = new Student("Valentino", 20);
        System.out.println(valentino);

        PrimarySchoolStudent tony = new PrimarySchoolStudent("tony",
                8, "Chris");
        System.out.println(tony);
    }

}

class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student {

    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
