package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class signup extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static	JPasswordField p1;
	static	JPasswordField p2;
	static JRadioButton male;
	static JRadioButton female;
	@SuppressWarnings("rawtypes")
	static JComboBox day_arr;
	@SuppressWarnings("rawtypes")
	static JComboBox month_arr;
	@SuppressWarnings("rawtypes")
	static JComboBox year_arr;            // Static Variables
	static JTextArea addr_txt;
	static JTextField name_txt;
	static JTextField username_txt;
	static JTextField mobile_txt;
	static JButton btn;
	static JButton btn2;
	static JTextArea output;
	static JCheckBox cb;
	static Container c;
	static JLabel war1;
	static JLabel war2;
	static JLabel war3;
	static JLabel war4;
	static JLabel war5;
	static JFrame frame;
	@SuppressWarnings("unused")
	private static String password;

	
	
	
   public static void main(String args[])
   {
	   EventQueue.invokeLater(new Runnable() {
           @SuppressWarnings("static-access")
		public void run() {
               try {
                   signup window = new signup();
                   window.frame.setVisible(true);
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }
       });
   }
	 public signup() {
	        initialize();
	    }

	 @SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize()
	 {	   
	   JFrame frame = new JFrame();
	   frame.setVisible(true);
	  
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //JFrame
	   frame.setBounds(-10,0,1800,740);
	   frame.setTitle("Career World --Way To Success");
       ImageIcon icon=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_1485415453700.png");
       ImageIcon icon1=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\registration_form.jpg");
       ImageIcon icon2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\register-a-business-checklist-300x288.jpg");
       
       
       frame.setIconImage(icon.getImage());

       
       
       
       JPanel co = new JPanel();
       co.setLayout(null);
       JScrollPane sp = new JScrollPane(co);
       co.setPreferredSize(new Dimension(100, 1500));
   

       
       
       JLabel label1 = new JLabel(icon1);
       label1.setBounds(-30,-120,1400,580);
      
       
       
       
       
       JLabel reg = new JLabel(icon2);
       reg.setBounds(920,850,200,200);
       
       
      
       
       
      
       

       JLabel name = new JLabel("Name");  //Name
	   name.setBounds(350,540,70,30);
	   Font f = new Font("Times New Roman",Font.PLAIN,20);
	   name.setFont(f);	   
	 
	   name_txt = new JTextField();
	   name_txt.setBounds(530,540,260,30);  //Name TextField
	   Font f1 = new Font("Sitka Display",Font.PLAIN,18);
	   name_txt.setFont(f1);
	   name_txt.setBorder(null);
	   
	   war1 = new JLabel("Please Enter Name");  //Warning Message1
	   war1.setBounds(530,570,160,25);    
	   war1.setForeground(Color.RED);
	   war1.setVisible(false); 
	   
	   
	   JLabel Username = new JLabel("UserName");  //Name
	   Username.setBounds(350,610,150,30);
	   Username.setFont(f);	   
	   
	   username_txt = new JTextField();
	   username_txt.setBounds(530,610,260,30);  //Name TextField
	   username_txt.setFont(f1);
	   username_txt.setBorder(null);
	  
	   
	   war5 = new JLabel("Please Enter UserName");  //Warning Message4
	   war5.setBounds(530,640,160,25);
	   war5.setForeground(Color.RED);
	   war5.setVisible(false);
	  
	   
	   
	   JLabel mobile = new JLabel("Mobile No");  //Mobile No
	   mobile.setBounds(350,680,100,30);
	   mobile.setFont(f);
	  
	   
	   mobile_txt = new JTextField();
	   mobile_txt.setBounds(530,680,260,30);   //Mobile No TextField
	   Font f2 = new Font("Segoe UI",Font.PLAIN,15);
	   mobile_txt.setFont(f2);
	   mobile_txt.setBorder(null);
	  
	   
	   war2 = new JLabel("Please Enter Mobile No");  //Warning Message2
	   war2.setBounds(530,710,160,25);
	   war2.setForeground(Color.RED);
	   war2.setVisible(false);
	   
	   JLabel cp = new JLabel("Create Password:");
	   cp.setBounds(350,750,150,30);
	   cp.setFont(f);

	   
	  JPasswordField p1 = new JPasswordField();
	  p1.setBounds(530,750,260,30);
       p1.setBorder(null);
	  
       
       
	   
	   JLabel cp1 = new JLabel("Confirm Password:");
	   cp1.setBounds(350,820,180,30);
	   cp1.setFont(f);

	   JPasswordField p2 = new JPasswordField();
		  p2.setBounds(530,820,260,30);
	   p2.setBorder(null);
	   
	   war3 = new JLabel("Password Mismatch");  //Warning Message3
	   war3.setBounds(530,730,160,25);    
	   war3.setForeground(Color.RED);
	   war3.setVisible(false);
	   
       
	   
	   
	   
	   JLabel dob = new JLabel("Date Of Birth ");  //Date Of Birth
	   dob.setBounds(350,890,150,30);
	   dob.setFont(f);
	
       
       
	   String day[]=new String[31];
	   for(int i=1;i<=31;i++)
		   day[i-1]=Integer.toString(i);
		   
		day_arr = new JComboBox(day);
	    day_arr.setBounds(530,890,50,30);  //day
	    day_arr.setEditable(true);
	    
	   
	    String month[]={"JAN","FEB","MAR","APR","MAY","JUN","JULY","AUG","SEP","OCT","NOV","DEC"};
	    
	    month_arr = new JComboBox(month);
	    month_arr.setBounds(610,890,60,30); //month
	    month_arr.setEditable(true);
	    
	    String year[]=new String[70];
	    for(int i=1951;i<=2020;i++)
	         year[i-1951]=Integer.toString(i);
	    
	    year_arr = new JComboBox(year);
	    year_arr.setBounds(700,890,60,30);  //year
	    year_arr.setEditable(true);
	    
	   JLabel gender = new JLabel("Gender ");  //gender
	   gender.setBounds(350,960,100,30);
	   gender.setFont(f);
	   
	   male = new JRadioButton("Male");  //male
	   male.setBounds(530,960,100,20);
	   male.setFont(f2);
	   
	   
	   female = new JRadioButton("Female"); //female
	   female.setBounds(630,960,130,20);
	   female.setFont(f2);
	   
	   ButtonGroup gen = new ButtonGroup(); //Button group
	   gen.add(male);
	   gen.add(female);
	   
	   male.setSelected(true);
	   
	   JLabel addr = new JLabel("Address ");  //Address
	   addr.setBounds(350,1030,100,30);
	   addr.setFont(f);
	   
	   addr_txt=new JTextArea(); 
	   addr_txt.setBounds(530,1030,260,110);   //Address TextField
	   addr_txt.setFont(f2);
	   
	   war4 = new JLabel("Please Enter Address"); //Warng Meassage3
	   war4.setBounds(530,1000,160,25);
	   war4.setForeground(Color.RED);
	   war4.setVisible(false);
	   
	  cb = new JCheckBox(" I accept all Terms and Conditions");  //CheckBox
	  cb.setBounds(350,1150,350,20);
	  cb.setFont(f2);
	    
	  Cursor cr = new Cursor(Cursor.HAND_CURSOR);  //Cursor
	  
	  JButton btn = new JButton("Submit");  //Submit Button
	  btn.setBounds(370,1210,150,30);
	  btn.setFont(f2);
	  btn.setCursor(cr);
	  
	  
	  
	  
	 
	  
	  JButton btn1 = new JButton("Clear");  //Clear Button
	  btn1.setBounds(580,1210,150,30);
	  btn1.setFont(f2);
	  btn1.setCursor(cr);
	  
	  
	  
	  JButton btn2 = new JButton("Login");  //Login Button
	  btn2.setBounds(480,1270,150,30);
	  btn2.setFont(f2);
	  btn2.setCursor(cr);
	  
	  
	  btn2.addActionListener(new ActionListener()
   	{
   			public void actionPerformed(ActionEvent e)
   			{
   				btn2Event(e);
   			}
  			
   		});
	  
	  
	   
	  btn.addActionListener(new ActionListener(){


		@SuppressWarnings({ "unused", "deprecation" })
		@Override
		public void actionPerformed(ActionEvent e) {   //Anonymous Class
			// TODO Auto-generated method stub
			try {
				btnEvent(e);
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String s=e.getActionCommand();
			String jp1,jp2;
			jp1=p1.getText();
			jp2=p2.getText();
			if(jp1.equals(jp2))
			{
			    war3.setVisible(false);
			}
			else
			{
				 JOptionPane.showMessageDialog(null,"Password Mismatch"); 
			}

			
		}
	  });
	  
	  
	  
	  btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {   //Anonymous Class
				// TODO Auto-generated method stub
				btnEvent1(e);
				
			}
		  });
	  
	  JLabel data = new JLabel(" Data Base");  //Data Base
	  data.setBounds(830,520,150,20);
	  data.setFont(f);
	  
	  output = new JTextArea();
	  output.setBounds(920,540,300,300);  //Output TextField
	  output.setFont(f);
	  output.setEditable(false);

       
       
       co.add(label1);
     
       co.add(cp);
       co.add(cp1);
       co.add(p1);
       co.add(p2);
       co.add(reg);
       co.add(Username);
       co.add(name); 
      
	   co.add(addr);
	   co.add(gender);
	   co.add(dob);
	   co.add(mobile);
	   co.add(mobile_txt);
	   co.add(name_txt);
	   co.add(username_txt);
	   co.add(day_arr);
	   co.add(month_arr);
	   co.add(year_arr);     //add All contents in container
	   co.add(male);
	   co.add(female);
	   co.add(addr_txt);
	   co.add(cb);
	   co.add(btn);
	   co.add(btn1);
	   co.add(btn2);
       co.add(war1);
       co.add(war2);
       co.add(war3);
       co.add(war4);
       co.add(war5);
       co.add(output);
       
       
       frame.getContentPane().add(sp);
       
	 }
	 

		
	 
	
	 
	 
	 
	 public static void btnEvent1(ActionEvent e) 
	   {
		 mobile_txt.setText("");
         username_txt.setText("");
         addr_txt.setText("");
         name_txt.setText("");

        
     }
	 
	  public static void btn2Event(ActionEvent e)
	    {
		 
		      
			Login l = new Login();
		    l.setVisible(true);
		   

	    
		}
	 
	   @SuppressWarnings({ "deprecation", "unused" })
	public static void btnEvent(ActionEvent e) throws ClassNotFoundException, SQLException
	   {
		   Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/trial", "root", "");
			
			
			 String name=name_txt.getText();  
			 String mobile=mobile_txt.getText();
			 
			 password = p1.getText();
			
		  
		 	if(cb.isSelected()==true)
		   {
			 
			  if(name.isEmpty()==true)
			  {
				  war1.setVisible(true);
				 
			  }
			  
			  String UserName=username_txt.getText();
			  if(UserName.isEmpty()==true)
			  {
				  war5.setVisible(true);
				 
			  }
			  
			 
			  if(mobile.isEmpty()==true)
			  {
				  war2.setVisible(true);
			  }
			
			  
			
			  String day=(String)day_arr.getSelectedItem();
			  String month=(String)month_arr.getSelectedItem();
			  String year=(String)year_arr.getSelectedItem();
			  String gen ="Male";
			  if(female.isSelected())
			  {
				  gen="Female";
			  }
			  
			  String add =addr_txt.getText();
			  if(add.isEmpty()==true)
			  {
				  war4.setVisible(true);
			  }
			  
			  
			 
			  
			  
			  if(name.isEmpty()==false||mobile.isEmpty()==false||add.isEmpty()==false)
			  {
				  String q2="insert into user values('"+mobile+"','"+name+"')";
				   
				   

				   PreparedStatement st = con.prepareStatement(q2);
				
				   
				  st.executeUpdate();
				 
				  
				  
				
	                
				   JOptionPane.showMessageDialog(null,"Registered Successfully. . . .Wellcome to Career World"); 
				   
				  
				   
				   
				   st.close();
				   con.close();
				   
				   
			  }
			  
			  
			  
			  else
			  {
				  output.setText("Please Fill Up All Information");
			  }
			  
		   }
			   
		   else
		   {
			   
			   output.setText("Please Select Terms And Conditions");
			   
		   }
		 	
		 	
		 }
	   
	   
	 
	   
	   
	   public void setVisible(boolean b)
	   {
		   this.setVisible(true);
	   }
}

	  
	   
	  





