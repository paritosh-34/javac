class parameterizedConstructor
{
    int id;
    String name;
    parameterizedConstructor(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String[] args)
    {
        parameterizedConstructor s1 = new parameterizedConstructor(10, "s1");
        parameterizedConstructor s2 = new parameterizedConstructor(11, "s2");
        s1.display();
        s2.display();
    }
}
