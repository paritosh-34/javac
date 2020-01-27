class defaultConstUse
{
	int id;
    String name;
    void display()
    {
	    System.out.println(id+" "+name);
    }
    public static void main(String[] args)
    {
	    defaultConstUse s1 = new defaultConstUse();
	    defaultConstUse s2 = new defaultConstUse();
	    s1.display();
	    s2.display();
    }
}
