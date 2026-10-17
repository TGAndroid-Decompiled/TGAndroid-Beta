package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f45881w;
        public float f45882x;
        public float f45883y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f45882x = f7;
            this.f45883y = f10;
            this.f45881w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f45881w;
        }

        @Override
        public float getX() {
            return this.f45882x;
        }

        @Override
        public float getY() {
            return this.f45883y;
        }

        public String toString() {
            return "Float{x=" + this.f45882x + ", y=" + this.f45883y + ", w=" + this.f45881w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
