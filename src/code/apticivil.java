package code;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
class  apti2 extends JFrame implements ActionListener
{
            /**
             * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
			JPanel panel;
            JPanel panelresult;
            JRadioButton choice1;
            JRadioButton choice2;
            JRadioButton choice3;
            JRadioButton choice4;
            ButtonGroup bg;
            JLabel lblmess;
            JButton btnext;
            String[][] qpa;
            String[][] qca;
            int qaid;
            private Timer tim;
            private int t;
            private JLabel lb2;
            HashMap<Integer, String> map;
            
            
           
                

           public apti2()
           {
                      initializedata();
                      setTitle("Career World --Way To Success");
                      setDefaultCloseOperation(EXIT_ON_CLOSE);
                      setBounds(-10,0,1800,740);
                    
                      
                      Container cont=getContentPane();
                      cont.setLayout(null); 
                      
                     
                      ImageIcon icon=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_1485415453700.png");
                      ImageIcon icon1=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\gfdt.jpg");
                      ImageIcon icon2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\aptitude-test.jpg");
                      
             
                      
                     setIconImage(icon.getImage());
                      
                     
                    bg=new ButtonGroup();      
                    choice1=new JRadioButton("Choice1",true);
                    choice2=new JRadioButton("Choice2",false);
                    choice3=new JRadioButton("Choice3",false);
                    choice4=new JRadioButton("Choice4",false);
                    bg.add(choice1);
                    bg.add(choice2);
                    bg.add(choice3);
                    bg.add(choice4);
                   lblmess=new JLabel("Choose a correct anwswer");
                    lblmess.setForeground(Color.BLUE);
                   lblmess.setFont(new Font("AR JULIAN", Font.BOLD, 20));
           
                  
                   
                  
       	        
       	  
             JLabel l1 = new JLabel(icon1);
 	        l1.setBounds(-20,-50,1400,450);
             
             JLabel l2=new JLabel(icon2);
             l2.setBounds(1000,300,350,330);
             
             
             panel=new JPanel();
             panel.setBackground(Color.white);
             panel.setBounds(380,300,600,400);
         

       	     
       	     
       	     
                   
                    btnext=new JButton("Next");
                    
                    btnext.setForeground(Color.red);
                    btnext.setFont(new Font("AR JULIAN", Font.PLAIN, 20));
                    btnext.setBorder(null);
                 //   btnext.setBounds(300,340,200,50);
                  
                    btnext.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        
                        t=10;
                        lb2.setText(String.valueOf(t));
                        tim.start();
                       
                           if(btnext.getText().equals("Next")){
                                                if(qaid<14){
                                                            
                                                            map.put(qaid,getSelection());
                                                            qaid++;
                                                            readqa(qaid);
                                                            }
                                                else {
                                                            map.put(qaid,getSelection());
                                                          
                                                            btnext.setText("Last Question after 10 sec it will be directed to Result >>>");
                                                            btnext.setEnabled(false);
                                                         }
                                                }
                                   // else if(btnext.getText().equals("Result >>>"))
                                     //           new Report();
                          
                        }
                    });

                    
                    
                    t=10;

                  //Taimer
                  lb2=new JLabel("10");
                  lb2.setBounds(150,450,80,80);
                 Font f1=new Font("Algerian",Font.BOLD,80);
     	         lb2.setFont(f1);
     	         lb2.setForeground(Color.red);
     	         
                  tim=new Timer(1000,new ActionListener(){
                      @Override
                      public void actionPerformed(ActionEvent e){
                          if(t>0){
                          t--;
                          lb2.setText(String.valueOf(t));
                          }else{
                              tim.stop();
                              
                              JOptionPane.showMessageDialog(null, "Time's up");
                              
                              t=10;
                              lb2.setText(String.valueOf(t));
                              tim.start();
                              
                             
                              
                              if(qaid<14){
                                  
                                  map.put(qaid,getSelection());
                                  qaid++;
                                  readqa(qaid);
                                  }
                      else {
                                  map.put(qaid,getSelection());
                                  btnext.setText("Result >>>");
                                  new Report();
                                  setVisible(false);
                                tim.stop();
                               }
                         
                           
                             
                             
                              } 
        
                          
                          }
                      });
                  
                  t=10;

                  //Taimer
                  lb2=new JLabel("10");
                  lb2.setBounds(150,450,80,80);
                 
     	         lb2.setFont(f1);
     	         lb2.setForeground(Color.red);
     	         
                 
                     
                      
                          if(t>0)
                          {
                          t--;
                          lb2.setText(String.valueOf(t));
                          }
                          else
                          {
                              tim.stop();
                              
                          }
                   
                    
                    
                   
                    panel.setLayout(new GridLayout(6,2));
                   panel.add(lblmess);
                    panel.add(choice1);
                    panel.add(choice2);
                    panel.add(choice3);
                    panel.add(choice4);
                    panel.add(btnext);
                    cont.add(lb2);
                    cont.add(panel);
                   cont.add(l1);
                   cont.add(l2);
                 
                   
                    qaid=0;
                    readqa(qaid);
        
                    
                    
                    tim.start();
                    setVisible(true);
            }
           
           
               
        public void initializedata(){
                        //qpa stores pairs of question and its possible answers
                        qpa=new String[15][5];

                        qpa[0][0]="In a mortar, the binding material is_______";
                        qpa[0][1]="Cement";
                        qpa[0][2]="Sand";
                        qpa[0][3]="Surkhi";
                        qpa[0][4]="Cinder";

                        qpa[1][0]="Lacquer paints__";
                        qpa[1][1]="are generally applied on structural steel";
                        qpa[1][2]="are less durable as compared to enamel paints";
                        qpa[1][3]="consist of resin and nitro-cellulose";
                        qpa[1][4]="all the above";
                        
                        qpa[2][0]="Wrought iron contains carbon upto";
                        qpa[2][1]="0.25%";
                        qpa[2][2]="1.0%";
                        qpa[2][3]="1.5%";
                        qpa[2][4]="2%";

                        qpa[3][0]="Pick up the polymineralic rock from the following:";
                        qpa[3][1]="Quartz sand";
                        qpa[3][2]="Pure gypsum";
                        qpa[3][3]="Magnesite";
                        qpa[3][4]="Granite";

                        qpa[4][0]="Pick up the correct statement from the following:";
                        qpa[4][1]="For thin structures subjected to wetting and drying, the water cement ratio should be 0.45";
                        qpa[4][2]="For mass concrete structures subjected to wetting and drying, the water ratio should be 0.55";
                        qpa[4][3]="For thin structures which remain continuously under water, the water-cement ratio by weight should be 0.55";
                        qpa[4][4]="All the above";

                        qpa[5][0]="Hydrographic surveys deal with the mapping of";
                        qpa[5][1]="large water bodies";
                        qpa[5][2]="heavenly bodies";
                        qpa[5][3]="mountaineous region";
                        qpa[5][4]="canal system";

                        qpa[6][0]="An ideal vertical curve to join two gradients, is ";
                        qpa[6][1]="Circular";
                        qpa[6][2]="Parabolic";
                        qpa[6][3]="Elliptical";
                        qpa[6][4]="None of these.";

                        qpa[7][0]="Pick up the correct statement from the following :";
                        qpa[7][1]="the eyepiece plays no part in defining the line of sight";
                        qpa[7][2]="the diaphragm plays no part in defining the line of sight";
                        qpa[7][3]="the optical centre of the objective plays no part in defining the line of sight";
                        qpa[7][4]="none of these.";

                        qpa[8][0]="The intercept of a staff____";
                        qpa[8][1]="is maximum if the staff is held truly normal to the line of sight.";
                        qpa[8][2]="is minimum if the staff is held truly normal to the line of sight";
                        qpa[8][3]="decreases if the staff is tilted away from normal";
                        qpa[8][4]="increases if the staff is tilted towards normal.";

                        qpa[9][0]="In case of Raymond pile";
                        qpa[9][1]="lengths vary from 6 m to 12 m";
                        qpa[9][2]="diameter of top of piles varies from 40 cm to 60 cm";
                        qpa[9][3]="diameter of pile at bottom varies from 20 cm to 28 cm";
                        qpa[9][4]="all the above.";
                        
                        qpa[10][0]="Queen closer may be placed";
                        qpa[10][1]="in header course";
                        qpa[10][2]="in stretcher course";
                        qpa[10][3]="in header course next to first brick";
                        qpa[10][4]="in stretcher course next to first brick";

                        qpa[11][0]="Dado is usually provided in";
                        qpa[11][1]="dinning halls";
                        qpa[11][2]="bath rooms";
                        qpa[11][3]="living rooms";
                        qpa[11][4]="verandah";
                        
                        qpa[12][0]="Foundation in which cantilever beam is provided,known as";
                        qpa[12][1]="strip footing";
                        qpa[12][2]="strap footing";
                        qpa[12][3]="combined footing";
                        qpa[12][4]="raft footing";

                        qpa[13][0]="Foundations are placed below ground level, to increase";
                        qpa[13][1]="strength";
                        qpa[13][2]="workability";
                        qpa[13][3]="stability of structure";
                        qpa[13][4]="all the above";

                        qpa[14][0]="Stud(s) of a common wooden partition";
                        qpa[14][1]="are vertical wooden members";
                        qpa[14][2]="is the upper horizontal wooden member";
                        qpa[14][3]="is the lower horizontal wooden member";
                        qpa[14][4]="are the intermediate horizontal wooden members";

                                               
                       
                        
                        //qca stores pairs of question and its correct answer
                        qca=new String[15][2];
                        
                        qca[0][0]="mortar, the binding material is________";
                        qca[0][1]="Cement";

                        qca[1][0]="Lacquer paints__";
                        qca[1][1]="All the above";

                        qca[2][0]="Wrought iron contains carbon upto";
                        qca[2][1]="0.25%";

                        qca[3][0]="Pick up the polymineralic rock from the following:";
                        qca[3][1]="Granite";


                        qca[4][0]="Pick up the correct statement from the following:";
                        qca[4][1]="All the above";

                        qca[5][0]="Hydrographic surveys deal with the mapping of";
                        qca[5][1]="large water bodies";

                        qca[6][0]="An ideal vertical curve to join two gradients, is";
                        qca[6][1]="parabolic";
                        
                        qca[7][0]="Pick up the correct statement from the following :";
                        qca[7][1]="the eyepiece plays no part in defining the line of sight";
                        
                        qca[8][0]="The intercept of a staff____";
                        qca[8][1]="is minimum if the staff is held truly normal to the line of sight.";

                        qca[9][0]="In case of Raymond pile";
                        qca[9][1]="all the above.";
                        
                        qca[10][0]="Queen closer may be placed";
                        qca[10][1]="in header course next to first brick";

                        qca[11][0]="Dado is usually provided in";
                        qca[11][1]="bath rooms";

                        qca[12][0]="The foundation in which a cantilever beam is provided to join two footings, is known as";
                        qca[12][1]="strap footing";

                        qca[13][0]="The foundations are placed below ground level, to increase";
                        qca[13][1]="stability of structure";


                        qca[14][0]="Stud(s) of a common wooden partition";
                        qca[14][1]="are vertical wooden members";

                       

                      

                        
                        //create a map object to store pairs of question and selected answer
                        map=new HashMap<Integer, String>();
                        
                        }
        public String getSelection(){
                        String selectedChoice=null;
                        Enumeration<AbstractButton> buttons=bg.getElements();  
                        while(buttons.hasMoreElements())  
                        {  
                        JRadioButton temp=(JRadioButton)buttons.nextElement();  
                        if(temp.isSelected())  
                                    {  
                                                selectedChoice=temp.getText();
                                    }  
                         }   
                        return(selectedChoice);
            }


        public void readqa(int qid){
                        lblmess.setText("  "+qpa[qid][0]);
                        choice1.setText(qpa[qid][1]);
                        choice2.setText(qpa[qid][2]);
                        choice3.setText(qpa[qid][3]);
                        choice4.setText(qpa[qid][4]);
                        choice1.setSelected(true); 
            }
        public void reset(){
                        qaid=0;
                        map.clear();
                        readqa(qaid);
                        btnext.setText("Next");
                        }
        public int calCorrectAnswer(){
                        int qnum=15;
                        int count=0;
                        for(int qid=0;qid<qnum;qid++)
                                    if(qca[qid][1].equals(map.get(qid))) count++;
                        return count;
            }
        
        
        
        
        
        

        public class Report extends JFrame
        {
        	
        	
        
        	 /**
			 * 
			 */
			private static final long serialVersionUID = 1L;


