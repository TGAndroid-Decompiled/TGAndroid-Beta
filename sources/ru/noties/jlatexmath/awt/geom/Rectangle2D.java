package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f46284w;
        public float f46285x;
        public float f46286y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f46285x = f7;
            this.f46286y = f10;
            this.f46284w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f46284w;
        }

        @Override
        public float getX() {
            return this.f46285x;
        }

        @Override
        public float getY() {
            return this.f46286y;
        }

        public String toString() {
            return "Float{x=" + this.f46285x + ", y=" + this.f46286y + ", w=" + this.f46284w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
