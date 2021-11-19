/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydisplay_game ;
import java.awt.Color ;
import java.awt.Font;
import java.awt.Graphics ;
import java.awt.Graphics2D ;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.JPanel ;
import java.awt.event.KeyListener;
import myCharacters.* ;
import myEvent.Event;
import javax.swing.*;

//URL imageURL= this.getClass().getResource("DarkTown.jpg");
    //Image image = new ImageIcon(imageURL).getImage();
/**
 *
 * @author Nuttyyari
 */

public class Game extends JPanel implements KeyListener{ 
    
    public Game(){
        this.setBounds(0,0,1000,600); //Set window size at x,y location and size,size
        this.setFocusable(true); //Set event after that
        this.setLayout(null);// Not define layout because I can define it later.
        this.addKeyListener(this); //9. Add parameter (this or this clas because IPM)
        
    }

    
    //Create object
    //int crnSpeed = 30 ; //(int x,int y,int w,int h,int speed,JPanel game1)
    Coronavirus delta  = new Coronavirus(100,10,30,30,35,this) ;
    Coronavirus[] deltaSet = makeCoronavirusSet(5) ;
    
    Coronavirus delta2  = new Coronavirus(500,10,30,30,40,this) ;
    Coronavirus[] deltaSet2 = makeCoronavirusSet2(5) ;
    
    Coronavirus delta3  = new Coronavirus(680,10,30,30,55,this) ;
    Coronavirus[] deltaSet3 = makeCoronavirusSet3(5) ;
    
    Vaccine pfizer  = new Vaccine(470,10,30,30,15,this) ;
    Vaccine[] vaccineSet = makeVaccineSet(4) ;
    
    Doctor mhor = new Doctor(425,400,100); //5.Crete mhor object
    //Coronavirus delta = new Coronavirus(300,800,100,100) ;
    
    
    @Override
    public void paint(Graphics G){
       
        super.paint(G); //Call method paint in order to not make many rect
        Graphics2D GG = (Graphics2D) G ;
        
        //Coronavirus1
        GG.setColor(Color.red);
        GG.drawRect(delta.x,delta.y,delta.width,delta.height);
        for(Coronavirus delta : deltaSet){
            GG.drawRect(delta.x, delta.y, delta.width, delta.height);
            Event.checkHit(mhor, delta);
        }
        
        //Coronavirus2
        GG.setColor(Color.red);
        GG.drawRect(delta2.x,delta2.y,delta2.width,delta2.height);
        for(Coronavirus delta2 : deltaSet2){
            GG.drawRect(delta2.x, delta2.y, delta2.width, delta2.height);
            Event.checkHit(mhor, delta2);
        }
        
        //Coronavirus3
        GG.setColor(Color.red);
        GG.drawRect(delta3.x,delta3.y,delta3.width,delta3.height);
        for(Coronavirus delta3 : deltaSet3){
            GG.drawRect(delta3.x, delta3.y, delta3.width, delta3.height);
            Event.checkHit(mhor, delta3);
        }
        
        //Vaccine
        GG.setColor(Color.GREEN);
        GG.drawRect(pfizer.x,pfizer.y,pfizer.width,pfizer.height);
        for(Vaccine pfizer : vaccineSet){
            GG.drawRect(pfizer.x, pfizer.y, pfizer.width,pfizer.height);
            Event.checkHit(mhor, pfizer);
        }
        
        //Doctor
        GG.setColor(Color.black); //Set color to next component(line)
        //GG.drawRect(100 ,100 ,100 ,100); //Create Rectangle -> x,y,width,height
        GG.drawRect(mhor.X, mhor.Y, mhor.DoctorSize, mhor.DoctorSize);//6.Put argument from Doctor
    
        
        
    }
   
   
    private Coronavirus[] makeCoronavirusSet(int deltaNumber){
        Coronavirus[] deltaSet = new Coronavirus[deltaNumber];
        for(int i=0 ; i<deltaNumber ; i++){
            double deltaLocation ; 
            deltaLocation = 1000 + Math.floor(Math.random()*1000);
            deltaSet[i] = new Coronavirus((int)deltaLocation,300,30,40,30,this);
        }
        return deltaSet;
    }
    
    private Coronavirus[] makeCoronavirusSet2(int deltaNumber2){
        Coronavirus[] deltaSet2 = new Coronavirus[deltaNumber2];
        for(int i=0 ; i<deltaNumber2 ; i++){
            double deltaLocation2 ; 
            deltaLocation2 = 1000 + Math.floor(Math.random()*1000);
            deltaSet2[i] = new Coronavirus((int)deltaLocation2,300,30,40,30,this);
        }
        return deltaSet2;
    }
    
    private Coronavirus[] makeCoronavirusSet3(int deltaNumber3){
        Coronavirus[] deltaSet3 = new Coronavirus[deltaNumber3];
        for(int i=0 ; i<deltaNumber3 ; i++){
            double deltaLocation3 ; 
            deltaLocation3 = 1000 + Math.floor(Math.random()*1000);
            deltaSet3[i] = new Coronavirus((int)deltaLocation3,300,30,40,30,this);
        }
        return deltaSet3;
    }
    
    private Vaccine[] makeVaccineSet(int pfizerNumber){
       Vaccine[] pfizerSet = new Vaccine[pfizerNumber];
        for(int i=0 ; i<pfizerNumber ; i++){
            double pfizerLocation ; 
            pfizerLocation = 1000 + Math.floor(Math.random()*1000);
            pfizerSet[i] = new Vaccine((int)pfizerLocation,300,30,40,30,this);
        }
        return pfizerSet;
       
   }
   
 
    //8.After imp KL, get override as follows 
    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override //8.1
    public void keyPressed(KeyEvent evn) {
        //System.out.println(evn.getKeyCode()); //For look key code
        //10.When meet key code 38(Up) and 32 (spacebar) --> Doctor will jump.
        if(evn.getKeyCode() == 38 || evn.getKeyCode() == 32){
            mhor.jump(this); //Get argument from class Dogtor
            this.repaint(); //For call method paint again --> repaint when I move X of dog
        }
        
        if(evn.getKeyCode() == 37){
            mhor.moveL(this);
            //this.repaint();
        }
        
        if(evn.getKeyCode() == 39){
            mhor.moveR(this);
            //this.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
