
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame implements ActionListener  {

    private Container c;
    private JTextField tf,tf2;
    private JRadioButton in1,in2, in3,out1,out2,out3;
    private ButtonGroup grp,grp2;
    private Font f,f2;
    private JLabel label1, label2,imagelabel;



    TemperatureConverter(){


        this.setBounds(100,100,500,700);


        c = this.getContentPane();
        c.setBackground(Color.CYAN);
        c.setLayout(null);

        f = new Font("Arial",Font.BOLD,20);
        f2 = new Font("Arial",Font.BOLD,24);


        label1 = new JLabel("Input");
        label1.setBounds(20,50,100,50);
        label1.setForeground(Color.BLUE);
        label1.setFont(f2);
        c.add(label1);

        label2 = new JLabel("Output");
        label2.setBounds(20,120,100,50);
        label2.setForeground(Color.RED);
        label2.setFont(f2);
        c.add(label2);

        tf = new JTextField();
        tf.setForeground(Color.GREEN);
        tf.setBounds(150,50,200,50);
        tf.setFont(f);
        c.add(tf);

        tf2 = new JTextField();
        tf2.setBounds(150,120,200,50);
        tf2.setFont(f);
        tf2.setForeground(Color.RED);
        tf2.setEditable(false);
        c.add(tf2);



        in1 = new JRadioButton("Celcious");
        in1.setBounds(50,200,150,30);
        in1.setForeground(Color.BLUE);
        in1.setFont(f);
        c.add(in1);

        in2 = new JRadioButton("Farenheit");
        in2.setBounds(50,250,150,30);
        in2.setForeground(Color.BLUE);
        in2.setFont(f);
        c.add(in2);

        in3 = new JRadioButton("Kelvin");
        in3.setBounds(50,300,150,30);
        in3.setForeground(Color.BLUE);
        //in3.setBackground(Color.WHITE);
        in3.setFont(f);
        c.add(in3);

        grp = new ButtonGroup();
        grp.add(in1);
        grp.add(in2);
        grp.add(in3);


        out1 = new JRadioButton("Celcious");
        out1.setForeground(Color.RED);
        out1.setBounds(260,200,150,30);
        //out1.setBackground(Color.CYAN);
        out1.setFont(f);
        c.add(out1);

        out2 = new JRadioButton("Ferhenheit");
        out2.setForeground(Color.RED);
        //out2.setBackground(Color.GRAY);
        out2.setBounds(260,250,150,30);
        out2.setFont(f);
        c.add(out2);

        out3 = new JRadioButton("Kelvin");
        out3.setForeground(Color.RED);
        //out3.setBackground(Color.GRAY);
        out3.setBounds(260,300,150,30);
        out3.setFont(f);
        c.add(out3);

        grp2 = new ButtonGroup();
        grp2.add(out1);
        grp2.add(out2);
        grp2.add(out3);



        tf.addActionListener(this);
        tf2.addActionListener(this);

        in1.addActionListener(this);
        in2.addActionListener(this);
        in3.addActionListener(this);

        out1.addActionListener(this);
        out2.addActionListener(this);
        out3.addActionListener(this);


    }

    
        @Override
        public void actionPerformed(ActionEvent e) {
            if(in1.isSelected()){
                if(out1.isSelected()){
                    String s = tf.getText();
                    Double x = Double.parseDouble(s);
                    Double y = x;
                    tf2.setText(y+"C");
                }
                else if(out2.isSelected()){
                    String s = tf.getText();
                    Double x = Double.parseDouble(s);
                    Double y = ((9*x)/5)+32;
                    tf2.setText(y+""+"F");
                }
                else if(out3.isSelected()){
                    String s = tf.getText();
                    Double x = Double.parseDouble(s);
                    Double y = x+273.15;
                    tf2.setText(y+""+"K");
                }
            }
            else if(in2.isSelected()){
                if(out1.isSelected()){
                    String s = tf.getText();
                    Double x = Double.parseDouble(s);
                    Double y =((x-32)*5)/9;
                    tf2.setText(y+"C");
                }
                else if(out2.isSelected()){
                    String s = tf.getText();
                    Double x = Double.parseDouble(s);
                    Double y = x;
                    tf2.setText(y+""+"F");
                }
                else if(out3.isSelected()){
                    String s = tf.getText();
                    Double x = Double.parseDouble(s);
                    Double y = (((x-32)*5)/9) + 273.15;
                    tf2.setText(y+""+"K");
                }
            }
            else if(in3.isSelected()){
                if(out1.isSelected()){
                    String s = tf.getText();
                    Double x = Double.parseDouble(s);
                    Double y = x-273.15;
                    tf2.setText(y+""+"C");
                }
                else if(out2.isSelected()){
                    String s = tf.getText();
                    Double x = Double.parseDouble(s);
                    Double y = (((x-273.15)*9)/5)+32;
                    tf2.setText(y+""+"F");
                }
                else if(out3.isSelected()){
                    String s = tf.getText();
                    Double x = Double.parseDouble(s);
                    Double y = x;
                    tf2.setText(y+""+"K");
                }
            }
        }





        public static void main(String[] args) {

            TemperatureConverter frame = new TemperatureConverter();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(TemperatureConverter.EXIT_ON_CLOSE);
            frame.setTitle("Converter");
        }

}

