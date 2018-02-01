/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java;

/**
 *
 * @author Hardik
 */
public class Triangle {
   
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        System.out.println(".....Auto Wire by Constructor....");
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    
    
    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    
    
    
    public void display(){
        
        System.out.println("Point - A : ("+getPointA().getX()+","+getPointA().getY()+")");
        System.out.println("Point - B : ("+getPointB().getX()+","+getPointB().getY()+")");
        System.out.println("Point - C : ("+getPointC().getX()+","+getPointC().getY()+")");
        
    }
}
