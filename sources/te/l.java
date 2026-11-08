package te;

import android.graphics.RectF;
public final class l {
    public final RectF f55519e = new RectF();
    public final k f55516a = new k(0.0f);
    public final k f55517b = new k(0.0f);
    public final k f55518c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        boolean z9;
        boolean z10;
        boolean a10 = this.f55516a.a(f10);
        if (!this.f55517b.a(f10) && !a10) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!this.f55518c.a(f10) && !z9) {
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
        if (!this.f55516a.b(f10) && !this.f55517b.b(f11) && !this.f55518c.b(f12) && !this.d.b(f13)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z9) {
        this.f55516a.c(z9);
        this.f55517b.c(z9);
        this.f55518c.c(z9);
        this.d.c(z9);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f55516a.d(f10);
        this.f55517b.d(f11);
        this.f55518c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f55516a.f55515c = f10;
        this.f55517b.f55515c = f11;
        this.f55518c.f55515c = f12;
        this.d.f55515c = f13;
    }
}
