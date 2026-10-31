package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f47836w;
        public float f47837x;
        public float f47838y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f47837x = f7;
            this.f47838y = f10;
            this.f47836w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f47836w;
        }

        @Override
        public float getX() {
            return this.f47837x;
        }

        @Override
        public float getY() {
            return this.f47838y;
        }

        public String toString() {
            return "Float{x=" + this.f47837x + ", y=" + this.f47838y + ", w=" + this.f47836w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
