package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f45670w;
        public float f45671x;
        public float f45672y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f45671x = f7;
            this.f45672y = f10;
            this.f45670w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f45670w;
        }

        @Override
        public float getX() {
            return this.f45671x;
        }

        @Override
        public float getY() {
            return this.f45672y;
        }

        public String toString() {
            return "Float{x=" + this.f45671x + ", y=" + this.f45672y + ", w=" + this.f45670w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
