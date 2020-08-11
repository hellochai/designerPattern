package abstrFactory.impl;

import factoryPattern.Sender;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 14:40
 */
public class SmsSenderImpl implements Sender {
    @Override
    public void Send() {
        System.out.println("This is sms sender");
    }
}
