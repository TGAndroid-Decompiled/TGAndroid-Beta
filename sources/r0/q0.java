package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;
import org.telegram.ui.Components.ok0;
public final class q0 implements View.OnApplyWindowInsetsListener {
    public final ah.e f46851a;
    public m1 f46852b;

    public q0(ViewGroup viewGroup, ah.e eVar) {
        m1 m1Var;
        c1 y0Var;
        this.f46851a = eVar;
        m1 f9 = j0.f(viewGroup);
        if (f9 != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                y0Var = new b1(f9);
            } else if (i10 >= 30) {
                y0Var = new a1(f9);
            } else if (i10 >= 29) {
                y0Var = new z0(f9);
            } else {
                y0Var = new y0(f9);
            }
            m1Var = y0Var.b();
        } else {
            m1Var = null;
        }
        this.f46852b = m1Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j10;
        int[] iArr;
        boolean z10;
        boolean z11;
        if (!view.isLaidOut()) {
            this.f46852b = m1.h(view, windowInsets);
            if (view.getTag(2131296687) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        m1 h = m1.h(view, windowInsets);
        j1 j1Var = h.f46843a;
        if (this.f46852b == null) {
            this.f46852b = j0.f(view);
        }
        if (this.f46852b == null) {
            this.f46852b = h;
            if (view.getTag(2131296687) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            ab.e i10 = r0.i(view);
            if (i10 != null && Objects.equals((m1) i10.f306a, h)) {
                if (view.getTag(2131296687) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                m1 m1Var = this.f46852b;
                int i11 = 1;
                while (i11 <= 512) {
                    i0.b f9 = j1Var.f(i11);
                    i0.b f10 = m1Var.f46843a.f(i11);
                    int i12 = f9.f8186a;
                    int i13 = f9.d;
                    int i14 = f9.f8188c;
                    int i15 = f9.f8187b;
                    int i16 = f10.f8186a;
                    int i17 = f10.d;
                    int i18 = f10.f8188c;
                    int i19 = f10.f8187b;
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
                    this.f46852b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    m1 m1Var2 = this.f46852b;
                    if ((i20 & 8) != 0) {
                        interpolator = r0.f46854e;
                    } else if ((i21 & 8) != 0) {
                        interpolator = r0.f46855f;
                    } else if ((i20 & 519) != 0) {
                        interpolator = r0.f46856g;
                    } else if ((i21 & 519) != 0) {
                        interpolator = r0.h;
                    } else {
                        interpolator = null;
                    }
                    if ((i22 & 8) != 0) {
                        j10 = 160;
                    } else {
                        j10 = 250;
                    }
                    w0 w0Var = new w0(i22, j10, interpolator);
                    w0Var.f46870a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w0Var.f46870a.a());
                    i0.b f11 = j1Var.f(i22);
                    i0.b f12 = m1Var2.f46843a.f(i22);
                    int min = Math.min(f11.f8186a, f12.f8186a);
                    int i23 = f11.f8187b;
                    int i24 = f12.f8187b;
                    int min2 = Math.min(i23, i24);
                    int i25 = f11.f8188c;
                    int i26 = f12.f8188c;
                    int min3 = Math.min(i25, i26);
                    int i27 = f11.d;
                    int i28 = f12.d;
                    oc.i iVar = new oc.i(21, i0.b.b(min, min2, min3, Math.min(i27, i28)), i0.b.b(Math.max(f11.f8186a, f12.f8186a), Math.max(i23, i24), Math.max(i25, i26), Math.max(i27, i28)));
                    r0.f(view, h, false);
                    duration.addUpdateListener(new p0(w0Var, h, m1Var2, i22, view));
                    duration.addListener(new ok0(w0Var, view, 19));
                    q.a(view, new c2.p(view, w0Var, iVar, duration, false, 8));
                    this.f46852b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            }
        }
        return windowInsets;
    }
}
