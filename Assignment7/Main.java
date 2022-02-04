package assignment7;
interface A{
    default void a1(){
        System.out.println("this is interface A a1 method");
    }
    default void a2(){
        System.out.println("this is interface A a2 method");
    }
}
interface B{
    default void b1(){
        System.out.println("this is interface B b1 method");
    }
    default void b2(){
        System.out.println("this is interface B b2 method");
    }
}
interface C{
    default void c1(){
        System.out.println("this is interface C c1 method");
    }
    default void c2(){
        System.out.println("this is interface C c1 method");
    }
}
interface D extends A,B,C{
    default void d1(){
        System.out.println("this is interface D d1 method");
    }
}
class E{
    public void e1(){
        System.out.println("this is a concrete class");
    }
}
class Main extends E implements D{
    public void m1(A i1){
        i1.a1();
        i1.a2();
    }
    public void m2(B i2){
        i2.b1();
        i2.b2();
    }
    public void m3(C i3){
        i3.c1();
        i3.c2();
    }
    public void m4(D i4){
        i4.d1();
    }

    public static void main(String[] args) {
        Main m=new Main();
        m.m1(m);
        m.m2(m);
        m.m3(m);
        m.m4(m);
        m.e1();
    }
}
