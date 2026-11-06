package sg;

import a8.r9;
public final class g1 extends h1 {
    public final z0 f54940f;
    public final float f54941g;
    public final float h;
    public final i1 f54942i;

    public g1(i1 i1Var, z0 z0Var, boolean z9, boolean z10) {
        float f10;
        this.f54942i = i1Var;
        this.f54947b = false;
        this.f54940f = z0Var;
        if (z9) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f54941g = f10;
        this.h = z10 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        z0 z0Var = this.f54940f;
        if (z0Var != null) {
            float f10 = (this.f54941g * z0Var.d) + z0Var.f55151b;
            float f11 = z0Var.f55152c;
            i1 i1Var = this.f54942i;
            i1Var.c(f10, (this.h * z0Var.f55153e) + f11, true);
            float[] fArr = i1Var.f54966p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.f54949e = f13;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        this.d = f10;
        this.f54949e = f11;
        z0 z0Var = this.f54940f;
        float f12 = ((-this.f54941g) * z0Var.d) + z0Var.f55151b;
        float f13 = ((-this.h) * z0Var.f55153e) + z0Var.f55152c;
        i1 i1Var = this.f54942i;
        i1Var.c(f10, f11, false);
        i1Var.c(f12, f13, true);
        float[] fArr = i1Var.f54966p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - z0Var.h;
        z0Var.d = ((float) Math.abs(Math.cos(atan2) * r9.a(f10, f11, f14, f15))) / 2.0f;
        z0Var.f55153e = ((float) Math.abs(Math.sin(atan2) * r9.a(f10, f11, f14, f15))) / 2.0f;
        z0Var.f55151b = (f10 + f14) / 2.0f;
        z0Var.f55152c = (f11 + f15) / 2.0f;
        for (int i7 = 0; i7 < i1Var.f54963m.size(); i7++) {
            ((h1) i1Var.f54963m.get(i7)).a();
        }
    }
}
