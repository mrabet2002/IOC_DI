package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // Weak coupling

    /**
     * Inject the dao object.
     * @param dao the dao to set
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        return data * Math.random();
    }
}
