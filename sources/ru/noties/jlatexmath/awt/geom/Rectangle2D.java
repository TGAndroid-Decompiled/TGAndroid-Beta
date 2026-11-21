package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f56766w;
        public float f56767x;
        public float f56768y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f56767x = f10;
            this.f56768y = f11;
            this.f56766w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f56766w;
        }

        @Override
        public float getX() {
            return this.f56767x;
        }

        @Override
        public float getY() {
            return this.f56768y;
        }

        public String toString() {
            return "Float{x=" + this.f56767x + ", y=" + this.f56768y + ", w=" + this.f56766w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
