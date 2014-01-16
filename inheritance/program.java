class Emp
{
float salary=10000;
}
class program extends Emp
{
int bonus=5000;
public static void main(String arg[])
{
program p=new program();
System.out.println("program salary"+p.salary);
System.out.println("program bonus"+p.bonus);
}
}