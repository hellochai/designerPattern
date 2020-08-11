package abstrFactory.impl;

import abstrFactory.Provider;
import abstrFactory.Sender;
import factoryPattern.impl.SmsSender;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 14:47
 */
public class SendSmsFactoryImpl implements Provider {
    @Override
    public Sender produce() {
        return (Sender) new SmsSender();
    }
}
