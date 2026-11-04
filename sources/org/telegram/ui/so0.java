package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class so0 extends u4.z0 {
    public final float f49582k;
    public final LinearInterpolator f49580i = new LinearInterpolator();
    public final DecelerateInterpolator f49581j = new DecelerateInterpolator(1.5f);
    public int f49583l = 0;
    public int f49584m = 0;

    public so0(Context context) {
        this.f49582k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i3) {
        u4.o0 o0Var = this.f55706c;
        if (o0Var instanceof u4.b0) {
            return ((u4.b0) o0Var).E0(i3);
        }
        return null;
    }

    @Override
    public final void d(int i3, int i10, u4.y0 y0Var) {
        if (this.f55705b.f2305y.r() == 0) {
            h();
            return;
        }
        int i11 = this.f49583l;
        int i12 = i11 - i3;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f49583l = i12;
        int i14 = this.f49584m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f49584m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a10 = a(this.f55704a);
            if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
                u4.z0.b(a10);
                this.f49583l = (int) (a10.x * 10000.0f);
                this.f49584m = (int) (a10.y * 10000.0f);
                y0Var.b((int) (this.f49583l * 1.2f), (int) (this.f49584m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f49582k)) * 1.2f), this.f49580i);
                return;
            }
            y0Var.d = this.f55704a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f49584m = 0;
        this.f49583l = 0;
    }

    @Override
    public final void g(android.view.View r8, u4.y0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.so0.g(android.view.View, u4.y0):void");
    }

    @Override
    public final void e() {
    }
}
