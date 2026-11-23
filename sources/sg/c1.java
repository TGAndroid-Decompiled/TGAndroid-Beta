package sg;

import a8.w9;
public final class c1 extends f1 {
    public final int f57222f;
    public final g1 f57223g;

    public c1(g1 g1Var, int i7) {
        this.f57222f = i7;
        this.f57223g = g1Var;
    }

    @Override
    public final void a() {
        switch (this.f57222f) {
            case 0:
                g1 g1Var = this.f57223g;
                x0 x0Var = g1Var.h;
                double atan2 = Math.atan2(x0Var.f57444c - x0Var.f57449j, x0Var.f57443b - x0Var.f57448i) + 3.141592653589793d;
                x0 x0Var2 = g1Var.h;
                double d = x0Var2.f57450k / 5.5f;
                this.d = x0Var2.f57443b + ((float) (Math.cos(atan2) * d));
                this.f57240e = g1Var.h.f57444c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                x0 x0Var3 = this.f57223g.h;
                float f10 = x0Var3.f57444c;
                this.d = x0Var3.f57443b + x0Var3.d;
                this.f57240e = f10;
                return;
            case 2:
                g1 g1Var2 = this.f57223g;
                x0 x0Var4 = g1Var2.h;
                float min = Math.min(x0Var4.d, x0Var4.f57445e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + g1Var2.h.f57443b;
                float f11 = g1Var2.h.f57444c;
                this.d = cos;
                this.f57240e = (((float) Math.sin(-0.3141592653589793d)) * min) + f11;
                return;
            case 3:
                x0 x0Var5 = this.f57223g.h;
                this.d = x0Var5.f57443b;
                this.f57240e = x0Var5.f57444c - Math.abs(x0Var5.f57445e);
                return;
            case 4:
                x0 x0Var6 = this.f57223g.h;
                float f12 = x0Var6.f57448i;
                float f13 = x0Var6.f57449j;
                x0Var6.f57448i = f12;
                x0Var6.f57449j = f13;
                this.d = f12;
                this.f57240e = f13;
                return;
            default:
                x0 x0Var7 = this.f57223g.h;
                this.d = x0Var7.f57443b;
                this.f57240e = x0Var7.f57444c;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f57222f) {
            case 0:
                g1 g1Var = this.f57223g;
                x0 x0Var = g1Var.h;
                double atan2 = Math.atan2(x0Var.f57444c - x0Var.f57449j, x0Var.f57443b - x0Var.f57448i) + 1.5707963267948966d;
                x0 x0Var2 = g1Var.h;
                x0 x0Var3 = g1Var.h;
                float f12 = x0Var3.f57443b;
                float f13 = x0Var3.f57444c;
                g1Var.getClass();
                x0Var3.f57450k = Math.min((w9.a(x0Var2.f57443b, x0Var2.f57444c, x0Var2.f57448i, x0Var2.f57449j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f10;
                this.f57240e = f11;
                x0 x0Var4 = this.f57223g.h;
                float a10 = w9.a(x0Var4.f57443b, x0Var4.f57444c, f10, f11);
                x0Var4.f57445e = a10;
                x0Var4.d = a10;
                return;
            case 2:
                g1 g1Var2 = this.f57223g;
                x0 x0Var5 = g1Var2.h;
                float a11 = w9.a(x0Var5.f57443b, x0Var5.f57444c, f10, f11);
                x0Var5.f57445e = a11;
                x0Var5.d = a11;
                x0 x0Var6 = g1Var2.h;
                x0Var6.h = (float) ((((float) Math.atan2(x0Var6.f57444c - f11, f10 - x0Var6.f57443b)) - 0.3141592653589793d) + x0Var6.h);
                a();
                return;
            case 3:
                g1 g1Var3 = this.f57223g;
                x0 x0Var7 = g1Var3.h;
                x0Var7.h = (float) ((((float) Math.atan2(x0Var7.f57444c - f11, f10 - x0Var7.f57443b)) - 1.5707963267948966d) + x0Var7.h);
                for (int i7 = 0; i7 < g1Var3.f57255m.size(); i7++) {
                    f1 f1Var = (f1) g1Var3.f57255m.get(i7);
                    if (f1Var instanceof e1) {
                        f1Var.a();
                    }
                }
                return;
            case 4:
                x0 x0Var8 = this.f57223g.h;
                x0Var8.f57448i = f10;
                x0Var8.f57449j = f11;
                this.d = f10;
                this.f57240e = f11;
                float f14 = x0Var8.f57444c;
                float f15 = x0Var8.f57445e;
                float f16 = f14 - f15;
                int i10 = (f11 > f16 ? 1 : (f11 == f16 ? 0 : -1));
                if (i10 > 0 && f11 < f14 + f15) {
                    float f17 = x0Var8.f57443b;
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
                float f21 = x0Var8.f57443b;
                float f22 = x0Var8.d;
                if (f20 > f21 - f22 && f20 < f21 + f22) {
                    if (f11 <= f14 && i10 > 0) {
                        this.f57240e = f16;
                    } else if (f11 > f14) {
                        float f23 = f14 + f15;
                        if (f11 < f23) {
                            this.f57240e = f23;
                        }
                    }
                }
                x0Var8.f57448i = f20;
                x0Var8.f57449j = this.f57240e;
                return;
            default:
                int i11 = 0;
                while (true) {
                    g1 g1Var4 = this.f57223g;
                    if (i11 < g1Var4.f57255m.size()) {
                        f1 f1Var2 = (f1) g1Var4.f57255m.get(i11);
                        if (f1Var2 != this) {
                            f1Var2.a();
                        }
                        i11++;
                    } else {
                        x0 x0Var9 = g1Var4.h;
                        x0Var9.f57443b = f10;
                        x0Var9.f57444c = f11;
                        this.d = f10;
                        this.f57240e = f11;
                        return;
                    }
                }
        }
    }

    public c1(g1 g1Var, int i7, boolean z10) {
        super(0);
        this.f57222f = i7;
        this.f57223g = g1Var;
    }
}
