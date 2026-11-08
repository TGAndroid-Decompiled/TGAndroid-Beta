package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f54585w;
        public float f54586x;
        public float f54587y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f54586x = f10;
            this.f54587y = f11;
            this.f54585w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f54585w;
        }

        @Override
        public float getX() {
            return this.f54586x;
        }

        @Override
        public float getY() {
            return this.f54587y;
        }

        public String toString() {
            return "Float{x=" + this.f54586x + ", y=" + this.f54587y + ", w=" + this.f54585w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
