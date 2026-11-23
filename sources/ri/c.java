package ri;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class c implements ui.a, si.a {
    public final int f56771a;
    public final d f56772b;

    public c(d dVar, int i7) {
        this.f56772b = dVar;
        this.f56771a = i7;
    }

    @Override
    public final int a() {
        boolean a10 = p5.c.a(this.f56771a);
        d dVar = this.f56772b;
        if (a10) {
            return dVar.f56789s;
        }
        return dVar.f56787q;
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        d.b(this.f56772b, this.f56771a, canvas, rectF, i7, f10, f11);
    }

    @Override
    public final int e() {
        boolean a10 = p5.c.a(this.f56771a);
        d dVar = this.f56772b;
        if (a10) {
            return dVar.f56784n;
        }
        return dVar.f56783m;
    }

    @Override
    public final int f() {
        boolean a10 = p5.c.a(this.f56771a);
        d dVar = this.f56772b;
        if (a10) {
            return dVar.f56788r;
        }
        return dVar.f56786p;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void z(float f10, float f11, float f12, float f13, Canvas canvas) {
        d.a(this.f56772b, canvas, this.f56771a, f10, f11, f12, f13);
    }
}
