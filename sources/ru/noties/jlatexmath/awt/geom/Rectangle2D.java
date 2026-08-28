package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f47276w;
        public float f47277x;
        public float f47278y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f47277x = f10;
            this.f47278y = f11;
            this.f47276w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47276w;
        }

        @Override
        public float getX() {
            return this.f47277x;
        }

        @Override
        public float getY() {
            return this.f47278y;
        }

        public String toString() {
            return "Float{x=" + this.f47277x + ", y=" + this.f47278y + ", w=" + this.f47276w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
