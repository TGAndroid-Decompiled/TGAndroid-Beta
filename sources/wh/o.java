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
    public final LinearInterpolator f46700i;
    public final DecelerateInterpolator f46701j;
    public final float f46702k;
    public int f46703l;
    public int f46704m;
    public final int f46705n;
    public final float f46706o;
    public int f46707p;

    public o(Context context, int i10) {
        this.f46700i = new LinearInterpolator();
        this.f46701j = new DecelerateInterpolator(1.5f);
        this.f46703l = 0;
        this.f46704m = 0;
        this.f46706o = 1.0f;
        this.f46702k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f46705n = i10;
    }

    @Override
    public final PointF a(int i10) {
        v0 v0Var = this.f5714c;
        if (v0Var instanceof i0) {
            return ((i0) v0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, g1 g1Var) {
        if (this.f5713b.f1261x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f46703l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f46703l = i13;
        int i15 = this.f46704m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f46704m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f5712a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                h1.b(a2);
                this.f46703l = (int) (a2.x * 10000.0f);
                this.f46704m = (int) (a2.y * 10000.0f);
                g1Var.b((int) (this.f46703l * 1.2f), (int) (this.f46704m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f46702k)) * 1.2f), this.f46700i);
                return;
            }
            g1Var.d = this.f5712a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f46704m = 0;
        this.f46703l = 0;
    }

    @Override
    public final void g(android.view.View r8, f2.g1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: wh.o.g(android.view.View, f2.g1):void");
    }

    public o(Context context, int i10, float f10) {
        this.f46700i = new LinearInterpolator();
        this.f46701j = new DecelerateInterpolator(1.5f);
        this.f46703l = 0;
        this.f46704m = 0;
        this.f46706o = f10;
        this.f46702k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.f46705n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
