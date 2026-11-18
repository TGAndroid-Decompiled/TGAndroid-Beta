package ri;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class c implements ui.a, si.a {
    public final int f56648a;
    public final d f56649b;

    public c(d dVar, int i7) {
        this.f56649b = dVar;
        this.f56648a = i7;
    }

    @Override
    public final int a() {
        boolean a10 = p5.c.a(this.f56648a);
        d dVar = this.f56649b;
        if (a10) {
            return dVar.f56666s;
        }
        return dVar.f56664q;
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        d.b(this.f56649b, this.f56648a, canvas, rectF, i7, f10, f11);
    }

    @Override
    public final int e() {
        boolean a10 = p5.c.a(this.f56648a);
        d dVar = this.f56649b;
        if (a10) {
            return dVar.f56661n;
        }
        return dVar.f56660m;
    }

    @Override
    public final int f() {
        boolean a10 = p5.c.a(this.f56648a);
        d dVar = this.f56649b;
        if (a10) {
            return dVar.f56665r;
        }
        return dVar.f56663p;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        d.a(this.f56649b, canvas, this.f56648a, f10, f11, f12, f13);
    }
}
