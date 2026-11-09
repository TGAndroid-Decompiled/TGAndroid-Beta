package te;

import android.graphics.RectF;
public final class l {
    public final RectF f55531e = new RectF();
    public final k f55528a = new k(0.0f);
    public final k f55529b = new k(0.0f);
    public final k f55530c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        boolean z9;
        boolean z10;
        boolean a10 = this.f55528a.a(f10);
        if (!this.f55529b.a(f10) && !a10) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!this.f55530c.a(f10) && !z9) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.d.a(f10) || z10) {
            return true;
        }
        return false;
    }

    public final boolean b(float f10, float f11, float f12, float f13) {
        if (!this.f55528a.b(f10) && !this.f55529b.b(f11) && !this.f55530c.b(f12) && !this.d.b(f13)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z9) {
        this.f55528a.c(z9);
        this.f55529b.c(z9);
        this.f55530c.c(z9);
        this.d.c(z9);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f55528a.d(f10);
        this.f55529b.d(f11);
        this.f55530c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f55528a.f55527c = f10;
        this.f55529b.f55527c = f11;
        this.f55530c.f55527c = f12;
        this.d.f55527c = f13;
    }
}
