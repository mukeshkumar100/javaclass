class student
{
int id;
String name;
student(int id,String name)
{
id=id;
name=name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String arr[]){
student s1=new student(10,"ram");
student s2=new student(120,"ramu");
s1.display();
s2.display();
}
}