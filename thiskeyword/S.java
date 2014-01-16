class S
{
void  m(S obj)
{
System.out.println("method invoked");
}
void p()
{
m(this);
}
public static void main(String arr[])
{
S s1=new S();
s1.p();
}
}