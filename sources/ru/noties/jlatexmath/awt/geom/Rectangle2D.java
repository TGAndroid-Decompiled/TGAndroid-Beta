package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f42561w;
        public float f42562x;
        public float f42563y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f42562x = f7;
            this.f42563y = f10;
            this.f42561w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f42561w;
        }

        @Override
        public float getX() {
            return this.f42562x;
        }

        @Override
        public float getY() {
            return this.f42563y;
        }

        public String toString() {
            return "Float{x=" + this.f42562x + ", y=" + this.f42563y + ", w=" + this.f42561w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
