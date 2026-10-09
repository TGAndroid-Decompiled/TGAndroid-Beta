package pg;

import v7.z6;
public final class p1 extends q1 {
    public final h1 f45718f;
    public final float f45719g;
    public final float h;
    public final r1 f45720i;

    public p1(r1 r1Var, h1 h1Var, boolean z10, boolean z11) {
        float f7;
        this.f45720i = r1Var;
        this.f45726b = false;
        this.f45718f = h1Var;
        if (z10) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        this.f45719g = f7;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        h1 h1Var = this.f45718f;
        if (h1Var != null) {
            float f7 = (this.f45719g * h1Var.d) + h1Var.f45654b;
            float f10 = h1Var.f45655c;
            r1 r1Var = this.f45720i;
            r1Var.c(f7, (this.h * h1Var.f45656e) + f10, true);
            float[] fArr = r1Var.f45748p;
            float f11 = fArr[0];
            float f12 = fArr[1];
            this.d = f11;
            this.f45728e = f12;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        this.d = f7;
        this.f45728e = f10;
        h1 h1Var = this.f45718f;
        float f11 = ((-this.f45719g) * h1Var.d) + h1Var.f45654b;
        float f12 = ((-this.h) * h1Var.f45656e) + h1Var.f45655c;
        r1 r1Var = this.f45720i;
        r1Var.c(f7, f10, false);
        r1Var.c(f11, f12, true);
        float[] fArr = r1Var.f45748p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f7 - f13)) - h1Var.h;
        h1Var.d = ((float) Math.abs(Math.cos(atan2) * z6.a(f7, f10, f13, f14))) / 2.0f;
        h1Var.f45656e = ((float) Math.abs(Math.sin(atan2) * z6.a(f7, f10, f13, f14))) / 2.0f;
        h1Var.f45654b = (f7 + f13) / 2.0f;
        h1Var.f45655c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < r1Var.f45745m.size(); i10++) {
            ((q1) r1Var.f45745m.get(i10)).a();
        }
    }
}
