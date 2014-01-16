class vikal
{
void run()
{
System.out.println("vikal is runnning");
}
}
class moterbike extends vikal
{
void run()
{
System.out.println("bike is running");
}
public static void main(String arr[])
{
moterbike b=new moterbike();
b.run();
}
}