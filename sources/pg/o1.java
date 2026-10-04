package pg;

import v7.z6;
public final class o1 extends r1 {
    public final int f44554f;
    public final s1 f44555g;

    public o1(s1 s1Var, int i10) {
        this.f44554f = i10;
        this.f44555g = s1Var;
    }

    @Override
    public final void a() {
        switch (this.f44554f) {
            case 0:
                s1 s1Var = this.f44555g;
                i1 i1Var = s1Var.h;
                double atan2 = Math.atan2(i1Var.f44497c - i1Var.f44502j, i1Var.f44496b - i1Var.f44501i) + 3.141592653589793d;
                i1 i1Var2 = s1Var.h;
                double d = i1Var2.f44503k / 5.5f;
                this.d = i1Var2.f44496b + ((float) (Math.cos(atan2) * d));
                this.f44576e = s1Var.h.f44497c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                i1 i1Var3 = this.f44555g.h;
                float f7 = i1Var3.f44497c;
                this.d = i1Var3.f44496b + i1Var3.d;
                this.f44576e = f7;
                return;
            case 2:
                s1 s1Var2 = this.f44555g;
                i1 i1Var4 = s1Var2.h;
                float min = Math.min(i1Var4.d, i1Var4.f44498e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + s1Var2.h.f44496b;
                float f10 = s1Var2.h.f44497c;
                this.d = cos;
                this.f44576e = (((float) Math.sin(-0.3141592653589793d)) * min) + f10;
                return;
            case 3:
                i1 i1Var5 = this.f44555g.h;
                this.d = i1Var5.f44496b;
                this.f44576e = i1Var5.f44497c - Math.abs(i1Var5.f44498e);
                return;
            case 4:
                i1 i1Var6 = this.f44555g.h;
                float f11 = i1Var6.f44501i;
                float f12 = i1Var6.f44502j;
                i1Var6.f44501i = f11;
                i1Var6.f44502j = f12;
                this.d = f11;
                this.f44576e = f12;
                return;
            default:
                i1 i1Var7 = this.f44555g.h;
                this.d = i1Var7.f44496b;
                this.f44576e = i1Var7.f44497c;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f44554f) {
            case 0:
                s1 s1Var = this.f44555g;
                i1 i1Var = s1Var.h;
                double atan2 = Math.atan2(i1Var.f44497c - i1Var.f44502j, i1Var.f44496b - i1Var.f44501i) + 1.5707963267948966d;
                i1 i1Var2 = s1Var.h;
                i1 i1Var3 = s1Var.h;
                float f11 = i1Var3.f44496b;
                float f12 = i1Var3.f44497c;
                s1Var.getClass();
                i1Var3.f44503k = Math.min((z6.a(i1Var2.f44496b, i1Var2.f44497c, i1Var2.f44501i, i1Var2.f44502j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f7))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f7;
                this.f44576e = f10;
                i1 i1Var4 = this.f44555g.h;
                float a2 = z6.a(i1Var4.f44496b, i1Var4.f44497c, f7, f10);
                i1Var4.f44498e = a2;
                i1Var4.d = a2;
                return;
            case 2:
                s1 s1Var2 = this.f44555g;
                i1 i1Var5 = s1Var2.h;
                float a10 = z6.a(i1Var5.f44496b, i1Var5.f44497c, f7, f10);
                i1Var5.f44498e = a10;
                i1Var5.d = a10;
                i1 i1Var6 = s1Var2.h;
                i1Var6.h = (float) ((((float) Math.atan2(i1Var6.f44497c - f10, f7 - i1Var6.f44496b)) - 0.3141592653589793d) + i1Var6.h);
                a();
                return;
            case 3:
                s1 s1Var3 = this.f44555g;
                i1 i1Var7 = s1Var3.h;
                i1Var7.h = (float) ((((float) Math.atan2(i1Var7.f44497c - f10, f7 - i1Var7.f44496b)) - 1.5707963267948966d) + i1Var7.h);
                for (int i10 = 0; i10 < s1Var3.f44616m.size(); i10++) {
                    r1 r1Var = (r1) s1Var3.f44616m.get(i10);
                    if (r1Var instanceof q1) {
                        r1Var.a();
                    }
                }
                return;
            case 4:
                i1 i1Var8 = this.f44555g.h;
                i1Var8.f44501i = f7;
                i1Var8.f44502j = f10;
                this.d = f7;
                this.f44576e = f10;
                float f13 = i1Var8.f44497c;
                float f14 = i1Var8.f44498e;
                float f15 = f13 - f14;
                int i11 = (f10 > f15 ? 1 : (f10 == f15 ? 0 : -1));
                if (i11 > 0 && f10 < f13 + f14) {
                    float f16 = i1Var8.f44496b;
                    if (f7 <= f16) {
                        float f17 = f16 - i1Var8.d;
                        if (f7 > f17) {
                            this.d = f17;
                        }
                    }
                    if (f7 > f13) {
                        float f18 = f16 + i1Var8.d;
                        if (f7 < f18) {
                            this.d = f18;
                        }
                    }
                }
                float f19 = this.d;
                float f20 = i1Var8.f44496b;
                float f21 = i1Var8.d;
                if (f19 > f20 - f21 && f19 < f20 + f21) {
                    if (f10 <= f13 && i11 > 0) {
                        this.f44576e = f15;
                    } else if (f10 > f13) {
                        float f22 = f13 + f14;
                        if (f10 < f22) {
                            this.f44576e = f22;
                        }
                    }
                }
                i1Var8.f44501i = f19;
                i1Var8.f44502j = this.f44576e;
                return;
            default:
                int i12 = 0;
                while (true) {
                    s1 s1Var4 = this.f44555g;
                    if (i12 < s1Var4.f44616m.size()) {
                        r1 r1Var2 = (r1) s1Var4.f44616m.get(i12);
                        if (r1Var2 != this) {
                            r1Var2.a();
                        }
                        i12++;
                    } else {
                        i1 i1Var9 = s1Var4.h;
                        i1Var9.f44496b = f7;
                        i1Var9.f44497c = f10;
                        this.d = f7;
                        this.f44576e = f10;
                        return;
                    }
                }
        }
    }

    public o1(s1 s1Var, int i10, boolean z10) {
        super(0);
        this.f44554f = i10;
        this.f44555g = s1Var;
    }
}
