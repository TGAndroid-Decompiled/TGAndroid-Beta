package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f54468w;
        public float f54469x;
        public float f54470y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f54469x = f10;
            this.f54470y = f11;
            this.f54468w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f54468w;
        }

        @Override
        public float getX() {
            return this.f54469x;
        }

        @Override
        public float getY() {
            return this.f54470y;
        }

        public String toString() {
            return "Float{x=" + this.f54469x + ", y=" + this.f54470y + ", w=" + this.f54468w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
