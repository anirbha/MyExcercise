class A{
   int i=10;

   A(int a){
        this.i=a;
        System.out.println(i);
   }
}

class B extends A{

    B(int b){
        super(b);
        this.i=i*5;
        System.out.println(i);
    }
}

public class InheritanceExmpl1 {

   public static void main(String args[])
   {
       B obj =new B(20);
       System.out.println(obj.i);
   }

}
