class A{
int a=10;
A()
{
B b=new B(this);
b.display();
}

public static void main(String arr[])
{
A a=new A();
}
}