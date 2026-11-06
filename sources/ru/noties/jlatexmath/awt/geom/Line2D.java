package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f54462x1;
        public double f54463x2;
        public double f54464y1;
        public double f54465y2;

        public Float() {
        }

        public void setLine(double d, double d2, double d10, double d11) {
            this.f54462x1 = d;
            this.f54464y1 = d2;
            this.f54463x2 = d10;
            this.f54465y2 = d11;
        }

        public String toString() {
            return "Float{x1=" + this.f54462x1 + ", y1=" + this.f54464y1 + ", x2=" + this.f54463x2 + ", y2=" + this.f54465y2 + '}';
        }

        public Float(float f10, float f11, float f12, float f13) {
            setLine(f10, f11, f12, f13);
        }
    }
}
