package pg;

import v7.z6;
public final class o1 extends p1 {
    public final g1 f45597f;
    public final float f45598g;
    public final float h;
    public final q1 f45599i;

    public o1(q1 q1Var, g1 g1Var, boolean z10, boolean z11) {
        float f7;
        this.f45599i = q1Var;
        this.f45604b = false;
        this.f45597f = g1Var;
        if (z10) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        this.f45598g = f7;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        g1 g1Var = this.f45597f;
        if (g1Var != null) {
            float f7 = (this.f45598g * g1Var.d) + g1Var.f45534b;
            float f10 = g1Var.f45535c;
            q1 q1Var = this.f45599i;
            q1Var.c(f7, (this.h * g1Var.f45536e) + f10, true);
            float[] fArr = q1Var.f45623p;
            float f11 = fArr[0];
            float f12 = fArr[1];
            this.d = f11;
            this.f45606e = f12;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        this.d = f7;
        this.f45606e = f10;
        g1 g1Var = this.f45597f;
        float f11 = ((-this.f45598g) * g1Var.d) + g1Var.f45534b;
        float f12 = ((-this.h) * g1Var.f45536e) + g1Var.f45535c;
        q1 q1Var = this.f45599i;
        q1Var.c(f7, f10, false);
        q1Var.c(f11, f12, true);
        float[] fArr = q1Var.f45623p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f7 - f13)) - g1Var.h;
        g1Var.d = ((float) Math.abs(Math.cos(atan2) * z6.a(f7, f10, f13, f14))) / 2.0f;
        g1Var.f45536e = ((float) Math.abs(Math.sin(atan2) * z6.a(f7, f10, f13, f14))) / 2.0f;
        g1Var.f45534b = (f7 + f13) / 2.0f;
        g1Var.f45535c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < q1Var.f45620m.size(); i10++) {
            ((p1) q1Var.f45620m.get(i10)).a();
        }
    }
}
