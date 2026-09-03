package xd;
public final class k {
    public float f46981a;
    public float f46982b;
    public float f46983c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f46982b;
        float w10 = e2.c.w(this.f46983c, f11, f10, f11);
        if (this.f46981a != w10) {
            this.f46981a = w10;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f46983c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z4) {
        if (z4) {
            float f10 = this.f46983c;
            this.f46981a = f10;
            this.f46982b = f10;
            return;
        }
        this.f46982b = this.f46981a;
    }

    public final void d(float f10) {
        this.f46982b = f10;
        this.f46983c = f10;
        this.f46981a = f10;
    }
}
