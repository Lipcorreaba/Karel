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
public class Hello {
    private Robot joe1;
    private Robot joe2;
    private Robot joe3;
    private Robot joe4;
    private Robot joe5;
    private City unal;
    private Thing balon;
    public Hello(){
        this.unal=new City(7,21);
        this.joe1=new Robot(unal,1,1,Direction.SOUTH,11);
        this.joe2=new Robot(unal,1,7,Direction.SOUTH,11);
        this.joe3=new Robot(unal,1,9,Direction.SOUTH,7);
        this.joe4=new Robot(unal,1,13,Direction.SOUTH,7);
        this.joe5=new Robot(unal,1,17,Direction.SOUTH,12);
    }
    public void h(){
        for(int m=0;m<=2;m++){
            joe1.turnLeft();
            joe1.putThing();
            joe1.move();
            joe1.move();
            joe1.putThing();
            if(m==2){
                break;
            }
            for(int i=0;i<=2;i++){
                joe1.turnLeft();
            }
            joe1.move();
            joe1.putThing();
            for(int i=0;i<=2;i++){
                joe1.turnLeft();
            }
            joe1.move();
            joe1.move();
            joe1.putThing();
            joe1.turnLeft();
            joe1.move();
        }
        joe1.turnLeft();
        joe1.move();
        joe1.move();
        joe1.turnLeft();
        joe1.move();
        joe1.putThing();
    }
    public void e(){
        for(int i=0;i<=2;i++){
            joe2.turnLeft();
        }
        for(int j=0;j<=2;j++){
            joe2.putThing();
            if(j==2){
                break;
            }
            joe2.move();
        }
        joe2.turnLeft();
        for(int j=0;j<=3;j++){
            joe2.move();
            joe2.putThing();
        }
        joe2.turnLeft();
        for(int j=0;j<=1;j++){
            joe2.move();
            joe2.putThing();
        }
        joe2.turnLeft();
        joe2.move();
        joe2.move();
        joe2.turnLeft();
        joe2.putThing();
        joe2.move();
        joe2.putThing();
    }
    public void l(){
        for(int i=0;i<=4;i++){
            joe3.putThing();
            if(i==4){
                break;
            }
            joe3.move();
        }
        joe3.turnLeft();
        for(int j=0;j<=1;j++){
            joe3.move();
            joe3.putThing();
        }
        for(int i=0;i<=4;i++){
            joe4.putThing();
            if(i==4){
                break;
            }
            joe4.move();
        }
        joe4.turnLeft();
        for(int j=0;j<=1;j++){
            joe4.move();
            joe4.putThing();
        }
    }
    public void o(){
        for(int i=0; i<=4;i++){
            joe5.putThing();
            if(i==4){
                break;
            }
            joe5.move();
        }
        joe5.turnLeft();
        for(int j=0;j<=1;j++){
            joe5.move();
            joe5.putThing();
        }
        joe5.turnLeft();
        for(int k=0;k<=3;k++){
            joe5.move();
            joe5.putThing();
        }
        joe5.turnLeft();
        joe5.move();
        joe5.putThing();
    }
    public void hello(){
        h();
        e();
        l();
        o();
    }
}
