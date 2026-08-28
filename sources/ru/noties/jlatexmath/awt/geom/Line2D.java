package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f47270x1;
        public double f47271x2;
        public double f47272y1;
        public double f47273y2;

        public Float() {
        }

        public void setLine(double d, double d9, double d10, double d11) {
            this.f47270x1 = d;
            this.f47272y1 = d9;
            this.f47271x2 = d10;
            this.f47273y2 = d11;
        }

        public String toString() {
            return "Float{x1=" + this.f47270x1 + ", y1=" + this.f47272y1 + ", x2=" + this.f47271x2 + ", y2=" + this.f47273y2 + '}';
        }

        public Float(float f10, float f11, float f12, float f13) {
            setLine(f10, f11, f12, f13);
        }
    }
}
