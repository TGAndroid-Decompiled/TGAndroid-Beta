package r1;

import org.telegram.ui.Cells.i;
public final class h {
    public double f56335a;
    public double f56336b;
    public boolean f56337c;
    public double d;
    public double f56338e;
    public double f56339f;
    public double f56340g;
    public double h;
    public double f56341i;
    public final i f56342j;

    public h() {
        this.f56335a = Math.sqrt(1500.0d);
        this.f56336b = 0.5d;
        this.f56337c = false;
        this.f56341i = Double.MAX_VALUE;
        this.f56342j = new Object();
    }

    public final void a(float f10) {
        if (f10 >= 0.0f) {
            this.f56336b = f10;
            this.f56337c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void b(float f10) {
        if (f10 > 0.0f) {
            this.f56335a = Math.sqrt(f10);
            this.f56337c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final i c(double d, double d2, long j3) {
        double sin;
        double cos;
        if (!this.f56337c) {
            if (this.f56341i != Double.MAX_VALUE) {
                double d10 = this.f56336b;
                if (d10 > 1.0d) {
                    double d11 = this.f56335a;
                    this.f56339f = (Math.sqrt((d10 * d10) - 1.0d) * d11) + ((-d10) * d11);
                    double d12 = this.f56336b;
                    double d13 = this.f56335a;
                    this.f56340g = ((-d12) * d13) - (Math.sqrt((d12 * d12) - 1.0d) * d13);
                } else if (d10 >= 0.0d && d10 < 1.0d) {
                    this.h = Math.sqrt(1.0d - (d10 * d10)) * this.f56335a;
                }
                this.f56337c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d14 = j3 / 1000.0d;
        double d15 = d - this.f56341i;
        double d16 = this.f56336b;
        int i7 = (d16 > 1.0d ? 1 : (d16 == 1.0d ? 0 : -1));
        if (i7 > 0) {
            double d17 = this.f56340g;
            double d18 = ((d17 * d15) - d2) / (d17 - this.f56339f);
            double d19 = d15 - d18;
            sin = (Math.pow(2.718281828459045d, this.f56339f * d14) * d18) + (Math.pow(2.718281828459045d, d17 * d14) * d19);
            double d20 = this.f56340g;
            double pow = Math.pow(2.718281828459045d, d20 * d14) * d19 * d20;
            double d21 = this.f56339f;
            cos = (Math.pow(2.718281828459045d, d21 * d14) * d18 * d21) + pow;
        } else if (i7 == 0) {
            double d22 = this.f56335a;
            double d23 = (d22 * d15) + d2;
            double d24 = (d23 * d14) + d15;
            double pow2 = Math.pow(2.718281828459045d, (-d22) * d14) * d24;
            double pow3 = Math.pow(2.718281828459045d, (-this.f56335a) * d14) * d24;
            double d25 = -this.f56335a;
            cos = (Math.pow(2.718281828459045d, d25 * d14) * d23) + (pow3 * d25);
            sin = pow2;
        } else {
            double d26 = 1.0d / this.h;
            double d27 = this.f56335a;
            double d28 = ((d16 * d27 * d15) + d2) * d26;
            sin = ((Math.sin(this.h * d14) * d28) + (Math.cos(this.h * d14) * d15)) * Math.pow(2.718281828459045d, (-d16) * d27 * d14);
            double d29 = this.f56335a;
            double d30 = this.f56336b;
            double d31 = (-d29) * sin * d30;
            double pow4 = Math.pow(2.718281828459045d, (-d30) * d29 * d14);
            double d32 = this.h;
            double sin2 = Math.sin(d32 * d14) * (-d32) * d15;
            double d33 = this.h;
            cos = (((Math.cos(d33 * d14) * d28 * d33) + sin2) * pow4) + d31;
        }
        i iVar = this.f56342j;
        iVar.f30770a = (float) (sin + this.f56341i);
        iVar.f30771b = (float) cos;
        return iVar;
    }

    public h(float f10) {
        this.f56335a = Math.sqrt(1500.0d);
        this.f56336b = 0.5d;
        this.f56337c = false;
        this.f56342j = new Object();
        this.f56341i = f10;
    }
}
