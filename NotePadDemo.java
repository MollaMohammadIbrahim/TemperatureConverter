
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class NotePadDemo extends JFrame implements ActionListener{
    private JFileChooser chooser;
    private JTextArea ta;
    private JButton btn;
    private Container c;
    
    
    
    NotePadDemo(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
      
        
        ta = new JTextArea();
        ta.setBounds(55,5,795,500);
    
        c.add(ta);
        btn = new JButton("Open");
        btn.setBounds(350,510,100,50);
        c.add(btn);
        
        btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            try {
                chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                File file = chooser.getSelectedFile();
                System.out.println(file);
                Scanner input = new Scanner(file);
                while (input.hasNext()) {
                    String s = input.nextLine();
                    ta.append(s + " \r\n");

                }
                input.close();
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            }
        }
    }
    
    public static void main(String[] args) {
        
        NotePadDemo frame = new NotePadDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1,50,800,600);
        frame.setTitle("Note Pad");
        
        
    }
}

    
    

