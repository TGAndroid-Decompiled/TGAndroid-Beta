package ud;

import android.graphics.RectF;

public final class l {

    public final RectF f48528e = new RectF();

    public final k f48525a = new k(0.0f);

    public final k f48526b = new k(0.0f);

    public final k f48527c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        return this.d.a(f10) || (this.f48527c.a(f10) || (this.f48526b.a(f10) || this.f48525a.a(f10)));
    }

    public final boolean b(float f10, float f11, float f12, float f13) {
        return this.f48525a.b(f10) || this.f48526b.b(f11) || this.f48527c.b(f12) || this.d.b(f13);
    }

    public final void c(boolean z10) {
        this.f48525a.c(z10);
        this.f48526b.c(z10);
        this.f48527c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f48525a.d(f10);
        this.f48526b.d(f11);
        this.f48527c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f48525a.f48524c = f10;
        this.f48526b.f48524c = f11;
        this.f48527c.f48524c = f12;
        this.d.f48524c = f13;
    }
}
