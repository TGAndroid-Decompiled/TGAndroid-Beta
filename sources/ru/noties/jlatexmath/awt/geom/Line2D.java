package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f56760x1;
        public double f56761x2;
        public double f56762y1;
        public double f56763y2;

        public Float() {
        }

        public void setLine(double d, double d2, double d10, double d11) {
            this.f56760x1 = d;
            this.f56762y1 = d2;
            this.f56761x2 = d10;
            this.f56763y2 = d11;
        }

        public String toString() {
            return "Float{x1=" + this.f56760x1 + ", y1=" + this.f56762y1 + ", x2=" + this.f56761x2 + ", y2=" + this.f56763y2 + '}';
        }

        public Float(float f10, float f11, float f12, float f13) {
            setLine(f10, f11, f12, f13);
        }
    }
}
