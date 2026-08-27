package ru.noties.jlatexmath.awt.geom;

public class Line2D {

    public static class Float {

        public double f47635x1;

        public double f47636x2;

        public double f47637y1;

        public double f47638y2;

        public Float() {
        }

        public void setLine(double d, double d10, double d11, double d12) {
            this.f47635x1 = d;
            this.f47637y1 = d10;
            this.f47636x2 = d11;
            this.f47638y2 = d12;
        }

        public String toString() {
            return "Float{x1=" + this.f47635x1 + ", y1=" + this.f47637y1 + ", x2=" + this.f47636x2 + ", y2=" + this.f47638y2 + '}';
        }

        public Float(float f10, float f11, float f12, float f13) {
            setLine(f10, f11, f12, f13);
        }
    }
}
