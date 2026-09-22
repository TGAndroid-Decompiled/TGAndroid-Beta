package ru.noties.jlatexmath.awt.geom;
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float f42606w;
        public float f42607x;
        public float f42608y;

        public Float(float f7, float f10, float f11, float f12) {
            this.f42607x = f7;
            this.f42608y = f10;
            this.f42606w = f11;
            this.h = f12;
        }

        @Override
        public float getHeight() {
            return this.h;
        }

        @Override
        public float getWidth() {
            return this.f42606w;
        }

        @Override
        public float getX() {
            return this.f42607x;
        }

        @Override
        public float getY() {
            return this.f42608y;
        }

        public String toString() {
            return "Float{x=" + this.f42607x + ", y=" + this.f42608y + ", w=" + this.f42606w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
