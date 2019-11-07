public class Human {

    String name;
    int age;
    String lastName;

    public Human (String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Human (String name, String lastName){
        this(name, lastName, 15);
    }

}
