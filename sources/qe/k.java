package qe;
public final class k {
    public float f53866a;
    public float f53867b;
    public float f53868c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f53867b;
        float y9 = com.google.android.recaptcha.internal.a.y(this.f53868c, f11, f10, f11);
        if (this.f53866a != y9) {
            this.f53866a = y9;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f53868c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f10 = this.f53868c;
            this.f53866a = f10;
            this.f53867b = f10;
            return;
        }
        this.f53867b = this.f53866a;
    }

    public final void d(float f10) {
        this.f53867b = f10;
        this.f53868c = f10;
        this.f53866a = f10;
    }
}
