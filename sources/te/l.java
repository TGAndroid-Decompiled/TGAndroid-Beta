package te;

import android.graphics.RectF;
public final class l {
    public final RectF f57689e = new RectF();
    public final k f57686a = new k(0.0f);
    public final k f57687b = new k(0.0f);
    public final k f57688c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        boolean z10;
        boolean z11;
        boolean a10 = this.f57686a.a(f10);
        if (!this.f57687b.a(f10) && !a10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f57688c.a(f10) && !z10) {
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
        if (!this.f57686a.b(f10) && !this.f57687b.b(f11) && !this.f57688c.b(f12) && !this.d.b(f13)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f57686a.c(z10);
        this.f57687b.c(z10);
        this.f57688c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f57686a.d(f10);
        this.f57687b.d(f11);
        this.f57688c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f57686a.f57685c = f10;
        this.f57687b.f57685c = f11;
        this.f57688c.f57685c = f12;
        this.d.f57685c = f13;
    }
}
