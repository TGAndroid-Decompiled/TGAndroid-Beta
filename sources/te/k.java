package te;

import com.google.android.gms.internal.vision.e2;
public final class k {
    public float f57805a;
    public float f57806b;
    public float f57807c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.f57806b;
        float z10 = e2.z(this.f57807c, f11, f10, f11);
        if (this.f57805a != z10) {
            this.f57805a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f10) {
        if (this.f57807c != f10) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f10 = this.f57807c;
            this.f57805a = f10;
            this.f57806b = f10;
            return;
        }
        this.f57806b = this.f57805a;
    }

    public final void d(float f10) {
        this.f57806b = f10;
        this.f57807c = f10;
        this.f57805a = f10;
    }
}
