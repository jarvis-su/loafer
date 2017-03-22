import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuartzTest {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("quartz-context.xml");
    }
}
