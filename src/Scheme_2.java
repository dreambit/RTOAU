import java.util.ArrayList;
import java.util.Stack;

public class Scheme_2 extends Stability {
    
    
    @Override
    protected boolean isStableByMihaylov(double k1, double k2, double k3, double k4, double t1, double t2, double t3, double t4) {
        Stack<Double> points = new Stack<Double>();
        Function function = new Function() {
            
            @Override
            public double getValueFor(double w) {
                // TODO Auto-generated method stub
                return 0;
            }
        };
        return false;
    }
    
    
    @Override
    protected boolean isStableByNyquist(double k1, double k2, double k3, double k4, double t1, double t2, double t3, double t4) {
        return false;
    }
    
    
    @Override
    protected boolean isStableByGurvic(double k1, double k2, double k3, double k4, double t1, double t2, double t3, double t4) {
        double a0 = t2 * t3 * t4;
        double a1 = t2 * t3 + t2 * t4 + t3 * t4;
        double a2 = t2 + t3 + t4;
        double a3 = t2 * k1 * k3 * k4 + t3 * k1 * k2 * k4 + 1;
        double a4 = k1 * k2 * k4 + k1 * k3 * k4;
        double a5 = 0;
        
        double m2[][] = {{a1, a3},
                         {a0, a2}};
        
        double m3[][] = {{a1, a3, a5},
                         {a0, a2, a4},
                         {0, a1, a3}};
        
        double m4[][] = {{a1, a3, a5, 0},
                         {a0, a2, a4, 0},
                         {0, a1, a3, a5},
                         {0, a0, a2, a4}};
        
        return (a1 >= 0 && 
                Matrix.determinant(m2) >= 0 && 
                Matrix.determinant(m3) >= 0 && 
                Matrix.determinant(m4) >= 0);
    }
    
}
