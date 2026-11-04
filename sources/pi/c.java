package pi;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Cells.f1;
public final class c implements si.a, qi.a {
    public final int f53556a;
    public final d f53557b;

    public c(d dVar, int i3) {
        this.f53557b = dVar;
        this.f53556a = i3;
    }

    @Override
    public final int a() {
        boolean d = f1.d(this.f53556a);
        d dVar = this.f53557b;
        if (d) {
            return dVar.f53574s;
        }
        return dVar.f53572q;
    }

    @Override
    public final void c(float f10, float f11, int i3, Canvas canvas, RectF rectF) {
        d.b(this.f53557b, this.f53556a, canvas, rectF, i3, f10, f11);
    }

    @Override
    public final int e() {
        boolean d = f1.d(this.f53556a);
        d dVar = this.f53557b;
        if (d) {
            return dVar.f53569n;
        }
        return dVar.f53568m;
    }

    @Override
    public final int f() {
        boolean d = f1.d(this.f53556a);
        d dVar = this.f53557b;
        if (d) {
            return dVar.f53573r;
        }
        return dVar.f53571p;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        d.a(this.f53557b, canvas, this.f53556a, f10, f11, f12, f13);
    }
}
