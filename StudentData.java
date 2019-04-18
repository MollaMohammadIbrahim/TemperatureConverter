
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.FileWriter;


public class StudentData extends JFrame {
    static int i = 0;

    private Container c;
    private JLabel nameLabel,fnameLabel,mnameLabel,Bgrp,studentId,department,gender;
    private JLabel address,nationality,divition,district,thana,phone;
    private Font  textf, font;
    private JTextField ntf,ftf,mtf,sidtf,nationalitytf,districttf,thanatf,phonetf;
    private JComboBox bgbox,depbox,divBox;
    private JRadioButton male,female,common;
    private ButtonGroup group1;
    private JButton btn;

    private String[] bloodGroup = {"A+","O+","B+","AB+","A-","O-","B-","AB-"};
    private String[] alldept ={"Applied Physics","Computer Science and Enggineering","Applied Chemistry & Chemical Engineering","Information & Communication Engineering","Materials Science and Engineering","Electrical and Electronic Engineering"};
    private String[] divitionName ={"Barishal","Chittagong","Dhaka","Mymensingh","Khulna","Rajshahi","Rangpur","Sylhet"};
    private String sgender;

    StudentData(){



        c = this.getContentPane();
        c.setLayout(null);


        textf = new Font("Arial",Font.PLAIN,18);


        nameLabel = new JLabel("Name :");
        nameLabel.setBounds(100,80,150,30);
        nameLabel.setFont(textf);
        nameLabel.setOpaque(true);
        c.add(nameLabel);

        ntf = new JTextField();
        ntf.setBounds(250,80,300,30);
        ntf.setFont(textf);
        c.add(ntf);


        fnameLabel = new JLabel("Father's Name :");
        fnameLabel.setBounds(100,120,150,30);
        fnameLabel.setFont(textf);
        fnameLabel.setOpaque(true);
        c.add(fnameLabel);

        ftf = new JTextField();
        ftf.setBounds(250,120,300,30);
        ftf.setFont(textf);
        c.add(ftf);

        mnameLabel = new JLabel("Mother's Name :");
        mnameLabel.setBounds(100,160,150,30);
        mnameLabel.setFont(textf);
        mnameLabel.setOpaque(true);
        c.add(mnameLabel);

        mtf = new JTextField();
        mtf.setBounds(250,160,300,30);
        mtf.setFont(textf);
        //mtf.setBackground(Color.CYAN);
        c.add(mtf);

        studentId = new JLabel("Student ID :");
        //studentId.setBackground(Color.CYAN);
        studentId.setBounds(100,200,150,30);
        studentId.setFont(textf);
        studentId.setOpaque(true);
        c.add(studentId);

        sidtf = new JTextField();
        sidtf.setBounds(250,200,300,30);
        sidtf.setFont(textf);
        c.add(sidtf);

        department = new JLabel("Department :");
        department.setBounds(100,240,150,30);
        department.setFont(textf);
        department.setOpaque(true);
        //department.setBackground(Color.CYAN);
        c.add(department);

        depbox = new JComboBox(alldept);
        depbox.setBounds(250,240,300,30);
        depbox.setSelectedIndex(1);
        c.add(depbox);

        Bgrp = new JLabel("Blood Group :");
        Bgrp.setBounds(100,280,150,30);
        Bgrp.setFont(textf);
        Bgrp.setForeground(Color.RED);
        Bgrp.setOpaque(true);
        c.add(Bgrp);

        bgbox = new JComboBox(bloodGroup);
        bgbox.setBounds(250,280,100,30);
        bgbox.setForeground(Color.RED);
        c.add(bgbox);

        gender = new JLabel("Gender :");
        //gender.setBackground(Color.CYAN);
        gender.setBounds(100,320,150,30);
        gender.setFont(textf);
        gender.setOpaque(true);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setBounds(250,320,120,30);
        male.setFont(textf);
        male.setForeground(Color.BLUE);
        c.add(male);

        female = new JRadioButton("Female");
        female.setBounds(250,360,120,30);
        female.setFont(textf);
        female.setForeground(Color.BLACK);
        c.add(female);

        common = new JRadioButton("Common");
        common.setBounds(250,400,120,30);
        common.setFont(textf);
        common.setForeground(Color.BLACK);
        c.add(common);

        group1 = new ButtonGroup();

        group1.add(male);
        group1.add(female);
        group1.add(common);

        font = new Font("Arial",Font.BOLD,26);

        address = new JLabel("Address");
        address.setBounds(100,430,200,50);
        address.setFont(font);
        c.add(address);

        nationality = new JLabel("Nationality :");
        nationality.setBounds(100,490,150,30);
        nationality.setForeground(Color.blue);
        nationality.setFont(textf);
        c.add(nationality);

        nationalitytf = new JTextField("Bangladeshi");
        nationalitytf.setBounds(250,490,200,30);
        nationalitytf.setFont(textf);
        c.add(nationalitytf);

        divition = new JLabel("Divition :");
        divition.setBounds(100,530,150,30);
        divition.setFont(textf);
        c.add(divition);

        divBox = new JComboBox(divitionName );
        divBox.setFont(textf);
        divBox.setBounds(250,530,200,30);
        divBox.setSelectedIndex(2);

        c.add(divBox);


        district = new JLabel("District :");
        district.setBounds(100,570,150,30);
        district.setFont(textf);
        c.add(district);

        districttf = new JTextField();
        districttf.setFont(textf);
        districttf.setBounds(250,570,200,30);
        c.add(districttf);

        thana = new JLabel("Thana :");
        thana.setBounds(100,610,150,30);
        thana.setFont(textf);
        c.add(thana);

        thanatf = new JTextField();
        thanatf.setFont(textf);
        thanatf.setBounds(250,610,200,30);
        c.add(thanatf);

        phone = new JLabel("Phone :");
        phone.setBounds(100,650,150,30);
        phone.setForeground(Color.DARK_GRAY);
        phone.setFont(textf);
        c.add(phone);

        phonetf = new JTextField();
        phonetf.setBounds(250,650,200,30);
        phonetf.setFont(textf);
        c.add(phonetf);

        btn = new JButton("SAVE");
        btn.setBounds(500,645,80,35);
        c.add(btn);


        Handaler handaler = new Handaler();

        btn.addActionListener(handaler);
        male.addActionListener(handaler);
        female.addActionListener(handaler);
        common.addActionListener(handaler);
    }





