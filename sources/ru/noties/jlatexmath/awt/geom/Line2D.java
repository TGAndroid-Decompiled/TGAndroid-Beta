package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f42996x1;
        public double f42997x2;
        public double f42998y1;
        public double f42999y2;

        public Float() {
        }

        public void setLine(double d, double d10, double d11, double d12) {
            this.f42996x1 = d;
            this.f42998y1 = d10;
            this.f42997x2 = d11;
            this.f42999y2 = d12;
        }

        public String toString() {
            return "Float{x1=" + this.f42996x1 + ", y1=" + this.f42998y1 + ", x2=" + this.f42997x2 + ", y2=" + this.f42999y2 + '}';
        }

        public Float(float f7, float f10, float f11, float f12) {
            setLine(f7, f10, f11, f12);
        }
    }
}
