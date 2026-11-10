package sg;

import a8.r9;
public final class f1 extends g1 {
    public final y0 f55061f;
    public final float f55062g;
    public final float h;
    public final h1 f55063i;

    public f1(h1 h1Var, y0 y0Var, boolean z9, boolean z10) {
        float f10;
        this.f55063i = h1Var;
        this.f55070b = false;
        this.f55061f = y0Var;
        if (z9) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f55062g = f10;
        this.h = z10 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        y0 y0Var = this.f55061f;
        if (y0Var != null) {
            float f10 = (this.f55062g * y0Var.d) + y0Var.f55275b;
            float f11 = y0Var.f55276c;
            h1 h1Var = this.f55063i;
            h1Var.c(f10, (this.h * y0Var.f55277e) + f11, true);
            float[] fArr = h1Var.f55089p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.f55072e = f13;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        this.d = f10;
        this.f55072e = f11;
        y0 y0Var = this.f55061f;
        float f12 = ((-this.f55062g) * y0Var.d) + y0Var.f55275b;
        float f13 = ((-this.h) * y0Var.f55277e) + y0Var.f55276c;
        h1 h1Var = this.f55063i;
        h1Var.c(f10, f11, false);
        h1Var.c(f12, f13, true);
        float[] fArr = h1Var.f55089p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - y0Var.h;
        y0Var.d = ((float) Math.abs(Math.cos(atan2) * r9.a(f10, f11, f14, f15))) / 2.0f;
        y0Var.f55277e = ((float) Math.abs(Math.sin(atan2) * r9.a(f10, f11, f14, f15))) / 2.0f;
        y0Var.f55275b = (f10 + f14) / 2.0f;
        y0Var.f55276c = (f11 + f15) / 2.0f;
        for (int i7 = 0; i7 < h1Var.f55086m.size(); i7++) {
            ((g1) h1Var.f55086m.get(i7)).a();
        }
    }
}
