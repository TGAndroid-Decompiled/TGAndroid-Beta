package ud;

public final class k {

    public float f48522a;

    public float f48523b;

    public float f48524c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f48523b;
        float fZ = com.google.android.recaptcha.internal.a.z(this.f48524c, f11, f10, f11);
        if (this.f48522a == fZ) {
            return false;
        }
        this.f48522a = fZ;
        return true;
    }

    public final boolean b(float f10) {
        return this.f48524c != f10;
    }

    public final void c(boolean z10) {
        if (!z10) {
            this.f48523b = this.f48522a;
            return;
        }
        float f10 = this.f48524c;
        this.f48522a = f10;
        this.f48523b = f10;
    }

    public final void d(float f10) {
        this.f48523b = f10;
        this.f48524c = f10;
        this.f48522a = f10;
    }
}
