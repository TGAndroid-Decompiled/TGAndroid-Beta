package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f47847w;
        public float f47848x;
        public float f47849y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f47848x = f7;
            this.f47849y = f10;
            this.f47847w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47847w;
        }

        @Override
        public float getX() {
            return this.f47848x;
        }

        @Override
        public float getY() {
            return this.f47849y;
        }

        public String toString() {
            return "Float{x=" + this.f47848x + ", y=" + this.f47849y + ", w=" + this.f47847w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
