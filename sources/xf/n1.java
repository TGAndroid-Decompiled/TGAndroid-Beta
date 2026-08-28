package xf;
public final class n1 extends o1 {
    public final f1 f49281f;
    public final float f49282g;
    public final float h;
    public final p1 f49283i;

    public n1(p1 p1Var, f1 f1Var, boolean z10, boolean z11) {
        float f10;
        this.f49283i = p1Var;
        this.f49290b = false;
        this.f49281f = f1Var;
        if (z10) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f49282g = f10;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        f1 f1Var = this.f49281f;
        if (f1Var != null) {
            float f10 = (this.f49282g * f1Var.d) + f1Var.f49220b;
            float f11 = f1Var.f49221c;
            p1 p1Var = this.f49283i;
            p1Var.c(f10, (this.h * f1Var.f49222e) + f11, true);
            float[] fArr = p1Var.f49308p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.f49292e = f13;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        this.d = f10;
        this.f49292e = f11;
        f1 f1Var = this.f49281f;
        float f12 = ((-this.f49282g) * f1Var.d) + f1Var.f49220b;
        float f13 = ((-this.h) * f1Var.f49222e) + f1Var.f49221c;
        p1 p1Var = this.f49283i;
        p1Var.c(f10, f11, false);
        p1Var.c(f12, f13, true);
        float[] fArr = p1Var.f49308p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - f1Var.h;
        f1Var.d = ((float) Math.abs(Math.cos(atan2) * g7.w.a(f10, f11, f14, f15))) / 2.0f;
        f1Var.f49222e = ((float) Math.abs(Math.sin(atan2) * g7.w.a(f10, f11, f14, f15))) / 2.0f;
        f1Var.f49220b = (f10 + f14) / 2.0f;
        f1Var.f49221c = (f11 + f15) / 2.0f;
        for (int i9 = 0; i9 < p1Var.f49305m.size(); i9++) {
            ((o1) p1Var.f49305m.get(i9)).a();
        }
    }
}
