package pg;

import v7.z6;
public final class l1 extends o1 {
    public final int f40937f;
    public final p1 f40938g;

    public l1(p1 p1Var, int i10) {
        this.f40937f = i10;
        this.f40938g = p1Var;
    }

    @Override
    public final void a() {
        switch (this.f40937f) {
            case 0:
                p1 p1Var = this.f40938g;
                f1 f1Var = p1Var.h;
                double atan2 = Math.atan2(f1Var.f40891c - f1Var.f40895j, f1Var.f40890b - f1Var.f40894i) + 3.141592653589793d;
                f1 f1Var2 = p1Var.h;
                double d = f1Var2.f40896k / 5.5f;
                this.d = f1Var2.f40890b + ((float) (Math.cos(atan2) * d));
                this.e = p1Var.h.f40891c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                f1 f1Var3 = this.f40938g.h;
                float f7 = f1Var3.f40891c;
                this.d = f1Var3.f40890b + f1Var3.d;
                this.e = f7;
                return;
            case 2:
                p1 p1Var2 = this.f40938g;
                f1 f1Var4 = p1Var2.h;
                float min = Math.min(f1Var4.d, f1Var4.e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + p1Var2.h.f40890b;
                float f10 = p1Var2.h.f40891c;
                this.d = cos;
                this.e = (((float) Math.sin(-0.3141592653589793d)) * min) + f10;
                return;
            case 3:
                f1 f1Var5 = this.f40938g.h;
                this.d = f1Var5.f40890b;
                this.e = f1Var5.f40891c - Math.abs(f1Var5.e);
                return;
            case 4:
                f1 f1Var6 = this.f40938g.h;
                float f11 = f1Var6.f40894i;
                float f12 = f1Var6.f40895j;
                f1Var6.f40894i = f11;
                f1Var6.f40895j = f12;
                this.d = f11;
                this.e = f12;
                return;
            default:
                f1 f1Var7 = this.f40938g.h;
                this.d = f1Var7.f40890b;
                this.e = f1Var7.f40891c;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f40937f) {
            case 0:
                p1 p1Var = this.f40938g;
                f1 f1Var = p1Var.h;
                double atan2 = Math.atan2(f1Var.f40891c - f1Var.f40895j, f1Var.f40890b - f1Var.f40894i) + 1.5707963267948966d;
                f1 f1Var2 = p1Var.h;
                f1 f1Var3 = p1Var.h;
                float f11 = f1Var3.f40890b;
                float f12 = f1Var3.f40891c;
                p1Var.getClass();
                f1Var3.f40896k = Math.min((z6.a(f1Var2.f40890b, f1Var2.f40891c, f1Var2.f40894i, f1Var2.f40895j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f7))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f7;
                this.e = f10;
                f1 f1Var4 = this.f40938g.h;
                float a2 = z6.a(f1Var4.f40890b, f1Var4.f40891c, f7, f10);
                f1Var4.e = a2;
                f1Var4.d = a2;
                return;
            case 2:
                p1 p1Var2 = this.f40938g;
                f1 f1Var5 = p1Var2.h;
                float a10 = z6.a(f1Var5.f40890b, f1Var5.f40891c, f7, f10);
                f1Var5.e = a10;
                f1Var5.d = a10;
                f1 f1Var6 = p1Var2.h;
                f1Var6.h = (float) ((((float) Math.atan2(f1Var6.f40891c - f10, f7 - f1Var6.f40890b)) - 0.3141592653589793d) + f1Var6.h);
                a();
                return;
            case 3:
                p1 p1Var3 = this.f40938g;
                f1 f1Var7 = p1Var3.h;
                f1Var7.h = (float) ((((float) Math.atan2(f1Var7.f40891c - f10, f7 - f1Var7.f40890b)) - 1.5707963267948966d) + f1Var7.h);
                for (int i10 = 0; i10 < p1Var3.f40970m.size(); i10++) {
                    o1 o1Var = (o1) p1Var3.f40970m.get(i10);
                    if (o1Var instanceof n1) {
                        o1Var.a();
                    }
                }
                return;
            case 4:
                f1 f1Var8 = this.f40938g.h;
                f1Var8.f40894i = f7;
                f1Var8.f40895j = f10;
                this.d = f7;
                this.e = f10;
                float f13 = f1Var8.f40891c;
                float f14 = f1Var8.e;
                float f15 = f13 - f14;
                int i11 = (f10 > f15 ? 1 : (f10 == f15 ? 0 : -1));
                if (i11 > 0 && f10 < f13 + f14) {
                    float f16 = f1Var8.f40890b;
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
                float f20 = f1Var8.f40890b;
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
                f1Var8.f40894i = f19;
                f1Var8.f40895j = this.e;
                return;
            default:
                int i12 = 0;
                while (true) {
                    p1 p1Var4 = this.f40938g;
                    if (i12 < p1Var4.f40970m.size()) {
                        o1 o1Var2 = (o1) p1Var4.f40970m.get(i12);
                        if (o1Var2 != this) {
                            o1Var2.a();
                        }
                        i12++;
                    } else {
                        f1 f1Var9 = p1Var4.h;
                        f1Var9.f40890b = f7;
                        f1Var9.f40891c = f10;
                        this.d = f7;
                        this.e = f10;
                        return;
                    }
                }
        }
    }

    public l1(p1 p1Var, int i10, boolean z10) {
        super(0);
        this.f40937f = i10;
        this.f40938g = p1Var;
    }
}
