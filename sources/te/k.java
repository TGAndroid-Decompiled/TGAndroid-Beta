package te;

import com.google.android.gms.internal.vision.e2;
public final class k {
    public float f57111a;
    public float f57112b;
    public float f57113c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f57112b;
        float z10 = e2.z(this.f57113c, f11, f10, f11);
        if (this.f57111a != z10) {
            this.f57111a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f57113c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f10 = this.f57113c;
            this.f57111a = f10;
            this.f57112b = f10;
            return;
        }
        this.f57112b = this.f57111a;
    }

    public final void d(float f10) {
        this.f57112b = f10;
        this.f57113c = f10;
        this.f57111a = f10;
    }
}
