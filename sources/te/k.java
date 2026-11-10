package te;
public final class k {
    public float f55524a;
    public float f55525b;
    public float f55526c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f55525b;
        float z9 = com.google.android.recaptcha.internal.a.z(this.f55526c, f11, f10, f11);
        if (this.f55524a != z9) {
            this.f55524a = z9;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f55526c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z9) {
        if (z9) {
            float f10 = this.f55526c;
            this.f55524a = f10;
            this.f55525b = f10;
            return;
        }
        this.f55525b = this.f55524a;
    }

    public final void d(float f10) {
        this.f55525b = f10;
        this.f55526c = f10;
        this.f55524a = f10;
    }
}
