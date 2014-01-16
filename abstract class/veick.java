abstract class bike12
{
abstract void run();
}
class veick extends bike12
{
veick()
{
System.out.println("not running");
}
void run()
{
System.out.println("running vical");
}
public static void main(String arr[])
{
veick obj=new veick();

obj.run();
}
}