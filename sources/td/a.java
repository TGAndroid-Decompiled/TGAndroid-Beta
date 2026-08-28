package td;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.t1;
public final class a implements b {
    public final int f47772a;
    public final b f47773b;
    public final Interpolator f47774c;
    public final long d;
    public float f47775e;
    public boolean f47776f;
    public c h;

    public a(View view, Interpolator interpolator, long j10) {
        this(0, new t1(view), interpolator, j10, false);
    }

    @Override
    public final void B(float f10, int i9) {
        this.f47773b.B(f10, this.f47772a);
    }

    @Override
    public final void J0(int i9, float f10, float f11, c cVar) {
        if (this.f47775e != f10) {
            this.f47775e = f10;
            this.f47773b.J0(this.f47772a, f10, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        a aVar;
        if (this.f47776f != z10 || !z11) {
            this.f47776f = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    aVar = this;
                    aVar.h = new c(0, aVar, this.f47774c, this.d, this.f47775e);
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
            float f11 = this.f47775e;
            if (f11 != f10) {
                int i9 = this.f47772a;
                b bVar = this.f47773b;
                if (f11 != f10) {
                    this.f47775e = f10;
                    bVar.J0(i9, f10, -1.0f, null);
                }
                bVar.B(f10, i9);
            }
        }
    }

    public a(int i9, b bVar, Interpolator interpolator, long j10) {
        this(i9, bVar, interpolator, j10, false);
    }

    public a(int i9, b bVar, Interpolator interpolator, long j10, boolean z10) {
        this.f47772a = i9;
        this.f47773b = bVar;
        this.f47774c = interpolator;
        this.d = j10;
        this.f47776f = z10;
        this.f47775e = z10 ? 1.0f : 0.0f;
    }
}
