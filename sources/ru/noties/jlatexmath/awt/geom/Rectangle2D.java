package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f45864w;
        public float f45865x;
        public float f45866y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f45865x = f7;
            this.f45866y = f10;
            this.f45864w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f45864w;
        }

        @Override
        public float getX() {
            return this.f45865x;
        }

        @Override
        public float getY() {
            return this.f45866y;
        }

        public String toString() {
            return "Float{x=" + this.f45865x + ", y=" + this.f45866y + ", w=" + this.f45864w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
