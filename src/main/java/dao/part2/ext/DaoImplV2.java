package dao.part2.ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version 2.0.0 of DaoImpl");
        return 35.4;
    }
}
