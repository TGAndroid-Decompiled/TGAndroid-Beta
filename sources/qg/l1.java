package qg;

import v7.z6;
public final class l1 extends o1 {
    public final int f44506f;
    public final p1 f44507g;

    public l1(p1 p1Var, int i10) {
        this.f44506f = i10;
        this.f44507g = p1Var;
    }

    @Override
    public final void a() {
        switch (this.f44506f) {
            case 0:
                p1 p1Var = this.f44507g;
                f1 f1Var = p1Var.h;
                double atan2 = Math.atan2(f1Var.f44457c - f1Var.f44462j, f1Var.f44456b - f1Var.f44461i) + 3.141592653589793d;
                f1 f1Var2 = p1Var.h;
                double d = f1Var2.f44463k / 5.5f;
                this.d = f1Var2.f44456b + ((float) (Math.cos(atan2) * d));
                this.f44528e = p1Var.h.f44457c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                f1 f1Var3 = this.f44507g.h;
                float f7 = f1Var3.f44457c;
                this.d = f1Var3.f44456b + f1Var3.d;
                this.f44528e = f7;
                return;
            case 2:
                p1 p1Var2 = this.f44507g;
                f1 f1Var4 = p1Var2.h;
                float min = Math.min(f1Var4.d, f1Var4.f44458e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + p1Var2.h.f44456b;
                float f10 = p1Var2.h.f44457c;
                this.d = cos;
                this.f44528e = (((float) Math.sin(-0.3141592653589793d)) * min) + f10;
                return;
            case 3:
                f1 f1Var5 = this.f44507g.h;
                this.d = f1Var5.f44456b;
                this.f44528e = f1Var5.f44457c - Math.abs(f1Var5.f44458e);
                return;
            case 4:
                f1 f1Var6 = this.f44507g.h;
                float f11 = f1Var6.f44461i;
                float f12 = f1Var6.f44462j;
                f1Var6.f44461i = f11;
                f1Var6.f44462j = f12;
                this.d = f11;
                this.f44528e = f12;
                return;
            default:
                f1 f1Var7 = this.f44507g.h;
                this.d = f1Var7.f44456b;
                this.f44528e = f1Var7.f44457c;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f44506f) {
            case 0:
                p1 p1Var = this.f44507g;
                f1 f1Var = p1Var.h;
                double atan2 = Math.atan2(f1Var.f44457c - f1Var.f44462j, f1Var.f44456b - f1Var.f44461i) + 1.5707963267948966d;
                f1 f1Var2 = p1Var.h;
                f1 f1Var3 = p1Var.h;
                float f11 = f1Var3.f44456b;
                float f12 = f1Var3.f44457c;
                p1Var.getClass();
                f1Var3.f44463k = Math.min((z6.a(f1Var2.f44456b, f1Var2.f44457c, f1Var2.f44461i, f1Var2.f44462j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f7))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f7;
                this.f44528e = f10;
                f1 f1Var4 = this.f44507g.h;
                float a2 = z6.a(f1Var4.f44456b, f1Var4.f44457c, f7, f10);
                f1Var4.f44458e = a2;
                f1Var4.d = a2;
                return;
            case 2:
                p1 p1Var2 = this.f44507g;
                f1 f1Var5 = p1Var2.h;
                float a10 = z6.a(f1Var5.f44456b, f1Var5.f44457c, f7, f10);
                f1Var5.f44458e = a10;
                f1Var5.d = a10;
                f1 f1Var6 = p1Var2.h;
                f1Var6.h = (float) ((((float) Math.atan2(f1Var6.f44457c - f10, f7 - f1Var6.f44456b)) - 0.3141592653589793d) + f1Var6.h);
                a();
                return;
            case 3:
                p1 p1Var3 = this.f44507g;
                f1 f1Var7 = p1Var3.h;
                f1Var7.h = (float) ((((float) Math.atan2(f1Var7.f44457c - f10, f7 - f1Var7.f44456b)) - 1.5707963267948966d) + f1Var7.h);
                for (int i10 = 0; i10 < p1Var3.f44541m.size(); i10++) {
                    o1 o1Var = (o1) p1Var3.f44541m.get(i10);
                    if (o1Var instanceof n1) {
                        o1Var.a();
                    }
                }
                return;
            case 4:
                f1 f1Var8 = this.f44507g.h;
                f1Var8.f44461i = f7;
                f1Var8.f44462j = f10;
                this.d = f7;
                this.f44528e = f10;
                float f13 = f1Var8.f44457c;
                float f14 = f1Var8.f44458e;
                float f15 = f13 - f14;
                int i11 = (f10 > f15 ? 1 : (f10 == f15 ? 0 : -1));
                if (i11 > 0 && f10 < f13 + f14) {
                    float f16 = f1Var8.f44456b;
                    if (f7 <= f16) {
                        float f17 = f16 - f1Var8.d;
                        if (f7 > f17) {
                            this.d = f17;
                        }
                    }
                    if (f7 > f13) {
                        float f18 = f16 + f1Var8.d;
                        if (f7 < f18) {
                            this.d = f18;
                        }
                    }
                }
                float f19 = this.d;
                float f20 = f1Var8.f44456b;
                float f21 = f1Var8.d;
                if (f19 > f20 - f21 && f19 < f20 + f21) {
                    if (f10 <= f13 && i11 > 0) {
                        this.f44528e = f15;
                    } else if (f10 > f13) {
                        float f22 = f13 + f14;
                        if (f10 < f22) {
                            this.f44528e = f22;
                        }
                    }
                }
                f1Var8.f44461i = f19;
                f1Var8.f44462j = this.f44528e;
                return;
            default:
                int i12 = 0;
                while (true) {
                    p1 p1Var4 = this.f44507g;
                    if (i12 < p1Var4.f44541m.size()) {
                        o1 o1Var2 = (o1) p1Var4.f44541m.get(i12);
                        if (o1Var2 != this) {
                            o1Var2.a();
                        }
                        i12++;
                    } else {
                        f1 f1Var9 = p1Var4.h;
                        f1Var9.f44456b = f7;
                        f1Var9.f44457c = f10;
                        this.d = f7;
                        this.f44528e = f10;
                        return;
                    }
                }
        }
    }

    public l1(p1 p1Var, int i10, boolean z10) {
        super(0);
        this.f44506f = i10;
        this.f44507g = p1Var;
    }
}
