package xd;
public final class k {
    public float f50566a;
    public float f50567b;
    public float f50568c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f50567b;
        float w10 = e2.c.w(this.f50568c, f11, f10, f11);
        if (this.f50566a != w10) {
            this.f50566a = w10;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f50568c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z4) {
        if (z4) {
            float f10 = this.f50568c;
            this.f50566a = f10;
            this.f50567b = f10;
            return;
        }
        this.f50567b = this.f50566a;
    }

    public final void d(float f10) {
        this.f50567b = f10;
        this.f50568c = f10;
        this.f50566a = f10;
    }
}
