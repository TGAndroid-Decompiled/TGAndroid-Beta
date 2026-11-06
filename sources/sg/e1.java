package sg;

import a8.r9;
public final class e1 extends h1 {
    public final int f54929f;
    public final i1 f54930g;

    public e1(i1 i1Var, int i7) {
        this.f54929f = i7;
        this.f54930g = i1Var;
    }

    @Override
    public final void a() {
        switch (this.f54929f) {
            case 0:
                i1 i1Var = this.f54930g;
                z0 z0Var = i1Var.h;
                double atan2 = Math.atan2(z0Var.f55152c - z0Var.f55157j, z0Var.f55151b - z0Var.f55156i) + 3.141592653589793d;
                z0 z0Var2 = i1Var.h;
                double d = z0Var2.f55158k / 5.5f;
                this.d = z0Var2.f55151b + ((float) (Math.cos(atan2) * d));
                this.f54949e = i1Var.h.f55152c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                z0 z0Var3 = this.f54930g.h;
                float f10 = z0Var3.f55152c;
                this.d = z0Var3.f55151b + z0Var3.d;
                this.f54949e = f10;
                return;
            case 2:
                i1 i1Var2 = this.f54930g;
                z0 z0Var4 = i1Var2.h;
                float min = Math.min(z0Var4.d, z0Var4.f55153e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + i1Var2.h.f55151b;
                float f11 = i1Var2.h.f55152c;
                this.d = cos;
                this.f54949e = (((float) Math.sin(-0.3141592653589793d)) * min) + f11;
                return;
            case 3:
                z0 z0Var5 = this.f54930g.h;
                this.d = z0Var5.f55151b;
                this.f54949e = z0Var5.f55152c - Math.abs(z0Var5.f55153e);
                return;
            case 4:
                z0 z0Var6 = this.f54930g.h;
                float f12 = z0Var6.f55156i;
                float f13 = z0Var6.f55157j;
                z0Var6.f55156i = f12;
                z0Var6.f55157j = f13;
                this.d = f12;
                this.f54949e = f13;
                return;
            default:
                z0 z0Var7 = this.f54930g.h;
                this.d = z0Var7.f55151b;
                this.f54949e = z0Var7.f55152c;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f54929f) {
            case 0:
                i1 i1Var = this.f54930g;
                z0 z0Var = i1Var.h;
                double atan2 = Math.atan2(z0Var.f55152c - z0Var.f55157j, z0Var.f55151b - z0Var.f55156i) + 1.5707963267948966d;
                z0 z0Var2 = i1Var.h;
                z0 z0Var3 = i1Var.h;
                float f12 = z0Var3.f55151b;
                float f13 = z0Var3.f55152c;
                i1Var.getClass();
                z0Var3.f55158k = Math.min((r9.a(z0Var2.f55151b, z0Var2.f55152c, z0Var2.f55156i, z0Var2.f55157j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f10;
                this.f54949e = f11;
                z0 z0Var4 = this.f54930g.h;
                float a10 = r9.a(z0Var4.f55151b, z0Var4.f55152c, f10, f11);
                z0Var4.f55153e = a10;
                z0Var4.d = a10;
                return;
            case 2:
                i1 i1Var2 = this.f54930g;
                z0 z0Var5 = i1Var2.h;
                float a11 = r9.a(z0Var5.f55151b, z0Var5.f55152c, f10, f11);
                z0Var5.f55153e = a11;
                z0Var5.d = a11;
                z0 z0Var6 = i1Var2.h;
                z0Var6.h = (float) ((((float) Math.atan2(z0Var6.f55152c - f11, f10 - z0Var6.f55151b)) - 0.3141592653589793d) + z0Var6.h);
                a();
                return;
            case 3:
                i1 i1Var3 = this.f54930g;
                z0 z0Var7 = i1Var3.h;
                z0Var7.h = (float) ((((float) Math.atan2(z0Var7.f55152c - f11, f10 - z0Var7.f55151b)) - 1.5707963267948966d) + z0Var7.h);
                for (int i7 = 0; i7 < i1Var3.f54963m.size(); i7++) {
                    h1 h1Var = (h1) i1Var3.f54963m.get(i7);
                    if (h1Var instanceof g1) {
                        h1Var.a();
                    }
                }
                return;
            case 4:
                z0 z0Var8 = this.f54930g.h;
                z0Var8.f55156i = f10;
                z0Var8.f55157j = f11;
                this.d = f10;
                this.f54949e = f11;
                float f14 = z0Var8.f55152c;
                float f15 = z0Var8.f55153e;
                float f16 = f14 - f15;
                int i10 = (f11 > f16 ? 1 : (f11 == f16 ? 0 : -1));
                if (i10 > 0 && f11 < f14 + f15) {
                    float f17 = z0Var8.f55151b;
                    if (f10 <= f17) {
                        float f18 = f17 - z0Var8.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + z0Var8.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = z0Var8.f55151b;
                float f22 = z0Var8.d;
                if (f20 > f21 - f22 && f20 < f21 + f22) {
                    if (f11 <= f14 && i10 > 0) {
                        this.f54949e = f16;
                    } else if (f11 > f14) {
                        float f23 = f14 + f15;
                        if (f11 < f23) {
                            this.f54949e = f23;
                        }
                    }
                }
                z0Var8.f55156i = f20;
                z0Var8.f55157j = this.f54949e;
                return;
            default:
                int i11 = 0;
                while (true) {
                    i1 i1Var4 = this.f54930g;
                    if (i11 < i1Var4.f54963m.size()) {
                        h1 h1Var2 = (h1) i1Var4.f54963m.get(i11);
                        if (h1Var2 != this) {
                            h1Var2.a();
                        }
                        i11++;
                    } else {
                        z0 z0Var9 = i1Var4.h;
                        z0Var9.f55151b = f10;
                        z0Var9.f55152c = f11;
                        this.d = f10;
                        this.f54949e = f11;
                        return;
                    }
                }
        }
    }

    public e1(i1 i1Var, int i7, boolean z9) {
        super(0);
        this.f54929f = i7;
        this.f54930g = i1Var;
    }
}
