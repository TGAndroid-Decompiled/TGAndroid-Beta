package te;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.s1;
public final class a implements b {
    public final int f57078a;
    public final b f57079b;
    public final Interpolator f57080c;
    public final long d;
    public float f57081e;
    public boolean f57082f;
    public c h;

    public a(View view, Interpolator interpolator, long j3) {
        this(0, new s1(view), interpolator, j3, false);
    }

    @Override
    public final void E(float f10, int i7) {
        this.f57079b.E(f10, this.f57078a);
    }

    @Override
    public final void G(int i7, float f10, float f11, c cVar) {
        if (this.f57081e != f10) {
            this.f57081e = f10;
            this.f57079b.G(this.f57078a, f10, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        a aVar;
        if (this.f57082f != z10 || !z11) {
            this.f57082f = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    aVar = this;
                    aVar.h = new c(0, aVar, this.f57080c, this.d, this.f57081e);
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
            float f11 = this.f57081e;
            if (f11 != f10) {
                int i7 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
                int i10 = this.f57078a;
                b bVar = this.f57079b;
                if (i7 != 0) {
                    this.f57081e = f10;
                    bVar.G(i10, f10, -1.0f, null);
                }
                bVar.E(f10, i10);
            }
        }
    }

    public a(int i7, b bVar, Interpolator interpolator, long j3) {
        this(i7, bVar, interpolator, j3, false);
    }

    public a(int i7, b bVar, Interpolator interpolator, long j3, boolean z10) {
        this.f57078a = i7;
        this.f57079b = bVar;
        this.f57080c = interpolator;
        this.d = j3;
        this.f57082f = z10;
        this.f57081e = z10 ? 1.0f : 0.0f;
    }
}
