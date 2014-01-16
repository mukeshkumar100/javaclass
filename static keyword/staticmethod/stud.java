class stud
{
int rollno;
String name;
static String college="vmu";
static void change()
{
college="avit";
}
stud(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
public static void main(String arr[])
{
stud.change();
stud s1=new stud(10,"ram");
stud s2=new stud(20,"ramu");
s1.display();
s2.display();
}
}