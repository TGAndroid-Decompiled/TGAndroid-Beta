package xd;

import android.graphics.RectF;
public final class l {
    public final RectF f50572e = new RectF();
    public final k f50569a = new k(0.0f);
    public final k f50570b = new k(0.0f);
    public final k f50571c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        boolean z4;
        boolean z10;
        boolean a2 = this.f50569a.a(f10);
        if (!this.f50570b.a(f10) && !a2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!this.f50571c.a(f10) && !z4) {
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
        if (!this.f50569a.b(f10) && !this.f50570b.b(f11) && !this.f50571c.b(f12) && !this.d.b(f13)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z4) {
        this.f50569a.c(z4);
        this.f50570b.c(z4);
        this.f50571c.c(z4);
        this.d.c(z4);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f50569a.d(f10);
        this.f50570b.d(f11);
        this.f50571c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f50569a.f50568c = f10;
        this.f50570b.f50568c = f11;
        this.f50571c.f50568c = f12;
        this.d.f50568c = f13;
    }
}
