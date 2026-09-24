package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f42880w;
        public float f42881x;
        public float f42882y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f42881x = f7;
            this.f42882y = f10;
            this.f42880w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f42880w;
        }

        @Override
        public float getX() {
            return this.f42881x;
        }

        @Override
        public float getY() {
            return this.f42882y;
        }

        public String toString() {
            return "Float{x=" + this.f42881x + ", y=" + this.f42882y + ", w=" + this.f42880w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
