package factoryPattern;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 14:21
 */

import factoryPattern.impl.MailSender;
import factoryPattern.impl.SmsSender;

/**
 * 多个工厂方法模式
 *     对普通工厂方法啊模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能创建对象，多工厂方法模式是
 *     提供多个工厂方法，分别创建对象
 *
 *
 *  静态工厂方法模式
 *  将工厂方法模式里的方法置为静态，不需要创建实例，直接调用即可
 */
public class SendFactory {
    public Sender produceMail(){
        return new MailSender();
    }

    /**
     *  静态工厂方法模式
     *     public Sender produceMail(){
     *         return new MailSender();
     *     }
     *
     */
    public Sender produceSms(){
        return new SmsSender();
    }
}


