package ru.noties.jlatexmath.awt.geom;

public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float w;
        public float x;
        public float y;

        public Float(float f, float f2, float f3, float f4) {
            this.x = f;
            this.y = f2;
            this.w = f3;
            this.h = f4;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.w;
        }

        @Override
        public float getX() {
            return this.x;
        }

        @Override
        public float getY() {
            return this.y;
        }

        public String toString() {
            return "Float{x=" + this.x + ", y=" + this.y + ", w=" + this.w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
