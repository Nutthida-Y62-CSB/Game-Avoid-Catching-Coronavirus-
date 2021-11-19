/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myEvent;
import myCharacters.* ;
/**
 *
 * @author Nuttyyari
 */
public class Event {
    public static boolean checkHit(Doctor mhor,Coronavirus delta){
        if(mhor.Y + mhor.DoctorSize > delta.y && mhor.Y < delta.y){
            System.out.println("Hit X axis!");
            if(mhor.X + mhor.DoctorSize >= delta.x-delta.height){
                System.out.println("Hit Y axis!"); 
                return true ;
            }
        }
        return false ;
    }
    
    
    public static boolean checkHit(Doctor mhor,Vaccine pfizer){
        if(mhor.Y + mhor.DoctorSize > pfizer.y && mhor.Y < pfizer.y){
            System.out.println("Hit X axis!");
            if(mhor.X + mhor.DoctorSize >= pfizer.x-pfizer.height){
                System.out.println("Hit Y axis!"); 
                return true ;
            }
        }
        return false ;
    }
 }

 






/*if(mhor.Y - mhor.DoctorSize < delta.y  &&  mhor.Y > delta.y){
            if(mhor.X-mhor.DoctorSize <= delta.x+delta.height){
                System.out.println("HIT X");
                return true ;
            }
        }
        return false ;*/

/*if(mhor.X + mhor.DoctorSize>delta.x && mhor.X<delta.x){
            System.out.println("Hit AT [x] !!!!!!");
            if(mhor.Y + mhor.DoctorSize >= delta.y-delta.height){
                System.out.println("Hit AT [Y] !!!!!!"); 
                return true ;
            }
        }*/