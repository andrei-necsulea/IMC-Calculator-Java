import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import java.awt.*;
import java.awt.event.*;
public class BMI {
   static JButton b;
   static JTextArea t,a,c;
   static JFrame f;
   static JPanel p;
   static JLabel l,l1,r,m,n,o,q,v;
    public static void main(String[] args){
         f = new JFrame("BMI");
         f.setSize(265 , 300);
         p = new JPanel();
         p.setMaximumSize(new Dimension(265,550));
         b = new JButton("    Calculate    ");
         l = new JLabel(" Weight(kg) : ");
         l1 = new JLabel(" Height(m/cm) : ");
         r = new JLabel(" Result : ");
         m = new JLabel("                                                                                                                                                                                                                                                                          ");
         n = new JLabel("                     ");
         o = new JLabel("                                                                                                                                                                                                                                                                                                                                                         ");
         q = new JLabel("                                                                                                                                                                                                                                                                ");
         v = new JLabel("                     ");
         t = new JTextArea();
         t.setPreferredSize(new Dimension(150 , 30));
         a = new JTextArea();
         a.setPreferredSize(new Dimension(150 , 30));
         c = new JTextArea();
         c.setPreferredSize(new Dimension(150 , 30));
         p.add(l);
         p.add(t);
         p.add(l1);
         p.add(a);
         p.add(n);
         p.add(v);
         p.add(b);
         p.add(m);
         p.add(o);
         p.add(q);
         p.add(r);
         p.add(c);
         f.add(p);
         f.setVisible(true);
         f.setResizable(false);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         b.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
             String data =  t.getText();
              a.getText();
              if(data.equals(""))
                                JOptionPane.showMessageDialog(f,"Please enter your weight and height ! ","Error Message Box",JOptionPane.ERROR_MESSAGE);

              else
                                 
              if(!(data.equals("") )){
              Double weight = Double.parseDouble(t.getText());
              Double height = Double.parseDouble(a.getText());
              if(height>100)
                            height = height/100;
              Double raport = weight/(height*height);
              Math.ceil(raport);
              String s = String.valueOf(raport);
              c.setText(s);
              if(raport<18.5)
                              JOptionPane.showMessageDialog(f," You are underweight !");
               if(raport>=18.5 && raport<=24.9)
                              JOptionPane.showMessageDialog(f," You have a normal weight !");
               if(raport>=25 && raport<=29.99)
                              JOptionPane.showMessageDialog(f," You are overweight !");
               if(raport>=30 && raport<=34.99)
                              JOptionPane.showMessageDialog(f," You have obesity( grade 1 ) !");    
               if(raport>=35 && raport<=39.99)
                              JOptionPane.showMessageDialog(f," You have obesity( grade 2 ) !");     
               if(raport>=40)   
                              JOptionPane.showMessageDialog(f," You have morbid obesity !");                  

              }
          }
      });

    } 
}
