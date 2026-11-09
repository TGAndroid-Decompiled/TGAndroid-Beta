package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f54597w;
        public float f54598x;
        public float f54599y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f54598x = f10;
            this.f54599y = f11;
            this.f54597w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f54597w;
        }

        @Override
        public float getX() {
            return this.f54598x;
        }

        @Override
        public float getY() {
            return this.f54599y;
        }

        public String toString() {
            return "Float{x=" + this.f54598x + ", y=" + this.f54599y + ", w=" + this.f54597w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
