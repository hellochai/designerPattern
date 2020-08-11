package builder;

/**
 * @Description: 建造者模式，将各种产品集中起来管理，用来创建复合对象，
 *                复合对象： 指某个类具有不同的属性
 * @Author: fchai
 * @Date: 2020/8/10 15:03
 */

public abstract class Builder {
    /**
     * 1. 装CPU
     */
    public abstract void buildCPU();

    /**
     * 装主板
     */
    public abstract void buildMainBoard();

    /**
     * 装硬盘
     */
    public abstract void buildDisk();

    /**
     * 获得组装好的电脑
     */
    public abstract Computer getComputer();
}
