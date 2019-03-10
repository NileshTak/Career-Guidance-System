package code;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SplashScreen extends JWindow {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static boolean isRegistered;
    private static JProgressBar progressBar = new JProgressBar();
    private static SplashScreen execute;
    private static int count;
    private static Timer timer1;

    public SplashScreen() {

        Container container = getContentPane();
        container.setLayout(null);
     

        JPanel panel = new JPanel();
        panel.setBorder(null);
        panel.setBackground(Color.WHITE);
        panel.setSize(230,230);
        panel.setLayout(null);
        container.add(panel);

        JLabel label = new JLabel(new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\logo.png"));
        label.setBounds(-10,-20,250,250);
        JLabel copyrt = new JLabel("Copyright 2017, TYCO2 Creation",
            JLabel.CENTER);
        copyrt.setBounds(0,200,230,10);
        copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 13));
       
        Color oraRed = new Color(156, 20, 20, 255);
        panel.setBorder(BorderFactory.createLineBorder(oraRed, 5));

        panel.add(label, BorderLayout.CENTER);
        panel.add(copyrt, BorderLayout.SOUTH);
        
setVisible(true);
        

        progressBar.setMaximum(100);
        progressBar.setBounds(5, 220, 220, 4);
        progressBar.setForeground(Color.BLUE);
       panel.add(progressBar);
        
       
        loadProgressBar();
        setSize(230, 230);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void loadProgressBar() {
        ActionListener al = new ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                count++;

                progressBar.setValue(count);

                System.out.println(count);

                if (count == 120) {

                    createFrame();

                    execute.setVisible(false);//swapped this around with timer1.stop()

                    timer1.stop();
                }

            }

            private void createFrame() throws HeadlessException {
               Login l=new Login();
               l.setVisible(true);
            }
        };
        timer1 = new Timer(50, al);
        timer1.start();
    }

    public static void main(String[] args) {
        execute = new SplashScreen();
    }
};