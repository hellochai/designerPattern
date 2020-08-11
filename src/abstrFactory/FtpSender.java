package abstrFactory;

/**
 * @Description:
 * @Author: fchai
 * @Date: 2020/8/10 14:58
 */
public class FtpSender implements Sender {
    @Override
    public void Send() {
        System.out.println("This is FTP");
    }
}
