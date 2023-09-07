## demo proje for abstract classes
# NOTES
- Abstract static methodlar oluşturamayız çünkü static methodlar override edilemez ancak Abstract methodların override edilmesi zorunludur bu nedenle yapılamaz Ancak static methodlar kullanılabilir.

```

public abstract class Parent {
 
			....
    abstract void career(String name);
    abstract void partner(String name,int age);

    static void hello(){
        System.out.println("hey");
    }

}
```

- Abstract class'ları inherit eden sınıflar,abstract methodları override etmesi zorunludur
- Abstract method'ların body'leri yok,normal method tanımlanabilir

## INTERFACES VS ABSTRACT CLASSES

| Definition                    | Interface                                         | Abstract Class                                 |
|-------------------------------|---------------------------------------------------|------------------------------------------------|
| Final Variables               | Default olarak final                              | Final veya non-final                           |
| Type of variables             | Static ve final                                   | Final,non-final,static ve non-static           |
| Implementation                | İnterface’ler abstract class’ı implemente edemez. | Abstract class Interface’i implements edebilir |
| Inheritance vs Abstraction    | Implements keyword                                | Extends keyword                                |
| Multiple implementations      | Birden fazla olabilir                             | Sadece bir tane                                |
| Multiple Inheritance          | Destekler                                         | Desteklemez(diamond problem)                   |
| Accessibility of Data Members | public                                            | public,private,protected                       |



