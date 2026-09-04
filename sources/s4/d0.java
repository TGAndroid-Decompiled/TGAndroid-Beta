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
    public static final boolean f45759q = BuildVars.DEBUG_VERSION;
    public PointF f45762k;
    public final DisplayMetrics f45763l;
    public float f45765n;
    public final LinearInterpolator f45760i = new LinearInterpolator();
    public final DecelerateInterpolator f45761j = new DecelerateInterpolator();
    public boolean f45764m = false;
    public int f45766o = 0;
    public int f45767p = 0;

    public d0(Context context) {
        this.f45763l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i10, int i11, x0 x0Var) {
        PointF pointF;
        if (this.f45907b.f1896x.r() == 0) {
            h();
        } else if (f45759q && (pointF = this.f45762k) != null && (pointF.x * i10 < 0.0f || pointF.y * i11 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i12 = this.f45766o;
            int i13 = i12 - i10;
            int i14 = 0;
            if (i12 * i13 <= 0) {
                i13 = 0;
            }
            this.f45766o = i13;
            int i15 = this.f45767p;
            int i16 = i15 - i11;
            if (i15 * i16 > 0) {
                i14 = i16;
            }
            this.f45767p = i14;
            if (i13 == 0 && i14 == 0) {
                q(x0Var);
            }
        }
    }

    @Override
    public final void f() {
        this.f45767p = 0;
        this.f45766o = 0;
        this.f45762k = null;
    }

    @Override
    public void g(View view, x0 x0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            x0Var.b(-j3, -k10, m10, this.f45761j);
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
        o0 o0Var = this.f45908c;
        if (o0Var != null && o0Var.d()) {
            p0 p0Var = (p0) view.getLayoutParams();
            return i(o0.x(view) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, o0.y(view) + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, o0Var.D(), o0Var.f45851m - o0Var.E(), i10);
        }
        return 0;
    }

    public int k(int i10, View view) {
        o0 o0Var = this.f45908c;
        if (o0Var != null && o0Var.e()) {
            p0 p0Var = (p0) view.getLayoutParams();
            return i(o0.z(view) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, o0.v(view) + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin, o0Var.F(), o0Var.f45852n - o0Var.C(), i10);
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
        if (!this.f45764m) {
            this.f45765n = l(this.f45763l);
            this.f45764m = true;
        }
        return (int) Math.ceil(abs * this.f45765n);
    }

    public final int o() {
        PointF pointF = this.f45762k;
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
        PointF pointF = this.f45762k;
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
        PointF a2 = a(this.f45906a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            y0.b(a2);
            this.f45762k = a2;
            this.f45766o = (int) (a2.x * 10000.0f);
            this.f45767p = (int) (a2.y * 10000.0f);
            x0Var.b((int) (this.f45766o * 1.2f), (int) (this.f45767p * 1.2f), (int) (n(10000) * 1.2f), this.f45760i);
            return;
        }
        x0Var.d = this.f45906a;
        h();
    }

    @Override
    public final void e() {
    }
}
