package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f56145x1;
        public double f56146x2;
        public double f56147y1;
        public double f56148y2;

        public Float() {
        }

        public void setLine(double d, double d2, double d10, double d11) {
            this.f56145x1 = d;
            this.f56147y1 = d2;
            this.f56146x2 = d10;
            this.f56148y2 = d11;
        }

        public String toString() {
            return "Float{x1=" + this.f56145x1 + ", y1=" + this.f56147y1 + ", x2=" + this.f56146x2 + ", y2=" + this.f56148y2 + '}';
        }

        public Float(float f10, float f11, float f12, float f13) {
            setLine(f10, f11, f12, f13);
        }
    }
}
