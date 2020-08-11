package factoryPattern.impl;

import factoryPattern.Sender;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 14:11
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("This is sms sender");
    }
}
