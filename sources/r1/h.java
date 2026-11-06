package r1;

import org.telegram.ui.Cells.i;
public final class h {
    public double f54176a;
    public double f54177b;
    public boolean f54178c;
    public double d;
    public double f54179e;
    public double f54180f;
    public double f54181g;
    public double h;
    public double f54182i;
    public final i f54183j;

    public h() {
        this.f54176a = Math.sqrt(1500.0d);
        this.f54177b = 0.5d;
        this.f54178c = false;
        this.f54182i = Double.MAX_VALUE;
        this.f54183j = new Object();
    }

    public final void a(float f10) {
        if (f10 >= 0.0f) {
            this.f54177b = f10;
            this.f54178c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void b(float f10) {
        if (f10 > 0.0f) {
            this.f54176a = Math.sqrt(f10);
            this.f54178c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final i c(double d, double d2, long j3) {
        double sin;
        double cos;
        if (!this.f54178c) {
            if (this.f54182i != Double.MAX_VALUE) {
                double d10 = this.f54177b;
                if (d10 > 1.0d) {
                    double d11 = this.f54176a;
                    this.f54180f = (Math.sqrt((d10 * d10) - 1.0d) * d11) + ((-d10) * d11);
                    double d12 = this.f54177b;
                    double d13 = this.f54176a;
                    this.f54181g = ((-d12) * d13) - (Math.sqrt((d12 * d12) - 1.0d) * d13);
                } else if (d10 >= 0.0d && d10 < 1.0d) {
                    this.h = Math.sqrt(1.0d - (d10 * d10)) * this.f54176a;
                }
                this.f54178c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d14 = j3 / 1000.0d;
        double d15 = d - this.f54182i;
        double d16 = this.f54177b;
        int i7 = (d16 > 1.0d ? 1 : (d16 == 1.0d ? 0 : -1));
        if (i7 > 0) {
            double d17 = this.f54181g;
            double d18 = ((d17 * d15) - d2) / (d17 - this.f54180f);
            double d19 = d15 - d18;
            sin = (Math.pow(2.718281828459045d, this.f54180f * d14) * d18) + (Math.pow(2.718281828459045d, d17 * d14) * d19);
            double d20 = this.f54181g;
            double pow = Math.pow(2.718281828459045d, d20 * d14) * d19 * d20;
            double d21 = this.f54180f;
            cos = (Math.pow(2.718281828459045d, d21 * d14) * d18 * d21) + pow;
        } else if (i7 == 0) {
            double d22 = this.f54176a;
            double d23 = (d22 * d15) + d2;
            double d24 = (d23 * d14) + d15;
            double pow2 = Math.pow(2.718281828459045d, (-d22) * d14) * d24;
            double pow3 = Math.pow(2.718281828459045d, (-this.f54176a) * d14) * d24;
            double d25 = -this.f54176a;
            cos = (Math.pow(2.718281828459045d, d25 * d14) * d23) + (pow3 * d25);
            sin = pow2;
        } else {
            double d26 = 1.0d / this.h;
            double d27 = this.f54176a;
            double d28 = ((d16 * d27 * d15) + d2) * d26;
            sin = ((Math.sin(this.h * d14) * d28) + (Math.cos(this.h * d14) * d15)) * Math.pow(2.718281828459045d, (-d16) * d27 * d14);
            double d29 = this.f54176a;
            double d30 = this.f54177b;
            double d31 = (-d29) * sin * d30;
            double pow4 = Math.pow(2.718281828459045d, (-d30) * d29 * d14);
            double d32 = this.h;
            double sin2 = Math.sin(d32 * d14) * (-d32) * d15;
            double d33 = this.h;
            cos = (((Math.cos(d33 * d14) * d28 * d33) + sin2) * pow4) + d31;
        }
        i iVar = this.f54183j;
        iVar.f29295a = (float) (sin + this.f54182i);
        iVar.f29296b = (float) cos;
        return iVar;
    }

    public h(float f10) {
        this.f54176a = Math.sqrt(1500.0d);
        this.f54177b = 0.5d;
        this.f54178c = false;
        this.f54183j = new Object();
        this.f54182i = f10;
    }
}
