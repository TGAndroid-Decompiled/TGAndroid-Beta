package yf;

public final class k1 extends n1 {

    public final int f49971f;

    public final o1 f49972g;

    public k1(o1 o1Var, int i10) {
        this.f49971f = i10;
        this.f49972g = o1Var;
    }

    @Override
    public final void a() {
        switch (this.f49971f) {
            case 0:
                o1 o1Var = this.f49972g;
                e1 e1Var = o1Var.h;
                double dAtan2 = Math.atan2(e1Var.f49923c - e1Var.f49928j, e1Var.f49922b - e1Var.f49927i) + 3.141592653589793d;
                e1 e1Var2 = o1Var.h;
                double d = e1Var2.f49929k / 5.5f;
                float fCos = e1Var2.f49922b + ((float) (Math.cos(dAtan2) * d));
                float fSin = o1Var.h.f49923c + ((float) (Math.sin(dAtan2) * d));
                this.d = fCos;
                this.f49992e = fSin;
                break;
            case 1:
                e1 e1Var3 = this.f49972g.h;
                float f10 = e1Var3.f49922b + e1Var3.d;
                float f11 = e1Var3.f49923c;
                this.d = f10;
                this.f49992e = f11;
                break;
            case 2:
                o1 o1Var2 = this.f49972g;
                e1 e1Var4 = o1Var2.h;
                float fMin = Math.min(e1Var4.d, e1Var4.f49924e);
                float fCos2 = (((float) Math.cos(-0.3141592653589793d)) * fMin) + o1Var2.h.f49922b;
                float fSin2 = (((float) Math.sin(-0.3141592653589793d)) * fMin) + o1Var2.h.f49923c;
                this.d = fCos2;
                this.f49992e = fSin2;
                break;
            case 3:
                e1 e1Var5 = this.f49972g.h;
                float f12 = e1Var5.f49922b;
                float fAbs = e1Var5.f49923c - Math.abs(e1Var5.f49924e);
                this.d = f12;
                this.f49992e = fAbs;
                break;
            case 4:
                e1 e1Var6 = this.f49972g.h;
                float f13 = e1Var6.f49927i;
                float f14 = e1Var6.f49928j;
                e1Var6.f49927i = f13;
                e1Var6.f49928j = f14;
                this.d = f13;
                this.f49992e = f14;
                break;
            default:
                e1 e1Var7 = this.f49972g.h;
                this.d = e1Var7.f49922b;
                this.f49992e = e1Var7.f49923c;
                break;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        float f12;
        switch (this.f49971f) {
            case 0:
                o1 o1Var = this.f49972g;
                e1 e1Var = o1Var.h;
                double dAtan2 = Math.atan2(e1Var.f49923c - e1Var.f49928j, e1Var.f49922b - e1Var.f49927i) + 1.5707963267948966d;
                e1 e1Var2 = o1Var.h;
                float fA = (h7.y.a(e1Var2.f49922b, e1Var2.f49923c, e1Var2.f49927i, e1Var2.f49928j) * 5.5f) / 2.0f;
                e1 e1Var3 = o1Var.h;
                float f13 = e1Var3.f49922b;
                float f14 = e1Var3.f49923c;
                o1Var.getClass();
                e1Var3.f49929k = Math.min(fA, Math.max(100.0f, (-((float) ((Math.cos(dAtan2) * ((double) (f14 - f11))) - (Math.sin(dAtan2) * ((double) (f13 - f10)))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f10;
                this.f49992e = f11;
                e1 e1Var4 = this.f49972g.h;
                float fA2 = h7.y.a(e1Var4.f49922b, e1Var4.f49923c, f10, f11);
                e1Var4.f49924e = fA2;
                e1Var4.d = fA2;
                break;
            case 2:
                o1 o1Var2 = this.f49972g;
                e1 e1Var5 = o1Var2.h;
                float fA3 = h7.y.a(e1Var5.f49922b, e1Var5.f49923c, f10, f11);
                e1Var5.f49924e = fA3;
                e1Var5.d = fA3;
                e1 e1Var6 = o1Var2.h;
                e1Var6.h = (float) ((((double) ((float) Math.atan2(e1Var6.f49923c - f11, f10 - e1Var6.f49922b))) - 0.3141592653589793d) + ((double) e1Var6.h));
                a();
                break;
            case 3:
                o1 o1Var3 = this.f49972g;
                e1 e1Var7 = o1Var3.h;
                e1Var7.h = (float) ((((double) ((float) Math.atan2(e1Var7.f49923c - f11, f10 - e1Var7.f49922b))) - 1.5707963267948966d) + ((double) e1Var7.h));
                for (int i10 = 0; i10 < o1Var3.f50007m.size(); i10++) {
                    n1 n1Var = (n1) o1Var3.f50007m.get(i10);
                    if (n1Var instanceof m1) {
                        n1Var.a();
                    }
                }
                break;
            case 4:
                e1 e1Var8 = this.f49972g.h;
                e1Var8.f49927i = f10;
                e1Var8.f49928j = f11;
                this.d = f10;
                this.f49992e = f11;
                float f15 = e1Var8.f49923c;
                float f16 = e1Var8.f49924e;
                float f17 = f15 - f16;
                if (f11 > f17 && f11 < f15 + f16) {
                    float f18 = e1Var8.f49922b;
                    if (f10 <= f18) {
                        float f19 = f18 - e1Var8.d;
                        if (f10 > f19) {
                            this.d = f19;
                        } else if (f10 > f15) {
                            f12 = f18 + e1Var8.d;
                            if (f10 < f12) {
                                this.d = f12;
                            }
                        }
                    } else if (f10 > f15) {
                        f12 = f18 + e1Var8.d;
                        if (f10 < f12) {
                            this.d = f12;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = e1Var8.f49922b;
                float f22 = e1Var8.d;
                if (f20 > f21 - f22 && f20 < f21 + f22) {
                    if (f11 <= f15 && f11 > f17) {
                        this.f49992e = f17;
                    } else if (f11 > f15) {
                        float f23 = f15 + f16;
                        if (f11 < f23) {
                            this.f49992e = f23;
                        }
                    }
                }
                e1Var8.f49927i = f20;
                e1Var8.f49928j = this.f49992e;
                break;
            default:
                int i11 = 0;
                while (true) {
                    o1 o1Var4 = this.f49972g;
                    if (i11 >= o1Var4.f50007m.size()) {
                        e1 e1Var9 = o1Var4.h;
                        e1Var9.f49922b = f10;
                        e1Var9.f49923c = f11;
                        this.d = f10;
                        this.f49992e = f11;
                    } else {
                        n1 n1Var2 = (n1) o1Var4.f50007m.get(i11);
                        if (n1Var2 != this) {
                            n1Var2.a();
                        }
                        i11++;
                    }
                    break;
                }
                break;
        }
    }

    public k1(o1 o1Var, int i10, boolean z10) {
        super(0);
        this.f49971f = i10;
        this.f49972g = o1Var;
    }
}
