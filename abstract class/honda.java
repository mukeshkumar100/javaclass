abstract class bike22
{
abstract void run();
void changear()
{
System.out.println("gear is running");
}
}
class honda extends bike22
{
void run()
{
System.out.println("hoda running");
}
public static void main(String arr[])
{
honda obj=new honda();
obj.run();
obj.changear();
}
}