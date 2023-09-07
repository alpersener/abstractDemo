## demo proje for abstract classes
# NOTES
-Abstract static methodlar oluşturamayız çünkü static methodlar override edilemez ancak Abstract methodların override edilmesi zorunludur bu nedenle yapılamaz Ancak static methodlar kullanılabilir.

\
public abstract class Parent {
 		
    abstract void career(String name);
    abstract void partner(String name,int age);

    static void hello(){
        System.out.println("hey");
    }

}
\
