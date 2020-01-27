class Test
{
    void m1(int i)
    {
        System.out.println(i);
    }
    void m1(int i, int j)
    {
        System.out.println(i+j);
    }
}
class Overloading
{
    public static void main(String[] args)
    {
        Test t1 = new Test();
        t1.m1(10);
        t1.m1(10, 10);
    }
}
