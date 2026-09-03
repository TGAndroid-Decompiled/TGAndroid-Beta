package xd;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.u1;
public final class a implements b {
    public final int f50538a;
    public final b f50539b;
    public final Interpolator f50540c;
    public final long d;
    public float f50541e;
    public boolean f50542f;
    public c h;

    public a(View view, Interpolator interpolator, long j10) {
        this(0, new u1(view), interpolator, j10, false);
    }

    @Override
    public final void L(int i10, float f10, float f11, c cVar) {
        if (this.f50541e != f10) {
            this.f50541e = f10;
            this.f50539b.L(this.f50538a, f10, -1.0f, null);
        }
    }

    public final void a(boolean z4, boolean z10) {
        float f10;
        a aVar;
        if (this.f50542f != z4 || !z10) {
            this.f50542f = z4;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (z10) {
                if (this.h == null) {
                    aVar = this;
                    aVar.h = new c(0, aVar, this.f50540c, this.d, this.f50541e);
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
            float f11 = this.f50541e;
            if (f11 != f10) {
                int i10 = this.f50538a;
                b bVar = this.f50539b;
                if (f11 != f10) {
                    this.f50541e = f10;
                    bVar.L(i10, f10, -1.0f, null);
                }
                bVar.z(f10, i10);
            }
        }
    }

    @Override
    public final void z(float f10, int i10) {
        this.f50539b.z(f10, this.f50538a);
    }

    public a(int i10, b bVar, Interpolator interpolator, long j10) {
        this(i10, bVar, interpolator, j10, false);
    }

    public a(int i10, b bVar, Interpolator interpolator, long j10, boolean z4) {
        this.f50538a = i10;
        this.f50539b = bVar;
        this.f50540c = interpolator;
        this.d = j10;
        this.f50542f = z4;
        this.f50541e = z4 ? 1.0f : 0.0f;
    }
}
