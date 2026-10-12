package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f44781w;
        public float f44782x;
        public float f44783y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f44782x = f7;
            this.f44783y = f10;
            this.f44781w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f44781w;
        }

        @Override
        public float getX() {
            return this.f44782x;
        }

        @Override
        public float getY() {
            return this.f44783y;
        }

        public String toString() {
            return "Float{x=" + this.f44782x + ", y=" + this.f44783y + ", w=" + this.f44781w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
