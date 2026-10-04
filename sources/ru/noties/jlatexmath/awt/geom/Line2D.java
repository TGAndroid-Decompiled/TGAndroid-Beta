package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f46448x1;
        public double f46449x2;
        public double f46450y1;
        public double f46451y2;

        public Float() {
        }

        public void setLine(double d, double d10, double d11, double d12) {
            this.f46448x1 = d;
            this.f46450y1 = d10;
            this.f46449x2 = d11;
            this.f46451y2 = d12;
        }

        public String toString() {
            return "Float{x1=" + this.f46448x1 + ", y1=" + this.f46450y1 + ", x2=" + this.f46449x2 + ", y2=" + this.f46451y2 + '}';
        }

        public Float(float f7, float f10, float f11, float f12) {
            setLine(f7, f10, f11, f12);
        }
    }
}
