package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f47695w;
        public float f47696x;
        public float f47697y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f47696x = f7;
            this.f47697y = f10;
            this.f47695w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47695w;
        }

        @Override
        public float getX() {
            return this.f47696x;
        }

        @Override
        public float getY() {
            return this.f47697y;
        }

        public String toString() {
            return "Float{x=" + this.f47696x + ", y=" + this.f47697y + ", w=" + this.f47695w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
