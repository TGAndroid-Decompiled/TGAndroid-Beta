package pg;

import v7.z6;
public final class n1 extends q1 {
    public final int f41176f;
    public final r1 f41177g;

    public n1(r1 r1Var, int i10) {
        this.f41176f = i10;
        this.f41177g = r1Var;
    }

    @Override
    public final void a() {
        switch (this.f41176f) {
            case 0:
                r1 r1Var = this.f41177g;
                h1 h1Var = r1Var.h;
                double atan2 = Math.atan2(h1Var.f41128c - h1Var.f41132j, h1Var.f41127b - h1Var.f41131i) + 3.141592653589793d;
                h1 h1Var2 = r1Var.h;
                double d = h1Var2.f41133k / 5.5f;
                this.d = h1Var2.f41127b + ((float) (Math.cos(atan2) * d));
                this.e = r1Var.h.f41128c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                h1 h1Var3 = this.f41177g.h;
                float f7 = h1Var3.f41128c;
                this.d = h1Var3.f41127b + h1Var3.d;
                this.e = f7;
                return;
            case 2:
                r1 r1Var2 = this.f41177g;
                h1 h1Var4 = r1Var2.h;
                float min = Math.min(h1Var4.d, h1Var4.e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + r1Var2.h.f41127b;
                float f10 = r1Var2.h.f41128c;
                this.d = cos;
                this.e = (((float) Math.sin(-0.3141592653589793d)) * min) + f10;
                return;
            case 3:
                h1 h1Var5 = this.f41177g.h;
                this.d = h1Var5.f41127b;
                this.e = h1Var5.f41128c - Math.abs(h1Var5.e);
                return;
            case 4:
                h1 h1Var6 = this.f41177g.h;
                float f11 = h1Var6.f41131i;
                float f12 = h1Var6.f41132j;
                h1Var6.f41131i = f11;
                h1Var6.f41132j = f12;
                this.d = f11;
                this.e = f12;
                return;
            default:
                h1 h1Var7 = this.f41177g.h;
                this.d = h1Var7.f41127b;
                this.e = h1Var7.f41128c;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f41176f) {
            case 0:
                r1 r1Var = this.f41177g;
                h1 h1Var = r1Var.h;
                double atan2 = Math.atan2(h1Var.f41128c - h1Var.f41132j, h1Var.f41127b - h1Var.f41131i) + 1.5707963267948966d;
                h1 h1Var2 = r1Var.h;
                h1 h1Var3 = r1Var.h;
                float f11 = h1Var3.f41127b;
                float f12 = h1Var3.f41128c;
                r1Var.getClass();
                h1Var3.f41133k = Math.min((z6.a(h1Var2.f41127b, h1Var2.f41128c, h1Var2.f41131i, h1Var2.f41132j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f7))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f7;
                this.e = f10;
                h1 h1Var4 = this.f41177g.h;
                float a2 = z6.a(h1Var4.f41127b, h1Var4.f41128c, f7, f10);
                h1Var4.e = a2;
                h1Var4.d = a2;
                return;
            case 2:
                r1 r1Var2 = this.f41177g;
                h1 h1Var5 = r1Var2.h;
                float a10 = z6.a(h1Var5.f41127b, h1Var5.f41128c, f7, f10);
                h1Var5.e = a10;
                h1Var5.d = a10;
                h1 h1Var6 = r1Var2.h;
                h1Var6.h = (float) ((((float) Math.atan2(h1Var6.f41128c - f10, f7 - h1Var6.f41127b)) - 0.3141592653589793d) + h1Var6.h);
                a();
                return;
            case 3:
                r1 r1Var3 = this.f41177g;
                h1 h1Var7 = r1Var3.h;
                h1Var7.h = (float) ((((float) Math.atan2(h1Var7.f41128c - f10, f7 - h1Var7.f41127b)) - 1.5707963267948966d) + h1Var7.h);
                for (int i10 = 0; i10 < r1Var3.f41211m.size(); i10++) {
                    q1 q1Var = (q1) r1Var3.f41211m.get(i10);
                    if (q1Var instanceof p1) {
                        q1Var.a();
                    }
                }
                return;
            case 4:
                h1 h1Var8 = this.f41177g.h;
                h1Var8.f41131i = f7;
                h1Var8.f41132j = f10;
                this.d = f7;
                this.e = f10;
                float f13 = h1Var8.f41128c;
                float f14 = h1Var8.e;
                float f15 = f13 - f14;
                int i11 = (f10 > f15 ? 1 : (f10 == f15 ? 0 : -1));
                if (i11 > 0 && f10 < f13 + f14) {
                    float f16 = h1Var8.f41127b;
                    if (f7 <= f16) {
                        float f17 = f16 - h1Var8.d;
                        if (f7 > f17) {
                            this.d = f17;
                        }
                    }
                    if (f7 > f13) {
                        float f18 = f16 + h1Var8.d;
                        if (f7 < f18) {
                            this.d = f18;
                        }
                    }
                }
                float f19 = this.d;
                float f20 = h1Var8.f41127b;
                float f21 = h1Var8.d;
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
                h1Var8.f41131i = f19;
                h1Var8.f41132j = this.e;
                return;
            default:
                int i12 = 0;
                while (true) {
                    r1 r1Var4 = this.f41177g;
                    if (i12 < r1Var4.f41211m.size()) {
                        q1 q1Var2 = (q1) r1Var4.f41211m.get(i12);
                        if (q1Var2 != this) {
                            q1Var2.a();
                        }
                        i12++;
                    } else {
                        h1 h1Var9 = r1Var4.h;
                        h1Var9.f41127b = f7;
                        h1Var9.f41128c = f10;
                        this.d = f7;
                        this.e = f10;
                        return;
                    }
                }
        }
    }

    public n1(r1 r1Var, int i10, boolean z10) {
        super(0);
        this.f41176f = i10;
        this.f41177g = r1Var;
    }
}
