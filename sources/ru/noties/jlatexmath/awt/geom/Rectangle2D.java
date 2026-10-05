package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f46469w;
        public float f46470x;
        public float f46471y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f46470x = f7;
            this.f46471y = f10;
            this.f46469w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f46469w;
        }

        @Override
        public float getX() {
            return this.f46470x;
        }

        @Override
        public float getY() {
            return this.f46471y;
        }

        public String toString() {
            return "Float{x=" + this.f46470x + ", y=" + this.f46471y + ", w=" + this.f46469w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
