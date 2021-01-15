package Practice;

import org.junit.Test;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author shanyu
 * @version 1.0
 * @date 2021/1/15 10:34
 */
public class PracticeJava {

    /**
     * 测试int，byte表示十六进制转换输出情况
     */
    @Test
    public void intHex() {
        int a = 0x02;
//        System.out.println(a);
        byte c = (byte) 0xAE;
        byte b = (byte) (a);
        System.out.println(c);
    }

    /**
     * byte数据判断时需要注意范围
     */
    @Test
    public void byteCondition() {
        byte a = (byte) 0x82;
        /*由于byte类型范围为-128--127，所以表示不了0x82（130），不能直接判断*/
        if (a == 0x82) {
            System.out.println(a);
        }
        if (a == -126) {
            System.out.println(a);
        }
    }

    /**
     * 获取当前时间，自定义格式
     */
    @Test
    public void getTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy MM dd '+' HH mm ss");
        System.out.println(dateFormat.format(System.currentTimeMillis()));
    }

    @Test
    public void arrayListToArray() {
        List<Byte> lb = new ArrayList<>();
        byte[] dt = {12, 23, 45, 64, 35, 56};
        for (byte t : dt) {
            lb.add(t);
        }
        Byte[] ne = new Byte[lb.size()];
        lb.toArray(ne);
    }

    @Test
    public void testString() {
        String str1 = "jbsjbh";
        String str2 = "11";
        str1 = str1.substring(0, 2);
        System.out.println(str1);
    }

    /**
     * 获取随机数，计算机基于当前时间获取
     *
     * @throws InterruptedException
     */
    @Test
    public void randomNum() throws InterruptedException {
        int num = new Random().nextInt(7);
        switch (num) {
            case 0:
                System.out.println(num);break;
            case 1:
                System.out.println(num);break;
            case 2:
                System.out.println(num);break;
            case 3:
                System.out.println(num);break;
            case 4:
                System.out.println(num);break;
            case 5:
                System.out.println(num);break;
            case 6:
                System.out.println(num);break;

        }
        while (true) {
            /*Random生成[0-100)中随机数,底层通过nanoTime获取*/
            System.out.print(new Random().nextInt(6) + " ");

            /*Math生成随机数，底层用了Random*/
            System.out.print((int) (Math.random() * 100) + " ");

            /*currentTime获取随机数*/
            System.out.print(System.currentTimeMillis() % 100);

            System.out.println();
            TimeUnit.NANOSECONDS.sleep(10000);
        }
    }
}
