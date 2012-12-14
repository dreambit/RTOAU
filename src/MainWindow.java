import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;


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
    public MainWindow() {
        setResizable(false);
        setTitle("Оценка устойчивости системы");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(569, 363);
        
        preview = new JImage("image.jpg");
        paramPanel = new JPanel();
        paramPanel.setBorder(BorderFactory.createTitledBorder("Параметры системы"));
        
        JButton button = new JButton("Начать оценку");
        
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(10)
                            .addComponent(preview, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(paramPanel, GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
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
                    .addComponent(paramPanel, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(button, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
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
