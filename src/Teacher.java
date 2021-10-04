/**
 * Project name(项目名称)：this关键字
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/4
 * Time(创建时间)： 21:44
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Teacher
{
    private String name;
    private double salary;
    private int age;

    public Teacher(String name, double salary, int age)
    {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public void display()
    {
        StringBuilder s = new StringBuilder();
        s.append("姓名：").append(name).append("\n工资：").append(salary).append("\n年龄：").append(age);
        System.out.println(s);
        //System.out.println("姓名："+name);
        //System.out.println("工资："+salary);
        // System.out.println("年龄："+age);
    }

    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Teacher t = new Teacher("张三", 5864, 23);
        t.display();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        //------------------------------------------------------
    }
}
