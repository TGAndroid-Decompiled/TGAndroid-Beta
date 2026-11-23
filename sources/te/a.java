package te;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.r1;
public final class a implements b {
    public final int f57662a;
    public final b f57663b;
    public final Interpolator f57664c;
    public final long d;
    public float f57665e;
    public boolean f57666f;
    public c h;

    public a(View view, Interpolator interpolator, long j3) {
        this(0, new r1(view), interpolator, j3, false);
    }

    @Override
    public final void D(float f10, int i7) {
        this.f57663b.D(f10, this.f57662a);
    }

    @Override
    public final void H(int i7, float f10, float f11, c cVar) {
        if (this.f57665e != f10) {
            this.f57665e = f10;
            this.f57663b.H(this.f57662a, f10, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        a aVar;
        if (this.f57666f != z10 || !z11) {
            this.f57666f = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    aVar = this;
                    aVar.h = new c(0, aVar, this.f57664c, this.d, this.f57665e);
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
            float f11 = this.f57665e;
            if (f11 != f10) {
                int i7 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
                int i10 = this.f57662a;
                b bVar = this.f57663b;
                if (i7 != 0) {
                    this.f57665e = f10;
                    bVar.H(i10, f10, -1.0f, null);
                }
                bVar.D(f10, i10);
            }
        }
    }

    public a(int i7, b bVar, Interpolator interpolator, long j3) {
        this(i7, bVar, interpolator, j3, false);
    }

    public a(int i7, b bVar, Interpolator interpolator, long j3, boolean z10) {
        this.f57662a = i7;
        this.f57663b = bVar;
        this.f57664c = interpolator;
        this.d = j3;
        this.f57666f = z10;
        this.f57665e = z10 ? 1.0f : 0.0f;
    }
}
