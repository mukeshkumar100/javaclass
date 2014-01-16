class para
{
int id;
String name;
para(int i,String n)
{
id=i;
name=n;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String arr[])
{
para p1=new para(10,"ram");
para p2=new para(19,"ramesh");
p1.display();
p2.display();
}
}