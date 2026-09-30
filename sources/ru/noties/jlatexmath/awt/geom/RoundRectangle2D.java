package ru.noties.jlatexmath.awt.geom;
public class RoundRectangle2D {

    public static class Float {
        public float archeight;
        public float arcwidth;
        public float height;
        public float width;
        public float f43005x;
        public float f43006y;

        public Float(float f7, float f10, float f11, float f12, float f13, float f14) {
            this.f43005x = f7;
            this.f43006y = f10;
            this.width = f11;
            this.height = f12;
            this.arcwidth = f13;
            this.archeight = f14;
        }

        public String toString() {
            return "Float{x=" + this.f43005x + ", y=" + this.f43006y + ", width=" + this.width + ", height=" + this.height + ", arcwidth=" + this.arcwidth + ", archeight=" + this.archeight + '}';
        }
    }
}
