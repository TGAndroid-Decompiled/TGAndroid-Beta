package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f46865w;
        public float f46866x;
        public float f46867y;

        public Float(float f10, float f11, float f12, float f13) {
            this.f46866x = f10;
            this.f46867y = f11;
            this.f46865w = f12;
            this.h = f13;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f46865w;
        }

        @Override
        public float getX() {
            return this.f46866x;
        }

        @Override
        public float getY() {
            return this.f46867y;
        }

        public String toString() {
            return "Float{x=" + this.f46866x + ", y=" + this.f46867y + ", w=" + this.f46865w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
