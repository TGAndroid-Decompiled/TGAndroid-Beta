package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f47569w;
        public float f47570x;
        public float f47571y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f47570x = f7;
            this.f47571y = f10;
            this.f47569w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47569w;
        }

        @Override
        public float getX() {
            return this.f47570x;
        }

        @Override
        public float getY() {
            return this.f47571y;
        }

        public String toString() {
            return "Float{x=" + this.f47570x + ", y=" + this.f47571y + ", w=" + this.f47569w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
