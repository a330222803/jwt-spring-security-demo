package org.zerhusen.security.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zerhusen.security.JwtTokenUtil;

import javax.servlet.http.HttpServletRequest;

@RestController
public class JokesRestController {
    private final Log logger = LogFactory.getLog(this.getClass());

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @RequestMapping(value = "my_jokes", method = RequestMethod.GET)
    public String getAuthenticatedUser(HttpServletRequest request) {
        return "{\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"id\": 44953,\n" +
                "      \"content\": \"某日，收到一条短信，　　觉得不太信，就念给老公听：“风油精可以去除包皮的污垢？” 　　老公听后，说：“这怎么受得了？”　　一脸困惑的把手机拿了过去！ 三秒钟的沉默后，　　老公怒吼道：“哇 靠，是皮包啦！看清楚了好不好！”\",\n" +
                "      \"hashId\": \"a307e87bb81fbab06f872c3eea9da9f7\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44954,\n" +
                "      \"content\": \"话说我一直弄不明白！　　为什么花木兰替父从军就没人能发现其女儿身！　　------忽然有一天灵光一现，我明白了！　　书中暗表：啊爷无大儿，木兰无长胸，没长胸啊有木有？\",\n" +
                "      \"hashId\": \"ec2790b86d171a77cac118764881e4d0\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44955,\n" +
                "      \"content\": \"这年头，无论是做菜的还是做 爱的，放心的肉是越来越少了； 　　无论是婴儿喝的还是成 人 摸的，放心的奶是越来越少了； 　　无论是家禽下的还是男人挂的，放心的蛋是越来越少了； 　　无论是饲养的还是应 招的，放心的鸡是越来越少了。。\",\n" +
                "      \"hashId\": \"9c424e2737766c4d7707df9f79fd33eb\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44956,\n" +
                "      \"content\": \"为什么这么男生喜欢看欧洲杯？　　原因很简单： 亚洲杯、非洲杯、美洲杯都是A-Cup，而欧洲杯是E-Cup\",\n" +
                "      \"hashId\": \"c4677cad2e11b37558ceba5f215761ae\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44957,\n" +
                "      \"content\": \"下午买水果，差点被宰，　　卖水果的大娘非常准确的报出了价格：四六三十六，　　小伙子，算你三十五吧。 　　我赶紧说：我还是要三斤吧，三六十八，我就带了20……\",\n" +
                "      \"hashId\": \"11f993d98960652ed7965e128b3028bd\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44958,\n" +
                "      \"content\": \"两兄弟山上采蘑菇，老人说颜色鲜艳的有毒，　　兄弟两个采回来，煮了，怕有毒，先让狗吃，　　狗吃完了没事出去了，老大看见，吃了一大碗，　　老二从外回来，哥，狗死了。　　老大一听吓坏了，急忙肥皂水，粪汁灌下去，吐了一肚子，　　然后问，那狗死得惨不。 　　老二说，死得老惨了，一出门就被大卡车给轧死了。\",\n" +
                "      \"hashId\": \"1db2835f2db38d80741eb827429170e7\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44959,\n" +
                "      \"content\": \"一天打开广播，广播：如果面色红润，带点绒毛就说明很健康。　　我对着镜子，摸摸自己的脸，心想这叫一个健康啊。 　　广播：好了，养猪知识讲座到此结束。\",\n" +
                "      \"hashId\": \"15d83666e627ff83bdce9a0c4a84fc5a\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44960,\n" +
                "      \"content\": \"男：“我满脑子装的都是你……” 　　女：“屁！我看你的脑子里装的都是屎吧！”　　男：“我不允许你这样侮辱你自己……”\",\n" +
                "      \"hashId\": \"644023355ac45577ed65a7bc9142eb35\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44961,\n" +
                "      \"content\": \"今天问一女性好友：“为什么一个不抽烟、不喝酒、　　不赌博、不花心、孝顺父母、有上进心、成熟稳重、　　大方大度、长相身高尚可、谦虚幽默有爱心的男人直到26岁还没有女朋友？”　　她只说了两个字：“没钱！” 　　我沉默了！\",\n" +
                "      \"hashId\": \"238e8e7f65202d50453d61ef4622f58b\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44962,\n" +
                "      \"content\": \"隔壁老头的追悼会开了，　　会上宣读了老头的遗言： 遗产不分，作为基金，每年取出利息，　　在墓前每年家人团聚一次，祭拜之后进行抽奖。\",\n" +
                "      \"hashId\": \"a7ea18b4adc96db7332fde27120e7fae\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44963,\n" +
                "      \"content\": \"一男同学借到了一本武功秘籍，　　整个暑假都在练，练到最后一页的时候，　　只见上面写着5个醒目的大字——孕妇健身操。\\r\\n冷笑话　2013-04-24 16:00\",\n" +
                "      \"hashId\": \"a8e8633be4517f73e3501725a2534b1a\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44964,\n" +
                "      \"content\": \"一男青年在公交车上看到一美女的衣领开得很低，　　春光外泄，戏言道‘真是桃花盛开的地方啊’。　　美女听后，撩起裙子说：‘还有生你养你的地方’！\",\n" +
                "      \"hashId\": \"a9b8b226b84d8d0160e30bacfe761946\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44965,\n" +
                "      \"content\": \"老公要出差半年， 贤妻收拾行李。　　完毕，深情地交给老公一包安全套说道：　　在外面实在忍不住的话记住一定带套。　　老公听罢激动地说：家里不宽裕还是用她们的吧。\",\n" +
                "      \"hashId\": \"3528b9ba1d56c233c79301e7de33c95b\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44966,\n" +
                "      \"content\": \"某男看到一则广告：不开刀、不住院、让你的生殖器轻轻松松变大变粗！　　顿大喜，立即汇款。　　数日，收到邮包，急切地打开一看！　　操！原来是一放大镜\",\n" +
                "      \"hashId\": \"b1865741dc696ad151ce0b837bdcc5f4\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44967,\n" +
                "      \"content\": \"在酒店吃饭，我席间内急，　　服务员热情地说：我们酒店没有卫生间，你可以去对面公厕，　　我们和他们有约定，到那你就说你是‘吃饭的’！\",\n" +
                "      \"hashId\": \"7bb6206fa18d6e60e8c90fa735270dde\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44968,\n" +
                "      \"content\": \"1949年9月28日我被捕了，　　第一天敌人毒打我我没招，　　第二天敌人用辣椒水泼我我没招，　　第三天敌人用美人计我招了，　　第四天我还想招，结果他妈的解放了。\",\n" +
                "      \"hashId\": \"2e6583f024946c9d25409fff2a53a1bf\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44969,\n" +
                "      \"content\": \"一个刚做了爸爸的屠夫气愤地说。　　“简直是疯了！加上产科医生的诊费、住院费和护理费，这个孩子竟然要800块钱1公斤！”\",\n" +
                "      \"hashId\": \"e05b03be3b9b51596f7f1ffb4dbbda9c\",\n" +
                "      \"updatetime\": 1501171522,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44950,\n" +
                "      \"content\": \"“一定要用阿拉伯语、英语、中文三种文字才能完整地叫出你的名字。”　　“啊，叫我什么？”　　“2b青年”\",\n" +
                "      \"hashId\": \"9c88160dc497e6d23ee019dd2f27d3fd\",\n" +
                "      \"updatetime\": 1501171521,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44951,\n" +
                "      \"content\": \"人生最重要的不是所在的位置，而是所朝的方向。　　同样是一个B，往北走就是NB，往南走就是SB。。。\",\n" +
                "      \"hashId\": \"1729daa8a29f5efe16d854d21fcce64d\",\n" +
                "      \"updatetime\": 1501171521,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44952,\n" +
                "      \"content\": \"你是哪里人？　　 贱人。 　　什么？ 　　不不不！是吉安人！输入法的问题！\",\n" +
                "      \"hashId\": \"e3b8445eff84267e7d6f36c75be07bb4\",\n" +
                "      \"updatetime\": 1501171521,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }

    @RequestMapping(value = "my_images", method = RequestMethod.GET)
    public String registerUser(HttpServletRequest request) {

        return "{\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"id\": 49065,\n" +
                "      \"content\": \"这眼神好凶恶啊\",\n" +
                "      \"hashId\": \"47ABEFD718E3B3719EDC5D9095A5CA9B\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/47ABEFD718E3B3719EDC5D9095A5CA9B.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49066,\n" +
                "      \"content\": \"阿姨，你到底做对它做了些什么？？\",\n" +
                "      \"hashId\": \"B93EBD5C4EC613EDF4E89AADB4EBB7BE\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/B93EBD5C4EC613EDF4E89AADB4EBB7BE.gif\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49067,\n" +
                "      \"content\": \"你怎么还不去吃药啊\",\n" +
                "      \"hashId\": \"B78C9170CFD9053D822134E3B6D946F0\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/B78C9170CFD9053D822134E3B6D946F0.gif\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49068,\n" +
                "      \"content\": \"在商场里看到的\",\n" +
                "      \"hashId\": \"D3468C5598EF59202CD2D141F1819E5E\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/D3468C5598EF59202CD2D141F1819E5E.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49069,\n" +
                "      \"content\": \"都学起来吧\",\n" +
                "      \"hashId\": \"8A3EC02FCDAA33EE910BA34C3BB9D4AF\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/8A3EC02FCDAA33EE910BA34C3BB9D4AF.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49070,\n" +
                "      \"content\": \"法克鱿！！吓死你爹我了！！\",\n" +
                "      \"hashId\": \"37F4A779BEA2A31883EEDA28490F6996\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/37F4A779BEA2A31883EEDA28490F6996.gif\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49071,\n" +
                "      \"content\": \"送吃货老婆最浪漫的礼物\",\n" +
                "      \"hashId\": \"DE7139D8047EEA1BC6DA17A1D552FAE4\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/DE7139D8047EEA1BC6DA17A1D552FAE4.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49072,\n" +
                "      \"content\": \"霸气外漏啊\",\n" +
                "      \"hashId\": \"9C8F71C27C110A92475E50E041FE3F42\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/9C8F71C27C110A92475E50E041FE3F42.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49073,\n" +
                "      \"content\": \"发型师的手艺不错\",\n" +
                "      \"hashId\": \"5491C6E302447B3539357AEB57C45628\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/5491C6E302447B3539357AEB57C45628.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49074,\n" +
                "      \"content\": \"大开眼界了\",\n" +
                "      \"hashId\": \"0F20E7336110191B3A18CE90A9514A62\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/0F20E7336110191B3A18CE90A9514A62.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49075,\n" +
                "      \"content\": \"不知道有没有人试过这招\",\n" +
                "      \"hashId\": \"7A7DCFE7EDFF6FD998D99C5635D429FE\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/7A7DCFE7EDFF6FD998D99C5635D429FE.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49076,\n" +
                "      \"content\": \"说的这么直接，伦家都不好意思了\",\n" +
                "      \"hashId\": \"B51E3F10738C2DE66C926BFB14D140FA\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/B51E3F10738C2DE66C926BFB14D140FA.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49077,\n" +
                "      \"content\": \"送餐小哥的态度是可以肯定的\",\n" +
                "      \"hashId\": \"241BFE528B4CC6B4963FAE328F3A14D4\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/241BFE528B4CC6B4963FAE328F3A14D4.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49078,\n" +
                "      \"content\": \"妹子你真的没有感觉出异常吗\",\n" +
                "      \"hashId\": \"018049974D55EB6E65FEF63FECD84576\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/018049974D55EB6E65FEF63FECD84576.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49079,\n" +
                "      \"content\": \"板凳的艺术\",\n" +
                "      \"hashId\": \"BB3D21179EA248C99AE7911B9CC57139\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/BB3D21179EA248C99AE7911B9CC57139.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49080,\n" +
                "      \"content\": \"甚至跟二胎弟妹争家产，你值得拥有\",\n" +
                "      \"hashId\": \"B6CABA54CF99B39509C9ECE2766742B0\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/B6CABA54CF99B39509C9ECE2766742B0.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49081,\n" +
                "      \"content\": \"酷炫的不得了\",\n" +
                "      \"hashId\": \"909A4F4F5240A5A07750907185622176\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/909A4F4F5240A5A07750907185622176.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49082,\n" +
                "      \"content\": \"大家把手放下，在我装逼的时候不要打断我！\",\n" +
                "      \"hashId\": \"2F9124E7C56797A70C60D9EB4C777A83\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/2F9124E7C56797A70C60D9EB4C777A83.gif\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49083,\n" +
                "      \"content\": \"不敢直视\",\n" +
                "      \"hashId\": \"637CB4DBFCBF54EF3CAFE23F56400302\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/637CB4DBFCBF54EF3CAFE23F56400302.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49084,\n" +
                "      \"content\": \"妹子你是有多能吃啊\",\n" +
                "      \"hashId\": \"140E1959A2F93C7A5B95998A8FBA85A3\",\n" +
                "      \"url\": \"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201501/30/140E1959A2F93C7A5B95998A8FBA85A3.jpg\",\n" +
                "      \"updatetime\": 1501171668,\n" +
                "      \"up_amount\": 0,\n" +
                "      \"down_amount\": 0,\n" +
                "      \"collect_amount\": 0,\n" +
                "      \"comment_amount\": 0,\n" +
                "      \"my_attitude\": 0,\n" +
                "      \"my_collected\": 0\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }

}
