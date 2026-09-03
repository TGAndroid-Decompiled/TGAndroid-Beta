package ru.noties.jlatexmath.awt.geom;
public class RoundRectangle2D {

    public static class Float {
        public float archeight;
        public float arcwidth;
        public float height;
        public float width;
        public float f43957x;
        public float f43958y;

        public Float(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f43957x = f10;
            this.f43958y = f11;
            this.width = f12;
            this.height = f13;
            this.arcwidth = f14;
            this.archeight = f15;
        }

        public String toString() {
            return "Float{x=" + this.f43957x + ", y=" + this.f43958y + ", width=" + this.width + ", height=" + this.height + ", arcwidth=" + this.arcwidth + ", archeight=" + this.archeight + '}';
        }
    }
}
