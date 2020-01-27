class Parent
{
    void m1()
    {
        System.out.println("parent");
    }
}
class Child extends Parent
{
    // void m1()
    // {
    //     System.out.println("child");
    // }
}
class Overriding
{
    public static void main(String[] args)
    {
        Child c1 = new Child();
        c1.m1();
    }
}
