package v4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.r2;
public class c0 extends z0 {
    public static final boolean f57025q;
    public PointF f57028k;
    public final DisplayMetrics f57029l;
    public float f57031n;
    public final LinearInterpolator f57026i = new LinearInterpolator();
    public final DecelerateInterpolator f57027j = new DecelerateInterpolator();
    public boolean f57030m = false;
    public int f57032o = 0;
    public int f57033p = 0;

    static {
        boolean z9 = r2.f25212a;
        f57025q = true;
    }

    public c0(Context context) {
        this.f57029l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i7, int i10, y0 y0Var) {
        PointF pointF;
        if (this.f57213b.f2873y.r() == 0) {
            h();
        } else if (f57025q && (pointF = this.f57028k) != null && (pointF.x * i7 < 0.0f || pointF.y * i10 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i11 = this.f57032o;
            int i12 = i11 - i7;
            int i13 = 0;
            if (i11 * i12 <= 0) {
                i12 = 0;
            }
            this.f57032o = i12;
            int i14 = this.f57033p;
            int i15 = i14 - i10;
            if (i14 * i15 > 0) {
                i13 = i15;
            }
            this.f57033p = i13;
            if (i12 == 0 && i13 == 0) {
                q(y0Var);
            }
        }
    }

    @Override
    public final void f() {
        this.f57033p = 0;
        this.f57032o = 0;
        this.f57028k = null;
    }

    @Override
    public void g(View view, y0 y0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            y0Var.b(-j3, -k10, m10, this.f57027j);
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
        n0 n0Var = this.f57214c;
        if (n0Var != null && n0Var.d()) {
            o0 o0Var = (o0) view.getLayoutParams();
            return i(n0.x(view) - ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, n0.y(view) + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, n0Var.D(), n0Var.f57140m - n0Var.E(), i7);
        }
        return 0;
    }

    public int k(int i7, View view) {
        n0 n0Var = this.f57214c;
        if (n0Var != null && n0Var.e()) {
            o0 o0Var = (o0) view.getLayoutParams();
            return i(n0.z(view) - ((ViewGroup.MarginLayoutParams) o0Var).topMargin, n0.v(view) + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin, n0Var.F(), n0Var.f57141n - n0Var.C(), i7);
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
        if (!this.f57030m) {
            this.f57031n = l(this.f57029l);
            this.f57030m = true;
        }
        return (int) Math.ceil(abs * this.f57031n);
    }

    public final int o() {
        PointF pointF = this.f57028k;
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
        PointF pointF = this.f57028k;
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

    public void q(y0 y0Var) {
        PointF a10 = a(this.f57212a);
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            z0.b(a10);
            this.f57028k = a10;
            this.f57032o = (int) (a10.x * 10000.0f);
            this.f57033p = (int) (a10.y * 10000.0f);
            y0Var.b((int) (this.f57032o * 1.2f), (int) (this.f57033p * 1.2f), (int) (n(10000) * 1.2f), this.f57026i);
            return;
        }
        y0Var.d = this.f57212a;
        h();
    }

    @Override
    public final void e() {
    }
}
