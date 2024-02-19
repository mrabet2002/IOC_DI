package dao.part1;

import dao.IDao;

public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("Version 1.0.0 of DaoImpl.");
        return 34.4;
    }
}
