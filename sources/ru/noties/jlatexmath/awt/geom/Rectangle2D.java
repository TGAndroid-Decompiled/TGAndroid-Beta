package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f41544w;
        public float f41545x;
        public float f41546y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f41545x = f7;
            this.f41546y = f10;
            this.f41544w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f41544w;
        }

        @Override
        public float getX() {
            return this.f41545x;
        }

        @Override
        public float getY() {
            return this.f41546y;
        }

        public String toString() {
            return "Float{x=" + this.f41545x + ", y=" + this.f41546y + ", w=" + this.f41544w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
