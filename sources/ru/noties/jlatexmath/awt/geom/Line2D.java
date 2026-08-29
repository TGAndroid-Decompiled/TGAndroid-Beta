package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f47461x1;
        public double f47462x2;
        public double f47463y1;
        public double f47464y2;

        public Float() {
        }

        public void setLine(double d, double d10, double d11, double d12) {
            this.f47461x1 = d;
            this.f47463y1 = d10;
            this.f47462x2 = d11;
            this.f47464y2 = d12;
        }

        public String toString() {
            return "Float{x1=" + this.f47461x1 + ", y1=" + this.f47463y1 + ", x2=" + this.f47462x2 + ", y2=" + this.f47464y2 + '}';
        }

        public Float(float f9, float f10, float f11, float f12) {
            setLine(f9, f10, f11, f12);
        }
    }
}
