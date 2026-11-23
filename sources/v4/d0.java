package v4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.s2;
public class d0 extends b1 {
    public static final boolean f59143q;
    public PointF f59146k;
    public final DisplayMetrics f59147l;
    public float f59149n;
    public final LinearInterpolator f59144i = new LinearInterpolator();
    public final DecelerateInterpolator f59145j = new DecelerateInterpolator();
    public boolean f59148m = false;
    public int f59150o = 0;
    public int f59151p = 0;

    static {
        boolean z10 = s2.f26730a;
        f59143q = true;
    }

    public d0(Context context) {
        this.f59147l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i7, int i10, a1 a1Var) {
        PointF pointF;
        if (this.f59110b.f2841y.r() == 0) {
            h();
        } else if (f59143q && (pointF = this.f59146k) != null && (pointF.x * i7 < 0.0f || pointF.y * i10 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i11 = this.f59150o;
            int i12 = i11 - i7;
            int i13 = 0;
            if (i11 * i12 <= 0) {
                i12 = 0;
            }
            this.f59150o = i12;
            int i14 = this.f59151p;
            int i15 = i14 - i10;
            if (i14 * i15 > 0) {
                i13 = i15;
            }
            this.f59151p = i13;
            if (i12 == 0 && i13 == 0) {
                q(a1Var);
            }
        }
    }

    @Override
    public final void f() {
        this.f59151p = 0;
        this.f59150o = 0;
        this.f59146k = null;
    }

    @Override
    public void g(View view, a1 a1Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            a1Var.b(-j3, -k10, m10, this.f59145j);
        }
    }

    public int i(int i7, int i10, int i11, int i12, int i13) {
        if (i13 != -1) {
            if (i13 != 0) {
                if (i13 == 1) {
                    return i12 - i10;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i14 = i11 - i7;
            if (i14 > 0) {
                return i14;
            }
            int i15 = i12 - i10;
            if (i15 < 0) {
                return i15;
            }
            return 0;
        }
        return i11 - i7;
    }

    public final int j(int i7, View view) {
        p0 p0Var = this.f59111c;
        if (p0Var != null && p0Var.d()) {
            q0 q0Var = (q0) view.getLayoutParams();
            return i(p0.x(view) - ((ViewGroup.MarginLayoutParams) q0Var).leftMargin, p0.y(view) + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, p0Var.D(), p0Var.f59259m - p0Var.E(), i7);
        }
        return 0;
    }

    public int k(int i7, View view) {
        p0 p0Var = this.f59111c;
        if (p0Var != null && p0Var.e()) {
            q0 q0Var = (q0) view.getLayoutParams();
            return i(p0.z(view) - ((ViewGroup.MarginLayoutParams) q0Var).topMargin, p0.v(view) + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin, p0Var.F(), p0Var.f59260n - p0Var.C(), i7);
        }
        return 0;
    }

    public float l(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int m(int i7) {
        return (int) Math.ceil(n(i7) / 0.3356d);
    }

    public int n(int i7) {
        float abs = Math.abs(i7);
        if (!this.f59148m) {
            this.f59149n = l(this.f59147l);
            this.f59148m = true;
        }
        return (int) Math.ceil(abs * this.f59149n);
    }

    public final int o() {
        PointF pointF = this.f59146k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                if (f10 > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public int p() {
        PointF pointF = this.f59146k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                if (f10 > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public void q(a1 a1Var) {
        PointF a10 = a(this.f59109a);
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            b1.b(a10);
            this.f59146k = a10;
            this.f59150o = (int) (a10.x * 10000.0f);
            this.f59151p = (int) (a10.y * 10000.0f);
            a1Var.b((int) (this.f59150o * 1.2f), (int) (this.f59151p * 1.2f), (int) (n(10000) * 1.2f), this.f59144i);
            return;
        }
        a1Var.d = this.f59109a;
        h();
    }

    @Override
    public final void e() {
    }
}
