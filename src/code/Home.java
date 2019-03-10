package code;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JFrame frame;

	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("static-access")
			public void run() {
                try {
                    Home window = new Home();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	 public Home() {
	        initialize();
	    }

	 private void initialize()
	 {

		 
		 JFrame frame=new JFrame();
	        frame.setVisible(true);
	        //frame.setSize(800,600);
	        //frame.setLocation(200,50);
	        frame.setBounds(-10,0,1800,1000);
	        frame.setTitle("Career World --Way To Success");
	        ImageIcon icon=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_1485415453700.png");
	        ImageIcon icon1=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\Think-Your-Way-to-Success_web-680x255.jpg");
	        ImageIcon icon2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_1485415453700.png");
	        ImageIcon icon4=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\images(1).jpg");
	        
	        
	        
	        frame.setIconImage(icon.getImage());
	        
	
	        
	        JPanel co = new JPanel();
	        co.setLayout(null);
	        JScrollPane sp = new JScrollPane(co);
	        co.setPreferredSize(new Dimension(100, 1500));
	    
	        
	        
	        JLabel label2 = new JLabel(icon1);
	        label2.setBounds(80,-20,1400,500);
	        
	        JLabel logo = new JLabel(icon2);
	          logo.setBounds(0,60,300,300);
	        
	        
	        
	        
	        JLabel label4 = new JLabel("DashBoard");
	        label4.setBounds(50,470,300,50); 
	        Font f3=new Font("Arial",Font.BOLD,30);
	         label4.setFont(f3);
	        
	       

	        
	        JButton logout = new JButton(icon4);
   	        logout.setBounds(75,610,80,80);
   	     Cursor cur = new Cursor(Cursor.HAND_CURSOR);
   	        logout.setCursor(cur);
   	        
   	     logout.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				logoutEvent(e);
	     			}
	    			
	    	});
	        
	        
	        
	        JButton b5 = new JButton("About");
	        b5.setBounds(50,520,130,30);
	        b5.setCursor(cur);

	        
	        b5.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				b5Event(e);
	     			}
	    			
	     		});
	       
	        
	        JButton b6 = new JButton("Expert Guidance");
	        b6.setBounds(50,570,130,30);
	        b6.setCursor(cur);
	        
	        
	        b6.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				b6Event(e);
	     			}
	    			
	     		});
	       
	        
	        
	        
	        
	        
	           JTextArea a1 = new JTextArea("*This is the Java Application that guides you choose right Career \n path for you according to you skills."
	           		+ " \n*If you are after 10th choose 'after10th' option available below."
	           		+ " \n*This field contains all the information about fields after 10th."
	           		+ " \n*Where you can also give Aptitude Test related to that field."
	           		+ " \n \n \t \t \n \t   \t  ALL THE BEST....");
	             a1.setBounds(350,440,750,230);
	             Font f6=new Font("Verdana",Font.BOLD,20);
	              a1.setFont(f6);
	             // a1.setForeground(Color.red);
	              a1.setEditable(false);
	        JButton j = new JButton("After 10th");
            j.setBounds(600,690,200,50);
            Font f9=new Font("AR JULIAN",Font.BOLD,18);
            j.setFont(f9);
            j.setForeground(Color.RED);
            j.setCursor(cur);
            j.setBorder(newRoundedBorder(50));
            
            
            j.addActionListener(new ActionListener()
         	{
         			public void actionPerformed(ActionEvent e)
         			{
         				jEvent(e);
         			}
        			
         		});
            
            
            
        
            
            
            JTextArea a2 = new JTextArea("*This is the Java Application that guides you choose right Career \n path for you according to you skills."
	           		+ " \n*If you are after Science choose 'after Science' option."
	           		+ " \n*If you are after Commerce choose 'after Commerce' option."
	           		+ " \n*If you are after Arts choose 'after Arts' option available below."
	           		+ " \n*This fields contains all the information about fields."
	           		+ " \n*Where you can also give Aptitude Test related to that field."
	           		+ " \n  \n \t   \t  ALL THE BEST....");
            a2.setBounds(350,760,750,240);
             a2.setFont(f6);
            // a1.setForeground(Color.red);
             a2.setEditable(false);
            JButton j1 = new JButton("After Science");
            j1.setBounds(370,1010,200,50);
            j1.setFont(f9);
            j1.setForeground(Color.RED);
            j1.setCursor(cur);
            j1.setBorder(newRoundedBorder(50));
            
            
            j1.addActionListener(new ActionListener()
         	{
         			public void actionPerformed(ActionEvent e)
         			{
         				j1Event(e);
         			}
        			
         		});
            
            
            
            JButton j2 = new JButton("After Commerce");
            j2.setBounds(620,1010,200,50);
            j2.setFont(f9);
            j2.setForeground(Color.RED);
            j2.setCursor(cur);
            j2.setBorder(newRoundedBorder(50));
            
            
            j2.addActionListener(new ActionListener()
         	{
         			public void actionPerformed(ActionEvent e)
         			{
         				j2Event(e);
         			}
        			
         		});
            
        
            
            JButton j3 = new JButton("After Arts");
            j3.setBounds(870,1010,200,50);
            j3.setFont(f9);
            j3.setForeground(Color.RED);
            j3.setCursor(cur);
            j3.setBorder(newRoundedBorder(50));
        
        
	        


	co.add(b5);
	co.add(b6);
	co.add(label4);
	co.add(label2);
	co.add(logo);
	co.add(j);
	co.add(j1);
	co.add(j2);
	co.add(j3);
	co.add(a1);
	co.add(a2);
	co.add(logout);
	 
	 frame.getContentPane().add(sp);
	 
	 
	 }
	private static Border newRoundedBorder(int i)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static void b5Event(ActionEvent e)
    {
		About a = new About();
	    a.setVisible(true);
	       	
	}
	
	public static void logoutEvent(ActionEvent e)
    {
		Login l = new Login();
	    l.setVisible(true);
	       	
	}
	
 
 public static void b6Event(ActionEvent e)
    {
		EG eg = new EG();
	    eg.setVisible(true);
	       	
	}
 
	
	
	  public void setVisible(boolean b)
	   {
		   this.setVisible(true);
	   }


public static void jEvent(ActionEvent e)
{
	after10 t = new after10();
    t.setVisible(true);
       	}


public static void j1Event(ActionEvent e)
{
	aftersci s = new aftersci();
   s.setVisible(true);
       	
}

public static void j2Event(ActionEvent e)
{
	bcom bc = new bcom();
    bc.setVisible(true);
       	
}

}
