package xd;
public final class k {
    public float f46913a;
    public float f46914b;
    public float f46915c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f46914b;
        float w10 = e2.c.w(this.f46915c, f11, f10, f11);
        if (this.f46913a != w10) {
            this.f46913a = w10;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f46915c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z4) {
        if (z4) {
            float f10 = this.f46915c;
            this.f46913a = f10;
            this.f46914b = f10;
            return;
        }
        this.f46914b = this.f46913a;
    }

    public final void d(float f10) {
        this.f46914b = f10;
        this.f46915c = f10;
        this.f46913a = f10;
    }
}
