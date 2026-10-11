package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f47661w;
        public float f47662x;
        public float f47663y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f47662x = f7;
            this.f47663y = f10;
            this.f47661w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47661w;
        }

        @Override
        public float getX() {
            return this.f47662x;
        }

        @Override
        public float getY() {
            return this.f47663y;
        }

        public String toString() {
            return "Float{x=" + this.f47662x + ", y=" + this.f47663y + ", w=" + this.f47661w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
