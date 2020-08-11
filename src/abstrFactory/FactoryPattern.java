package abstrFactory;

import abstrFactory.impl.SendMailFactoryImpl;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 14:52
 */
public class FactoryPattern {
    public static void main(String[] args) {
        Provider provider = new SendMailFactoryImpl();
        Sender sender = provider.produce();
        sender.Send();


        Provider provider1 = new SendFtpFactoryImpl();
        Sender sender1 = provider1.produce();
        sender1.Send();

    }
}

