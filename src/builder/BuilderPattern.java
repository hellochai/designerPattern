package builder;

import javax.swing.plaf.ButtonUI;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 15:15
 */

public class BuilderPattern {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConstructBuilder();
        director.Construct(builder);
        Computer computer = builder.getComputer();
        computer.print();
    }
}
