package presentation.part1;

import dao.part1.DaoImpl;
import metier.part1.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();
        metier.setDao(new DaoImpl());
        System.out.println(metier.calcul());
    }
}
