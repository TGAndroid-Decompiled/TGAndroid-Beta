package ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.Iterator;
public final class d implements a, dh.b, si.a {
    public final a f58432a;
    public final a f58433b;
    public final xe.b f58434c = new xe.b();
    public float d;

    public d(a aVar, a aVar2) {
        this.f58432a = aVar;
        this.f58433b = aVar2;
    }

    public static si.a h(a aVar) {
        if (aVar instanceof si.a) {
            si.a aVar2 = (si.a) aVar;
            if (aVar2.g()) {
                return aVar2;
            }
        }
        return null;
    }

    @Override
    public final int a() {
        return i().a();
    }

    @Override
    public final fh.g b() {
        fh.g gVar = new fh.g(this, this, this);
        c(gVar);
        return gVar;
    }

    @Override
    public final void b0(float f10, float f11, float f12, float f13, Canvas canvas) {
        float f14;
        float f15;
        float f16;
        float f17;
        Canvas canvas2;
        if (this.d < 1.0f) {
            this.f58432a.b0(f10, f11, f12, f13, canvas);
            f14 = f10;
            canvas2 = canvas;
            f17 = f13;
            f16 = f12;
            f15 = f11;
        } else {
            f14 = f10;
            f15 = f11;
            f16 = f12;
            f17 = f13;
            canvas2 = canvas;
        }
        float f18 = this.d;
        if (f18 > 0.0f) {
            if (f18 < 1.0f) {
                canvas2.saveLayerAlpha(f14, f15, f16, f17, (int) (f18 * 255.0f));
            }
            Canvas canvas3 = canvas2;
            this.f58433b.b0(f14, f15, f16, f17, canvas3);
            if (this.d < 1.0f) {
                canvas3.restore();
            }
        }
    }

    @Override
    public final void c(fh.g gVar) {
        this.f58434c.add(gVar);
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        float f12;
        float f13;
        int i10;
        Canvas canvas2;
        RectF rectF2;
        if (this.d < 1.0f) {
            f12 = f10;
            f13 = f11;
            i10 = i7;
            canvas2 = canvas;
            rectF2 = rectF;
            h(this.f58432a).d(f12, f13, i10, canvas2, rectF2);
        } else {
            f12 = f10;
            f13 = f11;
            i10 = i7;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        float f14 = this.d;
        if (f14 > 0.0f) {
            if (f14 < 1.0f) {
                canvas2.saveLayerAlpha(null, (int) (f14 * 255.0f));
            }
            RectF rectF3 = rectF2;
            Canvas canvas3 = canvas2;
            int i11 = i10;
            h(this.f58433b).d(f12, f13, i11, canvas3, rectF3);
            if (this.d < 1.0f) {
                canvas3.restore();
            }
        }
    }

    @Override
    public final int e() {
        return i().e();
    }

    @Override
    public final int f() {
        return i().f();
    }

    @Override
    public final boolean g() {
        if (h(this.f58432a) != null && h(this.f58433b) != null) {
            return true;
        }
        return false;
    }

    public final si.a i() {
        si.a h = h(this.f58432a);
        si.a h7 = h(this.f58433b);
        if (h.e() <= h7.e()) {
            return h;
        }
        return h7;
    }

    public final void j(float f10) {
        if (this.d != f10) {
            this.d = f10;
            Iterator it = this.f58434c.iterator();
            while (it.hasNext()) {
                fh.g gVar = (fh.g) it.next();
                gVar.updateColors();
                gVar.invalidateSelf();
            }
        }
    }
}
