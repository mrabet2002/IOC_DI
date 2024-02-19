package dao.part1;

import dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version 2.0.0 of DaoImpl");
        return 35.4;
    }
}
