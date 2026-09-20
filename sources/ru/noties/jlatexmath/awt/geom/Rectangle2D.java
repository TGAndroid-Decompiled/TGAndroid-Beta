package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f42908w;
        public float f42909x;
        public float f42910y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f42909x = f7;
            this.f42910y = f10;
            this.f42908w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f42908w;
        }

        @Override
        public float getX() {
            return this.f42909x;
        }

        @Override
        public float getY() {
            return this.f42910y;
        }

        public String toString() {
            return "Float{x=" + this.f42909x + ", y=" + this.f42910y + ", w=" + this.f42908w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
