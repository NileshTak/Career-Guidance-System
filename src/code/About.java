package code;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class About extends JFrame
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
                    About window = new About();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	 public About() {
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
        ImageIcon icon1=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\Beautyplus.JPG");
        ImageIcon icon2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\IMG-20170128-WA0040.jpg");
        ImageIcon icon3=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\Sudhir 20170126_014641.jpg");
        ImageIcon icon4=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_1485415453700.png");
        ImageIcon icon5=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\ca7b81256d27f757790508035a8177c0.png");
        ImageIcon icon6=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\images(1).jpg");
        frame.setIconImage(icon.getImage());
        
        
        
        JPanel co = new JPanel();
        co.setLayout(null);
        JScrollPane sp = new JScrollPane(co);
        co.setPreferredSize(new Dimension(100, 1500));
      //  co.setBackground(Color.white);
        
        
        

       
        
        JLabel label4 = new JLabel("DashBoard");
        label4.setBounds(80,440,300,50); 
        Font f3=new Font("Arial",Font.BOLD,30);
         label4.setFont(f3);
        
        JButton b4 = new JButton(icon5);
        b4.setBounds(105,490,80,80);
        Cursor cur3 = new Cursor(Cursor.HAND_CURSOR);
        b4.setCursor(cur3);
        
        
        b4.addActionListener(new ActionListener()
     	{
     			public void actionPerformed(ActionEvent e)
     			{
     				b4Event(e);
     			}
    			
     		});
       
        

        JButton logout = new JButton(icon6);
	        logout.setBounds(105,690,80,80);
	       
	        logout.setCursor(cur3);
	        
	     logout.addActionListener(new ActionListener()
     	{
     			public void actionPerformed(ActionEvent e)
     			{
     				logoutEvent(e);
     			}
    			
    	});

        
        JButton b5 = new JButton("About");
        b5.setBounds(80,590,130,30);
        Cursor cur4 = new Cursor(Cursor.HAND_CURSOR);
        b5.setCursor(cur4);

        
        
        b5.addActionListener(new ActionListener()
     	{
     			public void actionPerformed(ActionEvent e)
     			{
     				b5Event(e);
     			}
    			
     		});
       
        
        JButton b6 = new JButton("Expert Guidance");
        b6.setBounds(80,640,130,30);
        Cursor cur5 = new Cursor(Cursor.HAND_CURSOR);
        b6.setCursor(cur5);
       
        
        b6.addActionListener(new ActionListener()
     	{
     			public void actionPerformed(ActionEvent e)
     			{
     				b6Event(e);
     			}
    			
     		});
       
        
        JLabel label5 = new JLabel("WELLCOME TO");
        label5.setBounds(400,50,300,50); 
        Font f4=new Font("Caribian Bold",Font.BOLD,30);
         label5.setFont(f4);
         label5.setForeground(Color.gray);
         
         JLabel label6 = new JLabel("Career World --Way To Success");
         label6.setBounds(550,90,500,70); 
         Font f5=new Font("Sitka Small",Font.BOLD,30);
          label6.setFont(f5);
          label6.setForeground(Color.blue);
          
          
          JTextArea a1 = new JTextArea("A Career World where students can see various career opportunities,"
          		+ " the system shows various fields \n available for graduation. "
          		+ " Next the system   allows users to give a test."
          		+ " It is actually a series of tests \n of various  questions depending on their interest."
          		+ " After test completion a score is calculated for each \n test. "
          		+ " Based on those results the system manipulates and calculates the best career for that user."
          		+ "\n Student will receive his result along with advice from us."
          		+ " The system also includes an ebooks page."
          		+ "\n                 It also lists various colleges available where students can search colleges "
          		+ "by their courses.\n Next the system allows users to give a test. The test has questions which help us to identify "
          		+ "  which\n field the student is interested in.");
          a1.setBounds(250,150,1050,220); 
          Font f6=new Font("Verdana",Font.ITALIC,20);
           a1.setFont(f6);
          // a1.setForeground(Color.red);
           a1.setEditable(false);
           
           
           
           JTextArea a2 = new JTextArea("Mr. Nilesh I. Tak is currently working as an Diploma Student"
           		+ "\n \t at Jayawantrao Sawant Polytechnic."
           		+ "\n Completed 10th from Sona 'i' English Medium High School, \n \tPune in 2014.");
             a2.setBounds(520,420,750,230);
              a2.setFont(f6);
             // a1.setForeground(Color.red);
              a2.setEditable(false);
              a2.setBorder(newRoundedBorder(50));
              
              
              
              JTextArea a3 = new JTextArea("Mr. Shubham G. Supekar is currently working as an Diploma Student"
           		+ "\n \t at Jayawantrao Sawant Polytechnic."
           		+ "\n Completed 10th from Modern High School, Pune in 2012."
           		+ "\n Completed 12th from Modern Collage of Arts & Science, \n \tPune in 2014.");
              a3.setBounds(520,700,750,230);
               a3.setFont(f6);
              // a1.setForeground(Color.red);
               a3.setEditable(false);
               a3.setBorder(newRoundedBorder(50));
               
               
               
               JTextArea a4 = new JTextArea("Mr. Sudhir T. Tayade is currently working as an Diploma Student"
                  		+ "\n \t at Jayawantrao Sawant Polytechnic."
                   		+ "\n Completed 10th from Shivaji Maharaj High School, \n \tPune in 2014.");
               a4.setBounds(520,980,750,230);
                a4.setFont(f6);
               // a1.setForeground(Color.red);
                a4.setEditable(false);
                a4.setBorder(newRoundedBorder(50));
                
                
                JLabel notice = new JLabel("* If any query can contact on above given number or you can give feedback on the above given mail.");
                notice.setBounds(300,1200,1200,200);
                notice.setForeground(Color.red);
                Font f11=new Font("Calibri (body)",Font.PLAIN,15);
                notice.setFont(f11);
           
                JLabel nil = new JLabel(icon1);
                nil.setBounds(280,420,200,230);
                JLabel nil1 = new JLabel("Mr. Nilesh .I. Tak");
                nil1.setBounds(290,660,200,20);
                Font f7=new Font("Rockwell",Font.BOLD,20);
                nil1.setFont(f7);
                nil1.setForeground(Color.blue);
                JLabel phno = new JLabel("Contact No: 8446613467");
                phno.setBounds(560,660,500,20);
                phno.setFont(f7);
                phno.setForeground(Color.red);
                JLabel mail = new JLabel();
                mail.setText("<html> G-mail : <a href=\"\">me.nileshtak@gmail.com</a></html>");
                mail.setCursor(new Cursor(Cursor.HAND_CURSOR));
                mail.setBounds(850,660,800,20);
                mail.setFont(f7);
                mail.setForeground(Color.red);
               
           
           
           
           
           JLabel shubh = new JLabel(icon2);
           shubh.setBounds(290,700,200,230);
           JLabel shubh1 = new JLabel("Mr.Shubham .G. Supekar");
           shubh1.setBounds(270,940,250,19);
           Font f8=new Font("Rockwell",Font.BOLD,19);
           shubh1.setFont(f8);
           shubh1.setForeground(Color.blue);
           JLabel phno1 = new JLabel("Contact No: 8378800680");
           phno1.setBounds(560,940,500,20);
           phno1.setFont(f7);
           phno1.setForeground(Color.red);
           JLabel mail1 = new JLabel();
           mail1.setText("<html> G-mail : <a href=\"\">shubhamsupekar6565@gmail.com</a></html>");
           mail1.setCursor(new Cursor(Cursor.HAND_CURSOR));
           mail1.setBounds(850,940,500,20);
           mail1.setFont(f7);
           mail1.setForeground(Color.red);
           
           JLabel sudee = new JLabel(icon3);
           sudee.setBounds(290,980,200,230);
           JLabel sudee1 = new JLabel("Mr.Sudhir .T. Tayade");
           sudee1.setBounds(290,1220,250,20);
           Font f9=new Font("Rockwell",Font.BOLD,20);
           sudee1.setFont(f9);
           sudee1.setForeground(Color.blue);
           JLabel phno2 = new JLabel("Contact No: 9762487727");
           phno2.setBounds(560,1220,500,20);
           phno2.setFont(f7);
           phno2.setForeground(Color.red);
           JLabel mail2 = new JLabel();
           mail2.setText("<html> G-mail : <a href=\"\">sudhirtayade007@gmail.com</a></html>");
           mail2.setCursor(new Cursor(Cursor.HAND_CURSOR));
           mail2.setBounds(850,1220,500,20);
           mail2.setFont(f7);
           mail2.setForeground(Color.red);
           
           
           
           JLabel logo = new JLabel(icon4);
           logo.setBounds(10,110,300,300);
           
           
           JLabel label7 = new JLabel("\t \t   Career World Developers");
           label7.setBounds(560,380,500,30);
           Font f10=new Font("AR DESTINET",Font.BOLD,30);
           label7.setFont(f10);
           label7.setForeground(Color.black);
           
           
           
           
           
           
         
        co.add(label4);
        co.add(b4);
        co.add(b5);
        co.add(b6);
        co.add(label5);
        co.add(label6);
       co.add(a1); 
       co.add(a2);
       co.add(a3);
       co.add(a4);
       co.add(nil);
       co.add(nil1);
       co.add(phno);
       co.add(phno1);
       co.add(phno2);
       co.add(mail);
       co.add(mail1);
       co.add(mail2);
       co.add(shubh);
       co.add(shubh1);
       co.add(sudee);
       co.add(sudee1);
       co.add(label7);
       co.add(logo);
       co.add(notice);
       co.add(logout);
      
       frame.setVisible(true);
       sendMail(mail);
      shubMail(mail1);
       sudeeMail(mail2);
       frame.getContentPane().add(sp);

	 
	 }
	 
	 
	 private Border newRoundedBorder(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void b5Event(ActionEvent e)
	    {
		
			About a = new About();
		    a.setVisible(true);
		       	
		}
	
	public static void b4Event(ActionEvent e)
    {
		Home h = new Home();
	    h.setVisible(true);
	       	
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
	 
	 private void sendMail(JLabel mail) {
	        mail.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                try {
	                    Desktop.getDesktop().mail(new URI("mailto:https://mail.google.com/mail/u/0/?tab=wm#inbox?subject=TEST"));
	                } catch (URISyntaxException | IOException ex) {
	                    //It looks like there's a problem
	                }
	            }
	        });
	    }
	 
	 private void shubMail(JLabel mail1) {
	        mail1.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                try {
	                    Desktop.getDesktop().mail(new URI("mailto:shubhamsupekar6565@gmail.com?subject=TEST"));
	                } catch (URISyntaxException | IOException ex) {
	                    //It looks like there's a problem
	                }
	            }
	        });
	    }
	 
	 private void sudeeMail(JLabel mail2) {
	        mail2.addMouseListener(new MouseAdapter() {
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
	    
}

