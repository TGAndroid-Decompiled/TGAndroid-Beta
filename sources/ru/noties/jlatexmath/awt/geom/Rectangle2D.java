package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f47802w;
        public float f47803x;
        public float f47804y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f47803x = f7;
            this.f47804y = f10;
            this.f47802w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47802w;
        }

        @Override
        public float getX() {
            return this.f47803x;
        }

        @Override
        public float getY() {
            return this.f47804y;
        }

        public String toString() {
            return "Float{x=" + this.f47803x + ", y=" + this.f47804y + ", w=" + this.f47802w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
