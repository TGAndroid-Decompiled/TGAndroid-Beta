package qe;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.d1;
public final class a implements b {
    public final int f53837a;
    public final b f53838b;
    public final Interpolator f53839c;
    public final long d;
    public float f53840e;
    public boolean f53841f;
    public c h;

    public a(View view, Interpolator interpolator, long j10) {
        this(0, new d1(view), interpolator, j10, false);
    }

    @Override
    public final void F(float f10, int i3) {
        this.f53838b.F(f10, this.f53837a);
    }

    @Override
    public final void Y(int i3, float f10, float f11, c cVar) {
        if (this.f53840e != f10) {
            this.f53840e = f10;
            this.f53838b.Y(this.f53837a, f10, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        a aVar;
        if (this.f53841f != z10 || !z11) {
            this.f53841f = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    aVar = this;
                    aVar.h = new c(0, aVar, this.f53839c, this.d, this.f53840e);
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
            float f11 = this.f53840e;
            if (f11 != f10) {
                int i3 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
                int i10 = this.f53837a;
                b bVar = this.f53838b;
                if (i3 != 0) {
                    this.f53840e = f10;
                    bVar.Y(i10, f10, -1.0f, null);
                }
                bVar.F(f10, i10);
            }
        }
    }

    public a(int i3, b bVar, Interpolator interpolator, long j10) {
        this(i3, bVar, interpolator, j10, false);
    }

    public a(int i3, b bVar, Interpolator interpolator, long j10, boolean z10) {
        this.f53837a = i3;
        this.f53838b = bVar;
        this.f53839c = interpolator;
        this.d = j10;
        this.f53841f = z10;
        this.f53840e = z10 ? 1.0f : 0.0f;
    }
}
