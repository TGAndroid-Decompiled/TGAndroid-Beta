package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f42894w;
        public float f42895x;
        public float f42896y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f42895x = f7;
            this.f42896y = f10;
            this.f42894w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f42894w;
        }

        @Override
        public float getX() {
            return this.f42895x;
        }

        @Override
        public float getY() {
            return this.f42896y;
        }

        public String toString() {
            return "Float{x=" + this.f42895x + ", y=" + this.f42896y + ", w=" + this.f42894w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
