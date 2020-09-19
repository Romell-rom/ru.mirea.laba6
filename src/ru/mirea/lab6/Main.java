package ru.mirea.lab6;

public class Main {
        public static void main(String[] args) {

            Rectangle rectangle = new Rectangle(new Point(1,3,2,3));

            System.out.println(rectangle);

            MovableRectangle movablrectangle = new MovableRectangle(1,3,2,3);
System.out.println(movablrectangle);
            movablrectangle.move(12,19,2,-4);
            System.out.println(movablrectangle);
        }
    }

