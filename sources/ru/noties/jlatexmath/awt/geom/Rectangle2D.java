package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f45671w;
        public float f45672x;
        public float f45673y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f45672x = f7;
            this.f45673y = f10;
            this.f45671w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f45671w;
        }

        @Override
        public float getX() {
            return this.f45672x;
        }

        @Override
        public float getY() {
            return this.f45673y;
        }

        public String toString() {
            return "Float{x=" + this.f45672x + ", y=" + this.f45673y + ", w=" + this.f45671w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
