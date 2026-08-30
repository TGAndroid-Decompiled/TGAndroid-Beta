package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f43888w;
        public float f43889x;
        public float f43890y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f43889x = f10;
            this.f43890y = f11;
            this.f43888w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f43888w;
        }

        @Override
        public float getX() {
            return this.f43889x;
        }

        @Override
        public float getY() {
            return this.f43890y;
        }

        public String toString() {
            return "Float{x=" + this.f43889x + ", y=" + this.f43890y + ", w=" + this.f43888w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
