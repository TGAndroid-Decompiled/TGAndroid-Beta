package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f47571w;
        public float f47572x;
        public float f47573y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f47572x = f7;
            this.f47573y = f10;
            this.f47571w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47571w;
        }

        @Override
        public float getX() {
            return this.f47572x;
        }

        @Override
        public float getY() {
            return this.f47573y;
        }

        public String toString() {
            return "Float{x=" + this.f47572x + ", y=" + this.f47573y + ", w=" + this.f47571w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
