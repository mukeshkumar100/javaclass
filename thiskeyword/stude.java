class stude
{
int id;
String name;
stude()
{
System.out.println("default construtor call");
}
stude(int id,String name)
{
this();
this.id=id;
this.name=name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String arr[]){
stude s1=new stude(10,"ram");
stude s2=new stude(120,"ramu");
s1.display();
s2.display();
}
}