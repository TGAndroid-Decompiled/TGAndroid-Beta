package ri;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class c implements ui.a, si.a {
    public final int f56693a;
    public final d f56694b;

    public c(d dVar, int i7) {
        this.f56694b = dVar;
        this.f56693a = i7;
    }

    @Override
    public final int a() {
        boolean a10 = p5.c.a(this.f56693a);
        d dVar = this.f56694b;
        if (a10) {
            return dVar.f56711s;
        }
        return dVar.f56709q;
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        d.b(this.f56694b, this.f56693a, canvas, rectF, i7, f10, f11);
    }

    @Override
    public final int e() {
        boolean a10 = p5.c.a(this.f56693a);
        d dVar = this.f56694b;
        if (a10) {
            return dVar.f56706n;
        }
        return dVar.f56705m;
    }

    @Override
    public final int f() {
        boolean a10 = p5.c.a(this.f56693a);
        d dVar = this.f56694b;
        if (a10) {
            return dVar.f56710r;
        }
        return dVar.f56708p;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        d.a(this.f56694b, canvas, this.f56693a, f10, f11, f12, f13);
    }
}
