package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class ws0 extends s4.y0 {
    public final float f39084k;
    public final LinearInterpolator f39082i = new LinearInterpolator();
    public final DecelerateInterpolator f39083j = new DecelerateInterpolator(1.5f);
    public int f39085l = 0;
    public int f39086m = 0;

    public ws0(Context context) {
        this.f39084k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        s4.o0 o0Var = this.f42779c;
        if (o0Var instanceof s4.c0) {
            return ((s4.c0) o0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, s4.x0 x0Var) {
        if (this.f42778b.f2860x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f39085l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f39085l = i13;
        int i15 = this.f39086m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f39086m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f42777a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                s4.y0.b(a2);
                this.f39085l = (int) (a2.x * 10000.0f);
                this.f39086m = (int) (a2.y * 10000.0f);
                x0Var.b((int) (this.f39085l * 1.2f), (int) (this.f39086m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f39084k)) * 1.2f), this.f39082i);
                return;
            }
            x0Var.d = this.f42777a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f39086m = 0;
        this.f39085l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.x0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ws0.g(android.view.View, s4.x0):void");
    }

    @Override
    public final void e() {
    }
}
