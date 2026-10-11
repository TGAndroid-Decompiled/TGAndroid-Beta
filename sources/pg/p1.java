package pg;

import v7.z6;
public final class p1 extends q1 {
    public final h1 f45752f;
    public final float f45753g;
    public final float h;
    public final r1 f45754i;

    public p1(r1 r1Var, h1 h1Var, boolean z10, boolean z11) {
        float f7;
        this.f45754i = r1Var;
        this.f45760b = false;
        this.f45752f = h1Var;
        if (z10) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        this.f45753g = f7;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        h1 h1Var = this.f45752f;
        if (h1Var != null) {
            float f7 = (this.f45753g * h1Var.d) + h1Var.f45688b;
            float f10 = h1Var.f45689c;
            r1 r1Var = this.f45754i;
            r1Var.c(f7, (this.h * h1Var.f45690e) + f10, true);
            float[] fArr = r1Var.f45782p;
            float f11 = fArr[0];
            float f12 = fArr[1];
            this.d = f11;
            this.f45762e = f12;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        this.d = f7;
        this.f45762e = f10;
        h1 h1Var = this.f45752f;
        float f11 = ((-this.f45753g) * h1Var.d) + h1Var.f45688b;
        float f12 = ((-this.h) * h1Var.f45690e) + h1Var.f45689c;
        r1 r1Var = this.f45754i;
        r1Var.c(f7, f10, false);
        r1Var.c(f11, f12, true);
        float[] fArr = r1Var.f45782p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f7 - f13)) - h1Var.h;
        h1Var.d = ((float) Math.abs(Math.cos(atan2) * z6.a(f7, f10, f13, f14))) / 2.0f;
        h1Var.f45690e = ((float) Math.abs(Math.sin(atan2) * z6.a(f7, f10, f13, f14))) / 2.0f;
        h1Var.f45688b = (f7 + f13) / 2.0f;
        h1Var.f45689c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < r1Var.f45779m.size(); i10++) {
            ((q1) r1Var.f45779m.get(i10)).a();
        }
    }
}
