package ru.mirea.lab6;

public class Point {
        private int x;
        private int y;
        private int x1;
        private int y1;

        public Point(int x, int y,int x1,int y1) {
            this.x = x;
            this.y = y;
            this.x1 = x1;
            this.y1 = y1;
        }

        public int getX() {
            return x;
        }

        protected void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        protected void setY(int y) {
            this.y = y;
        }
    public int getX1() {
        return x1;
    }

    protected void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    protected void setY1(int y1) {
        this.y1 = y1;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", x1=" + x1 +
                ", y1=" + y1 +
                '}';
    }
}
