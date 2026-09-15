package ru.noties.jlatexmath.awt.geom;
public class RoundRectangle2D {

    public static class Float {
        public float archeight;
        public float arcwidth;
        public float height;
        public float width;
        public float f42613x;
        public float f42614y;

        public Float(float f7, float f10, float f11, float f12, float f13, float f14) {
            this.f42613x = f7;
            this.f42614y = f10;
            this.width = f11;
            this.height = f12;
            this.arcwidth = f13;
            this.archeight = f14;
        }

        public String toString() {
            return "Float{x=" + this.f42613x + ", y=" + this.f42614y + ", width=" + this.width + ", height=" + this.height + ", arcwidth=" + this.arcwidth + ", archeight=" + this.archeight + '}';
        }
    }
}
