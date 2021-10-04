/**
 * Project name(项目名称)：this关键字
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/4
 * Time(创建时间)： 21:56
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Dog
{
    public void jump()
    {
        System.out.println("正在执行jump方法");
    }
    public void run()
    {
        //Dog d=new Dog();
        //d.jump();
        this.jump();
        System.out.println("正在执行run方法");
    }
}
