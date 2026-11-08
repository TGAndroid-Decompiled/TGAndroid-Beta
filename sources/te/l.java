package te;

import android.graphics.RectF;
public final class l {
    public final RectF f55518e = new RectF();
    public final k f55515a = new k(0.0f);
    public final k f55516b = new k(0.0f);
    public final k f55517c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        boolean z9;
        boolean z10;
        boolean a10 = this.f55515a.a(f10);
        if (!this.f55516b.a(f10) && !a10) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!this.f55517c.a(f10) && !z9) {
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
        if (!this.f55515a.b(f10) && !this.f55516b.b(f11) && !this.f55517c.b(f12) && !this.d.b(f13)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z9) {
        this.f55515a.c(z9);
        this.f55516b.c(z9);
        this.f55517c.c(z9);
        this.d.c(z9);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f55515a.d(f10);
        this.f55516b.d(f11);
        this.f55517c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f55515a.f55514c = f10;
        this.f55516b.f55514c = f11;
        this.f55517c.f55514c = f12;
        this.d.f55514c = f13;
    }
}
