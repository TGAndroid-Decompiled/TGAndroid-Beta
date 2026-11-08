package sg;

import a8.r9;
public final class g1 extends h1 {
    public final z0 f55057f;
    public final float f55058g;
    public final float h;
    public final i1 f55059i;

    public g1(i1 i1Var, z0 z0Var, boolean z9, boolean z10) {
        float f10;
        this.f55059i = i1Var;
        this.f55064b = false;
        this.f55057f = z0Var;
        if (z9) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f55058g = f10;
        this.h = z10 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        z0 z0Var = this.f55057f;
        if (z0Var != null) {
            float f10 = (this.f55058g * z0Var.d) + z0Var.f55268b;
            float f11 = z0Var.f55269c;
            i1 i1Var = this.f55059i;
            i1Var.c(f10, (this.h * z0Var.f55270e) + f11, true);
            float[] fArr = i1Var.f55083p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.f55066e = f13;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        this.d = f10;
        this.f55066e = f11;
        z0 z0Var = this.f55057f;
        float f12 = ((-this.f55058g) * z0Var.d) + z0Var.f55268b;
        float f13 = ((-this.h) * z0Var.f55270e) + z0Var.f55269c;
        i1 i1Var = this.f55059i;
        i1Var.c(f10, f11, false);
        i1Var.c(f12, f13, true);
        float[] fArr = i1Var.f55083p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - z0Var.h;
        z0Var.d = ((float) Math.abs(Math.cos(atan2) * r9.a(f10, f11, f14, f15))) / 2.0f;
        z0Var.f55270e = ((float) Math.abs(Math.sin(atan2) * r9.a(f10, f11, f14, f15))) / 2.0f;
        z0Var.f55268b = (f10 + f14) / 2.0f;
        z0Var.f55269c = (f11 + f15) / 2.0f;
        for (int i7 = 0; i7 < i1Var.f55080m.size(); i7++) {
            ((h1) i1Var.f55080m.get(i7)).a();
        }
    }
}
