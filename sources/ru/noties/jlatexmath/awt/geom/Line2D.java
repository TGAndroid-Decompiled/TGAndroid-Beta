package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f45692x1;
        public double f45693x2;
        public double f45694y1;
        public double f45695y2;

        public Float() {
        }

        public void setLine(double d, double d10, double d11, double d12) {
            this.f45692x1 = d;
            this.f45694y1 = d10;
            this.f45693x2 = d11;
            this.f45695y2 = d12;
        }

        public String toString() {
            return "Float{x1=" + this.f45692x1 + ", y1=" + this.f45694y1 + ", x2=" + this.f45693x2 + ", y2=" + this.f45695y2 + '}';
        }

        public Float(float f7, float f10, float f11, float f12) {
            setLine(f7, f10, f11, f12);
        }
    }
}
