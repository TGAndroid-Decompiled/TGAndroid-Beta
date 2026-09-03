package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f43954w;
        public float f43955x;
        public float f43956y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f43955x = f10;
            this.f43956y = f11;
            this.f43954w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f43954w;
        }

        @Override
        public float getX() {
            return this.f43955x;
        }

        @Override
        public float getY() {
            return this.f43956y;
        }

        public String toString() {
            return "Float{x=" + this.f43955x + ", y=" + this.f43956y + ", w=" + this.f43954w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
