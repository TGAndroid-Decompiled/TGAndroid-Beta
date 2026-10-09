package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f47565x1;
        public double f47566x2;
        public double f47567y1;
        public double f47568y2;

        public Float() {
        }

        public void setLine(double d, double d10, double d11, double d12) {
            this.f47565x1 = d;
            this.f47567y1 = d10;
            this.f47566x2 = d11;
            this.f47568y2 = d12;
        }

        public String toString() {
            return "Float{x1=" + this.f47565x1 + ", y1=" + this.f47567y1 + ", x2=" + this.f47566x2 + ", y2=" + this.f47568y2 + '}';
        }

        public Float(float f7, float f10, float f11, float f12) {
            setLine(f7, f10, f11, f12);
        }
    }
}
