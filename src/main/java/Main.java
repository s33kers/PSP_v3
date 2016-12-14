import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import us.martink.interfaces.MainBean;

/**
 * Created by tadas on 2016-12-13.
 */
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-config.xml"});
        MainBean main = context.getBean("construction", MainBean.class);
        main.justDoIt();
        context.close();
    }
}
