package code;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class EG extends JFrame
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
	                    EG window = new EG();
	                    window.frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
		 public EG() {
		        initialize();
		    }

		 private void initialize()
		 {

		JFrame frame=new JFrame();
        frame.setVisible(true);
        //frame.setSize(800,600);
        //frame.setLocation(200,50);
        frame.setBounds(-10,0,1800,740);
        frame.setTitle("Career World --Way To Success");
        ImageIcon icon=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_1485415453700.png");
        ImageIcon icon1=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_1485415453700.png");
        ImageIcon icon2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\Qoute-11.png");
        ImageIcon icon3=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\private-career-guidance.jpg");
        ImageIcon mam1=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\IMG-20170316-WA0003.jpg");
        ImageIcon mam2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\rupali mam.jpg");
        ImageIcon icon4=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\ca7b81256d27f757790508035a8177c0.png");        
        ImageIcon icon5=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\images(1).jpg");
        
        frame.setIconImage(icon.getImage());
        
        JPanel co = new JPanel();
        co.setLayout(null);
        JScrollPane sp = new JScrollPane(co);
        co.setPreferredSize(new Dimension(100, 1500));
        
       
  
        JLabel label1 = new JLabel("DashBoard");
        label1.setBounds(80,440,300,50); 
        Font f1=new Font("Arial",Font.BOLD,30);
         label1.setFont(f1);
        
        JButton b1 = new JButton(icon4);
        b1.setBounds(105,490,80,80);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        b1.setCursor(cur);

        b1.addActionListener(new ActionListener()
     	{
     			public void actionPerformed(ActionEvent e)
     			{
     				b1Event(e);
     			}
    			
     		});
        
        JButton b2 = new JButton("About");
        b2.setBounds(80,590,130,30);
        b2.setCursor(cur);
        
        b2.addActionListener(new ActionListener()
     	{
     			public void actionPerformed(ActionEvent e)
     			{
     				b2Event(e);
     			}
    			
     		});
       

        JButton logout = new JButton(icon5);
	        logout.setBounds(105,690,80,80);
	       
	        logout.setCursor(cur);
	        
	     logout.addActionListener(new ActionListener()
     	{
     			public void actionPerformed(ActionEvent e)
     			{
     				logoutEvent(e);
     			}
    			
    	});
        
        
        JButton b3 = new JButton("Expert Guidance");
        b3.setBounds(80,640,130,30);
        b3.setCursor(cur);
        
        
        b3.addActionListener(new ActionListener()
     	{
     			public void actionPerformed(ActionEvent e)
     			{
     				b3Event(e);
     			}
    			
     		});
       
        
        JLabel label2 = new JLabel("WELLCOME TO");
        label2.setBounds(420,20,300,50); 
        Font f2=new Font("Caribian Bold",Font.BOLD,30);
         label2.setFont(f2);
         label2.setForeground(Color.gray);
         
         JLabel label3 = new JLabel("Career World --Way To Success");
         label3.setBounds(570,60,500,70); 
         Font f3=new Font("Sitka Small",Font.BOLD,30);
          label3.setFont(f3);
          label3.setForeground(Color.blue);
          
          JLabel label4 = new JLabel("Our Goal");
          label4.setBounds(430,110,500,70); 
          Font f4=new Font("copperplate Gothic Bold",Font.BOLD,35);
           label4.setFont(f4);
           label4.setForeground(Color.red);
           
           JLabel label5 = new JLabel("Your Success.");
           label5.setBounds(630,150,450,70); 
            label5.setFont(f4);
            label5.setForeground(Color.red);
            
            JTextArea a1 = new JTextArea("Career World provides you all the featurs through"
            		+ "\n which you can choose right career in your life. It also"
            		+ "\n provides Career Guidance throght which you can directly"
            		+ "\n interact with the experts related to perticular field"
            		+ "\n and they will help you to resolve your query if any.");
              a1.setBounds(300,210,620,150); 
              Font f5=new Font("Verdana",Font.ITALIC,20);
               a1.setFont(f5);
              // a1.setForeground(Color.red);
               a1.setEditable(false);
               
               
               JLabel label6 = new JLabel("Career Experts");
               label6.setBounds(540,640,450,70);
               Font f6=new Font("RockWell",Font.BOLD,30);
                label6.setFont(f6);
               // label2.setForeground(Color.red);
               
               
          
          JLabel logo = new JLabel(icon1);
          logo.setBounds(10,60,300,300);
          
          JLabel label7 = new JLabel(icon2);
          label7.setBounds(840,-140,600,800);
          
          JLabel l1 = new JLabel(icon3);
          l1.setBounds(300,400,800,250);
          
          JLabel mam = new JLabel(mam1);
          mam.setBounds(100,420,600,800);
          JLabel label8 = new JLabel("Prof. Jangam D.Y.");
          label8.setBounds(300,950,450,30);
          Font f7=new Font("Rockwell",Font.BOLD,25);
          label8.setFont(f7);
           label8.setForeground(Color.red);
           
           JButton j = new JButton();
           j.setText("<html> <a href=\"\">Take a Guidance</a></html>");
           j.setBounds(800,940,200,40);
           Font f10=new Font("AR JULIAN",Font.BOLD,18);
           j.setFont(f10);
           j.setCursor(cur);
           j.setBorder(newRoundedBorder(50));
          
           
           
           
           
           JLabel rupalimam = new JLabel(mam2);
           rupalimam.setBounds(100,760,600,800);
           JLabel label9 = new JLabel("Prof. Davalgaonkar R.A.");
           label9.setBounds(300,1320,450,25);
           label9.setFont(f7);
            label9.setForeground(Color.red);
            
            JButton j1 = new JButton();
            j1.setText("<html> <a href=\"\">Take a Guidance</a></html>");
            j1.setBounds(800,1310,200,40);
            j1.setFont(f10);
            j1.setCursor(cur);
            j1.setBorder(newRoundedBorder(50));
           
           
           
            
            JLabel notice = new JLabel("* For more Guidance there are various Experts available here to help you out. By clicking on above option you'll be guided by them.");
            notice.setBounds(300,1280,1200,200);
            notice.setForeground(Color.red);
            Font f8=new Font("Calibri (body)",Font.PLAIN,15);
            notice.setFont(f8);
	     
            
     

           
           JTextArea a2 = new JTextArea("Prof. Jangam D.Y. is currently working as an Lecturer"
           		+ "\n at Jayawantrao Sawant Polytechnic.  "
           		+ "\n Completed Bachelor of Computer Engineering from KBP College \n of Engineering & also "
           		+ "Master in Computer Engineering \n from JSCOE, Pune in year 2014. "
           		+ "Good Communication Skills."
           		+ "\n Effective Discipline Skills."
           		+ "Had 10 Years of teaching \n experience in all Technical "
           		+ "Fields especially in Java. \n Also contains good knowledge"
           		+ " about Java Programming. \n Can solve any type of "
           		+ "query related to technical field.");
             a2.setBounds(580,710,620,220);
             Font f9=new Font("Verdana",Font.PLAIN,18);
              a2.setFont(f9);
              a2.setEditable(false);
             
              
              JTextArea a3 = new JTextArea("Prof. Davalgaonkar R.A. is currently working as an Lecturer"
           		+ "\n at Jayawantrao Sawant Polytechnic, Hadapsar."
           		+ "\n Completed Bachelor of Computer Engineering from KBP College \n of Engineering in 2005 & also "
           		+ "Master in Computer Engineering \n from RSCOE, Pune in year 2013. "
           		+ "\n An Engaging Personality and Teaching Style."
           		+ "Had 10 Years of \n teaching  experience in all Technical "
           		+ "Fields especially in Java \n & RDBMS. \n Contains Knowledge of Curriculum and Standards."
           		+ " \n Can solve any type of "
           		+ "query related to your Career or \n technical field.");
                   a3.setBounds(580,1025,620,270);
                    a3.setFont(f9);
                    a3.setEditable(false);
                   
     
              
             
          
              
              
            
          
          
        co.add(label1);
        co.add(b1);
        co.add(b2);
        co.add(b3);
        co.add(label2);
        co.add(label3);
        co.add(l1);
        co.add(logo);
        co.add(label4);
        co.add(label5);
        co.add(label6);
        co.add(label7);
        co.add(a1);
        co.add(a2);
        co.add(a3);
        co.add(mam);
        co.add(rupalimam);
        co.add(label8);
        co.add(label9);
        co.add(j);
        co.add(j1);
        co.add(notice);
        co.add(logout);
        rMail(j);
        jMail(j1);
    
        frame.getContentPane().add(sp);

	}
		 
		 
		 public static void b1Event(ActionEvent e)
		    {
				Home h = new Home();
			    h.setVisible(true);
			       	
			}
		 
		 public static void logoutEvent(ActionEvent e)
		 {
				Login l = new Login();
			    l.setVisible(true);
			       	
			}
		 
		 
		 public static void b2Event(ActionEvent e)
		    {
				About a = new About();
			    a.setVisible(true);
			       	
			}
		 
		 public static void b3Event(ActionEvent e)
		    {
				EG eg = new EG();
			    eg.setVisible(true);
			       	
			}
		 
		 
		 public void setVisible(boolean b)
		   {
			   this.setVisible(true);
			  
			  
		   }
		 
		 
		 
		private Border newRoundedBorder(int i) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		 private void rMail(JButton j) {
		        j.addMouseListener(new MouseAdapter() {
		            @Override
		            public void mouseClicked(MouseEvent e) {
		                try {
		                    Desktop.getDesktop().mail(new URI("mailto:sudhirtayade007@gmail.com?subject=TEST"));
		                } catch (URISyntaxException | IOException ex) {
		                    //It looks like there's a problem
		                }
		            }
		        });
		    }
		
		 
		 private void jMail(JButton j1) {
		        j1.addMouseListener(new MouseAdapter() {
		            @Override
		            public void mouseClicked(MouseEvent e) {
		                try {
		                    Desktop.getDesktop().mail(new URI("mailto:rupali.dhavalgaonkar@gmail.com?subject=TEST"));
		                } catch (URISyntaxException | IOException ex) {
		                    
		                }
		            }
		        });
		    }
		
}