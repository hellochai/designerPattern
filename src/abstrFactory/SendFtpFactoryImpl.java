package abstrFactory;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 14:57
 */
public class SendFtpFactoryImpl implements Provider{
    @Override
    public Sender produce() {
        return new FtpSender();
    }
}
