package s4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.BuildVars;
public class d0 extends a1 {
    public static final boolean f47719q = BuildVars.DEBUG_VERSION;
    public PointF f47722k;
    public final DisplayMetrics f47723l;
    public float f47725n;
    public final LinearInterpolator f47720i = new LinearInterpolator();
    public final DecelerateInterpolator f47721j = new DecelerateInterpolator();
    public boolean f47724m = false;
    public int f47726o = 0;
    public int f47727p = 0;

    public d0(Context context) {
        this.f47723l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i10, int i11, z0 z0Var) {
        PointF pointF;
        if (this.f47678b.f3084x.r() == 0) {
            h();
        } else if (f47719q && (pointF = this.f47722k) != null && (pointF.x * i10 < 0.0f || pointF.y * i11 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i12 = this.f47726o;
            int i13 = i12 - i10;
            int i14 = 0;
            if (i12 * i13 <= 0) {
                i13 = 0;
            }
            this.f47726o = i13;
            int i15 = this.f47727p;
            int i16 = i15 - i11;
            if (i15 * i16 > 0) {
                i14 = i16;
            }
            this.f47727p = i14;
            if (i13 == 0 && i14 == 0) {
                q(z0Var);
            }
        }
    }

    @Override
    public final void f() {
        this.f47727p = 0;
        this.f47726o = 0;
        this.f47722k = null;
    }

    @Override
    public void g(View view, z0 z0Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            z0Var.b(-j10, -k10, m10, this.f47721j);
        }
    }

    public int i(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        }
        return i12 - i10;
    }

    public final int j(int i10, View view) {
        p0 p0Var = this.f47679c;
        if (p0Var != null && p0Var.d()) {
            q0 q0Var = (q0) view.getLayoutParams();
            return i(p0.x(view) - ((ViewGroup.MarginLayoutParams) q0Var).leftMargin, p0.y(view) + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, p0Var.D(), p0Var.f47824m - p0Var.E(), i10);
        }
        return 0;
    }

    public int k(int i10, View view) {
        p0 p0Var = this.f47679c;
        if (p0Var != null && p0Var.e()) {
            q0 q0Var = (q0) view.getLayoutParams();
            return i(p0.z(view) - ((ViewGroup.MarginLayoutParams) q0Var).topMargin, p0.v(view) + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin, p0Var.F(), p0Var.f47825n - p0Var.C(), i10);
        }
        return 0;
    }

    public float l(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int m(int i10) {
        return (int) Math.ceil(n(i10) / 0.3356d);
    }

    public int n(int i10) {
        float abs = Math.abs(i10);
        if (!this.f47724m) {
            this.f47725n = l(this.f47723l);
            this.f47724m = true;
        }
        return (int) Math.ceil(abs * this.f47725n);
    }

    public final int o() {
        PointF pointF = this.f47722k;
        if (pointF != null) {
            float f7 = pointF.x;
            if (f7 != 0.0f) {
                if (f7 > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public int p() {
        PointF pointF = this.f47722k;
        if (pointF != null) {
            float f7 = pointF.y;
            if (f7 != 0.0f) {
                if (f7 > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public void q(z0 z0Var) {
        PointF a2 = a(this.f47677a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            a1.b(a2);
            this.f47722k = a2;
            this.f47726o = (int) (a2.x * 10000.0f);
            this.f47727p = (int) (a2.y * 10000.0f);
            z0Var.b((int) (this.f47726o * 1.2f), (int) (this.f47727p * 1.2f), (int) (n(10000) * 1.2f), this.f47720i);
            return;
        }
        z0Var.d = this.f47677a;
        h();
    }

    @Override
    public final void e() {
    }
}
