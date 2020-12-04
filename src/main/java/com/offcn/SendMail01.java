package com.offcn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * @author 周达
 * @description SendMail01
 * @annotation:
 * @since 2020/11/19 16:18
 */
public class SendMail01 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-mail.xml");
        //创建邮件发送服务
        JavaMailSender mailSender = (JavaMailSender) context.getBean("mailSender");
        //创建简单邮件
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("13514955315@163.com");
        message.setTo("1435347856@qq.com");
        message.setSubject("马保国");
        message.setText("朋友们好啊我是浑元形意太极门掌门人马报国。\n" +
                "刚才有个朋友问我马老师发生什么事了，我说怎么回事，给我发了一几张截图，我一看！嗷！原来是昨天，有两个年轻人，三十多岁，一个体重，九十多公斤，一个体重八十多公斤，他们说，唉…有一个说是我在健身房练功颈椎练坏了，马老师你能不能教教我浑元功法，矮…帮助治疗一下，我的颈椎病。我说可以。我说你在健身房练死劲儿，不好用，他不服气。我说小朋友：你两个手来找我一个手指头，他找不动。他说你这也没用。我说我这个有用，这是化劲儿，传统功夫是讲化劲儿的四两拨千金。二百多斤的英国大力士，动我不动我这一个手指头。啊…哈！他非和我试试，我说可以。诶…我一说的啪就站起来了，很快啊！然后上来就是一个左正蹬一个右边腿一个左刺拳，我全部防区防出去了啊防出去以后自然是传统功夫你点到为止右拳放到他鼻子上没打他，我笑一下准备收拳，由这时间，欸传统功夫的点到为止他已经输了，如果这一拳发力，一拳就把他鼻子打骨折了，放在鼻子上没有打他，他也承认，我先打到他面部。他不知道拳放在他鼻子上，他承认我先打到他面部，啊，我收拳的时间不打了，他突然袭击左刺拳来打我脸，啊，我大意了啊，没有闪，矮…他的左拳给我眼，啊，右眼，蹭了一下，但没关系啊！他也说，啊他截图也说了，两分多钟以后，当时流眼泪了，捂着眼，我说停停。然后两分钟钟以后，两分多钟以后诶就好了，我说小伙子你不讲武德你不懂，我说马老师对不对不起，我不懂规矩。啊，我是…他说他是乱打的，他可不是乱打的啊，蹬蹬边腿左刺拳，训练有素，后来他说他练过三四年泰拳，啊，看来是有备而来！这两个年轻人不讲武德，来骗，来偷袭，我六十九岁的老同志，这好吗？这不好，我劝这位年轻人好自为之，好好反思，以后不要再犯这样的聪明，小聪明，啊，呃…武林要以和为贵，要讲武德，不要搞窝里斗，谢谢朋友们！");


        while (true) {
            mailSender.send(message);
            System.out.println("send ok");
        }
    }
}
