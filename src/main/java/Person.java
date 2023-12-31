import Reflection.Author;

@Author(name = "Ihor", dateOfCreation = 2023)
public class Person {
    private int id;
    private String name;

    public Person() {
        this.id = -1;
        this.name = "No name";
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Person" + id + " and name: " + name + " say hello!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
