package ru.noties.jlatexmath.awt.geom;
public class RoundRectangle2D {

    public static class Float {
        public float archeight;
        public float arcwidth;
        public float height;
        public float width;
        public float f54599x;
        public float f54600y;

        public Float(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f54599x = f10;
            this.f54600y = f11;
            this.width = f12;
            this.height = f13;
            this.arcwidth = f14;
            this.archeight = f15;
        }

        public String toString() {
            return "Float{x=" + this.f54599x + ", y=" + this.f54600y + ", width=" + this.width + ", height=" + this.height + ", arcwidth=" + this.arcwidth + ", archeight=" + this.archeight + '}';
        }
    }
}
