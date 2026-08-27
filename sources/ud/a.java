package ud;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.t1;

public final class a implements b {

    public final int f48494a;

    public final b f48495b;

    public final Interpolator f48496c;
    public final long d;

    public float f48497e;

    public boolean f48498f;
    public c h;

    public a(View view, Interpolator interpolator, long j10) {
        this(0, new t1(view), interpolator, j10, false);
    }

    @Override
    public final void A(float f10, int i10) {
        this.f48495b.A(f10, this.f48494a);
    }

    public final void a(boolean z10, boolean z11) {
        a aVar;
        if (this.f48498f == z10 && z11) {
            return;
        }
        this.f48498f = z10;
        float f10 = z10 ? 1.0f : 0.0f;
        if (z11) {
            if (this.h == null) {
                aVar = this;
                aVar.h = new c(0, aVar, this.f48496c, this.d, this.f48497e);
            } else {
                aVar = this;
            }
            aVar.h.a(f10);
            return;
        }
        c cVar = this.h;
        if (cVar != null) {
            cVar.c(f10);
        }
        float f11 = this.f48497e;
        if (f11 != f10) {
            int i10 = this.f48494a;
            b bVar = this.f48495b;
            if (f11 != f10) {
                this.f48497e = f10;
                bVar.o(i10, f10, -1.0f, null);
            }
            bVar.A(f10, i10);
        }
    }

    @Override
    public final void o(int i10, float f10, float f11, c cVar) {
        if (this.f48497e != f10) {
            this.f48497e = f10;
            this.f48495b.o(this.f48494a, f10, -1.0f, null);
        }
    }

    public a(int i10, b bVar, Interpolator interpolator, long j10) {
        this(i10, bVar, interpolator, j10, false);
    }

    public a(int i10, b bVar, Interpolator interpolator, long j10, boolean z10) {
        this.f48494a = i10;
        this.f48495b = bVar;
        this.f48496c = interpolator;
        this.d = j10;
        this.f48498f = z10;
        this.f48497e = z10 ? 1.0f : 0.0f;
    }
}
