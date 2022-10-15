/*
 * DuyDuc94.
 */
public abstract class Person {
    protected String name;

    public Person() {}
    public Person(String name) {
        this.name = name;
    }
    
    public abstract void display();
    public abstract double getSalary();
}
