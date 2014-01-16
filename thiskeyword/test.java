class ab
{
ab getab()
{
return this;
}
void display()
{
System.out.println("hello india");
}
}
class test
{
public static void main(String arr[])
{
new ab().getab().display();
}
}