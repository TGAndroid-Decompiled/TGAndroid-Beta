package zb;
public final class g {
    public final float f60364a;
    public final float f60365b;
    public final float f60366c;
    public final float d;
    public final float f60367e;
    public final float f60368f;
    public final float f60369g;
    public final float h;
    public final float f60370i;

    public g(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f60364a = f10;
        this.f60365b = f13;
        this.f60366c = f16;
        this.d = f11;
        this.f60367e = f14;
        this.f60368f = f17;
        this.f60369g = f12;
        this.h = f15;
        this.f60370i = f18;
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
        float c2 = com.google.android.recaptcha.internal.a.c(f21, f19, f23 * f18, f24);
        float c10 = com.google.android.recaptcha.internal.a.c(f18, f22, f20 * f19, f24);
        return new g((c2 * f12) + (f12 - f10), (c10 * f16) + (f16 - f10), f10, (c2 * f13) + (f13 - f11), (c10 * f17) + (f17 - f11), f11, c2, c10, 1.0f);
    }
}
