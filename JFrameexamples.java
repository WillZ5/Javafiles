import javax.swing.*;
public class Main {
 
    public static void main(String[] args) {
        JFrame f=new JFrame("JFrameInstanceExample");//create a JFrame object
 
        JButton b=new JButton("JFrameButton");//create instance of JButton
        b.setBounds(100,50,150, 40);//dimensions of JButton object
 
        f.add(b);//add button in JFrame
 
        f.setSize(300,200);//set frame width = 300 and height = 200
        f.setLayout(null);//no layout manager specified
        f.setVisible(true);//make the frame visible
    }
}

import javax.swing.*;
class JPanelExample {
    JPanelExample(){
        JFrame frame = new JFrame("Panel Example"); //create a frame
        JPanel panel = new JPanel(); //Create JPanel Object
        panel.setBounds(40,70,100,100); //set dimensions for Panel
        JButton b = new JButton("ButtonInPanel"); //create JButton object
        b.setBounds(60,50,80,40); //set dimensions for button
        panel.add(b);   //add button to the panel
        frame.add(panel);   //add panel to frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
 
}
public class Main {
    public static void main(String[] args) {
      new JPanelExample(); //create an object of FrameInherited class
    }
