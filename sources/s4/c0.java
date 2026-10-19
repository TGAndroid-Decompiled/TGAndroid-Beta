package s4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.BuildVars;
public class c0 extends x0 {
    public static final boolean f45932q = BuildVars.DEBUG_VERSION;
    public PointF f45935k;
    public final DisplayMetrics f45936l;
    public float f45938n;
    public final LinearInterpolator f45933i = new LinearInterpolator();
    public final DecelerateInterpolator f45934j = new DecelerateInterpolator();
    public boolean f45937m = false;
    public int f45939o = 0;
    public int f45940p = 0;

    public c0(Context context) {
        this.f45936l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i10, int i11, w0 w0Var) {
        PointF pointF;
        if (this.f46054b.f3631x.r() == 0) {
            h();
        } else if (f45932q && (pointF = this.f45935k) != null && (pointF.x * i10 < 0.0f || pointF.y * i11 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i12 = this.f45939o;
            int i13 = i12 - i10;
            int i14 = 0;
            if (i12 * i13 <= 0) {
                i13 = 0;
            }
            this.f45939o = i13;
            int i15 = this.f45940p;
            int i16 = i15 - i11;
            if (i15 * i16 > 0) {
                i14 = i16;
            }
            this.f45940p = i14;
            if (i13 == 0 && i14 == 0) {
                q(w0Var);
            }
        }
    }

    @Override
    public final void f() {
        this.f45940p = 0;
        this.f45939o = 0;
        this.f45935k = null;
    }

    @Override
    public void g(View view, w0 w0Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            w0Var.b(-j10, -k10, m10, this.f45934j);
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
        n0 n0Var = this.f46055c;
        if (n0Var != null && n0Var.d()) {
            o0 o0Var = (o0) view.getLayoutParams();
            return i(n0.x(view) - ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, n0.y(view) + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, n0Var.D(), n0Var.f46013m - n0Var.E(), i10);
        }
        return 0;
    }

    public int k(int i10, View view) {
        n0 n0Var = this.f46055c;
        if (n0Var != null && n0Var.e()) {
            o0 o0Var = (o0) view.getLayoutParams();
            return i(n0.z(view) - ((ViewGroup.MarginLayoutParams) o0Var).topMargin, n0.v(view) + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin, n0Var.F(), n0Var.f46014n - n0Var.C(), i10);
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
        if (!this.f45937m) {
            this.f45938n = l(this.f45936l);
            this.f45937m = true;
        }
        return (int) Math.ceil(abs * this.f45938n);
    }

    public final int o() {
        PointF pointF = this.f45935k;
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
        PointF pointF = this.f45935k;
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

    public void q(w0 w0Var) {
        PointF a2 = a(this.f46053a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            x0.b(a2);
            this.f45935k = a2;
            this.f45939o = (int) (a2.x * 10000.0f);
            this.f45940p = (int) (a2.y * 10000.0f);
            w0Var.b((int) (this.f45939o * 1.2f), (int) (this.f45940p * 1.2f), (int) (n(10000) * 1.2f), this.f45933i);
            return;
        }
        w0Var.d = this.f46053a;
        h();
    }

    @Override
    public final void e() {
    }
}
