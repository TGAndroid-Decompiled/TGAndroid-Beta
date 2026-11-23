package te;

import com.google.android.gms.internal.vision.e2;
public final class k {
    public float f57726a;
    public float f57727b;
    public float f57728c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f57727b;
        float z10 = e2.z(this.f57728c, f11, f10, f11);
        if (this.f57726a != z10) {
            this.f57726a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f57728c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f10 = this.f57728c;
            this.f57726a = f10;
            this.f57727b = f10;
            return;
        }
        this.f57727b = this.f57726a;
    }

    public final void d(float f10) {
        this.f57727b = f10;
        this.f57728c = f10;
        this.f57726a = f10;
    }
}
