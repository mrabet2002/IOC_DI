package dao.part2;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("Version 1.0.0 of DaoImpl.");
        return 34.4;
    }
}
