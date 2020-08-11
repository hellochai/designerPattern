package builder;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 15:10
 */
public class ConstructBuilder extends Builder {
    Computer computer = new Computer();
    @Override
    public void buildCPU() {
        computer.Add("CPU");
    }

    @Override
    public void buildMainBoard() {
        computer.Add("装主板");
    }

    @Override
    public void buildDisk() {
        computer.Add("装硬盘");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
