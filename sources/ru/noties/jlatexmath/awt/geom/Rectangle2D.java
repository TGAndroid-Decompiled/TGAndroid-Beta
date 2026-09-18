package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f42637w;
        public float f42638x;
        public float f42639y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f42638x = f7;
            this.f42639y = f10;
            this.f42637w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f42637w;
        }

        @Override
        public float getX() {
            return this.f42638x;
        }

        @Override
        public float getY() {
            return this.f42639y;
        }

        public String toString() {
            return "Float{x=" + this.f42638x + ", y=" + this.f42639y + ", w=" + this.f42637w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
