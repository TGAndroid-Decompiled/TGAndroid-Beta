package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f47467w;
        public float f47468x;
        public float f47469y;

        public Float(float f9, float f10, float f11, float f12) {
            this.f47468x = f9;
            this.f47469y = f10;
            this.f47467w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47467w;
        }

        @Override
        public float getX() {
            return this.f47468x;
        }

        @Override
        public float getY() {
            return this.f47469y;
        }

        public String toString() {
            return "Float{x=" + this.f47468x + ", y=" + this.f47469y + ", w=" + this.f47467w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
