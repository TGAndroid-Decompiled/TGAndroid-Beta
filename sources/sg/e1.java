package sg;

import a8.w9;
public final class e1 extends f1 {
    public final x0 f57231f;
    public final float f57232g;
    public final float h;
    public final g1 f57233i;

    public e1(g1 g1Var, x0 x0Var, boolean z10, boolean z11) {
        float f10;
        this.f57233i = g1Var;
        this.f57238b = false;
        this.f57231f = x0Var;
        if (z10) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f57232g = f10;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        x0 x0Var = this.f57231f;
        if (x0Var != null) {
            float f10 = (this.f57232g * x0Var.d) + x0Var.f57443b;
            float f11 = x0Var.f57444c;
            g1 g1Var = this.f57233i;
            g1Var.c(f10, (this.h * x0Var.f57445e) + f11, true);
            float[] fArr = g1Var.f57258p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.f57240e = f13;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        this.d = f10;
        this.f57240e = f11;
        x0 x0Var = this.f57231f;
        float f12 = ((-this.f57232g) * x0Var.d) + x0Var.f57443b;
        float f13 = ((-this.h) * x0Var.f57445e) + x0Var.f57444c;
        g1 g1Var = this.f57233i;
        g1Var.c(f10, f11, false);
        g1Var.c(f12, f13, true);
        float[] fArr = g1Var.f57258p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - x0Var.h;
        x0Var.d = ((float) Math.abs(Math.cos(atan2) * w9.a(f10, f11, f14, f15))) / 2.0f;
        x0Var.f57445e = ((float) Math.abs(Math.sin(atan2) * w9.a(f10, f11, f14, f15))) / 2.0f;
        x0Var.f57443b = (f10 + f14) / 2.0f;
        x0Var.f57444c = (f11 + f15) / 2.0f;
        for (int i7 = 0; i7 < g1Var.f57255m.size(); i7++) {
            ((f1) g1Var.f57255m.get(i7)).a();
        }
    }
}
