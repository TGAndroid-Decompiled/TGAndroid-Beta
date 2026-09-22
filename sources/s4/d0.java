package s4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.BuildVars;
public class d0 extends y0 {
    public static final boolean f43015q = BuildVars.DEBUG_VERSION;
    public PointF f43018k;
    public final DisplayMetrics f43019l;
    public float f43021n;
    public final LinearInterpolator f43016i = new LinearInterpolator();
    public final DecelerateInterpolator f43017j = new DecelerateInterpolator();
    public boolean f43020m = false;
    public int f43022o = 0;
    public int f43023p = 0;

    public d0(Context context) {
        this.f43019l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i10, int i11, x0 x0Var) {
        PointF pointF;
        if (this.f43146b.f2867x.r() == 0) {
            h();
        } else if (f43015q && (pointF = this.f43018k) != null && (pointF.x * i10 < 0.0f || pointF.y * i11 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i12 = this.f43022o;
            int i13 = i12 - i10;
            int i14 = 0;
            if (i12 * i13 <= 0) {
                i13 = 0;
            }
            this.f43022o = i13;
            int i15 = this.f43023p;
            int i16 = i15 - i11;
            if (i15 * i16 > 0) {
                i14 = i16;
            }
            this.f43023p = i14;
            if (i13 == 0 && i14 == 0) {
                q(x0Var);
            }
        }
    }

    @Override
    public final void f() {
        this.f43023p = 0;
        this.f43022o = 0;
        this.f43018k = null;
    }

    @Override
    public void g(View view, x0 x0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            x0Var.b(-j3, -k10, m10, this.f43017j);
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
        o0 o0Var = this.f43147c;
        if (o0Var != null && o0Var.d()) {
            p0 p0Var = (p0) view.getLayoutParams();
            return i(o0.x(view) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, o0.y(view) + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, o0Var.D(), o0Var.f43096m - o0Var.E(), i10);
        }
        return 0;
    }

    public int k(int i10, View view) {
        o0 o0Var = this.f43147c;
        if (o0Var != null && o0Var.e()) {
            p0 p0Var = (p0) view.getLayoutParams();
            return i(o0.z(view) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, o0.v(view) + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin, o0Var.F(), o0Var.f43097n - o0Var.C(), i10);
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
        if (!this.f43020m) {
            this.f43021n = l(this.f43019l);
            this.f43020m = true;
        }
        return (int) Math.ceil(abs * this.f43021n);
    }

    public final int o() {
        PointF pointF = this.f43018k;
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
        PointF pointF = this.f43018k;
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

    public void q(x0 x0Var) {
        PointF a2 = a(this.f43145a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            y0.b(a2);
            this.f43018k = a2;
            this.f43022o = (int) (a2.x * 10000.0f);
            this.f43023p = (int) (a2.y * 10000.0f);
            x0Var.b((int) (this.f43022o * 1.2f), (int) (this.f43023p * 1.2f), (int) (n(10000) * 1.2f), this.f43016i);
            return;
        }
        x0Var.d = this.f43145a;
        h();
    }

    @Override
    public final void e() {
    }
}
