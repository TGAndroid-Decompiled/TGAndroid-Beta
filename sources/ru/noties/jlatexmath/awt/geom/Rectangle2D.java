package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f47615w;
        public float f47616x;
        public float f47617y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f47616x = f7;
            this.f47617y = f10;
            this.f47615w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47615w;
        }

        @Override
        public float getX() {
            return this.f47616x;
        }

        @Override
        public float getY() {
            return this.f47617y;
        }

        public String toString() {
            return "Float{x=" + this.f47616x + ", y=" + this.f47617y + ", w=" + this.f47615w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
