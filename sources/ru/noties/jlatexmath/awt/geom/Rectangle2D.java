package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f56735w;
        public float f56736x;
        public float f56737y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f56736x = f10;
            this.f56737y = f11;
            this.f56735w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f56735w;
        }

        @Override
        public float getX() {
            return this.f56736x;
        }

        @Override
        public float getY() {
            return this.f56737y;
        }

        public String toString() {
            return "Float{x=" + this.f56736x + ", y=" + this.f56737y + ", w=" + this.f56735w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
