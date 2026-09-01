package xd;

import android.graphics.RectF;
public final class l {
    public final RectF f50536e = new RectF();
    public final k f50533a = new k(0.0f);
    public final k f50534b = new k(0.0f);
    public final k f50535c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        boolean z4;
        boolean z10;
        boolean a2 = this.f50533a.a(f10);
        if (!this.f50534b.a(f10) && !a2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!this.f50535c.a(f10) && !z4) {
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
        if (!this.f50533a.b(f10) && !this.f50534b.b(f11) && !this.f50535c.b(f12) && !this.d.b(f13)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z4) {
        this.f50533a.c(z4);
        this.f50534b.c(z4);
        this.f50535c.c(z4);
        this.d.c(z4);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f50533a.d(f10);
        this.f50534b.d(f11);
        this.f50535c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f50533a.f50532c = f10;
        this.f50534b.f50532c = f11;
        this.f50535c.f50532c = f12;
        this.d.f50532c = f13;
    }
}
