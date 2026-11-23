package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f56764x1;
        public double f56765x2;
        public double f56766y1;
        public double f56767y2;

        public Float() {
        }

        public void setLine(double d, double d2, double d10, double d11) {
            this.f56764x1 = d;
            this.f56766y1 = d2;
            this.f56765x2 = d10;
            this.f56767y2 = d11;
        }

        public String toString() {
            return "Float{x1=" + this.f56764x1 + ", y1=" + this.f56766y1 + ", x2=" + this.f56765x2 + ", y2=" + this.f56767y2 + '}';
        }

        public Float(float f10, float f11, float f12, float f13) {
            setLine(f10, f11, f12, f13);
        }
    }
}
