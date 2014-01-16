class student1
{
int id;
String name;
String city;
student1(int id,String name)
{
this.id=id;
this.name=name;
}
student1(int id,String name,String city)
{
this(id,name);   //yaha pe this keyword use karne se uper ke construtor ka instance/referance ko access karte hai.
this.city=city;
}
void display()
{
System.out.println(id+" "+name+" "+city);
}
public static void main(String arr[]){
student1 s1=new student1(10,"ram");
student1 s2=new student1(120,"mukesh","noida");
s1.display();
s2.display();
}
}