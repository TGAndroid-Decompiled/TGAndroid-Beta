package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f56725w;
        public float f56726x;
        public float f56727y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f56726x = f10;
            this.f56727y = f11;
            this.f56725w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f56725w;
        }

        @Override
        public float getX() {
            return this.f56726x;
        }

        @Override
        public float getY() {
            return this.f56727y;
        }

        public String toString() {
            return "Float{x=" + this.f56726x + ", y=" + this.f56727y + ", w=" + this.f56725w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
