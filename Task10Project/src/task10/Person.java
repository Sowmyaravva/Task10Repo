package task10;

public class Person {

	private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p = new Person("Alice", 28);
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

	}

}
