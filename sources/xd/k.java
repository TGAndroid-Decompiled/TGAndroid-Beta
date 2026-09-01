package xd;
public final class k {
    public float f50530a;
    public float f50531b;
    public float f50532c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f50531b;
        float w10 = e2.c.w(this.f50532c, f11, f10, f11);
        if (this.f50530a != w10) {
            this.f50530a = w10;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f50532c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z4) {
        if (z4) {
            float f10 = this.f50532c;
            this.f50530a = f10;
            this.f50531b = f10;
            return;
        }
        this.f50531b = this.f50530a;
    }

    public final void d(float f10) {
        this.f50531b = f10;
        this.f50532c = f10;
        this.f50530a = f10;
    }
}
