abstract class AbstractClass{
    abstract void display();
    void show()
    {
        System.out.println("This is an example of abstract class inside show method");
    }
}

public class SimpleAbstractClass extends AbstractClass{
    void display()
    {
        System.out.println("This is an example of abstract class inside display method");
    }
    public static void main(String args[])
    {
        SimpleAbstractClass obj=new SimpleAbstractClass();
        obj.display();
        obj.show();
    }
}
