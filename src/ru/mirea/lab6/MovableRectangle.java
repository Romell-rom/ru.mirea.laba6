package ru.mirea.lab6;

public class MovableRectangle extends Point implements Movable {
    public MovableRectangle(int x, int y,int x1,int y1) {
            super(x, y,x1,y1);
        }

    @Override
    public void move(int x, int y, int x1, int y1) {
        this.setX(getX()+x);
        this.setY(getY()+y);
        this.setX1(getX1()+x1);
        this.setY1(getY1()+y1);
    }
}
