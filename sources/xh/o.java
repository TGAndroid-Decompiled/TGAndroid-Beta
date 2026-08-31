package xh;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import f2.h1;
import f2.i1;
import f2.j0;
import f2.w0;
public class o extends i1 {
    public final LinearInterpolator f50651i;
    public final DecelerateInterpolator f50652j;
    public final float f50653k;
    public int f50654l;
    public int f50655m;
    public final int f50656n;
    public final float f50657o;
    public int f50658p;

    public o(Context context, int i10) {
        this.f50651i = new LinearInterpolator();
        this.f50652j = new DecelerateInterpolator(1.5f);
        this.f50654l = 0;
        this.f50655m = 0;
        this.f50657o = 1.0f;
        this.f50653k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f50656n = i10;
    }

    @Override
    public final PointF a(int i10) {
        w0 w0Var = this.f5807c;
        if (w0Var instanceof j0) {
            return ((j0) w0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, h1 h1Var) {
        if (this.f5806b.f1349x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f50654l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f50654l = i13;
        int i15 = this.f50655m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f50655m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f5805a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                i1.b(a2);
                this.f50654l = (int) (a2.x * 10000.0f);
                this.f50655m = (int) (a2.y * 10000.0f);
                h1Var.b((int) (this.f50654l * 1.2f), (int) (this.f50655m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f50653k)) * 1.2f), this.f50651i);
                return;
            }
            h1Var.d = this.f5805a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f50655m = 0;
        this.f50654l = 0;
    }

    @Override
    public final void g(android.view.View r8, f2.h1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: xh.o.g(android.view.View, f2.h1):void");
    }

    public o(Context context, int i10, float f10) {
        this.f50651i = new LinearInterpolator();
        this.f50652j = new DecelerateInterpolator(1.5f);
        this.f50654l = 0;
        this.f50655m = 0;
        this.f50657o = f10;
        this.f50653k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.f50656n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
