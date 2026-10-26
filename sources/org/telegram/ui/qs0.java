package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class qs0 extends s4.a1 {
    public final float f42911k;
    public final LinearInterpolator f42909i = new LinearInterpolator();
    public final DecelerateInterpolator f42910j = new DecelerateInterpolator(1.5f);
    public int f42912l = 0;
    public int f42913m = 0;

    public qs0(Context context) {
        this.f42911k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        s4.p0 p0Var = this.f47682c;
        if (p0Var instanceof s4.c0) {
            return ((s4.c0) p0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, s4.z0 z0Var) {
        if (this.f47681b.f3084x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f42912l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f42912l = i13;
        int i15 = this.f42913m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f42913m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f47680a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                s4.a1.b(a2);
                this.f42912l = (int) (a2.x * 10000.0f);
                this.f42913m = (int) (a2.y * 10000.0f);
                z0Var.b((int) (this.f42912l * 1.2f), (int) (this.f42913m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f42911k)) * 1.2f), this.f42909i);
                return;
            }
            z0Var.d = this.f47680a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f42913m = 0;
        this.f42912l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.z0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qs0.g(android.view.View, s4.z0):void");
    }

    @Override
    public final void e() {
    }
}
