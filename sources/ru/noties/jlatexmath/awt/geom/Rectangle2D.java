package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f47810w;
        public float f47811x;
        public float f47812y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f47811x = f7;
            this.f47812y = f10;
            this.f47810w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47810w;
        }

        @Override
        public float getX() {
            return this.f47811x;
        }

        @Override
        public float getY() {
            return this.f47812y;
        }

        public String toString() {
            return "Float{x=" + this.f47811x + ", y=" + this.f47812y + ", w=" + this.f47810w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
