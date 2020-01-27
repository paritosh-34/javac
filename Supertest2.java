class Parent
{
    Parent()
    {
        System.out.println("Hello");
    }
}
class child extends Parent
{
    child()
    {
        super();
        System.out.println("hello2");
    }
}
class Supertest2
{
    public static void main(String args[])
    {
        child c1 = new child();
    }
}
