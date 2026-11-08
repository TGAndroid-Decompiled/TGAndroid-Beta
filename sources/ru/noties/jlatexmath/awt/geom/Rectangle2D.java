package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f54584w;
        public float f54585x;
        public float f54586y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f54585x = f10;
            this.f54586y = f11;
            this.f54584w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f54584w;
        }

        @Override
        public float getX() {
            return this.f54585x;
        }

        @Override
        public float getY() {
            return this.f54586y;
        }

        public String toString() {
            return "Float{x=" + this.f54585x + ", y=" + this.f54586y + ", w=" + this.f54584w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
