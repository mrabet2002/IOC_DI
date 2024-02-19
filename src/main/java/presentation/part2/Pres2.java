package presentation.part2;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        // Recuperate the config file from the resources folder
        URL resourceUrl = Pres2.class.getClassLoader().getResource("config.txt");
        assert resourceUrl != null;
        // Create a file from the URL
        File file = new File(resourceUrl.toURI());
            Scanner scanner = new Scanner(file);
        // Read the first two lines of the file to get the implementation classes
        String daoClassName = scanner.nextLine();
        String metierClassName = scanner.nextLine();
        // Inject the dao and metier classes
        IDao dao = (IDao) Class.forName(daoClassName)
                .getConstructor().newInstance();
        IMetier metier = (IMetier) Class.forName(metierClassName)
                .getConstructor().newInstance();
        // Get the setDao method from the metier class and call it
        Method setDao = metier.getClass().getMethod("setDao", IDao.class);  // get the method
        setDao.invoke(metier, dao);
        // Call the calcul method from the metier class
        System.out.println(metier.calcul());
    }
}
