package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;
import org.telegram.ui.Components.fx0;
public final class q0 implements View.OnApplyWindowInsetsListener {
    public final dh.e f46460a;
    public m1 f46461b;

    public q0(ViewGroup viewGroup, dh.e eVar) {
        m1 m1Var;
        c1 y0Var;
        this.f46460a = eVar;
        m1 f10 = j0.f(viewGroup);
        if (f10 != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                y0Var = new b1(f10);
            } else if (i10 >= 30) {
                y0Var = new a1(f10);
            } else if (i10 >= 29) {
                y0Var = new z0(f10);
            } else {
                y0Var = new y0(f10);
            }
            m1Var = y0Var.b();
        } else {
            m1Var = null;
        }
        this.f46461b = m1Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j10;
        int[] iArr;
        boolean z4;
        boolean z10;
        if (!view.isLaidOut()) {
            this.f46461b = m1.h(view, windowInsets);
            if (view.getTag(2131296687) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        m1 h = m1.h(view, windowInsets);
        j1 j1Var = h.f46452a;
        if (this.f46461b == null) {
            this.f46461b = j0.f(view);
        }
        if (this.f46461b == null) {
            this.f46461b = h;
            if (view.getTag(2131296687) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            cb.e i10 = r0.i(view);
            if (i10 != null && Objects.equals((m1) i10.f2406a, h)) {
                if (view.getTag(2131296687) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                m1 m1Var = this.f46461b;
                int i11 = 1;
                while (i11 <= 512) {
                    i0.b f10 = j1Var.f(i11);
                    i0.b f11 = m1Var.f46452a.f(i11);
                    int i12 = f10.f7757a;
                    int i13 = f10.d;
                    int i14 = f10.f7759c;
                    int i15 = f10.f7758b;
                    int i16 = f11.f7757a;
                    int i17 = f11.d;
                    int i18 = f11.f7759c;
                    int i19 = f11.f7758b;
                    if (i12 <= i16 && i15 <= i19 && i14 <= i18 && i13 <= i17) {
                        iArr = iArr2;
                        z4 = false;
                    } else {
                        iArr = iArr2;
                        z4 = true;
                    }
                    if (i12 >= i16 && i15 >= i19 && i14 >= i18 && i13 >= i17) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z4 != z10) {
                        if (z4) {
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
                    this.f46461b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    m1 m1Var2 = this.f46461b;
                    if ((i20 & 8) != 0) {
                        interpolator = r0.f46463e;
                    } else if ((i21 & 8) != 0) {
                        interpolator = r0.f46464f;
                    } else if ((i20 & 519) != 0) {
                        interpolator = r0.f46465g;
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
                    w0Var.f46479a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w0Var.f46479a.a());
                    i0.b f12 = j1Var.f(i22);
                    i0.b f13 = m1Var2.f46452a.f(i22);
                    int min = Math.min(f12.f7757a, f13.f7757a);
                    int i23 = f12.f7758b;
                    int i24 = f13.f7758b;
                    int min2 = Math.min(i23, i24);
                    int i25 = f12.f7759c;
                    int i26 = f13.f7759c;
                    int min3 = Math.min(i25, i26);
                    int i27 = f12.d;
                    int i28 = f13.d;
                    q5.g0 g0Var = new q5.g0(3, i0.b.b(min, min2, min3, Math.min(i27, i28)), i0.b.b(Math.max(f12.f7757a, f13.f7757a), Math.max(i23, i24), Math.max(i25, i26), Math.max(i27, i28)));
                    r0.f(view, h, false);
                    duration.addUpdateListener(new p0(w0Var, h, m1Var2, i22, view));
                    duration.addListener(new fx0(w0Var, view, 19));
                    q.a(view, new c2.p(view, w0Var, g0Var, duration, false, 8));
                    this.f46461b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            }
        }
        return windowInsets;
    }
}
