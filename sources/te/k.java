package te;
public final class k {
    public float f55396a;
    public float f55397b;
    public float f55398c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f55397b;
        float z9 = com.google.android.recaptcha.internal.a.z(this.f55398c, f11, f10, f11);
        if (this.f55396a != z9) {
            this.f55396a = z9;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f55398c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z9) {
        if (z9) {
            float f10 = this.f55398c;
            this.f55396a = f10;
            this.f55397b = f10;
            return;
        }
        this.f55397b = this.f55396a;
    }

    public final void d(float f10) {
        this.f55397b = f10;
        this.f55398c = f10;
        this.f55396a = f10;
    }
}
