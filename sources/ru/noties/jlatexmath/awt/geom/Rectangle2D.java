package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f45699w;
        public float f45700x;
        public float f45701y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f45700x = f7;
            this.f45701y = f10;
            this.f45699w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f45699w;
        }

        @Override
        public float getX() {
            return this.f45700x;
        }

        @Override
        public float getY() {
            return this.f45701y;
        }

        public String toString() {
            return "Float{x=" + this.f45700x + ", y=" + this.f45701y + ", w=" + this.f45699w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
