package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f56151w;
        public float f56152x;
        public float f56153y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f56152x = f10;
            this.f56153y = f11;
            this.f56151w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f56151w;
        }

        @Override
        public float getX() {
            return this.f56152x;
        }

        @Override
        public float getY() {
            return this.f56153y;
        }

        public String toString() {
            return "Float{x=" + this.f56152x + ", y=" + this.f56153y + ", w=" + this.f56151w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
