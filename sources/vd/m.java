package vd;

import android.graphics.RectF;
public final class m {
    public final RectF f49537e = new RectF();
    public final l f49534a = new l(0.0f);
    public final l f49535b = new l(0.0f);
    public final l f49536c = new l(0.0f);
    public final l d = new l(0.0f);

    public final boolean a(float f9) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f49534a.a(f9);
        if (!this.f49535b.a(f9) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f49536c.a(f9) && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.d.a(f9) || z11) {
            return true;
        }
        return false;
    }

    public final boolean b(float f9, float f10, float f11, float f12) {
        if (!this.f49534a.b(f9) && !this.f49535b.b(f10) && !this.f49536c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f49534a.c(z10);
        this.f49535b.c(z10);
        this.f49536c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f9, float f10, float f11, float f12) {
        this.f49534a.d(f9);
        this.f49535b.d(f10);
        this.f49536c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f9, float f10, float f11, float f12) {
        this.f49534a.f49533c = f9;
        this.f49535b.f49533c = f10;
        this.f49536c.f49533c = f11;
        this.d.f49533c = f12;
    }
}
