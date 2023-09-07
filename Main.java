package OOP.abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son son=new Son();
        son.career("computer engineer");
        son.partner("xd",23);
        Parent parent=new Son();
        parent.career("deneme");
        parent.partner("xd",22);
        Parent.hello();
        son.normal();


    }
}
