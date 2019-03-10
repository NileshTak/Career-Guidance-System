package code;

import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.border.Border;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame
{
		
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JTextField t1_txt;
	static JPasswordField p1_txt;
	static JButton b1;
	static JButton b2;
	static JButton b3;
	static JLabel war;
	static JLabel war1;
	static JCheckBox cb;
	static JFrame frame;
	
	
	
	 
	
	 public static void main(String args[])
	    {
		   EventQueue.invokeLater(new Runnable() {
	           @SuppressWarnings("static-access")
			public void run() {
	               try {
	                   Login window = new Login();
	                   window.frame.setVisible(true);
	               } catch (Exception e) {
	                   e.printStackTrace();
	               }
	           }
	       });
	   }
	 
	 public void close()
	 {
		 WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
	 } 
	 
	 
	 
		 public Login() {
		        initialize();
		    }

		
		 	 
		 
		 private void initialize()
		 {	
    	
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(800,600);
        //frame.setLocation(200,50);
        frame.setBounds(-10,0,1800,740);
        frame.setTitle("Career World --Way To Success");
        
       
        
   
        
        
        ImageIcon icon=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_1485415453700.png");
        ImageIcon icon1=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_02-01-10.24.01.jpg");
        ImageIcon icon2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\logov2-7e1e772f026060b4898a7be53ca07545d83f1c5ce14b95484b56896953b0060a.png");
 //       ImageIcon icon3=new ImageIcon("PicsArt_1486664035605.png");
//        ImageIcon icon4=new ImageIcon("IMG-20170209-WA0003.jpg");
        
        frame.setIconImage(icon.getImage());
        
        
        
        JPanel co = new JPanel();
   co.setLayout(null);
        JScrollPane sp = new JScrollPane(co);
        co.setPreferredSize(new Dimension(0, 0));
        co.setBackground(Color.white);
        
        
        
    
        JLabel label = new JLabel("USERNAME");
        label.setBounds(480,450,300,100);
        Font f=new Font("Lucida Handwriting",Font.BOLD,19);
         label.setFont(f);
         
         war=new JLabel(" Please Enter UserName");
         war.setBounds(820,480,200,20);
         war.setForeground(Color.red);
         war.setVisible(false);
         
         
         JButton jButton_Login = new JButton("LogIn");
         jButton_Login.setBounds(480,600,150,40);
         Font f1=new Font("AR BERKLEY",Font.BOLD,20);
         Cursor cur = new Cursor(Cursor.HAND_CURSOR);
         jButton_Login.setCursor(cur);
         jButton_Login.setFont(f1);
         
         
         jButton_Login.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 try {
 					jButton_LoginActionPerformed(evt);
 				} catch (ClassNotFoundException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 				}
             }
         });
         
         
   
         
         
         t1_txt=new JTextField();
         t1_txt.setBounds(610,480,200,30);
         Font f2=new Font("Dialog",Font.BOLD,16);
         t1_txt.setFont(f2);
       
         
 
         
        
         
        JLabel label1 = new JLabel("PASSWORD");
        label1.setBounds(480,500,300,100); 
         label1.setFont(f);
         
         
         JButton b2 = new JButton("Clear");
         b2.setBounds(660,600,150,40);
         Cursor cur1 = new Cursor(Cursor.HAND_CURSOR);
         b2.setCursor(cur1);
         b2.setFont(f1);
         
         b2.addActionListener(new ActionListener()
      	{
      			public void actionPerformed(ActionEvent e)
      			{
      				b2Event(e);
      			}
     			
      		});
         
         JButton b3 = new JButton("Sign Up");
         b3.setBounds(480,650,330,30);
         Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
         b3.setCursor(cur2);
         b3.setFont(f1);
         
         b3.addActionListener(new ActionListener()
      	{
      			public void actionPerformed(ActionEvent e)
      			{
      				b3Event(e);
      		
      				
      			}
     			
      		});
         
         
         
         
 
         p1_txt=new JPasswordField();
         p1_txt.setBounds(610,530,200,30);
         p1_txt.setFont(f2);
         
         
         war1=new JLabel("Please Enter Correct Password");
         war1.setBounds(820,530,200,20);
         war1.setForeground(Color.red);
         war1.setVisible(false);
         
         
         
         
         JLabel label2 = new JLabel(icon1);
         label2.setBounds(20,-20,1320,500);
         
         JLabel label3 = new JLabel(icon2);
         label3.setBounds(260,480,190,210);
         
         
     // JLabel label5= new JLabel(icon3);
      //   label5.setBounds(970,30,400,900);
         
       //  JLabel label6= new JLabel(icon4);
       //  label6.setBounds(980,-50,400,400);
         
        
         
       
    
        
        JCheckBox cb = new JCheckBox();
        cb.setBounds(660,560,120,30);
        cb.setText("Show Password");
   
        
        
        cb.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent c)
            {
               cbEvent(c);
            }
        });
        
        
       
       
      
        
        
        co.add(t1_txt);
        co.add(p1_txt);
        co.add(jButton_Login);
        co.add(b2);
        co.add(b3);
        co.add(label);
        co.add(label2);
        co.add(label1);
        co.add(label3);
      
       // co.add(label5);
       // co.add(label6);
       
        co.add(cb);
       co.add(war);
       co.add(war1);
        
       
       frame.getContentPane().add(sp);
    }
    
		 
   
  
    @SuppressWarnings("unused")
	private static Border newRoundedBorder(int i)
    {
		// TODO Auto-generated method stub
		return null;
	}
    
    public void setVisible(boolean b)
	   {
		   this.setVisible(true);
	   }
    

	public static void b3Event(ActionEvent e)
    {
		
		  
		signup s = new signup();
		s.setVisible(true);
	
	
	    		
	 
	}
		 
    
   
    public static void b2Event(ActionEvent b) 
	   {
		p1_txt.setText("");

      t1_txt.setText("");


     

     
  }
  
    	 private void jButton_LoginActionPerformed(ActionEvent evt) throws ClassNotFoundException
    	 {                      
                
             String t1=t1_txt.getText();
         	@SuppressWarnings("deprecation")
			String p1=p1_txt.getText();
            
		if(t1.isEmpty()==true)
		{
			war.setVisible(true);
		}
		
		if(p1.isEmpty()==true)
		{
			war1.setVisible(true);
			
		}
		
		
			if(t1.isEmpty()==false)
			{
				war.setVisible(false);
				
			}
			
			if(p1.isEmpty()==false)
			{
				war1.setVisible(false);
				
			}
			
			Connection connection;
            PreparedStatement ps;
            try {
            	
            	Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "root");
                ps = connection.prepareStatement("SELECT `UserName`, `Password` FROM `user` WHERE `UserName` = ? AND `Password` = ?");
                ps.setString(1, t1_txt.getText());
                ps.setString(2, String.valueOf(p1_txt.getPassword()));
                ResultSet result = ps.executeQuery();
                if(result.next())
                {
               
                JOptionPane.showMessageDialog(null,"Access Granted"); 
                
                Home h = new Home();
                h.setVisible(true);
                
                                
                
                }
                else
    			{
    				 JOptionPane.showMessageDialog(null,"Invalid UserName or Password"); 

    			}
                
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            
           

	}
			
    
    
    
			 public static void cbEvent(ItemEvent c)
			   {
				
				  			
			if (c.getStateChange() == ItemEvent.SELECTED) 
			{
	            p1_txt.setEchoChar((char) 0);
	        }
			else
			{
	             p1_txt.setEchoChar('*');
	        }
			
			
			
			   }
			
			   }
			
			

			
			

