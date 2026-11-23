package pi;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import v4.a1;
import v4.b1;
import v4.c0;
import v4.p0;
public class l extends b1 {
    public final LinearInterpolator f55815i;
    public final DecelerateInterpolator f55816j;
    public final float f55817k;
    public int f55818l;
    public int f55819m;
    public final int f55820n;
    public final float f55821o;
    public int f55822p;

    public l(Context context, int i7) {
        this.f55815i = new LinearInterpolator();
        this.f55816j = new DecelerateInterpolator(1.5f);
        this.f55818l = 0;
        this.f55819m = 0;
        this.f55821o = 1.0f;
        this.f55817k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f55820n = i7;
    }

    @Override
    public final PointF a(int i7) {
        p0 p0Var = this.f59192c;
        if (p0Var instanceof c0) {
            return ((c0) p0Var).E0(i7);
        }
        return null;
    }

    @Override
    public final void d(int i7, int i10, a1 a1Var) {
        if (this.f59191b.f2793y.r() == 0) {
            h();
            return;
        }
        int i11 = this.f55818l;
        int i12 = i11 - i7;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f55818l = i12;
        int i14 = this.f55819m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f55819m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a10 = a(this.f59190a);
            if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
                b1.b(a10);
                this.f55818l = (int) (a10.x * 10000.0f);
                this.f55819m = (int) (a10.y * 10000.0f);
                a1Var.b((int) (this.f55818l * 1.2f), (int) (this.f55819m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f55817k)) * 1.2f), this.f55815i);
                return;
            }
            a1Var.d = this.f59190a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f55819m = 0;
        this.f55818l = 0;
    }

    @Override
    public final void g(android.view.View r8, v4.a1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: pi.l.g(android.view.View, v4.a1):void");
    }

    public l(Context context, int i7, float f10) {
        this.f55815i = new LinearInterpolator();
        this.f55816j = new DecelerateInterpolator(1.5f);
        this.f55818l = 0;
        this.f55819m = 0;
        this.f55821o = f10;
        this.f55817k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.f55820n = i7;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
