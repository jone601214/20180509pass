import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class mainframe1 extends JFrame{
    private JButton jbtnAdd=new JButton("Add");
    private JButton jbtnLow=new JButton("Lower");
    private JLabel jlb=new JLabel(">__<");
    private JButton jbtnExit=new JButton("Exit");
    private int x=12;
    public mainframe1(){
        init();
    }
    private void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);
        jbtnAdd.setLocation(50,120);
        jbtnLow.setLocation(200,120);
        jbtnAdd.setSize(120,30);
        jbtnLow.setSize(120,30);
        jlb.setBounds(50,350,100,30);
        jbtnExit.setBounds(400,100,150,50);
        this.add(jbtnAdd);
        this.add(jbtnLow);
        this.add(jlb);
        this.add(jbtnExit);
        jbtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x+=3;
                jlb.setFont(new Font(null,Font.BOLD,x));
            }
        });
        jbtnLow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x-=3;
                jlb.setFont(new Font(null,Font.BOLD,x));
            }
        });
        jbtnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
      }
    }


