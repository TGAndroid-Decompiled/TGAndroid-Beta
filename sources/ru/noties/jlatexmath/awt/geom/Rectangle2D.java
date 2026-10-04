package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f46462w;
        public float f46463x;
        public float f46464y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f46463x = f7;
            this.f46464y = f10;
            this.f46462w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f46462w;
        }

        @Override
        public float getX() {
            return this.f46463x;
        }

        @Override
        public float getY() {
            return this.f46464y;
        }

        public String toString() {
            return "Float{x=" + this.f46463x + ", y=" + this.f46464y + ", w=" + this.f46462w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
