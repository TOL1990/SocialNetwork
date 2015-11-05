package skillsUp.socialNetwork.coreImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Леонид on 04.11.2015.
 * main app starter
 */
public class App {
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");

    }
}
