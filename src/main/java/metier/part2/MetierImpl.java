package metier.part2;

import dao.IDao;
import metier.IMetier;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    private final IDao dao; // Weak coupling

    @Override
    public double calcul() {
        double data = dao.getData();
        return data * Math.random();
    }
}
