package tg;
public final class e1 extends f1 {
    public final x0 f55155f;
    public final float f55156g;
    public final float h;
    public final g1 f55157i;

    public e1(g1 g1Var, x0 x0Var, boolean z10, boolean z11) {
        float f10;
        this.f55157i = g1Var;
        this.f55161b = false;
        this.f55155f = x0Var;
        if (z10) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f55156g = f10;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        x0 x0Var = this.f55155f;
        if (x0Var != null) {
            float f10 = (this.f55156g * x0Var.d) + x0Var.f55365b;
            float f11 = x0Var.f55366c;
            g1 g1Var = this.f55157i;
            g1Var.c(f10, (this.h * x0Var.f55367e) + f11, true);
            float[] fArr = g1Var.f55182p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.f55163e = f13;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        this.d = f10;
        this.f55163e = f11;
        x0 x0Var = this.f55155f;
        float f12 = ((-this.f55156g) * x0Var.d) + x0Var.f55365b;
        float f13 = ((-this.h) * x0Var.f55367e) + x0Var.f55366c;
        g1 g1Var = this.f55157i;
        g1Var.c(f10, f11, false);
        g1Var.c(f12, f13, true);
        float[] fArr = g1Var.f55182p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - x0Var.h;
        x0Var.d = ((float) Math.abs(Math.cos(atan2) * a7.h.a(f10, f11, f14, f15))) / 2.0f;
        x0Var.f55367e = ((float) Math.abs(Math.sin(atan2) * a7.h.a(f10, f11, f14, f15))) / 2.0f;
        x0Var.f55365b = (f10 + f14) / 2.0f;
        x0Var.f55366c = (f11 + f15) / 2.0f;
        for (int i3 = 0; i3 < g1Var.f55179m.size(); i3++) {
            ((f1) g1Var.f55179m.get(i3)).a();
        }
    }
}
