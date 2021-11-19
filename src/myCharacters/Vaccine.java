/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCharacters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Nuttyyari
 */
public class Vaccine {
    public int x,y,width,height,speed ;
    private int x_Start,y_Start ;
    public Vaccine(int x,int y,int w,int h,int speed,JPanel game1){
        this.x = x ;
        this.y = y ;
        this.width = w ;
        this.height = h ;
        this.speed = speed ;
        gogoDown(game1);
        this.x_Start = x ;
        this.y_Start = y ;
    }
    
    public void gogoDown(JPanel game1){
        Timer timer = new Timer(50,new ActionListener(){ //Then go to class Game to crete int crnSpeed
            @Override
            public void actionPerformed(ActionEvent e) {
                /*x = x - speed ;
                game1.repaint();
                if(x<0){
                    x = x_Start ;
                }*/
                
                y = y + speed ; //speed = 30
                //game1.repaint();
                //Edit Tokkob
                if(y > 700){
                    y = y_Start ;
                }
                game1.repaint();
            }
        });
        timer.start();
    }
}
