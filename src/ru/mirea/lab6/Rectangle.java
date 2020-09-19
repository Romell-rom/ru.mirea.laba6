package ru.mirea.lab6;

public class Rectangle {
        private Point upleft;
        private Point downright;

        public Rectangle( Point upleft) {
            this.upleft = upleft;
         //   this.downright = downright;
        }
        protected void setUL(Point upleft) {
            this.upleft = upleft;
        }
      /*  protected void setDR(Point downright) {
            this.downright = downright;
        }*/
        public Point getUL() {
            return upleft;
        }
/*
        public Point getDR() {
            return downright;
        }*/

    }
