package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class ss0 extends s4.a1 {
    public final float f43398k;
    public final LinearInterpolator f43396i = new LinearInterpolator();
    public final DecelerateInterpolator f43397j = new DecelerateInterpolator(1.5f);
    public int f43399l = 0;
    public int f43400m = 0;

    public ss0(Context context) {
        this.f43398k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        s4.p0 p0Var = this.f47717c;
        if (p0Var instanceof s4.c0) {
            return ((s4.c0) p0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, s4.z0 z0Var) {
        if (this.f47716b.f3084x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f43399l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f43399l = i13;
        int i15 = this.f43400m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f43400m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f47715a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                s4.a1.b(a2);
                this.f43399l = (int) (a2.x * 10000.0f);
                this.f43400m = (int) (a2.y * 10000.0f);
                z0Var.b((int) (this.f43399l * 1.2f), (int) (this.f43400m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f43398k)) * 1.2f), this.f43396i);
                return;
            }
            z0Var.d = this.f47715a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f43400m = 0;
        this.f43399l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.z0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ss0.g(android.view.View, s4.z0):void");
    }

    @Override
    public final void e() {
    }
}
