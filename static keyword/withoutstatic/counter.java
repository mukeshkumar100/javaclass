class counter
{
int count=0;
counter()
{
count++;
System.out.println(count);
}
public static void main(String arr[])
{
counter c1=new counter();
counter c2=new counter();
counter c3=new counter();
}
}