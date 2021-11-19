/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydisplay_game;
import javax.swing.JFrame;

/**
 *
 * @author Nuttyyari
 */
public class Display extends JFrame { //1.Create JFrame
    public Display(){
        super("Avoid Catching Coronavirus !");
        this.setSize(1000,600);
        this.setLocation(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //2.Put class game in class display
        this.getContentPane().setLayout(null);
        this.getContentPane().add(new Game());
        
        
        
    }
    public static void main(String[] args) {
        Display DP = new Display();
    }
}
