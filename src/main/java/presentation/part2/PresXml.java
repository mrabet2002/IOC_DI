package presentation.part2;

import dao.part1.DaoImpl;
import metier.IMetier;
import metier.part1.MetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresXml {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
        IMetier metier = (IMetier) ctx.getBean("metier");
        System.out.println(metier.calcul());
    }
}
