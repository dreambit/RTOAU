public abstract class Stability {
    /**
     * Checks the system for stability
     * @param k1
     * @param k2
     * @param k3
     * @param k4
     * @param t1
     * @param t2
     * @param t3
     * @param t4
     * @return true is the system is stable, else false
     */
    public boolean isStable(Method method, double k1, double k2, double k3, double k4, double t1, double t2, double t3, double t4){
        switch (method) {
        case GURVIC:
            return isStableByGurvic(k1, k2, k3, k4, t1, t2, t3, t4);
        case MIHAYLOV:
            return isStableByMihaylov(k1, k2, k3, k4, t1, t2, t3, t4);
        case NYQUIST:
            return isStableByNyquist(k1, k2, k3, k4, t1, t2, t3, t4);
        default:
            return false;
        }
    }
    
    
    protected abstract boolean isStableByGurvic(double k1, double k2, double k3, double k4, double t1, double t2, double t3, double t4);
    
    
    protected abstract boolean isStableByMihaylov(double k1, double k2, double k3, double k4, double t1, double t2, double t3, double t4);
    protected abstract boolean isStableByNyquist(double k1, double k2, double k3, double k4, double t1, double t2, double t3, double t4);
}
