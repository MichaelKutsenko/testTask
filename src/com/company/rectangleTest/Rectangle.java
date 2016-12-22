package com.company.rectangleTest;

public class Rectangle {
    private int leftBottomX;
    private int leftBottomY;
    private int rightTopX;
    private int rightTopY;

    public Rectangle(int leftBottomX, int leftBottomY, int rightTopX, int rightTopY) {
        this.leftBottomX = leftBottomX;
        this.leftBottomY = leftBottomY;
        this.rightTopX = rightTopX;
        this.rightTopY = rightTopY;
    }

    public int getLeftBottomX() {
        return leftBottomX;
    }

    public int getLeftBottomY() {
        return leftBottomY;
    }

    public int getRightTopX() {
        return rightTopX;
    }

    public int getRightTopY() {
        return rightTopY;
    }
}
