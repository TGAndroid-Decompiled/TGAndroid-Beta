package si;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.Iterator;
public final class d implements a, eh.b, qi.a {
    public final a f54748a;
    public final a f54749b;
    public final ue.b f54750c = new ue.b();
    public float d;

    public d(a aVar, a aVar2) {
        this.f54748a = aVar;
        this.f54749b = aVar2;
    }

    public static qi.a h(a aVar) {
        if (aVar instanceof qi.a) {
            qi.a aVar2 = (qi.a) aVar;
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
    public final gh.g b() {
        gh.g gVar = new gh.g(this, this, this);
        d(gVar);
        return gVar;
    }

    @Override
    public final void c(float f10, float f11, int i3, Canvas canvas, RectF rectF) {
        float f12;
        float f13;
        int i10;
        Canvas canvas2;
        RectF rectF2;
        if (this.d < 1.0f) {
            f12 = f10;
            f13 = f11;
            i10 = i3;
            canvas2 = canvas;
            rectF2 = rectF;
            h(this.f54748a).c(f12, f13, i10, canvas2, rectF2);
        } else {
            f12 = f10;
            f13 = f11;
            i10 = i3;
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
            h(this.f54749b).c(f12, f13, i11, canvas3, rectF3);
            if (this.d < 1.0f) {
                canvas3.restore();
            }
        }
    }

    @Override
    public final void d(gh.g gVar) {
        this.f54750c.add(gVar);
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
        if (h(this.f54748a) != null && h(this.f54749b) != null) {
            return true;
        }
        return false;
    }

    public final qi.a i() {
        qi.a h = h(this.f54748a);
        qi.a h7 = h(this.f54749b);
        if (h.e() <= h7.e()) {
            return h;
        }
        return h7;
    }

    public final void j(float f10) {
        if (this.d != f10) {
            this.d = f10;
            Iterator it = this.f54750c.iterator();
            while (it.hasNext()) {
                gh.g gVar = (gh.g) it.next();
                gVar.updateColors();
                gVar.invalidateSelf();
            }
        }
    }

    @Override
    public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
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
            this.f54748a.l(canvas2, f14, f15, f16, f17);
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
            this.f54749b.l(canvas3, f22, f21, f20, f19);
            if (this.d < 1.0f) {
                canvas3.restore();
            }
        }
    }
}
