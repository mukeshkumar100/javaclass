abstract class bike1
{
abstract void run();
}
class veickal extends bike1
{
void run()
{
System.out.println("running vical");
}
public static void main(String arr[])
{
bike1 obj=new bike1();
obj.run();
}
}