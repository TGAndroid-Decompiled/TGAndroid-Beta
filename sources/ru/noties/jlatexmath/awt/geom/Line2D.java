package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f43882x1;
        public double f43883x2;
        public double f43884y1;
        public double f43885y2;

        public Float() {
        }

        public void setLine(double d, double d10, double d11, double d12) {
            this.f43882x1 = d;
            this.f43884y1 = d10;
            this.f43883x2 = d11;
            this.f43885y2 = d12;
        }

        public String toString() {
            return "Float{x1=" + this.f43882x1 + ", y1=" + this.f43884y1 + ", x2=" + this.f43883x2 + ", y2=" + this.f43885y2 + '}';
        }

        public Float(float f10, float f11, float f12, float f13) {
            setLine(f10, f11, f12, f13);
        }
    }
}
