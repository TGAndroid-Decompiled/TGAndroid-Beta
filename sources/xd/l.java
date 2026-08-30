package xd;

import android.graphics.RectF;
public final class l {
    public final RectF e = new RectF();
    public final k f46916a = new k(0.0f);
    public final k f46917b = new k(0.0f);
    public final k f46918c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        boolean z4;
        boolean z10;
        boolean a2 = this.f46916a.a(f10);
        if (!this.f46917b.a(f10) && !a2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!this.f46918c.a(f10) && !z4) {
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
        if (!this.f46916a.b(f10) && !this.f46917b.b(f11) && !this.f46918c.b(f12) && !this.d.b(f13)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z4) {
        this.f46916a.c(z4);
        this.f46917b.c(z4);
        this.f46918c.c(z4);
        this.d.c(z4);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f46916a.d(f10);
        this.f46917b.d(f11);
        this.f46918c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f46916a.f46915c = f10;
        this.f46917b.f46915c = f11;
        this.f46918c.f46915c = f12;
        this.d.f46915c = f13;
    }
}
