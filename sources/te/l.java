package te;

import android.graphics.RectF;
public final class l {
    public final RectF f55530e = new RectF();
    public final k f55527a = new k(0.0f);
    public final k f55528b = new k(0.0f);
    public final k f55529c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        boolean z9;
        boolean z10;
        boolean a10 = this.f55527a.a(f10);
        if (!this.f55528b.a(f10) && !a10) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!this.f55529c.a(f10) && !z9) {
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
        if (!this.f55527a.b(f10) && !this.f55528b.b(f11) && !this.f55529c.b(f12) && !this.d.b(f13)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z9) {
        this.f55527a.c(z9);
        this.f55528b.c(z9);
        this.f55529c.c(z9);
        this.d.c(z9);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f55527a.d(f10);
        this.f55528b.d(f11);
        this.f55529c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f55527a.f55526c = f10;
        this.f55528b.f55526c = f11;
        this.f55529c.f55526c = f12;
        this.d.f55526c = f13;
    }
}
