package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f46455w;
        public float f46456x;
        public float f46457y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f46456x = f7;
            this.f46457y = f10;
            this.f46455w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f46455w;
        }

        @Override
        public float getX() {
            return this.f46456x;
        }

        @Override
        public float getY() {
            return this.f46457y;
        }

        public String toString() {
            return "Float{x=" + this.f46456x + ", y=" + this.f46457y + ", w=" + this.f46455w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
