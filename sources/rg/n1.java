package rg;

import a8.ic;
public final class n1 extends o1 {
    public final f1 f47509f;
    public final float f47510g;
    public final float h;
    public final p1 f47511i;

    public n1(p1 p1Var, f1 f1Var, boolean z10, boolean z11) {
        float f7;
        this.f47511i = p1Var;
        this.f47518b = false;
        this.f47509f = f1Var;
        if (z10) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        this.f47510g = f7;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        f1 f1Var = this.f47509f;
        if (f1Var != null) {
            float f7 = (this.f47510g * f1Var.d) + f1Var.f47451b;
            float f10 = f1Var.f47452c;
            p1 p1Var = this.f47511i;
            p1Var.c(f7, (this.h * f1Var.e) + f10, true);
            float[] fArr = p1Var.f47537p;
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
        f1 f1Var = this.f47509f;
        float f11 = ((-this.f47510g) * f1Var.d) + f1Var.f47451b;
        float f12 = ((-this.h) * f1Var.e) + f1Var.f47452c;
        p1 p1Var = this.f47511i;
        p1Var.c(f7, f10, false);
        p1Var.c(f11, f12, true);
        float[] fArr = p1Var.f47537p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f7 - f13)) - f1Var.h;
        f1Var.d = ((float) Math.abs(Math.cos(atan2) * ic.a(f7, f10, f13, f14))) / 2.0f;
        f1Var.e = ((float) Math.abs(Math.sin(atan2) * ic.a(f7, f10, f13, f14))) / 2.0f;
        f1Var.f47451b = (f7 + f13) / 2.0f;
        f1Var.f47452c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < p1Var.f47534m.size(); i10++) {
            ((o1) p1Var.f47534m.get(i10)).a();
        }
    }
}
