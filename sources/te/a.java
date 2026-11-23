package te;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.s1;
public final class a implements b {
    public final int f57776a;
    public final b f57777b;
    public final Interpolator f57778c;
    public final long d;
    public float f57779e;
    public boolean f57780f;
    public c h;

    public a(View view, Interpolator interpolator, long j3) {
        this(0, new s1(view), interpolator, j3, false);
    }

    @Override
    public final void G(float f10, int i7) {
        this.f57777b.G(f10, this.f57776a);
    }

    @Override
    public final void K(int i7, float f10, float f11, c cVar) {
        if (this.f57779e != f10) {
            this.f57779e = f10;
            this.f57777b.K(this.f57776a, f10, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        a aVar;
        if (this.f57780f != z10 || !z11) {
            this.f57780f = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    aVar = this;
                    aVar.h = new c(0, aVar, this.f57778c, this.d, this.f57779e);
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
            float f11 = this.f57779e;
            if (f11 != f10) {
                int i7 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
                int i10 = this.f57776a;
                b bVar = this.f57777b;
                if (i7 != 0) {
                    this.f57779e = f10;
                    bVar.K(i10, f10, -1.0f, null);
                }
                bVar.G(f10, i10);
            }
        }
    }

    public a(int i7, b bVar, Interpolator interpolator, long j3) {
        this(i7, bVar, interpolator, j3, false);
    }

    public a(int i7, b bVar, Interpolator interpolator, long j3, boolean z10) {
        this.f57776a = i7;
        this.f57777b = bVar;
        this.f57778c = interpolator;
        this.d = j3;
        this.f57780f = z10;
        this.f57779e = z10 ? 1.0f : 0.0f;
    }
}
