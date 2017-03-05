/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
/**
 *
 * @author Usuario
 */
public class Histograma {
    private Robot joe;
    private City unal;
    private Thing balon;
    public Histograma(){
        this.unal=new City(7,7);
        this.joe=new Robot(unal,0,1,Direction.SOUTH);
        for(int i=0;i<=2;i++){
            this.balon=new Thing(unal,1,1);
        }
        for(int i=0;i<=1;i++){
            this.balon=new Thing(unal,2,1);
        }
        for(int i=0;i<=4;i++){
            this.balon=new Thing(unal,3,1);
        }
        for(int i=0;i<=3;i++){
            this.balon=new Thing(unal,4,1);
        }
    }
    public void x(){
        int w=0;
        do{
        int q=0;
        joe.move();
        do{
            joe.pickThing();
            q++;
        }while(joe.canPickThing()==true);
        joe.turnLeft();
        for(int i=1;i<=q;i++){
            joe.putThing();
            if(i==q){
                break;
            }
            joe.move();
        }
        joe.turnLeft();
        joe.turnLeft();
        for(int i=1;i<=q;i++){
            if(i==q){
                break;
            }
            joe.move();
        }
        joe.turnLeft();
        w++;
        }while(w<=3);
    }
}
