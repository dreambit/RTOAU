import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class MainWindow extends JFrame {

    private static final long serialVersionUID = 1L;
    private JImage preview;
    private JPanel paramPanel;
    private JTextField inputField_k1;
    private JTextField inputField_k2;
    private JTextField inputField_k3;
    private JTextField inputField_k4;
    private JTextField inputField_t1;
    private JTextField inputField_t2;
    private JTextField inputField_t3;
    private JTextField inputField_t4;
    private JComboBox schemaSelectComboBox;
    private JTextField inputField_gurvic;
    public MainWindow() {
        setResizable(false);
        setTitle("Оценка устойчивости системы");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(569, 458);
        
        preview = new JImage();
        paramPanel = new JPanel();
        paramPanel.setBorder(BorderFactory.createTitledBorder("Параметры системы"));
        
        JButton button = new JButton("Оценить систему");
        button.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                Stability stability = ((SchemeView)schemaSelectComboBox.getSelectedItem()).getStability();
                double k1 = Double.parseDouble(inputField_k1.getText());
                double k2 = Double.parseDouble(inputField_k2.getText());
                double k3 = Double.parseDouble(inputField_k3.getText());
                double k4 = Double.parseDouble(inputField_k4.getText());
                double t1 = Double.parseDouble(inputField_t1.getText());
                double t2 = Double.parseDouble(inputField_t2.getText());
                double t3 = Double.parseDouble(inputField_t3.getText());
                double t4 = Double.parseDouble(inputField_t4.getText());
                boolean isStable = stability.isStable(Method.GURVIC, k1, k2, k3, k4, t1, t2, t3, t4);
                
                if (isStable) {
                    inputField_gurvic.setText("Система устойчива");
                    inputField_gurvic.setForeground(new Color(3, 139, 34));
                } else {
                    inputField_gurvic.setText("Система неустойчива");
                    inputField_gurvic.setForeground(Color.RED);
                }
            }
        });
        
        //--------------------------------------------------------------------------------------------
        schemaSelectComboBox = new JComboBox();
        schemaSelectComboBox.addItem(new SchemeView(Toolkit.getDefaultToolkit().getImage("image1.jpg"), 
                "Схема №1", 
                new Scheme_1()));
        
        schemaSelectComboBox.addItem(new SchemeView(Toolkit.getDefaultToolkit().getImage("image2.jpg"), 
                                                    "Схема №2", 
                                                    new Scheme_2()));
        
        schemaSelectComboBox.addItem(new SchemeView(Toolkit.getDefaultToolkit().getImage("image3.jpg"), 
                "Схема №3", 
                new Scheme_3()));
        
        schemaSelectComboBox.addItem(new SchemeView(Toolkit.getDefaultToolkit().getImage("image4.jpg"), 
                "Схема №4", 
                new Scheme_4()));
        
        schemaSelectComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preview.setImage(((SchemeView)schemaSelectComboBox.getSelectedItem()).getImage());
            }
        });
        
        schemaSelectComboBox.setSelectedIndex(0);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Результаты", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
        
        JLabel label_7 = new JLabel("Критерий Гурвица");
        
        inputField_gurvic = new JTextField();
        inputField_gurvic.setHorizontalAlignment(SwingConstants.RIGHT);
        inputField_gurvic.setColumns(10);
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label_7)
                    .addPreferredGap(ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                    .addComponent(inputField_gurvic, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        gl_panel.setVerticalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(label_7)
                        .addComponent(inputField_gurvic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);
        //------------------------------------------------------------------------------------------------------
        
        
        
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                            .addGap(10)
                            .addComponent(preview, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(schemaSelectComboBox, 0, 539, Short.MAX_VALUE))
                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(paramPanel, GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panel, GroupLayout.PREFERRED_SIZE, 539, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(button)))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(10)
                    .addComponent(preview, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                    .addGap(10)
                    .addComponent(schemaSelectComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(paramPanel, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(panel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                    .addGap(5)
                    .addComponent(button, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addContainerGap())
        );
        
        inputField_k1 = new JTextField();
        inputField_k1.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("К1");
        
        JLabel label = new JLabel("К2");
        
        inputField_k2 = new JTextField();
        inputField_k2.setColumns(10);
        
        JLabel label_1 = new JLabel("К3");
        
        inputField_k3 = new JTextField();
        inputField_k3.setColumns(10);
        
        JLabel label_2 = new JLabel("К4");
        
        inputField_k4 = new JTextField();
        inputField_k4.setColumns(10);
        
        inputField_t1 = new JTextField();
        inputField_t1.setColumns(10);
        
        JLabel label_3 = new JLabel("Т1");
        
        inputField_t2 = new JTextField();
        inputField_t2.setColumns(10);
        
        inputField_t3 = new JTextField();
        inputField_t3.setColumns(10);
        
        inputField_t4 = new JTextField();
        inputField_t4.setColumns(10);
        
        JLabel label_4 = new JLabel("Т2");
        
        JLabel label_5 = new JLabel("Т3");
        
        JLabel label_6 = new JLabel("Т4");
        GroupLayout gl_paramPanel = new GroupLayout(paramPanel);
        gl_paramPanel.setHorizontalGroup(
            gl_paramPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_paramPanel.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_paramPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_paramPanel.createSequentialGroup()
                            .addComponent(lblNewLabel)
                            .addGap(18)
                            .addComponent(inputField_k1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                            .addComponent(label_3)
                            .addGap(18)
                            .addComponent(inputField_t1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(gl_paramPanel.createSequentialGroup()
                            .addComponent(label)
                            .addGap(18)
                            .addComponent(inputField_k2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                            .addComponent(label_4)
                            .addGap(18)
                            .addComponent(inputField_t2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(gl_paramPanel.createSequentialGroup()
                            .addComponent(label_1)
                            .addGap(18)
                            .addComponent(inputField_k3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                            .addComponent(label_5)
                            .addGap(18)
                            .addComponent(inputField_t3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(gl_paramPanel.createSequentialGroup()
                            .addComponent(label_2)
                            .addGap(18)
                            .addComponent(inputField_k4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                            .addComponent(label_6)
                            .addGap(18)
                            .addComponent(inputField_t4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        gl_paramPanel.setVerticalGroup(
            gl_paramPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_paramPanel.createSequentialGroup()
                    .addGroup(gl_paramPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNewLabel)
                        .addComponent(inputField_k1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputField_t1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_3))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_paramPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(label)
                        .addComponent(inputField_k2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputField_t2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_4))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_paramPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(label_1)
                        .addComponent(inputField_k3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputField_t3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_5))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_paramPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(label_2)
                        .addComponent(inputField_k4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputField_t4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_6))
                    .addContainerGap(47, Short.MAX_VALUE))
        );
        paramPanel.setLayout(gl_paramPanel);
        getContentPane().setLayout(groupLayout);
    }
}
