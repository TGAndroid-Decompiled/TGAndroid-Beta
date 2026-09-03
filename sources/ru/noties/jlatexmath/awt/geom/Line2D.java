package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f43948x1;
        public double f43949x2;
        public double f43950y1;
        public double f43951y2;

        public Float() {
        }

        public void setLine(double d, double d10, double d11, double d12) {
            this.f43948x1 = d;
            this.f43950y1 = d10;
            this.f43949x2 = d11;
            this.f43951y2 = d12;
        }

        public String toString() {
            return "Float{x1=" + this.f43948x1 + ", y1=" + this.f43950y1 + ", x2=" + this.f43949x2 + ", y2=" + this.f43951y2 + '}';
        }

        public Float(float f10, float f11, float f12, float f13) {
            setLine(f10, f11, f12, f13);
        }
    }
}
