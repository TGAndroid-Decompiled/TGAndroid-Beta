package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f42632w;
        public float f42633x;
        public float f42634y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f42633x = f7;
            this.f42634y = f10;
            this.f42632w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f42632w;
        }

        @Override
        public float getX() {
            return this.f42633x;
        }

        @Override
        public float getY() {
            return this.f42634y;
        }

        public String toString() {
            return "Float{x=" + this.f42633x + ", y=" + this.f42634y + ", w=" + this.f42632w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
