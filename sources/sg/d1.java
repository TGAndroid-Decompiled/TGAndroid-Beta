package sg;

import a8.x9;
public final class d1 extends e1 {
    public final w0 f57305f;
    public final float f57306g;
    public final float h;
    public final f1 f57307i;

    public d1(f1 f1Var, w0 w0Var, boolean z10, boolean z11) {
        float f10;
        this.f57307i = f1Var;
        this.f57311b = false;
        this.f57305f = w0Var;
        if (z10) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f57306g = f10;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        w0 w0Var = this.f57305f;
        if (w0Var != null) {
            float f10 = (this.f57306g * w0Var.d) + w0Var.f57513b;
            float f11 = w0Var.f57514c;
            f1 f1Var = this.f57307i;
            f1Var.c(f10, (this.h * w0Var.f57515e) + f11, true);
            float[] fArr = f1Var.f57330p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.f57313e = f13;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        this.d = f10;
        this.f57313e = f11;
        w0 w0Var = this.f57305f;
        float f12 = ((-this.f57306g) * w0Var.d) + w0Var.f57513b;
        float f13 = ((-this.h) * w0Var.f57515e) + w0Var.f57514c;
        f1 f1Var = this.f57307i;
        f1Var.c(f10, f11, false);
        f1Var.c(f12, f13, true);
        float[] fArr = f1Var.f57330p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - w0Var.h;
        w0Var.d = ((float) Math.abs(Math.cos(atan2) * x9.a(f10, f11, f14, f15))) / 2.0f;
        w0Var.f57515e = ((float) Math.abs(Math.sin(atan2) * x9.a(f10, f11, f14, f15))) / 2.0f;
        w0Var.f57513b = (f10 + f14) / 2.0f;
        w0Var.f57514c = (f11 + f15) / 2.0f;
        for (int i7 = 0; i7 < f1Var.f57327m.size(); i7++) {
            ((e1) f1Var.f57327m.get(i7)).a();
        }
    }
}
