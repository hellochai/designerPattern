package factoryPattern;

import factoryPattern.impl.MailSender;
import factoryPattern.impl.SmsSender;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 14:12
 */

/**
 * 普通工厂模式
 * 建立一个工厂类FactoryPattern,对实现了同一接口的一些类进行实例的创建
 */
public class FactoryPattern {
    public static void main(String[] args) {
        Sender sender = produce("sms");
        sender.Send();

        SendFactory factory = new SendFactory();
        Sender sender1 = factory.produceMail();
        sender1.Send();
    }
    private static Sender produce(String str) {
        if ("mail".equals(str)){
            return new MailSender();
        }else if ("sms".equals(str)){
            return new SmsSender();
        }else {
            System.out.println("输入有误");
            return null;
        }
    }
}
