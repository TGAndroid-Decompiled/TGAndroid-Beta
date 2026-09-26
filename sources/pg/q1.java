package pg;

import v7.a7;
public final class q1 extends r1 {
    public final i1 f41204f;
    public final float f41205g;
    public final float h;
    public final s1 f41206i;

    public q1(s1 s1Var, i1 i1Var, boolean z10, boolean z11) {
        float f7;
        this.f41206i = s1Var;
        this.f41213b = false;
        this.f41204f = i1Var;
        if (z10) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        this.f41205g = f7;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        i1 i1Var = this.f41204f;
        if (i1Var != null) {
            float f7 = (this.f41205g * i1Var.d) + i1Var.f41140b;
            float f10 = i1Var.f41141c;
            s1 s1Var = this.f41206i;
            s1Var.c(f7, (this.h * i1Var.e) + f10, true);
            float[] fArr = s1Var.f41254p;
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
        i1 i1Var = this.f41204f;
        float f11 = ((-this.f41205g) * i1Var.d) + i1Var.f41140b;
        float f12 = ((-this.h) * i1Var.e) + i1Var.f41141c;
        s1 s1Var = this.f41206i;
        s1Var.c(f7, f10, false);
        s1Var.c(f11, f12, true);
        float[] fArr = s1Var.f41254p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f7 - f13)) - i1Var.h;
        i1Var.d = ((float) Math.abs(Math.cos(atan2) * a7.a(f7, f10, f13, f14))) / 2.0f;
        i1Var.e = ((float) Math.abs(Math.sin(atan2) * a7.a(f7, f10, f13, f14))) / 2.0f;
        i1Var.f41140b = (f7 + f13) / 2.0f;
        i1Var.f41141c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < s1Var.f41251m.size(); i10++) {
            ((r1) s1Var.f41251m.get(i10)).a();
        }
    }
}
