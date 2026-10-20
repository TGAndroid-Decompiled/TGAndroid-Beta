package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f45854x1;
        public double f45855x2;
        public double f45856y1;
        public double f45857y2;

        public Float() {
        }

        public void setLine(double d, double d10, double d11, double d12) {
            this.f45854x1 = d;
            this.f45856y1 = d10;
            this.f45855x2 = d11;
            this.f45857y2 = d12;
        }

        public String toString() {
            return "Float{x1=" + this.f45854x1 + ", y1=" + this.f45856y1 + ", x2=" + this.f45855x2 + ", y2=" + this.f45857y2 + '}';
        }

        public Float(float f7, float f10, float f11, float f12) {
            setLine(f7, f10, f11, f12);
        }
    }
}