			public Report() {
        		 
                
                                   setTitle("Career World --Way To Success");
                                   setBounds(-10,0,1800,740);
                                   setBackground(Color.WHITE);
                                 // setLayout(new FlowLayout());
                                    
                                    ImageIcon icon=new ImageIcon("PicsArt_1485415453700.png");
                                                                     
                                    setIconImage(icon.getImage());
           
                                   
                        	                                 		
               
                                    addWindowListener(new WindowAdapter(){
                                                            public void windowClosing(WindowEvent e){
                                                                        dispose();
                                                                        reset();
                                                            }
                                                });
                                    
                                   
                                    
                                    
                                    Draw d=new Draw();                                   
                                   add(d);
                                   
                                   setVisible(true);
                                  
                            
                       	        
                                   
                                    }
                        
                        
                  class Draw extends Canvas
                  {
                	  
                	  private static final long serialVersionUID = 1L;
                	  
                	  public void paint(Graphics g)
                	  {
                                                int qnum=15;
                                                int x=10;
                                                int y=20;
                                               
                                             
                                                for(int i=0;i<qnum;i++){
                                                	
                                                	   
                                                            //print the 1st column
                                                            g.setFont(new Font("Arial",Font.BOLD,15));                                          
                                                            g.drawString(i+1+". "+qca[i][0], x,y);
                                                            y+=25;            
                                                            g.setFont(new Font("Arial",Font.PLAIN,12));                              
                                                            g.drawString("      Correct answer:"+qca[i][1], x,y);
                                                            y+=25;
                                                            g.drawString("      Your answer:"+map.get(i), x,y);
                                                            y+=25;
                                                            //print the 2nd column
                                                           if(y>600) 
                                                           {
                                                        	   
                                                         	y=25;
                                                             x=450;
                                                            }
                                                          
                                                         

                                                           
                                                           
                                                  	   
                                                           
                                                           
                                                            
                                                }
                                                
                                                //Show number of correct answers
                                                int numc=calCorrectAnswer();
                                                g.setColor(Color.BLUE);
                                                g.setFont(new Font("Arial",Font.BOLD,20));
                                                g.drawString("Number of correct answers:"+numc,500,650);
                        
                                            
                                    }   
                        }
                                    
            }







		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}
        public class apticivil{
        	  

        public static void main(String args[])
        {
                     new apti2();
                     
             	
        }

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			this.setVisible(true);
		}

		
}

            


