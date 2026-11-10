package sg;

import a8.r9;
public final class d1 extends g1 {
    public final int f55052f;
    public final h1 f55053g;

    public d1(h1 h1Var, int i7) {
        this.f55052f = i7;
        this.f55053g = h1Var;
    }

    @Override
    public final void a() {
        switch (this.f55052f) {
            case 0:
                h1 h1Var = this.f55053g;
                y0 y0Var = h1Var.h;
                double atan2 = Math.atan2(y0Var.f55276c - y0Var.f55281j, y0Var.f55275b - y0Var.f55280i) + 3.141592653589793d;
                y0 y0Var2 = h1Var.h;
                double d = y0Var2.f55282k / 5.5f;
                this.d = y0Var2.f55275b + ((float) (Math.cos(atan2) * d));
                this.f55072e = h1Var.h.f55276c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                y0 y0Var3 = this.f55053g.h;
                float f10 = y0Var3.f55276c;
                this.d = y0Var3.f55275b + y0Var3.d;
                this.f55072e = f10;
                return;
            case 2:
                h1 h1Var2 = this.f55053g;
                y0 y0Var4 = h1Var2.h;
                float min = Math.min(y0Var4.d, y0Var4.f55277e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + h1Var2.h.f55275b;
                float f11 = h1Var2.h.f55276c;
                this.d = cos;
                this.f55072e = (((float) Math.sin(-0.3141592653589793d)) * min) + f11;
                return;
            case 3:
                y0 y0Var5 = this.f55053g.h;
                this.d = y0Var5.f55275b;
                this.f55072e = y0Var5.f55276c - Math.abs(y0Var5.f55277e);
                return;
            case 4:
                y0 y0Var6 = this.f55053g.h;
                float f12 = y0Var6.f55280i;
                float f13 = y0Var6.f55281j;
                y0Var6.f55280i = f12;
                y0Var6.f55281j = f13;
                this.d = f12;
                this.f55072e = f13;
                return;
            default:
                y0 y0Var7 = this.f55053g.h;
                this.d = y0Var7.f55275b;
                this.f55072e = y0Var7.f55276c;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f55052f) {
            case 0:
                h1 h1Var = this.f55053g;
                y0 y0Var = h1Var.h;
                double atan2 = Math.atan2(y0Var.f55276c - y0Var.f55281j, y0Var.f55275b - y0Var.f55280i) + 1.5707963267948966d;
                y0 y0Var2 = h1Var.h;
                y0 y0Var3 = h1Var.h;
                float f12 = y0Var3.f55275b;
                float f13 = y0Var3.f55276c;
                h1Var.getClass();
                y0Var3.f55282k = Math.min((r9.a(y0Var2.f55275b, y0Var2.f55276c, y0Var2.f55280i, y0Var2.f55281j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f10;
                this.f55072e = f11;
                y0 y0Var4 = this.f55053g.h;
                float a10 = r9.a(y0Var4.f55275b, y0Var4.f55276c, f10, f11);
                y0Var4.f55277e = a10;
                y0Var4.d = a10;
                return;
            case 2:
                h1 h1Var2 = this.f55053g;
                y0 y0Var5 = h1Var2.h;
                float a11 = r9.a(y0Var5.f55275b, y0Var5.f55276c, f10, f11);
                y0Var5.f55277e = a11;
                y0Var5.d = a11;
                y0 y0Var6 = h1Var2.h;
                y0Var6.h = (float) ((((float) Math.atan2(y0Var6.f55276c - f11, f10 - y0Var6.f55275b)) - 0.3141592653589793d) + y0Var6.h);
                a();
                return;
            case 3:
                h1 h1Var3 = this.f55053g;
                y0 y0Var7 = h1Var3.h;
                y0Var7.h = (float) ((((float) Math.atan2(y0Var7.f55276c - f11, f10 - y0Var7.f55275b)) - 1.5707963267948966d) + y0Var7.h);
                for (int i7 = 0; i7 < h1Var3.f55086m.size(); i7++) {
                    g1 g1Var = (g1) h1Var3.f55086m.get(i7);
                    if (g1Var instanceof f1) {
                        g1Var.a();
                    }
                }
                return;
            case 4:
                y0 y0Var8 = this.f55053g.h;
                y0Var8.f55280i = f10;
                y0Var8.f55281j = f11;
                this.d = f10;
                this.f55072e = f11;
                float f14 = y0Var8.f55276c;
                float f15 = y0Var8.f55277e;
                float f16 = f14 - f15;
                int i10 = (f11 > f16 ? 1 : (f11 == f16 ? 0 : -1));
                if (i10 > 0 && f11 < f14 + f15) {
                    float f17 = y0Var8.f55275b;
                    if (f10 <= f17) {
                        float f18 = f17 - y0Var8.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + y0Var8.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = y0Var8.f55275b;
                float f22 = y0Var8.d;
                if (f20 > f21 - f22 && f20 < f21 + f22) {
                    if (f11 <= f14 && i10 > 0) {
                        this.f55072e = f16;
                    } else if (f11 > f14) {
                        float f23 = f14 + f15;
                        if (f11 < f23) {
                            this.f55072e = f23;
                        }
                    }
                }
                y0Var8.f55280i = f20;
                y0Var8.f55281j = this.f55072e;
                return;
            default:
                int i11 = 0;
                while (true) {
                    h1 h1Var4 = this.f55053g;
                    if (i11 < h1Var4.f55086m.size()) {
                        g1 g1Var2 = (g1) h1Var4.f55086m.get(i11);
                        if (g1Var2 != this) {
                            g1Var2.a();
                        }
                        i11++;
                    } else {
                        y0 y0Var9 = h1Var4.h;
                        y0Var9.f55275b = f10;
                        y0Var9.f55276c = f11;
                        this.d = f10;
                        this.f55072e = f11;
                        return;
                    }
                }
        }
    }

    public d1(h1 h1Var, int i7, boolean z9) {
        super(0);
        this.f55052f = i7;
        this.f55053g = h1Var;
    }
}
