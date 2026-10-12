package qg;

import v7.f7;
public final class l1 extends o1 {
    public final int f43483f;
    public final p1 f43484g;

    public l1(p1 p1Var, int i10) {
        this.f43483f = i10;
        this.f43484g = p1Var;
    }

    @Override
    public final void a() {
        switch (this.f43483f) {
            case 0:
                p1 p1Var = this.f43484g;
                f1 f1Var = p1Var.h;
                double atan2 = Math.atan2(f1Var.f43437c - f1Var.f43441j, f1Var.f43436b - f1Var.f43440i) + 3.141592653589793d;
                f1 f1Var2 = p1Var.h;
                double d = f1Var2.f43442k / 5.5f;
                this.d = f1Var2.f43436b + ((float) (Math.cos(atan2) * d));
                this.e = p1Var.h.f43437c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                f1 f1Var3 = this.f43484g.h;
                float f7 = f1Var3.f43437c;
                this.d = f1Var3.f43436b + f1Var3.d;
                this.e = f7;
                return;
            case 2:
                p1 p1Var2 = this.f43484g;
                f1 f1Var4 = p1Var2.h;
                float min = Math.min(f1Var4.d, f1Var4.e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + p1Var2.h.f43436b;
                float f10 = p1Var2.h.f43437c;
                this.d = cos;
                this.e = (((float) Math.sin(-0.3141592653589793d)) * min) + f10;
                return;
            case 3:
                f1 f1Var5 = this.f43484g.h;
                this.d = f1Var5.f43436b;
                this.e = f1Var5.f43437c - Math.abs(f1Var5.e);
                return;
            case 4:
                f1 f1Var6 = this.f43484g.h;
                float f11 = f1Var6.f43440i;
                float f12 = f1Var6.f43441j;
                f1Var6.f43440i = f11;
                f1Var6.f43441j = f12;
                this.d = f11;
                this.e = f12;
                return;
            default:
                f1 f1Var7 = this.f43484g.h;
                this.d = f1Var7.f43436b;
                this.e = f1Var7.f43437c;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f43483f) {
            case 0:
                p1 p1Var = this.f43484g;
                f1 f1Var = p1Var.h;
                double atan2 = Math.atan2(f1Var.f43437c - f1Var.f43441j, f1Var.f43436b - f1Var.f43440i) + 1.5707963267948966d;
                f1 f1Var2 = p1Var.h;
                f1 f1Var3 = p1Var.h;
                float f11 = f1Var3.f43436b;
                float f12 = f1Var3.f43437c;
                p1Var.getClass();
                f1Var3.f43442k = Math.min((f7.a(f1Var2.f43436b, f1Var2.f43437c, f1Var2.f43440i, f1Var2.f43441j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f7))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f7;
                this.e = f10;
                f1 f1Var4 = this.f43484g.h;
                float a2 = f7.a(f1Var4.f43436b, f1Var4.f43437c, f7, f10);
                f1Var4.e = a2;
                f1Var4.d = a2;
                return;
            case 2:
                p1 p1Var2 = this.f43484g;
                f1 f1Var5 = p1Var2.h;
                float a10 = f7.a(f1Var5.f43436b, f1Var5.f43437c, f7, f10);
                f1Var5.e = a10;
                f1Var5.d = a10;
                f1 f1Var6 = p1Var2.h;
                f1Var6.h = (float) ((((float) Math.atan2(f1Var6.f43437c - f10, f7 - f1Var6.f43436b)) - 0.3141592653589793d) + f1Var6.h);
                a();
                return;
            case 3:
                p1 p1Var3 = this.f43484g;
                f1 f1Var7 = p1Var3.h;
                f1Var7.h = (float) ((((float) Math.atan2(f1Var7.f43437c - f10, f7 - f1Var7.f43436b)) - 1.5707963267948966d) + f1Var7.h);
                for (int i10 = 0; i10 < p1Var3.f43516m.size(); i10++) {
                    o1 o1Var = (o1) p1Var3.f43516m.get(i10);
                    if (o1Var instanceof n1) {
                        o1Var.a();
                    }
                }
                return;
            case 4:
                f1 f1Var8 = this.f43484g.h;
                f1Var8.f43440i = f7;
                f1Var8.f43441j = f10;
                this.d = f7;
                this.e = f10;
                float f13 = f1Var8.f43437c;
                float f14 = f1Var8.e;
                float f15 = f13 - f14;
                int i11 = (f10 > f15 ? 1 : (f10 == f15 ? 0 : -1));
                if (i11 > 0 && f10 < f13 + f14) {
                    float f16 = f1Var8.f43436b;
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
                float f20 = f1Var8.f43436b;
                float f21 = f1Var8.d;
                if (f19 > f20 - f21 && f19 < f20 + f21) {
                    if (f10 <= f13 && i11 > 0) {
                        this.e = f15;
                    } else if (f10 > f13) {
                        float f22 = f13 + f14;
                        if (f10 < f22) {
                            this.e = f22;
                        }
                    }
                }
                f1Var8.f43440i = f19;
                f1Var8.f43441j = this.e;
                return;
            default:
                int i12 = 0;
                while (true) {
                    p1 p1Var4 = this.f43484g;
                    if (i12 < p1Var4.f43516m.size()) {
                        o1 o1Var2 = (o1) p1Var4.f43516m.get(i12);
                        if (o1Var2 != this) {
                            o1Var2.a();
                        }
                        i12++;
                    } else {
                        f1 f1Var9 = p1Var4.h;
                        f1Var9.f43436b = f7;
                        f1Var9.f43437c = f10;
                        this.d = f7;
                        this.e = f10;
                        return;
                    }
                }
        }
    }

    public l1(p1 p1Var, int i10, boolean z10) {
        super(0);
        this.f43483f = i10;
        this.f43484g = p1Var;
    }
}
