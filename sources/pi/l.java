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
    public final LinearInterpolator f55702i;
    public final DecelerateInterpolator f55703j;
    public final float f55704k;
    public int f55705l;
    public int f55706m;
    public final int f55707n;
    public final float f55708o;
    public int f55709p;

    public l(Context context, int i7) {
        this.f55702i = new LinearInterpolator();
        this.f55703j = new DecelerateInterpolator(1.5f);
        this.f55705l = 0;
        this.f55706m = 0;
        this.f55708o = 1.0f;
        this.f55704k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f55707n = i7;
    }

    @Override
    public final PointF a(int i7) {
        o0 o0Var = this.f59057c;
        if (o0Var instanceof b0) {
            return ((b0) o0Var).E0(i7);
        }
        return null;
    }

    @Override
    public final void d(int i7, int i10, z0 z0Var) {
        if (this.f59056b.f2792y.r() == 0) {
            h();
            return;
        }
        int i11 = this.f55705l;
        int i12 = i11 - i7;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f55705l = i12;
        int i14 = this.f55706m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f55706m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a10 = a(this.f59055a);
            if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
                a1.b(a10);
                this.f55705l = (int) (a10.x * 10000.0f);
                this.f55706m = (int) (a10.y * 10000.0f);
                z0Var.b((int) (this.f55705l * 1.2f), (int) (this.f55706m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f55704k)) * 1.2f), this.f55702i);
                return;
            }
            z0Var.d = this.f59055a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f55706m = 0;
        this.f55705l = 0;
    }

    @Override
    public final void g(android.view.View r8, v4.z0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: pi.l.g(android.view.View, v4.z0):void");
    }

    public l(Context context, int i7, float f10) {
        this.f55702i = new LinearInterpolator();
        this.f55703j = new DecelerateInterpolator(1.5f);
        this.f55705l = 0;
        this.f55706m = 0;
        this.f55708o = f10;
        this.f55704k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.f55707n = i7;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
