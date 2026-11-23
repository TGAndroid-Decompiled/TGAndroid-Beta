package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f56770w;
        public float f56771x;
        public float f56772y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f56771x = f10;
            this.f56772y = f11;
            this.f56770w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f56770w;
        }

        @Override
        public float getX() {
            return this.f56771x;
        }

        @Override
        public float getY() {
            return this.f56772y;
        }

        public String toString() {
            return "Float{x=" + this.f56771x + ", y=" + this.f56772y + ", w=" + this.f56770w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
