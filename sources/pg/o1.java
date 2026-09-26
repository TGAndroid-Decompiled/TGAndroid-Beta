package pg;

import v7.a7;
public final class o1 extends r1 {
    public final int f41194f;
    public final s1 f41195g;

    public o1(s1 s1Var, int i10) {
        this.f41194f = i10;
        this.f41195g = s1Var;
    }

    @Override
    public final void a() {
        switch (this.f41194f) {
            case 0:
                s1 s1Var = this.f41195g;
                i1 i1Var = s1Var.h;
                double atan2 = Math.atan2(i1Var.f41141c - i1Var.f41145j, i1Var.f41140b - i1Var.f41144i) + 3.141592653589793d;
                i1 i1Var2 = s1Var.h;
                double d = i1Var2.f41146k / 5.5f;
                this.d = i1Var2.f41140b + ((float) (Math.cos(atan2) * d));
                this.e = s1Var.h.f41141c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                i1 i1Var3 = this.f41195g.h;
                float f7 = i1Var3.f41141c;
                this.d = i1Var3.f41140b + i1Var3.d;
                this.e = f7;
                return;
            case 2:
                s1 s1Var2 = this.f41195g;
                i1 i1Var4 = s1Var2.h;
                float min = Math.min(i1Var4.d, i1Var4.e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + s1Var2.h.f41140b;
                float f10 = s1Var2.h.f41141c;
                this.d = cos;
                this.e = (((float) Math.sin(-0.3141592653589793d)) * min) + f10;
                return;
            case 3:
                i1 i1Var5 = this.f41195g.h;
                this.d = i1Var5.f41140b;
                this.e = i1Var5.f41141c - Math.abs(i1Var5.e);
                return;
            case 4:
                i1 i1Var6 = this.f41195g.h;
                float f11 = i1Var6.f41144i;
                float f12 = i1Var6.f41145j;
                i1Var6.f41144i = f11;
                i1Var6.f41145j = f12;
                this.d = f11;
                this.e = f12;
                return;
            default:
                i1 i1Var7 = this.f41195g.h;
                this.d = i1Var7.f41140b;
                this.e = i1Var7.f41141c;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f41194f) {
            case 0:
                s1 s1Var = this.f41195g;
                i1 i1Var = s1Var.h;
                double atan2 = Math.atan2(i1Var.f41141c - i1Var.f41145j, i1Var.f41140b - i1Var.f41144i) + 1.5707963267948966d;
                i1 i1Var2 = s1Var.h;
                i1 i1Var3 = s1Var.h;
                float f11 = i1Var3.f41140b;
                float f12 = i1Var3.f41141c;
                s1Var.getClass();
                i1Var3.f41146k = Math.min((a7.a(i1Var2.f41140b, i1Var2.f41141c, i1Var2.f41144i, i1Var2.f41145j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f7))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f7;
                this.e = f10;
                i1 i1Var4 = this.f41195g.h;
                float a2 = a7.a(i1Var4.f41140b, i1Var4.f41141c, f7, f10);
                i1Var4.e = a2;
                i1Var4.d = a2;
                return;
            case 2:
                s1 s1Var2 = this.f41195g;
                i1 i1Var5 = s1Var2.h;
                float a10 = a7.a(i1Var5.f41140b, i1Var5.f41141c, f7, f10);
                i1Var5.e = a10;
                i1Var5.d = a10;
                i1 i1Var6 = s1Var2.h;
                i1Var6.h = (float) ((((float) Math.atan2(i1Var6.f41141c - f10, f7 - i1Var6.f41140b)) - 0.3141592653589793d) + i1Var6.h);
                a();
                return;
            case 3:
                s1 s1Var3 = this.f41195g;
                i1 i1Var7 = s1Var3.h;
                i1Var7.h = (float) ((((float) Math.atan2(i1Var7.f41141c - f10, f7 - i1Var7.f41140b)) - 1.5707963267948966d) + i1Var7.h);
                for (int i10 = 0; i10 < s1Var3.f41251m.size(); i10++) {
                    r1 r1Var = (r1) s1Var3.f41251m.get(i10);
                    if (r1Var instanceof q1) {
                        r1Var.a();
                    }
                }
                return;
            case 4:
                i1 i1Var8 = this.f41195g.h;
                i1Var8.f41144i = f7;
                i1Var8.f41145j = f10;
                this.d = f7;
                this.e = f10;
                float f13 = i1Var8.f41141c;
                float f14 = i1Var8.e;
                float f15 = f13 - f14;
                int i11 = (f10 > f15 ? 1 : (f10 == f15 ? 0 : -1));
                if (i11 > 0 && f10 < f13 + f14) {
                    float f16 = i1Var8.f41140b;
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
                float f20 = i1Var8.f41140b;
                float f21 = i1Var8.d;
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
                i1Var8.f41144i = f19;
                i1Var8.f41145j = this.e;
                return;
            default:
                int i12 = 0;
                while (true) {
                    s1 s1Var4 = this.f41195g;
                    if (i12 < s1Var4.f41251m.size()) {
                        r1 r1Var2 = (r1) s1Var4.f41251m.get(i12);
                        if (r1Var2 != this) {
                            r1Var2.a();
                        }
                        i12++;
                    } else {
                        i1 i1Var9 = s1Var4.h;
                        i1Var9.f41140b = f7;
                        i1Var9.f41141c = f10;
                        this.d = f7;
                        this.e = f10;
                        return;
                    }
                }
        }
    }

    public o1(s1 s1Var, int i10, boolean z10) {
        super(0);
        this.f41194f = i10;
        this.f41195g = s1Var;
    }
}
