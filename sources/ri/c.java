package ri;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class c implements ui.a, si.a {
    public final int f56074a;
    public final d f56075b;

    public c(d dVar, int i7) {
        this.f56075b = dVar;
        this.f56074a = i7;
    }

    @Override
    public final int a() {
        boolean a10 = r.b.a(this.f56074a);
        d dVar = this.f56075b;
        if (a10) {
            return dVar.f56092s;
        }
        return dVar.f56090q;
    }

    @Override
    public final void b0(float f10, float f11, float f12, float f13, Canvas canvas) {
        d.a(this.f56075b, canvas, this.f56074a, f10, f11, f12, f13);
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        d.b(this.f56075b, this.f56074a, canvas, rectF, i7, f10, f11);
    }

    @Override
    public final int e() {
        boolean a10 = r.b.a(this.f56074a);
        d dVar = this.f56075b;
        if (a10) {
            return dVar.f56087n;
        }
        return dVar.f56086m;
    }

    @Override
    public final int f() {
        boolean a10 = r.b.a(this.f56074a);
        d dVar = this.f56075b;
        if (a10) {
            return dVar.f56091r;
        }
        return dVar.f56089p;
    }

    @Override
    public final boolean g() {
        return true;
    }
}
