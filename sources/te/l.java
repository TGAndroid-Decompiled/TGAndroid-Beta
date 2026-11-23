package te;

import android.graphics.RectF;
public final class l {
    public final RectF f57732e = new RectF();
    public final k f57729a = new k(0.0f);
    public final k f57730b = new k(0.0f);
    public final k f57731c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        boolean z10;
        boolean z11;
        boolean a10 = this.f57729a.a(f10);
        if (!this.f57730b.a(f10) && !a10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f57731c.a(f10) && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.d.a(f10) || z11) {
            return true;
        }
        return false;
    }

    public final boolean b(float f10, float f11, float f12, float f13) {
        if (!this.f57729a.b(f10) && !this.f57730b.b(f11) && !this.f57731c.b(f12) && !this.d.b(f13)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f57729a.c(z10);
        this.f57730b.c(z10);
        this.f57731c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f57729a.d(f10);
        this.f57730b.d(f11);
        this.f57731c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f57729a.f57728c = f10;
        this.f57730b.f57728c = f11;
        this.f57731c.f57728c = f12;
        this.d.f57728c = f13;
    }
}
