/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment3;

/**
 *
 * @author DELL
 */
public class Mammal implements animal{
    
    short NoOfLegs;
    String FavFood; 

    @Override
    public void eat() {
       
    }

    @Override
    public void travel() {
        
    }

    public short getNoOfLegs() {
        return NoOfLegs;
    }

    public void setNoOfLegs(short NoOfLegs) {
        this.NoOfLegs = NoOfLegs;
    }

    public String getFavFood() {
        return FavFood;
    }

    public void setFavFood(String FavFood) {
        this.FavFood = FavFood;
    }
    
    
}
