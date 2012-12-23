import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.DefaultXYZDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class ChartDialog extends JDialog{
    private static final long serialVersionUID = 1L;
    private JFreeChart chart;
    XYSeriesCollection dataset;
    
    public ChartDialog(JFrame MainWindow, String chartTitle, Function function) {
        super(MainWindow, false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        dataset = new XYSeriesCollection();
        XYSeries xySeries = new XYSeries("");  
        
        chart = ChartFactory.createBubbleChart(chartTitle, 
                "X", 
                "Y", 
                dataset, 
                PlotOrientation.VERTICAL, 
                true, 
                true, 
                false);
        
        chart.getPlot().setForegroundAlpha(0.1f);
        ChartPanel chartpanel = new ChartPanel(chart);
        chartpanel.setSize(new Dimension(500, 500));
        setContentPane(chartpanel);
        
        setResizable(false);
        pack();
    }
    
    
    public JFreeChart getChart() {
        return chart;
    }
    
    
    public DefaultXYZDataset getDataSet() {
        return dataset;
    }
    
    
    public void addSeries(String title, double data[][]) {
        dataset.addSeries(title, data);
    }
    
    
    public void removeSeries(String key) {
        dataset.removeSeries(key);
    }
}
