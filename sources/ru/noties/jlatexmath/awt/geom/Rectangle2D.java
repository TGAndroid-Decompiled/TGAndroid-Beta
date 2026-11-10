package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f54596w;
        public float f54597x;
        public float f54598y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f54597x = f10;
            this.f54598y = f11;
            this.f54596w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f54596w;
        }

        @Override
        public float getX() {
            return this.f54597x;
        }

        @Override
        public float getY() {
            return this.f54598y;
        }

        public String toString() {
            return "Float{x=" + this.f54597x + ", y=" + this.f54598y + ", w=" + this.f54596w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
