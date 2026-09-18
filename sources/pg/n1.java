package pg;

import v7.z6;
public final class n1 extends o1 {
    public final f1 f40948f;
    public final float f40949g;
    public final float h;
    public final p1 f40950i;

    public n1(p1 p1Var, f1 f1Var, boolean z10, boolean z11) {
        float f7;
        this.f40950i = p1Var;
        this.f40957b = false;
        this.f40948f = f1Var;
        if (z10) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        this.f40949g = f7;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        f1 f1Var = this.f40948f;
        if (f1Var != null) {
            float f7 = (this.f40949g * f1Var.d) + f1Var.f40890b;
            float f10 = f1Var.f40891c;
            p1 p1Var = this.f40950i;
            p1Var.c(f7, (this.h * f1Var.e) + f10, true);
            float[] fArr = p1Var.f40973p;
            float f11 = fArr[0];
            float f12 = fArr[1];
            this.d = f11;
            this.e = f12;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        this.d = f7;
        this.e = f10;
        f1 f1Var = this.f40948f;
        float f11 = ((-this.f40949g) * f1Var.d) + f1Var.f40890b;
        float f12 = ((-this.h) * f1Var.e) + f1Var.f40891c;
        p1 p1Var = this.f40950i;
        p1Var.c(f7, f10, false);
        p1Var.c(f11, f12, true);
        float[] fArr = p1Var.f40973p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f7 - f13)) - f1Var.h;
        f1Var.d = ((float) Math.abs(Math.cos(atan2) * z6.a(f7, f10, f13, f14))) / 2.0f;
        f1Var.e = ((float) Math.abs(Math.sin(atan2) * z6.a(f7, f10, f13, f14))) / 2.0f;
        f1Var.f40890b = (f7 + f13) / 2.0f;
        f1Var.f40891c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < p1Var.f40970m.size(); i10++) {
            ((o1) p1Var.f40970m.get(i10)).a();
        }
    }
}
