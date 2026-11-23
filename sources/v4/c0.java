package v4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.s2;
public class c0 extends a1 {
    public static final boolean f59089q;
    public PointF f59092k;
    public final DisplayMetrics f59093l;
    public float f59095n;
    public final LinearInterpolator f59090i = new LinearInterpolator();
    public final DecelerateInterpolator f59091j = new DecelerateInterpolator();
    public boolean f59094m = false;
    public int f59096o = 0;
    public int f59097p = 0;

    static {
        boolean z10 = s2.f26694a;
        f59089q = true;
    }

    public c0(Context context) {
        this.f59093l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i7, int i10, z0 z0Var) {
        PointF pointF;
        if (this.f59056b.f2792y.r() == 0) {
            h();
        } else if (f59089q && (pointF = this.f59092k) != null && (pointF.x * i7 < 0.0f || pointF.y * i10 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i11 = this.f59096o;
            int i12 = i11 - i7;
            int i13 = 0;
            if (i11 * i12 <= 0) {
                i12 = 0;
            }
            this.f59096o = i12;
            int i14 = this.f59097p;
            int i15 = i14 - i10;
            if (i14 * i15 > 0) {
                i13 = i15;
            }
            this.f59097p = i13;
            if (i12 == 0 && i13 == 0) {
                q(z0Var);
            }
        }
    }

    @Override
    public final void f() {
        this.f59097p = 0;
        this.f59096o = 0;
        this.f59092k = null;
    }

    @Override
    public void g(View view, z0 z0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            z0Var.b(-j3, -k10, m10, this.f59091j);
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
        o0 o0Var = this.f59057c;
        if (o0Var != null && o0Var.d()) {
            p0 p0Var = (p0) view.getLayoutParams();
            return i(o0.x(view) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, o0.y(view) + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, o0Var.D(), o0Var.f59206m - o0Var.E(), i7);
        }
        return 0;
    }

    public int k(int i7, View view) {
        o0 o0Var = this.f59057c;
        if (o0Var != null && o0Var.e()) {
            p0 p0Var = (p0) view.getLayoutParams();
            return i(o0.z(view) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, o0.v(view) + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin, o0Var.F(), o0Var.f59207n - o0Var.C(), i7);
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
        if (!this.f59094m) {
            this.f59095n = l(this.f59093l);
            this.f59094m = true;
        }
        return (int) Math.ceil(abs * this.f59095n);
    }

    public final int o() {
        PointF pointF = this.f59092k;
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
        PointF pointF = this.f59092k;
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
        PointF a10 = a(this.f59055a);
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            a1.b(a10);
            this.f59092k = a10;
            this.f59096o = (int) (a10.x * 10000.0f);
            this.f59097p = (int) (a10.y * 10000.0f);
            z0Var.b((int) (this.f59096o * 1.2f), (int) (this.f59097p * 1.2f), (int) (n(10000) * 1.2f), this.f59090i);
            return;
        }
        z0Var.d = this.f59055a;
        h();
    }

    @Override
    public final void e() {
    }
}
