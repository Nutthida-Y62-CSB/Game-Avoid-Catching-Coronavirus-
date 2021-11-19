/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCharacters;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener ;
import javax.swing.JPanel ;
import javax.swing.Timer ;
/**
 *
 * @author Nuttyyari
 */
public class Doctor { //3.Crete doctor class
    public int DoctorSize, X ,Y ; //StoreLocation of x,y and DoctorSize
    public Doctor(int X, int Y, int DoctorSize){ 
        this.DoctorSize = DoctorSize ;
        this.X = X ;
        this.Y = Y ; //4.Call class doctor in game
    }
    
    public int superJumpHeight = 100; //7. Make doctor jump and go to implement keylistener in Game
    public void jump(JPanel game1){ //Don't forget to sent argument game in class Game
        this.Y = Y - superJumpHeight ;
        //11.Jump and how dogtor on air for second?-->500 millisecond 
        game1.repaint(); //when dortor jump, he will be repainted        
        Timer timer = new Timer(500,new ActionListener() { //500 millisecond that do in line 29-33
            @Override
            public void actionPerformed(ActionEvent e) {
              Y = Y + superJumpHeight ;
              game1.repaint();
            }
        });
        timer.setRepeats(false); // Oherwise it will be loop
        timer.start();
        
    }
    
    public int superMoveL = 100 ;
    public void moveL(JPanel game1){
        this.X = X - superMoveL ;
        game1.repaint(); //when dortor jump, he will be repainted        
        Timer timer = new Timer(500,new ActionListener() { //500 millisecond that do in line 29-33
            @Override
            public void actionPerformed(ActionEvent e) {
              X = X + superMoveL ;
              game1.repaint();
            }
        });
        timer.setRepeats(false); // Oherwise it will be loop
        timer.start();
    }
    
    public int superMoveR = 100 ;
    public void moveR(JPanel game1){
        this.X = X + superMoveR ;
        game1.repaint(); //when dortor jump, he will be repainted        
        Timer timer = new Timer(500,new ActionListener() { //500 millisecond that do in line 29-33
            @Override
            public void actionPerformed(ActionEvent e) {
              X = X - superMoveR ;
              game1.repaint();
            }
        });
        timer.setRepeats(false); // Oherwise it will be loop
        timer.start();
    }
    
}
