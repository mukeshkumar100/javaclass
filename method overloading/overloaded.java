class overloaded
{
void sum(int a, int b)
{
System.out.println(a+b);
}
void sum(int a,int b,int c)
{
System.out.println(a+b+c);
}
public static void main(String arr[])
{
overloaded o=new overloaded();
o.sum(10,20);
o.sum(10,20,30);
}
}