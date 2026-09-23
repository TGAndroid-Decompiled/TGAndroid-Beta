package pg;

import v7.z6;
public final class m1 extends p1 {
    public final int f40865f;
    public final q1 f40866g;

    public m1(q1 q1Var, int i10) {
        this.f40865f = i10;
        this.f40866g = q1Var;
    }

    @Override
    public final void a() {
        switch (this.f40865f) {
            case 0:
                q1 q1Var = this.f40866g;
                g1 g1Var = q1Var.h;
                double atan2 = Math.atan2(g1Var.f40818c - g1Var.f40822j, g1Var.f40817b - g1Var.f40821i) + 3.141592653589793d;
                g1 g1Var2 = q1Var.h;
                double d = g1Var2.f40823k / 5.5f;
                this.d = g1Var2.f40817b + ((float) (Math.cos(atan2) * d));
                this.e = q1Var.h.f40818c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                g1 g1Var3 = this.f40866g.h;
                float f7 = g1Var3.f40818c;
                this.d = g1Var3.f40817b + g1Var3.d;
                this.e = f7;
                return;
            case 2:
                q1 q1Var2 = this.f40866g;
                g1 g1Var4 = q1Var2.h;
                float min = Math.min(g1Var4.d, g1Var4.e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + q1Var2.h.f40817b;
                float f10 = q1Var2.h.f40818c;
                this.d = cos;
                this.e = (((float) Math.sin(-0.3141592653589793d)) * min) + f10;
                return;
            case 3:
                g1 g1Var5 = this.f40866g.h;
                this.d = g1Var5.f40817b;
                this.e = g1Var5.f40818c - Math.abs(g1Var5.e);
                return;
            case 4:
                g1 g1Var6 = this.f40866g.h;
                float f11 = g1Var6.f40821i;
                float f12 = g1Var6.f40822j;
                g1Var6.f40821i = f11;
                g1Var6.f40822j = f12;
                this.d = f11;
                this.e = f12;
                return;
            default:
                g1 g1Var7 = this.f40866g.h;
                this.d = g1Var7.f40817b;
                this.e = g1Var7.f40818c;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f40865f) {
            case 0:
                q1 q1Var = this.f40866g;
                g1 g1Var = q1Var.h;
                double atan2 = Math.atan2(g1Var.f40818c - g1Var.f40822j, g1Var.f40817b - g1Var.f40821i) + 1.5707963267948966d;
                g1 g1Var2 = q1Var.h;
                g1 g1Var3 = q1Var.h;
                float f11 = g1Var3.f40817b;
                float f12 = g1Var3.f40818c;
                q1Var.getClass();
                g1Var3.f40823k = Math.min((z6.a(g1Var2.f40817b, g1Var2.f40818c, g1Var2.f40821i, g1Var2.f40822j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f7))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f7;
                this.e = f10;
                g1 g1Var4 = this.f40866g.h;
                float a2 = z6.a(g1Var4.f40817b, g1Var4.f40818c, f7, f10);
                g1Var4.e = a2;
                g1Var4.d = a2;
                return;
            case 2:
                q1 q1Var2 = this.f40866g;
                g1 g1Var5 = q1Var2.h;
                float a10 = z6.a(g1Var5.f40817b, g1Var5.f40818c, f7, f10);
                g1Var5.e = a10;
                g1Var5.d = a10;
                g1 g1Var6 = q1Var2.h;
                g1Var6.h = (float) ((((float) Math.atan2(g1Var6.f40818c - f10, f7 - g1Var6.f40817b)) - 0.3141592653589793d) + g1Var6.h);
                a();
                return;
            case 3:
                q1 q1Var3 = this.f40866g;
                g1 g1Var7 = q1Var3.h;
                g1Var7.h = (float) ((((float) Math.atan2(g1Var7.f40818c - f10, f7 - g1Var7.f40817b)) - 1.5707963267948966d) + g1Var7.h);
                for (int i10 = 0; i10 < q1Var3.f40898m.size(); i10++) {
                    p1 p1Var = (p1) q1Var3.f40898m.get(i10);
                    if (p1Var instanceof o1) {
                        p1Var.a();
                    }
                }
                return;
            case 4:
                g1 g1Var8 = this.f40866g.h;
                g1Var8.f40821i = f7;
                g1Var8.f40822j = f10;
                this.d = f7;
                this.e = f10;
                float f13 = g1Var8.f40818c;
                float f14 = g1Var8.e;
                float f15 = f13 - f14;
                int i11 = (f10 > f15 ? 1 : (f10 == f15 ? 0 : -1));
                if (i11 > 0 && f10 < f13 + f14) {
                    float f16 = g1Var8.f40817b;
                    if (f7 <= f16) {
                        float f17 = f16 - g1Var8.d;
                        if (f7 > f17) {
                            this.d = f17;
                        }
                    }
                    if (f7 > f13) {
                        float f18 = f16 + g1Var8.d;
                        if (f7 < f18) {
                            this.d = f18;
                        }
                    }
                }
                float f19 = this.d;
                float f20 = g1Var8.f40817b;
                float f21 = g1Var8.d;
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
                g1Var8.f40821i = f19;
                g1Var8.f40822j = this.e;
                return;
            default:
                int i12 = 0;
                while (true) {
                    q1 q1Var4 = this.f40866g;
                    if (i12 < q1Var4.f40898m.size()) {
                        p1 p1Var2 = (p1) q1Var4.f40898m.get(i12);
                        if (p1Var2 != this) {
                            p1Var2.a();
                        }
                        i12++;
                    } else {
                        g1 g1Var9 = q1Var4.h;
                        g1Var9.f40817b = f7;
                        g1Var9.f40818c = f10;
                        this.d = f7;
                        this.e = f10;
                        return;
                    }
                }
        }
    }

    public m1(q1 q1Var, int i10, boolean z10) {
        super(0);
        this.f40865f = i10;
        this.f40866g = q1Var;
    }
}
