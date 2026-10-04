package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f46449x1;
        public double f46450x2;
        public double f46451y1;
        public double f46452y2;

        public Float() {
        }

        public void setLine(double d, double d10, double d11, double d12) {
            this.f46449x1 = d;
            this.f46451y1 = d10;
            this.f46450x2 = d11;
            this.f46452y2 = d12;
        }

        public String toString() {
            return "Float{x1=" + this.f46449x1 + ", y1=" + this.f46451y1 + ", x2=" + this.f46450x2 + ", y2=" + this.f46452y2 + '}';
        }

        public Float(float f7, float f10, float f11, float f12) {
            setLine(f7, f10, f11, f12);
        }
    }
}
