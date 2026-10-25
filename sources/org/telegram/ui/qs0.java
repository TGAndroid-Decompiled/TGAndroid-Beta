package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class qs0 extends s4.a1 {
    public final float f42908k;
    public final LinearInterpolator f42906i = new LinearInterpolator();
    public final DecelerateInterpolator f42907j = new DecelerateInterpolator(1.5f);
    public int f42909l = 0;
    public int f42910m = 0;

    public qs0(Context context) {
        this.f42908k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        s4.p0 p0Var = this.f47679c;
        if (p0Var instanceof s4.c0) {
            return ((s4.c0) p0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, s4.z0 z0Var) {
        if (this.f47678b.f3084x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f42909l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f42909l = i13;
        int i15 = this.f42910m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f42910m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f47677a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                s4.a1.b(a2);
                this.f42909l = (int) (a2.x * 10000.0f);
                this.f42910m = (int) (a2.y * 10000.0f);
                z0Var.b((int) (this.f42909l * 1.2f), (int) (this.f42910m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f42908k)) * 1.2f), this.f42906i);
                return;
            }
            z0Var.d = this.f47677a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f42910m = 0;
        this.f42909l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.z0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qs0.g(android.view.View, s4.z0):void");
    }

    @Override
    public final void e() {
    }
}
