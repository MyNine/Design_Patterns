package ex02ObserverPatterns;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserveExample {
    JFrame frame;

    public static void main(String[] args){
        SwingObserveExample example = new SwingObserveExample();
        example.go();
    }

    public void go(){
        frame  = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        //在这里说着frame属性
    }

    class AngelListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do iit, you might regret it");
        }
    }

    class DevilListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }
}
