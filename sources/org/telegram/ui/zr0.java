package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class zr0 extends f2.j1 {
    public final float f45306k;
    public final LinearInterpolator f45304i = new LinearInterpolator();
    public final DecelerateInterpolator f45305j = new DecelerateInterpolator(1.5f);
    public int f45307l = 0;
    public int f45308m = 0;

    public zr0(Context context) {
        this.f45306k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        f2.w0 w0Var = this.f6375c;
        if (w0Var instanceof f2.j0) {
            return ((f2.j0) w0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, f2.i1 i1Var) {
        if (this.f6374b.f1858x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f45307l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f45307l = i13;
        int i15 = this.f45308m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f45308m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f6373a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                f2.j1.b(a2);
                this.f45307l = (int) (a2.x * 10000.0f);
                this.f45308m = (int) (a2.y * 10000.0f);
                i1Var.b((int) (this.f45307l * 1.2f), (int) (this.f45308m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f45306k)) * 1.2f), this.f45304i);
                return;
            }
            i1Var.d = this.f6373a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f45308m = 0;
        this.f45307l = 0;
    }

    @Override
    public final void g(android.view.View r8, f2.i1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zr0.g(android.view.View, f2.i1):void");
    }

    @Override
    public final void e() {
    }
}
