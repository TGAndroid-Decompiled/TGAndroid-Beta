package sg;

import a8.x9;
public final class b1 extends e1 {
    public final int f57296f;
    public final f1 f57297g;

    public b1(f1 f1Var, int i7) {
        this.f57296f = i7;
        this.f57297g = f1Var;
    }

    @Override
    public final void a() {
        switch (this.f57296f) {
            case 0:
                f1 f1Var = this.f57297g;
                w0 w0Var = f1Var.h;
                double atan2 = Math.atan2(w0Var.f57514c - w0Var.f57519j, w0Var.f57513b - w0Var.f57518i) + 3.141592653589793d;
                w0 w0Var2 = f1Var.h;
                double d = w0Var2.f57520k / 5.5f;
                this.d = w0Var2.f57513b + ((float) (Math.cos(atan2) * d));
                this.f57313e = f1Var.h.f57514c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                w0 w0Var3 = this.f57297g.h;
                float f10 = w0Var3.f57514c;
                this.d = w0Var3.f57513b + w0Var3.d;
                this.f57313e = f10;
                return;
            case 2:
                f1 f1Var2 = this.f57297g;
                w0 w0Var4 = f1Var2.h;
                float min = Math.min(w0Var4.d, w0Var4.f57515e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + f1Var2.h.f57513b;
                float f11 = f1Var2.h.f57514c;
                this.d = cos;
                this.f57313e = (((float) Math.sin(-0.3141592653589793d)) * min) + f11;
                return;
            case 3:
                w0 w0Var5 = this.f57297g.h;
                this.d = w0Var5.f57513b;
                this.f57313e = w0Var5.f57514c - Math.abs(w0Var5.f57515e);
                return;
            case 4:
                w0 w0Var6 = this.f57297g.h;
                float f12 = w0Var6.f57518i;
                float f13 = w0Var6.f57519j;
                w0Var6.f57518i = f12;
                w0Var6.f57519j = f13;
                this.d = f12;
                this.f57313e = f13;
                return;
            default:
                w0 w0Var7 = this.f57297g.h;
                this.d = w0Var7.f57513b;
                this.f57313e = w0Var7.f57514c;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f57296f) {
            case 0:
                f1 f1Var = this.f57297g;
                w0 w0Var = f1Var.h;
                double atan2 = Math.atan2(w0Var.f57514c - w0Var.f57519j, w0Var.f57513b - w0Var.f57518i) + 1.5707963267948966d;
                w0 w0Var2 = f1Var.h;
                w0 w0Var3 = f1Var.h;
                float f12 = w0Var3.f57513b;
                float f13 = w0Var3.f57514c;
                f1Var.getClass();
                w0Var3.f57520k = Math.min((x9.a(w0Var2.f57513b, w0Var2.f57514c, w0Var2.f57518i, w0Var2.f57519j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f10;
                this.f57313e = f11;
                w0 w0Var4 = this.f57297g.h;
                float a10 = x9.a(w0Var4.f57513b, w0Var4.f57514c, f10, f11);
                w0Var4.f57515e = a10;
                w0Var4.d = a10;
                return;
            case 2:
                f1 f1Var2 = this.f57297g;
                w0 w0Var5 = f1Var2.h;
                float a11 = x9.a(w0Var5.f57513b, w0Var5.f57514c, f10, f11);
                w0Var5.f57515e = a11;
                w0Var5.d = a11;
                w0 w0Var6 = f1Var2.h;
                w0Var6.h = (float) ((((float) Math.atan2(w0Var6.f57514c - f11, f10 - w0Var6.f57513b)) - 0.3141592653589793d) + w0Var6.h);
                a();
                return;
            case 3:
                f1 f1Var3 = this.f57297g;
                w0 w0Var7 = f1Var3.h;
                w0Var7.h = (float) ((((float) Math.atan2(w0Var7.f57514c - f11, f10 - w0Var7.f57513b)) - 1.5707963267948966d) + w0Var7.h);
                for (int i7 = 0; i7 < f1Var3.f57327m.size(); i7++) {
                    e1 e1Var = (e1) f1Var3.f57327m.get(i7);
                    if (e1Var instanceof d1) {
                        e1Var.a();
                    }
                }
                return;
            case 4:
                w0 w0Var8 = this.f57297g.h;
                w0Var8.f57518i = f10;
                w0Var8.f57519j = f11;
                this.d = f10;
                this.f57313e = f11;
                float f14 = w0Var8.f57514c;
                float f15 = w0Var8.f57515e;
                float f16 = f14 - f15;
                int i10 = (f11 > f16 ? 1 : (f11 == f16 ? 0 : -1));
                if (i10 > 0 && f11 < f14 + f15) {
                    float f17 = w0Var8.f57513b;
                    if (f10 <= f17) {
                        float f18 = f17 - w0Var8.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + w0Var8.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = w0Var8.f57513b;
                float f22 = w0Var8.d;
                if (f20 > f21 - f22 && f20 < f21 + f22) {
                    if (f11 <= f14 && i10 > 0) {
                        this.f57313e = f16;
                    } else if (f11 > f14) {
                        float f23 = f14 + f15;
                        if (f11 < f23) {
                            this.f57313e = f23;
                        }
                    }
                }
                w0Var8.f57518i = f20;
                w0Var8.f57519j = this.f57313e;
                return;
            default:
                int i11 = 0;
                while (true) {
                    f1 f1Var4 = this.f57297g;
                    if (i11 < f1Var4.f57327m.size()) {
                        e1 e1Var2 = (e1) f1Var4.f57327m.get(i11);
                        if (e1Var2 != this) {
                            e1Var2.a();
                        }
                        i11++;
                    } else {
                        w0 w0Var9 = f1Var4.h;
                        w0Var9.f57513b = f10;
                        w0Var9.f57514c = f11;
                        this.d = f10;
                        this.f57313e = f11;
                        return;
                    }
                }
        }
    }

    public b1(f1 f1Var, int i7, boolean z10) {
        super(0);
        this.f57296f = i7;
        this.f57297g = f1Var;
    }
}
