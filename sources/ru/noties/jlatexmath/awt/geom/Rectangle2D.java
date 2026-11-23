package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f56848w;
        public float f56849x;
        public float f56850y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f56849x = f10;
            this.f56850y = f11;
            this.f56848w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f56848w;
        }

        @Override
        public float getX() {
            return this.f56849x;
        }

        @Override
        public float getY() {
            return this.f56850y;
        }

        public String toString() {
            return "Float{x=" + this.f56849x + ", y=" + this.f56850y + ", w=" + this.f56848w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
