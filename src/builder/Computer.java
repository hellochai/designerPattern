package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 15:11
 */
public class Computer {
    private List<String> parts = new ArrayList<String>();
    public void Add(String part){
        parts.add(part);
    }
    public void print(){
        for (int i = 0; i < parts.size(); i++) {
            System.out.println("组件:" + parts.get(i) + "装好了..");
        }
        System.out.println("组装完成");
    }
}
