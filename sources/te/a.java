package te;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.o1;
public final class a implements b {
    public final int f55483a;
    public final b f55484b;
    public final Interpolator f55485c;
    public final long d;
    public float f55486e;
    public boolean f55487f;
    public c h;

    public a(View view, Interpolator interpolator, long j3) {
        this(0, new o1(view), interpolator, j3, false);
    }

    @Override
    public final void F(float f10, int i7) {
        this.f55484b.F(f10, this.f55483a);
    }

    @Override
    public final void Y(int i7, float f10, float f11, c cVar) {
        if (this.f55486e != f10) {
            this.f55486e = f10;
            this.f55484b.Y(this.f55483a, f10, -1.0f, null);
        }
    }

    public final void a(boolean z9, boolean z10) {
        float f10;
        a aVar;
        if (this.f55487f != z9 || !z10) {
            this.f55487f = z9;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (z10) {
                if (this.h == null) {
                    aVar = this;
                    aVar.h = new c(0, aVar, this.f55485c, this.d, this.f55486e);
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
            float f11 = this.f55486e;
            if (f11 != f10) {
                int i7 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
                int i10 = this.f55483a;
                b bVar = this.f55484b;
                if (i7 != 0) {
                    this.f55486e = f10;
                    bVar.Y(i10, f10, -1.0f, null);
                }
                bVar.F(f10, i10);
            }
        }
    }

    public a(int i7, b bVar, Interpolator interpolator, long j3) {
        this(i7, bVar, interpolator, j3, false);
    }

    public a(int i7, b bVar, Interpolator interpolator, long j3, boolean z9) {
        this.f55483a = i7;
        this.f55484b = bVar;
        this.f55485c = interpolator;
        this.d = j3;
        this.f55487f = z9;
        this.f55486e = z9 ? 1.0f : 0.0f;
    }
}
