package v4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.r2;
public class c0 extends a1 {
    public static final boolean f58514q;
    public PointF f58517k;
    public final DisplayMetrics f58518l;
    public float f58520n;
    public final LinearInterpolator f58515i = new LinearInterpolator();
    public final DecelerateInterpolator f58516j = new DecelerateInterpolator();
    public boolean f58519m = false;
    public int f58521o = 0;
    public int f58522p = 0;

    static {
        boolean z10 = r2.f26206a;
        f58514q = true;
    }

    public c0(Context context) {
        this.f58518l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i7, int i10, z0 z0Var) {
        PointF pointF;
        if (this.f58481b.f2830y.r() == 0) {
            h();
        } else if (f58514q && (pointF = this.f58517k) != null && (pointF.x * i7 < 0.0f || pointF.y * i10 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i11 = this.f58521o;
            int i12 = i11 - i7;
            int i13 = 0;
            if (i11 * i12 <= 0) {
                i12 = 0;
            }
            this.f58521o = i12;
            int i14 = this.f58522p;
            int i15 = i14 - i10;
            if (i14 * i15 > 0) {
                i13 = i15;
            }
            this.f58522p = i13;
            if (i12 == 0 && i13 == 0) {
                q(z0Var);
            }
        }
    }

    @Override
    public final void f() {
        this.f58522p = 0;
        this.f58521o = 0;
        this.f58517k = null;
    }

    @Override
    public void g(View view, z0 z0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            z0Var.b(-j3, -k10, m10, this.f58516j);
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
        o0 o0Var = this.f58482c;
        if (o0Var != null && o0Var.d()) {
            p0 p0Var = (p0) view.getLayoutParams();
            return i(o0.x(view) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, o0.y(view) + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, o0Var.D(), o0Var.f58631m - o0Var.E(), i7);
        }
        return 0;
    }

    public int k(int i7, View view) {
        o0 o0Var = this.f58482c;
        if (o0Var != null && o0Var.e()) {
            p0 p0Var = (p0) view.getLayoutParams();
            return i(o0.z(view) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, o0.v(view) + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin, o0Var.F(), o0Var.f58632n - o0Var.C(), i7);
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
        if (!this.f58519m) {
            this.f58520n = l(this.f58518l);
            this.f58519m = true;
        }
        return (int) Math.ceil(abs * this.f58520n);
    }

    public final int o() {
        PointF pointF = this.f58517k;
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
        PointF pointF = this.f58517k;
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

    public void q(z0 z0Var) {
        PointF a10 = a(this.f58480a);
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            a1.b(a10);
            this.f58517k = a10;
            this.f58521o = (int) (a10.x * 10000.0f);
            this.f58522p = (int) (a10.y * 10000.0f);
            z0Var.b((int) (this.f58521o * 1.2f), (int) (this.f58522p * 1.2f), (int) (n(10000) * 1.2f), this.f58515i);
            return;
        }
        z0Var.d = this.f58480a;
        h();
    }

    @Override
    public final void e() {
    }
}
