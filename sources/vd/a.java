package vd;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.u1;
public final class a implements b {
    public final int f49502a;
    public final b f49503b;
    public final Interpolator f49504c;
    public final long d;
    public float f49505e;
    public boolean f49506f;
    public c h;

    public a(View view, Interpolator interpolator, long j10) {
        this(0, new u1(view), interpolator, j10, false);
    }

    @Override
    public final void N(int i10, float f9, float f10, c cVar) {
        if (this.f49505e != f9) {
            this.f49505e = f9;
            this.f49503b.N(this.f49502a, f9, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        float f9;
        a aVar;
        if (this.f49506f != z10 || !z11) {
            this.f49506f = z10;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    aVar = this;
                    aVar.h = new c(0, aVar, this.f49504c, this.d, this.f49505e);
                } else {
                    aVar = this;
                }
                aVar.h.a(f9);
                return;
            }
            c cVar = this.h;
            if (cVar != null) {
                cVar.c(f9);
            }
            float f10 = this.f49505e;
            if (f10 != f9) {
                int i10 = this.f49502a;
                b bVar = this.f49503b;
                if (f10 != f9) {
                    this.f49505e = f9;
                    bVar.N(i10, f9, -1.0f, null);
                }
                bVar.z(f9, i10);
            }
        }
    }

    @Override
    public final void z(float f9, int i10) {
        this.f49503b.z(f9, this.f49502a);
    }

    public a(int i10, b bVar, Interpolator interpolator, long j10) {
        this(i10, bVar, interpolator, j10, false);
    }

    public a(int i10, b bVar, Interpolator interpolator, long j10, boolean z10) {
        this.f49502a = i10;
        this.f49503b = bVar;
        this.f49504c = interpolator;
        this.d = j10;
        this.f49506f = z10;
        this.f49505e = z10 ? 1.0f : 0.0f;
    }
}
