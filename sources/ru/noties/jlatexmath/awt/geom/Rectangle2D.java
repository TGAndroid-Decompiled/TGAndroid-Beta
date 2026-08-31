package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f46834w;
        public float f46835x;
        public float f46836y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f46835x = f10;
            this.f46836y = f11;
            this.f46834w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f46834w;
        }

        @Override
        public float getX() {
            return this.f46835x;
        }

        @Override
        public float getY() {
            return this.f46836y;
        }

        public String toString() {
            return "Float{x=" + this.f46835x + ", y=" + this.f46836y + ", w=" + this.f46834w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
