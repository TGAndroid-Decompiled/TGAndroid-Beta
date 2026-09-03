package pb;
public final class g {
    public final float f41136a;
    public final float f41137b;
    public final float f41138c;
    public final float d;
    public final float e;
    public final float f41139f;
    public final float f41140g;
    public final float h;
    public final float f41141i;

    public g(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f41136a = f10;
        this.f41137b = f13;
        this.f41138c = f16;
        this.d = f11;
        this.e = f14;
        this.f41139f = f17;
        this.f41140g = f12;
        this.h = f15;
        this.f41141i = f18;
    }

    public static g a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new g(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float d = e2.c.d(f21, f19, f23 * f18, f24);
        float d10 = e2.c.d(f18, f22, f20 * f19, f24);
        return new g((d * f12) + (f12 - f10), (d10 * f16) + (f16 - f10), f10, (d * f13) + (f13 - f11), (d10 * f17) + (f17 - f11), f11, d, d10, 1.0f);
    }
}
