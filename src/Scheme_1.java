public class Scheme_1 extends Stability {
    
    
    @Override
    protected boolean isStableByMihaylov(double k1, double k2, double k3, double k4, double t1, double t2, double t3, double t4) {
        return false;
    }
    
    
    @Override
    protected boolean isStableByNyquist(double k1, double k2, double k3, double k4, double t1, double t2, double t3, double t4) {
        return false;
    }
    
    
    @Override
    protected boolean isStableByGurvic(double k1, double k2, double k3, double k4, double t1, double t2, double t3, double t4) {
        return false;
    }
}
