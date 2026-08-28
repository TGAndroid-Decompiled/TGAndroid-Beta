package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.su0;
public final class q0 implements View.OnApplyWindowInsetsListener {
    public final xg.e f46937a;
    public m1 f46938b;

    public q0(ViewGroup viewGroup, xg.e eVar) {
        m1 m1Var;
        c1 y0Var;
        this.f46937a = eVar;
        m1 f10 = j0.f(viewGroup);
        if (f10 != null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 34) {
                y0Var = new b1(f10);
            } else if (i9 >= 30) {
                y0Var = new a1(f10);
            } else if (i9 >= 29) {
                y0Var = new z0(f10);
            } else {
                y0Var = new y0(f10);
            }
            m1Var = y0Var.b();
        } else {
            m1Var = null;
        }
        this.f46938b = m1Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j10;
        int[] iArr;
        boolean z10;
        boolean z11;
        if (!view.isLaidOut()) {
            this.f46938b = m1.h(view, windowInsets);
            if (view.getTag(2131296687) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        m1 h = m1.h(view, windowInsets);
        j1 j1Var = h.f46929a;
        if (this.f46938b == null) {
            this.f46938b = j0.f(view);
        }
        if (this.f46938b == null) {
            this.f46938b = h;
            if (view.getTag(2131296687) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            a8.a i9 = r0.i(view);
            if (i9 != null && Objects.equals((m1) i9.f108a, h)) {
                if (view.getTag(2131296687) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                m1 m1Var = this.f46938b;
                int i10 = 1;
                while (i10 <= 512) {
                    i0.b f10 = j1Var.f(i10);
                    i0.b f11 = m1Var.f46929a.f(i10);
                    int i11 = f10.f10848a;
                    int i12 = f10.d;
                    int i13 = f10.f10850c;
                    int i14 = f10.f10849b;
                    int i15 = f11.f10848a;
                    int i16 = f11.d;
                    int i17 = f11.f10850c;
                    int i18 = f11.f10849b;
                    if (i11 <= i15 && i14 <= i18 && i13 <= i17 && i12 <= i16) {
                        iArr = iArr2;
                        z10 = false;
                    } else {
                        iArr = iArr2;
                        z10 = true;
                    }
                    if (i11 >= i15 && i14 >= i18 && i13 >= i17 && i12 >= i16) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 != z11) {
                        if (z10) {
                            iArr[0] = iArr[0] | i10;
                        } else {
                            iArr3[0] = iArr3[0] | i10;
                        }
                    }
                    i10 <<= 1;
                    iArr2 = iArr;
                }
                int i19 = iArr2[0];
                int i20 = iArr3[0];
                int i21 = i19 | i20;
                if (i21 == 0) {
                    this.f46938b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    m1 m1Var2 = this.f46938b;
                    if ((i19 & 8) != 0) {
                        interpolator = r0.f46940e;
                    } else if ((i20 & 8) != 0) {
                        interpolator = r0.f46941f;
                    } else if ((i19 & 519) != 0) {
                        interpolator = r0.f46942g;
                    } else if ((i20 & 519) != 0) {
                        interpolator = r0.h;
                    } else {
                        interpolator = null;
                    }
                    if ((i21 & 8) != 0) {
                        j10 = 160;
                    } else {
                        j10 = 250;
                    }
                    w0 w0Var = new w0(i21, j10, interpolator);
                    w0Var.f46956a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w0Var.f46956a.a());
                    i0.b f12 = j1Var.f(i21);
                    i0.b f13 = m1Var2.f46929a.f(i21);
                    int min = Math.min(f12.f10848a, f13.f10848a);
                    int i22 = f12.f10849b;
                    int i23 = f13.f10849b;
                    int min2 = Math.min(i22, i23);
                    int i24 = f12.f10850c;
                    int i25 = f13.f10850c;
                    int min3 = Math.min(i24, i25);
                    int i26 = f12.d;
                    int i27 = f13.d;
                    e3 e3Var = new e3(i0.b.b(min, min2, min3, Math.min(i26, i27)), i0.b.b(Math.max(f12.f10848a, f13.f10848a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27)), false, 20);
                    r0.f(view, h, false);
                    duration.addUpdateListener(new p0(w0Var, h, m1Var2, i21, view));
                    duration.addListener(new su0(w0Var, view, 19));
                    q.a(view, new af.f(view, w0Var, e3Var, duration, false, 8));
                    this.f46938b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            }
        }
        return windowInsets;
    }
}
