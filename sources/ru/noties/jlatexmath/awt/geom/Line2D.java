package ru.noties.jlatexmath.awt.geom;
public class Line2D {

    public static class Float {
        public double f54548x1;
        public double f54549x2;
        public double f54550y1;
        public double f54551y2;

        public Float() {
        }

        public void setLine(double d, double d10, double d11, double d12) {
            this.f54548x1 = d;
            this.f54550y1 = d10;
            this.f54549x2 = d11;
            this.f54551y2 = d12;
        }

        public String toString() {
            return "Float{x1=" + this.f54548x1 + ", y1=" + this.f54550y1 + ", x2=" + this.f54549x2 + ", y2=" + this.f54551y2 + '}';
        }

        public Float(float f10, float f11, float f12, float f13) {
            setLine(f10, f11, f12, f13);
        }
    }
}
