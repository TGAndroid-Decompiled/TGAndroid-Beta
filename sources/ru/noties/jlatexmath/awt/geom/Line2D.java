package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f46828x1;
        public double f46829x2;
        public double f46830y1;
        public double f46831y2;

        public Float() {
        }

        public void setLine(double d, double d10, double d11, double d12) {
            this.f46828x1 = d;
            this.f46830y1 = d10;
            this.f46829x2 = d11;
            this.f46831y2 = d12;
        }

        public String toString() {
            return "Float{x1=" + this.f46828x1 + ", y1=" + this.f46830y1 + ", x2=" + this.f46829x2 + ", y2=" + this.f46831y2 + '}';
        }

        public Float(float f10, float f11, float f12, float f13) {
            setLine(f10, f11, f12, f13);
        }
    }
}
