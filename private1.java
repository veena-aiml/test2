import java.io.*;
class employee
{
private int id;
private String name;
private int age;
public int getId()
{
return id;
}
public void setId(int id)
{
this.id=id;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}
public int getAge()
{
return age;
}
public void setAge(int age)
{
this.age=age;
}
}
class private1
{
public static void main(String args[])
{
employee e=new employee();
e.setId(101);
e.setName("veena");
e.setAge(20);
System.out.println(e.getId()+" "+e.getName()+" "+e.getAge());
}
}