package wh;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import f2.g1;
import f2.h1;
import f2.i0;
import f2.v0;
public class o extends h1 {
    public final LinearInterpolator f46631i;
    public final DecelerateInterpolator f46632j;
    public final float f46633k;
    public int f46634l;
    public int f46635m;
    public final int f46636n;
    public final float f46637o;
    public int f46638p;

    public o(Context context, int i10) {
        this.f46631i = new LinearInterpolator();
        this.f46632j = new DecelerateInterpolator(1.5f);
        this.f46634l = 0;
        this.f46635m = 0;
        this.f46637o = 1.0f;
        this.f46633k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f46636n = i10;
    }

    @Override
    public final PointF a(int i10) {
        v0 v0Var = this.f5725c;
        if (v0Var instanceof i0) {
            return ((i0) v0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, g1 g1Var) {
        if (this.f5724b.f1250x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f46634l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f46634l = i13;
        int i15 = this.f46635m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f46635m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f5723a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                h1.b(a2);
                this.f46634l = (int) (a2.x * 10000.0f);
                this.f46635m = (int) (a2.y * 10000.0f);
                g1Var.b((int) (this.f46634l * 1.2f), (int) (this.f46635m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f46633k)) * 1.2f), this.f46631i);
                return;
            }
            g1Var.d = this.f5723a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f46635m = 0;
        this.f46634l = 0;
    }

    @Override
    public final void g(android.view.View r8, f2.g1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: wh.o.g(android.view.View, f2.g1):void");
    }

    public o(Context context, int i10, float f10) {
        this.f46631i = new LinearInterpolator();
        this.f46632j = new DecelerateInterpolator(1.5f);
        this.f46634l = 0;
        this.f46635m = 0;
        this.f46637o = f10;
        this.f46633k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.f46636n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
