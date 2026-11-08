package sg;

import a8.r9;
public final class g1 extends h1 {
    public final z0 f55056f;
    public final float f55057g;
    public final float h;
    public final i1 f55058i;

    public g1(i1 i1Var, z0 z0Var, boolean z9, boolean z10) {
        float f10;
        this.f55058i = i1Var;
        this.f55063b = false;
        this.f55056f = z0Var;
        if (z9) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f55057g = f10;
        this.h = z10 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        z0 z0Var = this.f55056f;
        if (z0Var != null) {
            float f10 = (this.f55057g * z0Var.d) + z0Var.f55267b;
            float f11 = z0Var.f55268c;
            i1 i1Var = this.f55058i;
            i1Var.c(f10, (this.h * z0Var.f55269e) + f11, true);
            float[] fArr = i1Var.f55082p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.f55065e = f13;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        this.d = f10;
        this.f55065e = f11;
        z0 z0Var = this.f55056f;
        float f12 = ((-this.f55057g) * z0Var.d) + z0Var.f55267b;
        float f13 = ((-this.h) * z0Var.f55269e) + z0Var.f55268c;
        i1 i1Var = this.f55058i;
        i1Var.c(f10, f11, false);
        i1Var.c(f12, f13, true);
        float[] fArr = i1Var.f55082p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - z0Var.h;
        z0Var.d = ((float) Math.abs(Math.cos(atan2) * r9.a(f10, f11, f14, f15))) / 2.0f;
        z0Var.f55269e = ((float) Math.abs(Math.sin(atan2) * r9.a(f10, f11, f14, f15))) / 2.0f;
        z0Var.f55267b = (f10 + f14) / 2.0f;
        z0Var.f55268c = (f11 + f15) / 2.0f;
        for (int i7 = 0; i7 < i1Var.f55079m.size(); i7++) {
            ((h1) i1Var.f55079m.get(i7)).a();
        }
    }
}