    public  class Handaler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if(male.isSelected()){
                sgender = male.getText();
            }else if(female.isSelected()){
                sgender = female.getText();
            }else  if(common.isSelected()){
                 sgender = common.getText();

            }

            String sname = ntf.getText();
            String sfname = ftf.getText();
            String smname = mtf.getText();
            String sid = sidtf.getText();
            String sdept = depbox.getSelectedItem().toString();
            String sbgrp = bgbox.getSelectedItem().toString();
            String snationality = nationalitytf.getText();
            String sdivition = divBox.getSelectedItem().toString();
            String sdistrict = districttf.getText();
            String sthana = thanatf.getText();
            String sphone = phonetf.getText();

            if(e.getSource() == btn){
                try{
                    BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Java All Lab Work\\StudentInformation.txt",true));
                    bw.write(++i+". Student Name   : "+sname+"\r\n"+"Fathers Name : "+sfname+"\r\n"+"Mothers Name  : "+smname+"\r\n"+sid+"\r\n"+sdept+"\r\n"+"Blood        : "+sbgrp+"\r\n"+"Gender       : "+sgender+"\r\n"+"Address      : "+snationality+", "+sdivition+", "+sdistrict+", "+sthana+", "+sphone+"\r\n");
                    bw.write("\r\n");
                    bw.close();
                }catch(Exception ex){
                }
                JOptionPane.showMessageDialog(null,"Succesfully Registered");

                ntf.setText("");
                ftf.setText("");
                mtf.setText("");
                sidtf.setText("");
                districttf.setText("");
                thanatf.setText("");
                phonetf.setText("");
            }
        }
    }


    public static void main(String[] args) {
        StudentData frame = new StudentData();
        frame.setDefaultCloseOperation(StudentData.EXIT_ON_CLOSE);
        frame.setTitle("Databage");
        frame.setBounds(180,0,670,750);
        frame.setVisible(true);
    }
}
