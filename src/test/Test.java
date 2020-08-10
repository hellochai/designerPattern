package test;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 16:51
 */

/**
 * 对象自救： 使用finalize()方法实现自救，。ﬁnalize()方法是对象逃脱死亡的最后一次机会，稍后GC将对F-Queue中的对象进行第二次小规模标记，
 * 如果对象在ﬁnalize()中成功拯救自己(只需要重新与引用链上的任何一个对象建立起关联关系即可)，那在第二次标记时它将会被移除出"即将回收"的集合；
 * 如果对象这时候还是没有逃脱，那基本上它就是真的被回收了。任何一个对象的ﬁnalize()方法都只会被系统自动调用一次，
 * 如果相同的对象在逃脱一次后又面临一次回收，它的ﬁnalize()方法不会被再次执行，因此第二段代码的自救行动失败。
 */
public class Test {
    public static Test test;
    public void isAlive() {
        System.out.println("I am alive :)");
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        test = this;
    }
    public static void main(String[] args)throws Exception {
        test = new Test();
        test = null;
        System.gc();
        Thread.sleep(500);
        if (test != null) {
            test.isAlive();
        }else {
            System.out.println("no,I am dead :(");
        }
        // 下面代码与上面完全一致，但是此次自救失败
        test = null;
        System.gc();
        Thread.sleep(500);
        if (test != null) {
            test.isAlive();
        }else {
            System.out.println("no,I am dead :(");
        }
    }
}