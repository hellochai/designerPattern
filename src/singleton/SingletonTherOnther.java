package singleton;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 11:27
 */

/**
 * 单例模式：
 *   懒汉式：
 *         当第一次去使用对象的时候才会为其产生实例化对象的操作
 */
public class SingletonTherOnther {
    /**
     * 声明变量
     * volatile:
     *   在生成混编代码时会在volatile修饰的共享变量进行写操作的时候会多出Lock前缀的指令：
     *   指令的影响:
     *    1. 将当前处理器缓存行的数据写回到系统内存
     *    2. 这个写回内存的操作会使得其他CPU里缓存了该内存地址的数据无效
     *    3. 当处理器发现本地缓存失效后，就会从内存中重读该变量数据，即可以获取当前最新值
     *    volatile变量通过这样的机制就使得每个线程都能获得该变量的最新值
     **/
    private static volatile SingletonTherOnther singletonTherOnther = null;

    /**
     * 私有构造方法
     */
    private SingletonTherOnther(){}

    /**
     * 提供对外方法
     */
    public static SingletonTherOnther getInstance(){
        if (singletonTherOnther == null){
            synchronized (SingletonTherOnther.class){
                if (singletonTherOnther == null){
                    singletonTherOnther = new SingletonTherOnther();
                }
            }
        }
        return singletonTherOnther;
    }
    public void print(){
        System.out.println("懒汉式单例类");
    }
}
