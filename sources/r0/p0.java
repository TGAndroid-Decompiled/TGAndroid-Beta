package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;
import org.telegram.ui.Components.vv0;
public final class p0 implements View.OnApplyWindowInsetsListener {
    public final oh.e f41081a;
    public l1 f41082b;

    public p0(ViewGroup viewGroup, oh.e eVar) {
        l1 l1Var;
        b1 x0Var;
        this.f41081a = eVar;
        l1 f7 = i0.f(viewGroup);
        if (f7 != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                x0Var = new a1(f7);
            } else if (i10 >= 30) {
                x0Var = new z0(f7);
            } else if (i10 >= 29) {
                x0Var = new y0(f7);
            } else {
                x0Var = new x0(f7);
            }
            l1Var = x0Var.b();
        } else {
            l1Var = null;
        }
        this.f41082b = l1Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j3;
        int[] iArr;
        boolean z10;
        boolean z11;
        if (!view.isLaidOut()) {
            this.f41082b = l1.h(view, windowInsets);
            if (view.getTag(2131296687) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        l1 h = l1.h(view, windowInsets);
        i1 i1Var = h.f41074a;
        if (this.f41082b == null) {
            this.f41082b = i0.f(view);
        }
        if (this.f41082b == null) {
            this.f41082b = h;
            if (view.getTag(2131296687) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            b2.g i10 = q0.i(view);
            if (i10 != null && Objects.equals((l1) i10.f1693a, h)) {
                if (view.getTag(2131296687) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                l1 l1Var = this.f41082b;
                int i11 = 1;
                while (i11 <= 512) {
                    i0.c f7 = i1Var.f(i11);
                    i0.c f10 = l1Var.f41074a.f(i11);
                    int i12 = f7.f10074a;
                    int i13 = f7.d;
                    int i14 = f7.f10076c;
                    int i15 = f7.f10075b;
                    int i16 = f10.f10074a;
                    int i17 = f10.d;
                    int i18 = f10.f10076c;
                    int i19 = f10.f10075b;
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
                    this.f41082b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    l1 l1Var2 = this.f41082b;
                    if ((i20 & 8) != 0) {
                        interpolator = q0.e;
                    } else if ((i21 & 8) != 0) {
                        interpolator = q0.f41084f;
                    } else if ((i20 & 519) != 0) {
                        interpolator = q0.f41085g;
                    } else if ((i21 & 519) != 0) {
                        interpolator = q0.h;
                    } else {
                        interpolator = null;
                    }
                    if ((i22 & 8) != 0) {
                        j3 = 160;
                    } else {
                        j3 = 250;
                    }
                    v0 v0Var = new v0(i22, j3, interpolator);
                    v0Var.f41097a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v0Var.f41097a.a());
                    i0.c f11 = i1Var.f(i22);
                    i0.c f12 = l1Var2.f41074a.f(i22);
                    int min = Math.min(f11.f10074a, f12.f10074a);
                    int i23 = f11.f10075b;
                    int i24 = f12.f10075b;
                    int min2 = Math.min(i23, i24);
                    int i25 = f11.f10076c;
                    int i26 = f12.f10076c;
                    int min3 = Math.min(i25, i26);
                    int i27 = f11.d;
                    int i28 = f12.d;
                    og.u0 u0Var = new og.u0(12, i0.c.b(min, min2, min3, Math.min(i27, i28)), i0.c.b(Math.max(f11.f10074a, f12.f10074a), Math.max(i23, i24), Math.max(i25, i26), Math.max(i27, i28)));
                    q0.f(view, h, false);
                    duration.addUpdateListener(new o0(v0Var, h, l1Var2, i22, view));
                    duration.addListener(new vv0(19, view, (Object) v0Var));
                    p.a(view, new com.google.android.gms.internal.cast.p(view, v0Var, u0Var, duration, 4));
                    this.f41082b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            }
        }
        return windowInsets;
    }
}
