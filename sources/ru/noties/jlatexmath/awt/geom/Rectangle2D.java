package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f46285w;
        public float f46286x;
        public float f46287y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f46286x = f7;
            this.f46287y = f10;
            this.f46285w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f46285w;
        }

        @Override
        public float getX() {
            return this.f46286x;
        }

        @Override
        public float getY() {
            return this.f46287y;
        }

        public String toString() {
            return "Float{x=" + this.f46286x + ", y=" + this.f46287y + ", w=" + this.f46285w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
