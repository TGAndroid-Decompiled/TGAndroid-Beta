package uh;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import f2.i1;
import f2.j0;
import f2.j1;
import f2.w0;
public class n extends j1 {
    public final LinearInterpolator f49299i;
    public final DecelerateInterpolator f49300j;
    public final float f49301k;
    public int f49302l;
    public int f49303m;
    public final int f49304n;
    public final float f49305o;
    public int f49306p;

    public n(Context context, int i10) {
        this.f49299i = new LinearInterpolator();
        this.f49300j = new DecelerateInterpolator(1.5f);
        this.f49302l = 0;
        this.f49303m = 0;
        this.f49305o = 1.0f;
        this.f49301k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f49304n = i10;
    }

    @Override
    public final PointF a(int i10) {
        w0 w0Var = this.f6375c;
        if (w0Var instanceof j0) {
            return ((j0) w0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, i1 i1Var) {
        if (this.f6374b.f1858x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f49302l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f49302l = i13;
        int i15 = this.f49303m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f49303m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f6373a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                j1.b(a2);
                this.f49302l = (int) (a2.x * 10000.0f);
                this.f49303m = (int) (a2.y * 10000.0f);
                i1Var.b((int) (this.f49302l * 1.2f), (int) (this.f49303m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f49301k)) * 1.2f), this.f49299i);
                return;
            }
            i1Var.d = this.f6373a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f49303m = 0;
        this.f49302l = 0;
    }

    @Override
    public final void g(android.view.View r8, f2.i1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: uh.n.g(android.view.View, f2.i1):void");
    }

    public n(Context context, int i10, float f9) {
        this.f49299i = new LinearInterpolator();
        this.f49300j = new DecelerateInterpolator(1.5f);
        this.f49302l = 0;
        this.f49303m = 0;
        this.f49305o = f9;
        this.f49301k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f9;
        this.f49304n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
