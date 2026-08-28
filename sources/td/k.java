package td;
public final class k {
    public float f47800a;
    public float f47801b;
    public float f47802c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f47801b;
        float z10 = e2.c.z(this.f47802c, f11, f10, f11);
        if (this.f47800a != z10) {
            this.f47800a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f47802c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f10 = this.f47802c;
            this.f47800a = f10;
            this.f47801b = f10;
            return;
        }
        this.f47801b = this.f47800a;
    }

    public final void d(float f10) {
        this.f47801b = f10;
        this.f47802c = f10;
        this.f47800a = f10;
    }
}
