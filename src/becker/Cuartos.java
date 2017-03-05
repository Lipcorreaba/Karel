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
public class Cuartos {
    private Robot joe;
    private City unal;
    private Thing balon;
    private Wall a;
    private String m[][];
    private String q[][];
    private String w[][];
    private String e[][];
    private String r[][];
    private String t[][];
    private String y[][];
    private String u[][];
    private String i[][];
    private String o[][];
    public Cuartos(){
        this.m=new String[5][3];
        this.q=new String[5][3];
        this.w=new String[5][3];
        this.e=new String[5][3];
        this.r=new String[5][3];
        this.t=new String[5][3];
        this.y=new String[5][3];
        this.u=new String[5][3];
        this.i=new String[5][3];
        this.o=new String[5][3];
        this.unal=new City(11,11);
        this.joe=new Robot(unal,6,2,Direction.NORTH);
        for(int i=0;i<=3;i++){
            for(int j=1;j<=10;j=j+3){
                for(int p=1;p<=5;p++){
                    this.a=new Wall(unal,p,j,Direction.WEST);
                }
            }
        }
        for(int i=1;i<=9;i++){
            this.a=new Wall(unal,1,i,Direction.NORTH);
        }
        for(int i=1;i<=3;i=i+2){
            this.a=new Wall(unal,5,i,Direction.SOUTH);
        }
        for(int i=4;i<=6;i=i+2){
            this.a=new Wall(unal,5,i,Direction.SOUTH);
        }
        for(int i=7;i<=9;i=i+2){
            this.a=new Wall(unal,5,i,Direction.SOUTH);
        }
        for(int j=1;j<=9;j++){
            for(int p=1;p<=6;p=p+4){
                this.balon=new Thing(unal,p,j);
            }
        }
        for(int j=2;j<=4;j++){
            for(int p=1;p<=3;p=p+2){
                this.balon=new Thing(unal,j,p);
            }
        }
        for(int j=2;j<=4;j++){
            for(int p=7;p<=9;p=p+2){
                this.balon=new Thing(unal,j,p);
            }
        }
        this.balon=new Thing(unal,2,4);
        this.balon=new Thing(unal,3,4);
        this.balon=new Thing(unal,3,5);
        this.balon=new Thing(unal,3,6);
        this.balon=new Thing(unal,4,6);
    }
    /**/
    public void checkRoom(){
        joe.move();
        for(int i=0; i<=2;i++){
            joe.turnLeft();
        }
        joe.move();
        joe.turnLeft();
        for(int i=2;i>=0;i--){
            for(int j=4;j>=0;j--){
                if(joe.canPickThing()==true){
                    m[j][i]="*";
                }
                else{
                    m[j][i]=" ";
                }
                if(joe.frontIsClear()==true){
                    joe.move();
                }
            }
            joe.turnLeft();
            if(joe.frontIsClear()==true){
                joe.move();
            }
            joe.turnLeft();
            if(joe.frontIsClear()==true){
            for(int q=0;q<=3;q++){
                joe.move();
            }
            }
            joe.turnLeft();
            joe.turnLeft();
        }
        for(int i=0;i<=4;i++){
            for(int j=0;j<=2;j++){
                System.out.print(" "+ m[i][j]);
            }
            System.out.println(" ");
        }
    }
    public void nextRoom(){
        for(int i=0; i<=2;i++){
            joe.turnLeft();
        }
        joe.move();
        for(int i=0; i<=2;i++){
            joe.turnLeft();
        }
        joe.move();
        joe.turnLeft();
        joe.move();
        joe.move();
        joe.move();
        joe.turnLeft();
    }
    
}
