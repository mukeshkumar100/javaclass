class stud
{
int id;
String name;
stud(int id,String name)
{
this.id=id;
this.name=name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String arr[]){
stud s1=new stud(10,"ram");
stud s2=new stud(120,"ramu");
s1.display();
s2.display();
}
}