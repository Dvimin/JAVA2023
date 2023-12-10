package works.Lab9;

public class MyClass {
    private String name = "Masha";
    private int age = 15;

    public MyClass(String name_, int age_) {
        name = name_;
        age = age_;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age_) {
        age = age_;
    }
}
