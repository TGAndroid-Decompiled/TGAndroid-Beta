package xd;
public final class k {
    public float f50529a;
    public float f50530b;
    public float f50531c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f50530b;
        float w10 = e2.c.w(this.f50531c, f11, f10, f11);
        if (this.f50529a != w10) {
            this.f50529a = w10;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f50531c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z4) {
        if (z4) {
            float f10 = this.f50531c;
            this.f50529a = f10;
            this.f50530b = f10;
            return;
        }
        this.f50530b = this.f50529a;
    }

    public final void d(float f10) {
        this.f50530b = f10;
        this.f50531c = f10;
        this.f50529a = f10;
    }
}
