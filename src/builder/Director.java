package builder;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 15:08
 */

/**
 * 装机人员装机
 */
public class Director {
    public void Construct(Builder builder){
        builder.buildCPU();
        builder.buildMainBoard();
        builder.buildDisk();
    }
}
