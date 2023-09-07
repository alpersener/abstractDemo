package OOP.abstractdemo;

public abstract class Parent {
    int age;

    public Parent() {
    }

    abstract void career(String name);
    abstract void partner(String name,int age);

    static void hello(){
        System.out.println("hey");
    }

    void normal() {
        System.out.println("parent");
    }

}
