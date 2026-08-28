package td;

import android.graphics.RectF;
public final class l {
    public final RectF f47806e = new RectF();
    public final k f47803a = new k(0.0f);
    public final k f47804b = new k(0.0f);
    public final k f47805c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f47803a.a(f10);
        if (!this.f47804b.a(f10) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f47805c.a(f10) && !z10) {
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
        if (!this.f47803a.b(f10) && !this.f47804b.b(f11) && !this.f47805c.b(f12) && !this.d.b(f13)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f47803a.c(z10);
        this.f47804b.c(z10);
        this.f47805c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f47803a.d(f10);
        this.f47804b.d(f11);
        this.f47805c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f47803a.f47802c = f10;
        this.f47804b.f47802c = f11;
        this.f47805c.f47802c = f12;
        this.d.f47802c = f13;
    }
}
