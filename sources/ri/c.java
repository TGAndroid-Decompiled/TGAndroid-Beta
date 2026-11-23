package ri;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class c implements ui.a, si.a {
    public final int f56658a;
    public final d f56659b;

    public c(d dVar, int i7) {
        this.f56659b = dVar;
        this.f56658a = i7;
    }

    @Override
    public final int a() {
        boolean a10 = p5.c.a(this.f56658a);
        d dVar = this.f56659b;
        if (a10) {
            return dVar.f56676s;
        }
        return dVar.f56674q;
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        d.b(this.f56659b, this.f56658a, canvas, rectF, i7, f10, f11);
    }

    @Override
    public final int e() {
        boolean a10 = p5.c.a(this.f56658a);
        d dVar = this.f56659b;
        if (a10) {
            return dVar.f56671n;
        }
        return dVar.f56670m;
    }

    @Override
    public final int f() {
        boolean a10 = p5.c.a(this.f56658a);
        d dVar = this.f56659b;
        if (a10) {
            return dVar.f56675r;
        }
        return dVar.f56673p;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        d.a(this.f56659b, canvas, this.f56658a, f10, f11, f12, f13);
    }
}
