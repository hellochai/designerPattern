package abstrFactory.impl;

import abstrFactory.Provider;
import abstrFactory.Sender;
import factoryPattern.impl.MailSender;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 14:42
 */
public class SendMailFactoryImpl implements Provider {
    /**
     * new 一个新的工厂
     * @return
     */
    @Override
    public Sender produce() {
        return new MailSendermpl();
    }
}
