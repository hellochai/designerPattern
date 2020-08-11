package factoryPattern.impl;

import factoryPattern.Sender;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 14:10
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("This is mail sender");
    }
}
