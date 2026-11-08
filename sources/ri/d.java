package ri;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.Iterator;
public final class d implements a, dh.b, pi.a {
    public final a f54565a;
    public final a f54566b;
    public final xe.b f54567c = new xe.b();
    public float d;

    public d(a aVar, a aVar2) {
        this.f54565a = aVar;
        this.f54566b = aVar2;
    }

    public static pi.a i(a aVar) {
        if (aVar instanceof pi.a) {
            pi.a aVar2 = (pi.a) aVar;
            if (aVar2.h()) {
                return aVar2;
            }
        }
        return null;
    }

    @Override
    public final int a() {
        return j().a();
    }

    @Override
    public final fh.g b() {
        fh.g gVar = new fh.g(this, this, this);
        c(gVar);
        return gVar;
    }

    @Override
    public final void c(fh.g gVar) {
        this.f54567c.add(gVar);
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
            i(this.f54565a).d(f12, f13, i10, canvas2, rectF2);
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
            i(this.f54566b).d(f12, f13, i11, canvas3, rectF3);
            if (this.d < 1.0f) {
                canvas3.restore();
            }
        }
    }

    @Override
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        Canvas canvas2;
        float f14;
        float f15;
        float f16;
        float f17;
        if (this.d < 1.0f) {
            canvas2 = canvas;
            f14 = f10;
            f15 = f11;
            f16 = f12;
            f17 = f13;
            this.f54565a.e(canvas2, f14, f15, f16, f17);
        } else {
            canvas2 = canvas;
            f14 = f10;
            f15 = f11;
            f16 = f12;
            f17 = f13;
        }
        float f18 = this.d;
        if (f18 > 0.0f) {
            if (f18 < 1.0f) {
                canvas2.saveLayerAlpha(f14, f15, f16, f17, (int) (f18 * 255.0f));
            }
            float f19 = f17;
            float f20 = f16;
            float f21 = f15;
            float f22 = f14;
            Canvas canvas3 = canvas2;
            this.f54566b.e(canvas3, f22, f21, f20, f19);
            if (this.d < 1.0f) {
                canvas3.restore();
            }
        }
    }

    @Override
    public final int f() {
        return j().f();
    }

    @Override
    public final int g() {
        return j().g();
    }

    @Override
    public final boolean h() {
        if (i(this.f54565a) != null && i(this.f54566b) != null) {
            return true;
        }
        return false;
    }

    public final pi.a j() {
        pi.a i7 = i(this.f54565a);
        pi.a i10 = i(this.f54566b);
        if (i7.f() <= i10.f()) {
            return i7;
        }
        return i10;
    }

    public final void k(float f10) {
        if (this.d != f10) {
            this.d = f10;
            Iterator it = this.f54567c.iterator();
            while (it.hasNext()) {
                fh.g gVar = (fh.g) it.next();
                gVar.updateColors();
                gVar.invalidateSelf();
            }
        }
    }
}
