package te;
public final class k {
    public float f55512a;
    public float f55513b;
    public float f55514c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f55513b;
        float z9 = com.google.android.recaptcha.internal.a.z(this.f55514c, f11, f10, f11);
        if (this.f55512a != z9) {
            this.f55512a = z9;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f55514c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z9) {
        if (z9) {
            float f10 = this.f55514c;
            this.f55512a = f10;
            this.f55513b = f10;
            return;
        }
        this.f55513b = this.f55512a;
    }

    public final void d(float f10) {
        this.f55513b = f10;
        this.f55514c = f10;
        this.f55512a = f10;
    }
}
