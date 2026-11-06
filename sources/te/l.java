package te;

import android.graphics.RectF;
public final class l {
    public final RectF f55402e = new RectF();
    public final k f55399a = new k(0.0f);
    public final k f55400b = new k(0.0f);
    public final k f55401c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        boolean z9;
        boolean z10;
        boolean a10 = this.f55399a.a(f10);
        if (!this.f55400b.a(f10) && !a10) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!this.f55401c.a(f10) && !z9) {
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
        if (!this.f55399a.b(f10) && !this.f55400b.b(f11) && !this.f55401c.b(f12) && !this.d.b(f13)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z9) {
        this.f55399a.c(z9);
        this.f55400b.c(z9);
        this.f55401c.c(z9);
        this.d.c(z9);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f55399a.d(f10);
        this.f55400b.d(f11);
        this.f55401c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f55399a.f55398c = f10;
        this.f55400b.f55398c = f11;
        this.f55401c.f55398c = f12;
        this.d.f55398c = f13;
    }
}
