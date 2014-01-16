class vikal
{
void run()
{
System.out.println("vikal is runnning");
}
}
class bike extends vikal
{
void run()
{
System.out.println("bike is running");
}
public static void main(String arr[])
{
bike b=new bike();
vikal c=new vikal();

b.run();
c.run();
}
}