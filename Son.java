package OOP.abstractdemo;

public class Son extends Parent{


    @Override
    void career(String name) {
        System.out.println("career:"+name);

    }
    @Override
    void partner(String name, int age) {
        System.out.println("i love "+name+" she is "+age);

    }

    @Override
    void normal() {
        System.out.println("normal method");
    }
}
