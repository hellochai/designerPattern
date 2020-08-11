package test;

import org.junit.Test;
import singleton.Singleton;
import singleton.SingletonTherOnther;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 11:19
 */

public class DesignerTest {
    @Test
    public void singletonTest() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        if (singleton == singleton1) {
            System.out.println("是单例");
        } else System.out.println("不是单例");
    }

    /**
     * 懒汉式单例类测试
     */
    @Test
    public void singleTheOtherTest() {
        SingletonTherOnther.getInstance().print();
    }
}









