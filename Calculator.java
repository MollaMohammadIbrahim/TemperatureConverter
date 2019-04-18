


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends JFrame implements ActionListener{

    private Container c;
    private JButton ac,sqr,sq2,percent,point,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,equal,plus, minus, mul, div;
    private BorderLayout borderLayout;
    private GridLayout gridLayout;
    private String pre = "",post = "",sans;
    private JTextField tf;
    private JPanel bpan;
    private Double p,q, ans;
    private Font font;

    Calculator(){
        initcomponent();

    }

    public void initcomponent(){
        this.setDefaultCloseOperation(Calculator.EXIT_ON_CLOSE);
        this.setBounds(100,100,300,500);

        borderLayout = new BorderLayout();

        c = this.getContentPane();
        borderLayout = new BorderLayout();
        c.setLayout(borderLayout);





        tf = new JTextField();
        tf.setBackground(Color.GREEN);
        //tf.setFont(font);
        c.add(tf,BorderLayout.NORTH);
        tf.setPreferredSize(new Dimension(100,100));

        gridLayout = new GridLayout(5,4,5,5);

        bpan = new JPanel();
        bpan.setLayout(gridLayout);
        c.add(bpan,BorderLayout.CENTER);

        ac = new JButton("AC");
        percent = new JButton("%");
        sqr = new JButton("!");
        sq2 = new JButton("22");
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
       div = new JButton("/");
       mul = new JButton("X");
       minus = new JButton("-");
       plus = new JButton("+");
       equal = new JButton("=");
       point = new JButton(".");

        bpan.add(ac);
        bpan.add(percent);
        bpan.add(sqr);
        bpan.add(sq2);


        bpan.add(b7);
        bpan.add(b8);
        bpan.add(b9);
        bpan.add(div);


        bpan.add(b4);
        bpan.add(b5);
        bpan.add(b6);
        bpan.add(mul);

        bpan.add(b1);
        bpan.add(b2);
        bpan.add(b3);
        bpan.add(minus);

        bpan.add(point);
        bpan.add(b0);
        bpan.add(equal);
        bpan.add(plus);


        ac.addActionListener(this);
        percent.addActionListener(this);
        sqr.addActionListener(this);
        sq2.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        div.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        mul.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        minus.addActionListener(this);
        point.addActionListener(this);
        b0.addActionListener(this);
        equal.addActionListener(this);
        plus.addActionListener(this);

    }




        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == b0){
                String x = b0.getText();
                pre = pre+""+x;
                post  = post+""+x;
                tf.setText(pre);
            }
            else if(e.getSource() == b1){
                String x = b1.getText();
                pre = pre+""+x;
                post = post+""+x;
                tf.setText(pre);
            }
            else if(e.getSource() == b2){
                String x = b2.getText();
                pre = pre+""+x;
                post = post+""+x;
                tf.setText(pre);
            } else if(e.getSource() == b3){
                String x = b3.getText();
                pre = pre+""+x;
                post = post+""+x;
                tf.setText(pre);
            } else if(e.getSource() == b4){
                String x = b4.getText();
                pre = pre+""+x;
                post = post+""+x;
                tf.setText(pre);
            } else if(e.getSource() == b5){
                String x = b5.getText();
                pre = pre+""+x;
                post = post+""+x;
                tf.setText(pre);
            } else if(e.getSource() == b6){
                String x = b6.getText();
                pre = pre+""+x;
                post = post+""+x;
                tf.setText(pre);
            } else if(e.getSource() == b7){
                String x = b7.getText();
                pre = pre+""+x;
                post = post+""+x;
                tf.setText(pre);
            } else if(e.getSource() == b8){
                String x = b8.getText();
                pre = pre+""+x;
                post = post+""+x;
                tf.setText(pre);
            }
            else if(e.getSource() == b9){
                String x = b9.getText();
                pre = pre+""+x;
                post = post+""+x;
                tf.setText(pre);
            } else if(e.getSource() == point){
                String x = point.getText();
                pre = pre+""+x;
                post = post+""+x;
                tf.setText(pre);
            } else if(e.getSource() == ac){
                pre = "";
                post = "";
                tf.setText(pre);
            }else if(e.getSource() == plus){
                p = Double.parseDouble(pre);
                pre = "";
                post = post+""+plus.getText();

            }else if(e.getSource() == minus){
                p = Double.parseDouble(pre);
                pre = "";
                post = post+""+minus.getText();

            }else if(e.getSource() == mul){
                p = Double.parseDouble(pre);
                pre = "";
                post = post+""+mul.getText();
            }else if(e.getSource() == div){
                p = Double.parseDouble(pre);
                pre = "";
                post = post+""+div.getText();
            }else if(e.getSource() == equal){
                q = Double.parseDouble(pre);
                if(post.contains("+")){
                    ans = p + q;
                    sans = String.valueOf(ans);
                    tf.setText(sans);
                    pre = "";
                    post = "";
                }else if(post.contains("-")){
                    ans = p - q;
                    sans = String.valueOf(ans);
                    tf.setText(sans);
                    pre = "";
                    post = "";
                }else if(post.contains("X")){
                    ans = p*q;
                    sans = String.valueOf(ans);
                    tf.setText(sans);
                    pre = "";
                    post = "";
                }else if(post.contains("/")){
                    try {
                        ans = p/q;
                        sans = String.valueOf(ans);
                        tf.setText(sans);
                        pre = "";
                        post = "";
                    }catch (Exception e1){
                        tf.setText("Math ERROR");
                    }
                }
            }


        }



    public static void main(String[] args) {
        Calculator frame = new Calculator();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("Calculator");

    }
}

