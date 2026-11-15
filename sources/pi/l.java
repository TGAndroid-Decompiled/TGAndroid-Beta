package pi;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import v4.a1;
import v4.b0;
import v4.o0;
import v4.z0;
public class l extends a1 {
    public final LinearInterpolator f55116i;
    public final DecelerateInterpolator f55117j;
    public final float f55118k;
    public int f55119l;
    public int f55120m;
    public final int f55121n;
    public final float f55122o;
    public int f55123p;

    public l(Context context, int i7) {
        this.f55116i = new LinearInterpolator();
        this.f55117j = new DecelerateInterpolator(1.5f);
        this.f55119l = 0;
        this.f55120m = 0;
        this.f55122o = 1.0f;
        this.f55118k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f55121n = i7;
    }

    @Override
    public final PointF a(int i7) {
        o0 o0Var = this.f58482c;
        if (o0Var instanceof b0) {
            return ((b0) o0Var).E0(i7);
        }
        return null;
    }

    @Override
    public final void d(int i7, int i10, z0 z0Var) {
        if (this.f58481b.f2827y.r() == 0) {
            h();
            return;
        }
        int i11 = this.f55119l;
        int i12 = i11 - i7;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f55119l = i12;
        int i14 = this.f55120m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f55120m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a10 = a(this.f58480a);
            if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
                a1.b(a10);
                this.f55119l = (int) (a10.x * 10000.0f);
                this.f55120m = (int) (a10.y * 10000.0f);
                z0Var.b((int) (this.f55119l * 1.2f), (int) (this.f55120m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f55118k)) * 1.2f), this.f55116i);
                return;
            }
            z0Var.d = this.f58480a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f55120m = 0;
        this.f55119l = 0;
    }

    @Override
    public final void g(android.view.View r8, v4.z0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: pi.l.g(android.view.View, v4.z0):void");
    }

    public l(Context context, int i7, float f10) {
        this.f55116i = new LinearInterpolator();
        this.f55117j = new DecelerateInterpolator(1.5f);
        this.f55119l = 0;
        this.f55120m = 0;
        this.f55122o = f10;
        this.f55118k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.f55121n = i7;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
