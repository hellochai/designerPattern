package singleton;

/**
 * @Description: 单例模式
 * @Author: fchai
 * @Date: 2020/8/10 11:02
 */


/**
 * 单例模式： 一个类只允许一个实例化对象
 * 分为懒汉式和饿汉式
 * 饿汉式：构造方法私有化，外部无法产生新的对象，只能通过static方法取得实例化对象
 */
public class Singleton {
    /**
     * 在类的内部访问私有结构，所以可以在类的内部产生实例化对象
     */
    private static Singleton singleton = new Singleton();

    /**
     * 声明构造
     * @param
     */
    private Singleton(){
    }

    /**
     * 返回类的实例对象
     * @param
     */
    public static Singleton getInstance() {
        return singleton;
    }


    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        if (singleton == singleton1){
            System.out.println("是单例");
        }else System.out.println("不是单例");
    }


}

























