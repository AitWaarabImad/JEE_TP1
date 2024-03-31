package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version temp");
        double tmp=36;
        return tmp;
    }
}
