package test;

import dao.UserDAO;
import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/applicationContext.xml");
        UserDAO userDAO=(UserDAO) applicationContext.getBean("userDAO");
        System.out.println(userDAO);

        userDAO.insert(new User("123","123","123"));
    }
}
