package te;
public final class k {
    public float f55525a;
    public float f55526b;
    public float f55527c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f55526b;
        float z9 = com.google.android.recaptcha.internal.a.z(this.f55527c, f11, f10, f11);
        if (this.f55525a != z9) {
            this.f55525a = z9;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f55527c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z9) {
        if (z9) {
            float f10 = this.f55527c;
            this.f55525a = f10;
            this.f55526b = f10;
            return;
        }
        this.f55526b = this.f55525a;
    }

    public final void d(float f10) {
        this.f55526b = f10;
        this.f55527c = f10;
        this.f55525a = f10;
    }
}
