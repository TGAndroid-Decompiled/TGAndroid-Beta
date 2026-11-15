package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class zo0 extends v4.a1 {
    public final float f53998k;
    public final LinearInterpolator f53996i = new LinearInterpolator();
    public final DecelerateInterpolator f53997j = new DecelerateInterpolator(1.5f);
    public int f53999l = 0;
    public int f54000m = 0;

    public zo0(Context context) {
        this.f53998k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i7) {
        v4.o0 o0Var = this.f58482c;
        if (o0Var instanceof v4.b0) {
            return ((v4.b0) o0Var).E0(i7);
        }
        return null;
    }

    @Override
    public final void d(int i7, int i10, v4.z0 z0Var) {
        if (this.f58481b.f2830y.r() == 0) {
            h();
            return;
        }
        int i11 = this.f53999l;
        int i12 = i11 - i7;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f53999l = i12;
        int i14 = this.f54000m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f54000m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a10 = a(this.f58480a);
            if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
                v4.a1.b(a10);
                this.f53999l = (int) (a10.x * 10000.0f);
                this.f54000m = (int) (a10.y * 10000.0f);
                z0Var.b((int) (this.f53999l * 1.2f), (int) (this.f54000m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f53998k)) * 1.2f), this.f53996i);
                return;
            }
            z0Var.d = this.f58480a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f54000m = 0;
        this.f53999l = 0;
    }

    @Override
    public final void g(android.view.View r8, v4.z0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zo0.g(android.view.View, v4.z0):void");
    }

    @Override
    public final void e() {
    }
}
