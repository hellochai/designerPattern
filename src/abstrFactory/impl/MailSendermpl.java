package abstrFactory.impl;

import abstrFactory.Provider;
import abstrFactory.Sender;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 14:39
 */
public class MailSendermpl implements Sender {
    @Override
    public void Send() {
        System.out.println("This is mail sender");
    }
}
