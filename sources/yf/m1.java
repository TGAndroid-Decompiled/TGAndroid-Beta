package yf;

public final class m1 extends n1 {

    public final e1 f49982f;

    public final float f49983g;
    public final float h;

    public final o1 f49984i;

    public m1(o1 o1Var, e1 e1Var, boolean z10, boolean z11) {
        this.f49984i = o1Var;
        this.f49990b = false;
        this.f49982f = e1Var;
        this.f49983g = z10 ? -1.0f : 1.0f;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        e1 e1Var = this.f49982f;
        if (e1Var != null) {
            float f10 = (this.f49983g * e1Var.d) + e1Var.f49922b;
            float f11 = (this.h * e1Var.f49924e) + e1Var.f49923c;
            o1 o1Var = this.f49984i;
            o1Var.c(f10, f11, true);
            float[] fArr = o1Var.f50010p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.f49992e = f13;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        this.d = f10;
        this.f49992e = f11;
        e1 e1Var = this.f49982f;
        float f12 = ((-this.f49983g) * e1Var.d) + e1Var.f49922b;
        float f13 = ((-this.h) * e1Var.f49924e) + e1Var.f49923c;
        o1 o1Var = this.f49984i;
        o1Var.c(f10, f11, false);
        o1Var.c(f12, f13, true);
        float[] fArr = o1Var.f50010p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double dAtan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - ((double) e1Var.h);
        double dCos = Math.cos(dAtan2) * ((double) h7.y.a(f10, f11, f14, f15));
        double dSin = Math.sin(dAtan2) * ((double) h7.y.a(f10, f11, f14, f15));
        e1Var.d = ((float) Math.abs(dCos)) / 2.0f;
        e1Var.f49924e = ((float) Math.abs(dSin)) / 2.0f;
        e1Var.f49922b = (f10 + f14) / 2.0f;
        e1Var.f49923c = (f11 + f15) / 2.0f;
        for (int i10 = 0; i10 < o1Var.f50007m.size(); i10++) {
            ((n1) o1Var.f50007m.get(i10)).a();
        }
    }
}
