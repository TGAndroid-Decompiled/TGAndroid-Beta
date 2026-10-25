package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f47633w;
        public float f47634x;
        public float f47635y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f47634x = f7;
            this.f47635y = f10;
            this.f47633w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47633w;
        }

        @Override
        public float getX() {
            return this.f47634x;
        }

        @Override
        public float getY() {
            return this.f47635y;
        }

        public String toString() {
            return "Float{x=" + this.f47634x + ", y=" + this.f47635y + ", w=" + this.f47633w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
