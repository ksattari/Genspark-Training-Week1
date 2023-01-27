class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class DataHiding {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("David");
        p.setAge(34);
        System.out.println(p.getName());
        System.out.println((p.getAge()));
    }
}
