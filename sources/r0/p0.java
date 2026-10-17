package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.ui.Components.ml0;
public final class p0 implements View.OnApplyWindowInsetsListener {
    public final qh.e f44861a;
    public k1 f44862b;

    public p0(ViewGroup viewGroup, qh.e eVar) {
        k1 k1Var;
        a1 w0Var;
        this.f44861a = eVar;
        WeakHashMap weakHashMap = i0.f44844a;
        k1 a2 = b0.a(viewGroup);
        if (a2 != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                w0Var = new z0(a2);
            } else if (i10 >= 30) {
                w0Var = new y0(a2);
            } else if (i10 >= 29) {
                w0Var = new x0(a2);
            } else {
                w0Var = new w0(a2);
            }
            k1Var = w0Var.b();
        } else {
            k1Var = null;
        }
        this.f44862b = k1Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j10;
        int[] iArr;
        boolean z10;
        boolean z11;
        if (!view.isLaidOut()) {
            this.f44862b = k1.h(view, windowInsets);
            if (view.getTag(2131296687) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        k1 h = k1.h(view, windowInsets);
        h1 h1Var = h.f44853a;
        if (this.f44862b == null) {
            WeakHashMap weakHashMap = i0.f44844a;
            this.f44862b = b0.a(view);
        }
        if (this.f44862b == null) {
            this.f44862b = h;
            if (view.getTag(2131296687) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            ai.c1 i10 = q0.i(view);
            if (i10 != null && Objects.equals((k1) i10.f1072a, h)) {
                if (view.getTag(2131296687) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                k1 k1Var = this.f44862b;
                int i11 = 1;
                while (i11 <= 512) {
                    i0.c f7 = h1Var.f(i11);
                    i0.c f10 = k1Var.f44853a.f(i11);
                    int i12 = f7.f12284a;
                    int i13 = f7.d;
                    int i14 = f7.f12286c;
                    int i15 = f7.f12285b;
                    int i16 = f10.f12284a;
                    int i17 = f10.d;
                    int i18 = f10.f12286c;
                    int i19 = f10.f12285b;
                    if (i12 <= i16 && i15 <= i19 && i14 <= i18 && i13 <= i17) {
                        iArr = iArr2;
                        z10 = false;
                    } else {
                        iArr = iArr2;
                        z10 = true;
                    }
                    if (i12 >= i16 && i15 >= i19 && i14 >= i18 && i13 >= i17) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 != z11) {
                        if (z10) {
                            iArr[0] = iArr[0] | i11;
                        } else {
                            iArr3[0] = iArr3[0] | i11;
                        }
                    }
                    i11 <<= 1;
                    iArr2 = iArr;
                }
                int i20 = iArr2[0];
                int i21 = iArr3[0];
                int i22 = i20 | i21;
                if (i22 == 0) {
                    this.f44862b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    k1 k1Var2 = this.f44862b;
                    if ((i20 & 8) != 0) {
                        interpolator = q0.e;
                    } else if ((i21 & 8) != 0) {
                        interpolator = q0.f44864f;
                    } else if ((i20 & 519) != 0) {
                        interpolator = q0.f44865g;
                    } else if ((i21 & 519) != 0) {
                        interpolator = q0.h;
                    } else {
                        interpolator = null;
                    }
                    if ((i22 & 8) != 0) {
                        j10 = 160;
                    } else {
                        j10 = 250;
                    }
                    v0 v0Var = new v0(i22, j10, interpolator);
                    v0Var.f44877a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v0Var.f44877a.a());
                    i0.c f11 = h1Var.f(i22);
                    i0.c f12 = k1Var2.f44853a.f(i22);
                    int min = Math.min(f11.f12284a, f12.f12284a);
                    int i23 = f11.f12285b;
                    int i24 = f12.f12285b;
                    int min2 = Math.min(i23, i24);
                    int i25 = f11.f12286c;
                    int i26 = f12.f12286c;
                    int min3 = Math.min(i25, i26);
                    int i27 = f11.d;
                    int i28 = f12.d;
                    mi.q qVar = new mi.q(18, i0.c.b(min, min2, min3, Math.min(i27, i28)), i0.c.b(Math.max(f11.f12284a, f12.f12284a), Math.max(i23, i24), Math.max(i25, i26), Math.max(i27, i28)));
                    q0.f(view, h, false);
                    duration.addUpdateListener(new o0(v0Var, h, k1Var2, i22, view));
                    duration.addListener(new ml0(v0Var, view, 19));
                    p.a(view, new com.google.android.gms.internal.cast.p(view, v0Var, qVar, duration, 4));
                    this.f44862b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            }
        }
        return windowInsets;
    }
}
