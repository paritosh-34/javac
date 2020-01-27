import java.util.*;

class Parent
{
	int i=10;
}
class child extends Parent
{
	int i=20;
	void m1()
	{
		System.out.println("value of i is child "+i);
		System.out.println("value of i is parent "+super.i);
	}
}
class Supertest
{
	public static void main(String args[])
	{
		child c1 = new child();
		c1.m1();
		Parent p1 = new Parent();
		System.out.println(p1.i);
	}
}
