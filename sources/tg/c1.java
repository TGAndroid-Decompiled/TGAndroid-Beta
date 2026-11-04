package tg;
public final class c1 extends f1 {
    public final int f55146f;
    public final g1 f55147g;

    public c1(g1 g1Var, int i3) {
        this.f55146f = i3;
        this.f55147g = g1Var;
    }

    @Override
    public final void a() {
        switch (this.f55146f) {
            case 0:
                g1 g1Var = this.f55147g;
                x0 x0Var = g1Var.h;
                double atan2 = Math.atan2(x0Var.f55366c - x0Var.f55371j, x0Var.f55365b - x0Var.f55370i) + 3.141592653589793d;
                x0 x0Var2 = g1Var.h;
                double d = x0Var2.f55372k / 5.5f;
                this.d = x0Var2.f55365b + ((float) (Math.cos(atan2) * d));
                this.f55163e = g1Var.h.f55366c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                x0 x0Var3 = this.f55147g.h;
                float f10 = x0Var3.f55366c;
                this.d = x0Var3.f55365b + x0Var3.d;
                this.f55163e = f10;
                return;
            case 2:
                g1 g1Var2 = this.f55147g;
                x0 x0Var4 = g1Var2.h;
                float min = Math.min(x0Var4.d, x0Var4.f55367e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + g1Var2.h.f55365b;
                float f11 = g1Var2.h.f55366c;
                this.d = cos;
                this.f55163e = (((float) Math.sin(-0.3141592653589793d)) * min) + f11;
                return;
            case 3:
                x0 x0Var5 = this.f55147g.h;
                this.d = x0Var5.f55365b;
                this.f55163e = x0Var5.f55366c - Math.abs(x0Var5.f55367e);
                return;
            case 4:
                x0 x0Var6 = this.f55147g.h;
                float f12 = x0Var6.f55370i;
                float f13 = x0Var6.f55371j;
                x0Var6.f55370i = f12;
                x0Var6.f55371j = f13;
                this.d = f12;
                this.f55163e = f13;
                return;
            default:
                x0 x0Var7 = this.f55147g.h;
                this.d = x0Var7.f55365b;
                this.f55163e = x0Var7.f55366c;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f55146f) {
            case 0:
                g1 g1Var = this.f55147g;
                x0 x0Var = g1Var.h;
                double atan2 = Math.atan2(x0Var.f55366c - x0Var.f55371j, x0Var.f55365b - x0Var.f55370i) + 1.5707963267948966d;
                x0 x0Var2 = g1Var.h;
                x0 x0Var3 = g1Var.h;
                float f12 = x0Var3.f55365b;
                float f13 = x0Var3.f55366c;
                g1Var.getClass();
                x0Var3.f55372k = Math.min((a7.h.a(x0Var2.f55365b, x0Var2.f55366c, x0Var2.f55370i, x0Var2.f55371j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f10;
                this.f55163e = f11;
                x0 x0Var4 = this.f55147g.h;
                float a10 = a7.h.a(x0Var4.f55365b, x0Var4.f55366c, f10, f11);
                x0Var4.f55367e = a10;
                x0Var4.d = a10;
                return;
            case 2:
                g1 g1Var2 = this.f55147g;
                x0 x0Var5 = g1Var2.h;
                float a11 = a7.h.a(x0Var5.f55365b, x0Var5.f55366c, f10, f11);
                x0Var5.f55367e = a11;
                x0Var5.d = a11;
                x0 x0Var6 = g1Var2.h;
                x0Var6.h = (float) ((((float) Math.atan2(x0Var6.f55366c - f11, f10 - x0Var6.f55365b)) - 0.3141592653589793d) + x0Var6.h);
                a();
                return;
            case 3:
                g1 g1Var3 = this.f55147g;
                x0 x0Var7 = g1Var3.h;
                x0Var7.h = (float) ((((float) Math.atan2(x0Var7.f55366c - f11, f10 - x0Var7.f55365b)) - 1.5707963267948966d) + x0Var7.h);
                for (int i3 = 0; i3 < g1Var3.f55179m.size(); i3++) {
                    f1 f1Var = (f1) g1Var3.f55179m.get(i3);
                    if (f1Var instanceof e1) {
                        f1Var.a();
                    }
                }
                return;
            case 4:
                x0 x0Var8 = this.f55147g.h;
                x0Var8.f55370i = f10;
                x0Var8.f55371j = f11;
                this.d = f10;
                this.f55163e = f11;
                float f14 = x0Var8.f55366c;
                float f15 = x0Var8.f55367e;
                float f16 = f14 - f15;
                int i10 = (f11 > f16 ? 1 : (f11 == f16 ? 0 : -1));
                if (i10 > 0 && f11 < f14 + f15) {
                    float f17 = x0Var8.f55365b;
                    if (f10 <= f17) {
                        float f18 = f17 - x0Var8.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + x0Var8.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = x0Var8.f55365b;
                float f22 = x0Var8.d;
                if (f20 > f21 - f22 && f20 < f21 + f22) {
                    if (f11 <= f14 && i10 > 0) {
                        this.f55163e = f16;
                    } else if (f11 > f14) {
                        float f23 = f14 + f15;
                        if (f11 < f23) {
                            this.f55163e = f23;
                        }
                    }
                }
                x0Var8.f55370i = f20;
                x0Var8.f55371j = this.f55163e;
                return;
            default:
                int i11 = 0;
                while (true) {
                    g1 g1Var4 = this.f55147g;
                    if (i11 < g1Var4.f55179m.size()) {
                        f1 f1Var2 = (f1) g1Var4.f55179m.get(i11);
                        if (f1Var2 != this) {
                            f1Var2.a();
                        }
                        i11++;
                    } else {
                        x0 x0Var9 = g1Var4.h;
                        x0Var9.f55365b = f10;
                        x0Var9.f55366c = f11;
                        this.d = f10;
                        this.f55163e = f11;
                        return;
                    }
                }
        }
    }

    public c1(g1 g1Var, int i3, boolean z10) {
        super(0);
        this.f55146f = i3;
        this.f55147g = g1Var;
    }
}
