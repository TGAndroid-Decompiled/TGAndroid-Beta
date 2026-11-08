package te;
public final class k {
    public float f55513a;
    public float f55514b;
    public float f55515c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f55514b;
        float z9 = com.google.android.recaptcha.internal.a.z(this.f55515c, f11, f10, f11);
        if (this.f55513a != z9) {
            this.f55513a = z9;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f55515c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z9) {
        if (z9) {
            float f10 = this.f55515c;
            this.f55513a = f10;
            this.f55514b = f10;
            return;
        }
        this.f55514b = this.f55513a;
    }

    public final void d(float f10) {
        this.f55514b = f10;
        this.f55515c = f10;
        this.f55513a = f10;
    }
}
