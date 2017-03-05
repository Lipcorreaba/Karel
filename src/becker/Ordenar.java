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
public class Ordenar {
    private Robot joe;
    private City unal;
    private Thing balon;
    private int[] x=new int [5];
    public Ordenar(){
        this.unal=new City(12,14);
        this.joe=new Robot(unal,9,1,Direction.NORTH);
        for(int i=0;i<=9;i++){
            if(i>5){
                this.balon=new Thing(unal,i,1);
            }
            if(i>6){
                this.balon=new Thing(unal,i,2);
            }
            if(i>=0){
                this.balon=new Thing(unal,i,3);
            }
            if(i>=5){
                this.balon=new Thing(unal,i,4);
            }
            if(i>8){
                this.balon=new Thing(unal,i,5);
            }
        }
    }
    public void Recognize(){
        for(int i=0; i<=4;i++){
            x[i]=0;
            for(int j=0; j<=9;j++){
                if(joe.canPickThing()==true){
                    joe.pickThing();
                    x[i]++;
                }
                if(j<9){
                    joe.move();
                }
            }
            if(i%2==0){
                for(int k=0;k<=2;k++){
                    joe.turnLeft();
                }
                joe.move();
                for(int k=0;k<=2;k++){
                    joe.turnLeft();
                }
            }else{
                joe.turnLeft();
                joe.move();
                joe.turnLeft();
            }
        }
        for(int h=0; h<=8;h++){
            joe.move();
        }
        for(int k=0;k<=2;k++){
            joe.turnLeft();
        }
        for(int h=0; h<=4;h++){
            joe.move();
        }
        for(int k=0;k<=2;k++){
            joe.turnLeft();
        }
    }
    public void Organize(){
        int aux1 = 0;
        for(int i=0;i<=4;i++) {
            for(int j=0;j<4;j++) {
                if(x[i] < x[j]) {
                    aux1 = x[i];
                    x[i] = x[j];
                    x[j] = aux1;
                }
            }
        }
        for(int i=0; i<=4;i++){
            for(int j=0;j<=9;j++){
                if(x[i]>0){
                    joe.putThing();
                    x[i]--;
                }
                if(j<9){
                    joe.move();
                }
            }
                for(int k=0;k<=2;k++){
                    joe.turnLeft();
                }
                joe.move();
                for(int k=0;k<=2;k++){
                    joe.turnLeft();
                }
            for(int m=0;m<=8;m++){
                joe.move();
            }
            joe.turnLeft();
            joe.turnLeft();
        }
    }
}
