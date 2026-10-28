package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f47671w;
        public float f47672x;
        public float f47673y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f47672x = f7;
            this.f47673y = f10;
            this.f47671w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47671w;
        }

        @Override
        public float getX() {
            return this.f47672x;
        }

        @Override
        public float getY() {
            return this.f47673y;
        }

        public String toString() {
            return "Float{x=" + this.f47672x + ", y=" + this.f47673y + ", w=" + this.f47671w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
