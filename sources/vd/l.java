package vd;
public final class l {
    public float f49531a;
    public float f49532b;
    public float f49533c;

    public l(float f9) {
        d(f9);
    }

    public final boolean a(float f9) {
        float f10 = this.f49532b;
        float z10 = com.google.android.recaptcha.internal.a.z(this.f49533c, f10, f9, f10);
        if (this.f49531a != z10) {
            this.f49531a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f9) {
        if (this.f49533c != f9) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f9 = this.f49533c;
            this.f49531a = f9;
            this.f49532b = f9;
            return;
        }
        this.f49532b = this.f49531a;
    }

    public final void d(float f9) {
        this.f49532b = f9;
        this.f49533c = f9;
        this.f49531a = f9;
    }
}
