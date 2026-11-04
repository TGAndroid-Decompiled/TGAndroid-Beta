package u4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.r2;
public class c0 extends z0 {
    public static final boolean f55523q;
    public PointF f55526k;
    public final DisplayMetrics f55527l;
    public float f55529n;
    public final LinearInterpolator f55524i = new LinearInterpolator();
    public final DecelerateInterpolator f55525j = new DecelerateInterpolator();
    public boolean f55528m = false;
    public int f55530o = 0;
    public int f55531p = 0;

    static {
        boolean z10 = r2.f25040a;
        f55523q = true;
    }

    public c0(Context context) {
        this.f55527l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i3, int i10, y0 y0Var) {
        PointF pointF;
        if (this.f55705b.f2305y.r() == 0) {
            h();
        } else if (f55523q && (pointF = this.f55526k) != null && (pointF.x * i3 < 0.0f || pointF.y * i10 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i11 = this.f55530o;
            int i12 = i11 - i3;
            int i13 = 0;
            if (i11 * i12 <= 0) {
                i12 = 0;
            }
            this.f55530o = i12;
            int i14 = this.f55531p;
            int i15 = i14 - i10;
            if (i14 * i15 > 0) {
                i13 = i15;
            }
            this.f55531p = i13;
            if (i12 == 0 && i13 == 0) {
                q(y0Var);
            }
        }
    }

    @Override
    public final void f() {
        this.f55531p = 0;
        this.f55530o = 0;
        this.f55526k = null;
    }

    @Override
    public void g(View view, y0 y0Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            y0Var.b(-j10, -k10, m10, this.f55525j);
        }
    }

    public int i(int i3, int i10, int i11, int i12, int i13) {
        if (i13 != -1) {
            if (i13 != 0) {
                if (i13 == 1) {
                    return i12 - i10;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i14 = i11 - i3;
            if (i14 > 0) {
                return i14;
            }
            int i15 = i12 - i10;
            if (i15 < 0) {
                return i15;
            }
            return 0;
        }
        return i11 - i3;
    }

    public final int j(int i3, View view) {
        o0 o0Var = this.f55706c;
        if (o0Var != null && o0Var.d()) {
            p0 p0Var = (p0) view.getLayoutParams();
            return i(o0.x(view) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, o0.y(view) + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, o0Var.D(), o0Var.f55639m - o0Var.E(), i3);
        }
        return 0;
    }

    public int k(int i3, View view) {
        o0 o0Var = this.f55706c;
        if (o0Var != null && o0Var.e()) {
            p0 p0Var = (p0) view.getLayoutParams();
            return i(o0.z(view) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, o0.v(view) + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin, o0Var.F(), o0Var.f55640n - o0Var.C(), i3);
        }
        return 0;
    }

    public float l(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int m(int i3) {
        return (int) Math.ceil(n(i3) / 0.3356d);
    }

    public int n(int i3) {
        float abs = Math.abs(i3);
        if (!this.f55528m) {
            this.f55529n = l(this.f55527l);
            this.f55528m = true;
        }
        return (int) Math.ceil(abs * this.f55529n);
    }

    public final int o() {
        PointF pointF = this.f55526k;
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
        PointF pointF = this.f55526k;
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
        PointF a10 = a(this.f55704a);
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            z0.b(a10);
            this.f55526k = a10;
            this.f55530o = (int) (a10.x * 10000.0f);
            this.f55531p = (int) (a10.y * 10000.0f);
            y0Var.b((int) (this.f55530o * 1.2f), (int) (this.f55531p * 1.2f), (int) (n(10000) * 1.2f), this.f55524i);
            return;
        }
        y0Var.d = this.f55704a;
        h();
    }

    @Override
    public final void e() {
    }
}
