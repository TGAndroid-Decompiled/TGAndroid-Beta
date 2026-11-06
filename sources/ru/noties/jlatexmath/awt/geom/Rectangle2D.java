package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f54493w;
        public float f54494x;
        public float f54495y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f54494x = f10;
            this.f54495y = f11;
            this.f54493w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f54493w;
        }

        @Override
        public float getX() {
            return this.f54494x;
        }

        @Override
        public float getY() {
            return this.f54495y;
        }

        public String toString() {
            return "Float{x=" + this.f54494x + ", y=" + this.f54495y + ", w=" + this.f54493w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
