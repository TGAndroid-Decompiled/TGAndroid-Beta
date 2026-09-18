package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f42864w;
        public float f42865x;
        public float f42866y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f42865x = f7;
            this.f42866y = f10;
            this.f42864w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f42864w;
        }

        @Override
        public float getX() {
            return this.f42865x;
        }

        @Override
        public float getY() {
            return this.f42866y;
        }

        public String toString() {
            return "Float{x=" + this.f42865x + ", y=" + this.f42866y + ", w=" + this.f42864w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
