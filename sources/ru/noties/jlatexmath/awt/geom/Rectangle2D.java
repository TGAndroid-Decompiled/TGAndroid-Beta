package ru.noties.jlatexmath.awt.geom;

public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;

        public float f47641w;

        public float f47642x;

        public float f47643y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f47642x = f10;
            this.f47643y = f11;
            this.f47641w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47641w;
        }

        @Override
        public float getX() {
            return this.f47642x;
        }

        @Override
        public float getY() {
            return this.f47643y;
        }

        public String toString() {
            return "Float{x=" + this.f47642x + ", y=" + this.f47643y + ", w=" + this.f47641w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
