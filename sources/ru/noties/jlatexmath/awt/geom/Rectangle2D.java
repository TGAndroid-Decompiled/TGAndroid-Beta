package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f42610w;
        public float f42611x;
        public float f42612y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f42611x = f7;
            this.f42612y = f10;
            this.f42610w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f42610w;
        }

        @Override
        public float getX() {
            return this.f42611x;
        }

        @Override
        public float getY() {
            return this.f42612y;
        }

        public String toString() {
            return "Float{x=" + this.f42611x + ", y=" + this.f42612y + ", w=" + this.f42610w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
