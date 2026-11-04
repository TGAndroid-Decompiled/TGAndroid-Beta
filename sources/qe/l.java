package qe;

import android.graphics.RectF;
public final class l {
    public final RectF f53872e = new RectF();
    public final k f53869a = new k(0.0f);
    public final k f53870b = new k(0.0f);
    public final k f53871c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        boolean z10;
        boolean z11;
        boolean a10 = this.f53869a.a(f10);
        if (!this.f53870b.a(f10) && !a10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f53871c.a(f10) && !z10) {
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
        if (!this.f53869a.b(f10) && !this.f53870b.b(f11) && !this.f53871c.b(f12) && !this.d.b(f13)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f53869a.c(z10);
        this.f53870b.c(z10);
        this.f53871c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f53869a.d(f10);
        this.f53870b.d(f11);
        this.f53871c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f53869a.f53868c = f10;
        this.f53870b.f53868c = f11;
        this.f53871c.f53868c = f12;
        this.d.f53868c = f13;
    }
}
