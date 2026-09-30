package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f43002w;
        public float f43003x;
        public float f43004y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f43003x = f7;
            this.f43004y = f10;
            this.f43002w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f43002w;
        }

        @Override
        public float getX() {
            return this.f43003x;
        }

        @Override
        public float getY() {
            return this.f43004y;
        }

        public String toString() {
            return "Float{x=" + this.f43003x + ", y=" + this.f43004y + ", w=" + this.f43002w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
