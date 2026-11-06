package te;
public final class k {
    public float f55421a;
    public float f55422b;
    public float f55423c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f55422b;
        float z9 = com.google.android.recaptcha.internal.a.z(this.f55423c, f11, f10, f11);
        if (this.f55421a != z9) {
            this.f55421a = z9;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f55423c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z9) {
        if (z9) {
            float f10 = this.f55423c;
            this.f55421a = f10;
            this.f55422b = f10;
            return;
        }
        this.f55422b = this.f55421a;
    }

    public final void d(float f10) {
        this.f55422b = f10;
        this.f55423c = f10;
        this.f55421a = f10;
    }
}
