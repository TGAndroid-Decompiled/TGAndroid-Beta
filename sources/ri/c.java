package ri;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class c implements ui.a, si.a {
    public final int f56689a;
    public final d f56690b;

    public c(d dVar, int i7) {
        this.f56690b = dVar;
        this.f56689a = i7;
    }

    @Override
    public final int a() {
        boolean a10 = p5.c.a(this.f56689a);
        d dVar = this.f56690b;
        if (a10) {
            return dVar.f56707s;
        }
        return dVar.f56705q;
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        d.b(this.f56690b, this.f56689a, canvas, rectF, i7, f10, f11);
    }

    @Override
    public final int e() {
        boolean a10 = p5.c.a(this.f56689a);
        d dVar = this.f56690b;
        if (a10) {
            return dVar.f56702n;
        }
        return dVar.f56701m;
    }

    @Override
    public final int f() {
        boolean a10 = p5.c.a(this.f56689a);
        d dVar = this.f56690b;
        if (a10) {
            return dVar.f56706r;
        }
        return dVar.f56704p;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        d.a(this.f56690b, canvas, this.f56689a, f10, f11, f12, f13);
    }
}
