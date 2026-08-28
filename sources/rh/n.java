package rh;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import f2.l1;
import f2.m0;
import f2.m1;
import f2.z0;
public class n extends m1 {
    public final LinearInterpolator f47262i;
    public final DecelerateInterpolator f47263j;
    public final float f47264k;
    public int f47265l;
    public int f47266m;
    public final int f47267n;
    public final float f47268o;
    public int f47269p;

    public n(Context context, int i9) {
        this.f47262i = new LinearInterpolator();
        this.f47263j = new DecelerateInterpolator(1.5f);
        this.f47265l = 0;
        this.f47266m = 0;
        this.f47268o = 1.0f;
        this.f47264k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f47267n = i9;
    }

    @Override
    public final PointF a(int i9) {
        z0 z0Var = this.f5445c;
        if (z0Var instanceof m0) {
            return ((m0) z0Var).E0(i9);
        }
        return null;
    }

    @Override
    public final void d(int i9, int i10, l1 l1Var) {
        if (this.f5444b.f1368x.r() == 0) {
            h();
            return;
        }
        int i11 = this.f47265l;
        int i12 = i11 - i9;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f47265l = i12;
        int i14 = this.f47266m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f47266m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a2 = a(this.f5443a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                m1.b(a2);
                this.f47265l = (int) (a2.x * 10000.0f);
                this.f47266m = (int) (a2.y * 10000.0f);
                l1Var.b((int) (this.f47265l * 1.2f), (int) (this.f47266m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f47264k)) * 1.2f), this.f47262i);
                return;
            }
            l1Var.d = this.f5443a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f47266m = 0;
        this.f47265l = 0;
    }

    @Override
    public final void g(android.view.View r8, f2.l1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: rh.n.g(android.view.View, f2.l1):void");
    }

    public n(Context context, int i9, float f10) {
        this.f47262i = new LinearInterpolator();
        this.f47263j = new DecelerateInterpolator(1.5f);
        this.f47265l = 0;
        this.f47266m = 0;
        this.f47268o = f10;
        this.f47264k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.f47267n = i9;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
