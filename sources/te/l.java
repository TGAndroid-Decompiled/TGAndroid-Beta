package te;

import android.graphics.RectF;
public final class l {
    public final RectF f57697e = new RectF();
    public final k f57694a = new k(0.0f);
    public final k f57695b = new k(0.0f);
    public final k f57696c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        boolean z10;
        boolean z11;
        boolean a10 = this.f57694a.a(f10);
        if (!this.f57695b.a(f10) && !a10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f57696c.a(f10) && !z10) {
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
        if (!this.f57694a.b(f10) && !this.f57695b.b(f11) && !this.f57696c.b(f12) && !this.d.b(f13)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f57694a.c(z10);
        this.f57695b.c(z10);
        this.f57696c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f57694a.d(f10);
        this.f57695b.d(f11);
        this.f57696c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f57694a.f57693c = f10;
        this.f57695b.f57693c = f11;
        this.f57696c.f57693c = f12;
        this.d.f57693c = f13;
    }
}
