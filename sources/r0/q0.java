package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.ui.Components.ql0;
public final class q0 implements View.OnApplyWindowInsetsListener {
    public final qh.e f43749a;
    public l1 f43750b;

    public q0(ViewGroup viewGroup, qh.e eVar) {
        l1 l1Var;
        b1 x0Var;
        this.f43749a = eVar;
        WeakHashMap weakHashMap = j0.f43732a;
        l1 a2 = c0.a(viewGroup);
        if (a2 != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                x0Var = new a1(a2);
            } else if (i10 >= 30) {
                x0Var = new z0(a2);
            } else if (i10 >= 29) {
                x0Var = new y0(a2);
            } else {
                x0Var = new x0(a2);
            }
            l1Var = x0Var.b();
        } else {
            l1Var = null;
        }
        this.f43750b = l1Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j10;
        int[] iArr;
        boolean z10;
        boolean z11;
        if (!view.isLaidOut()) {
            this.f43750b = l1.h(view, windowInsets);
            if (view.getTag(2131296687) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        l1 h = l1.h(view, windowInsets);
        i1 i1Var = h.f43741a;
        if (this.f43750b == null) {
            WeakHashMap weakHashMap = j0.f43732a;
            this.f43750b = c0.a(view);
        }
        if (this.f43750b == null) {
            this.f43750b = h;
            if (view.getTag(2131296687) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            b2.h i10 = r0.i(view);
            if (i10 != null && Objects.equals((l1) i10.f2145a, h)) {
                if (view.getTag(2131296687) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                l1 l1Var = this.f43750b;
                int i11 = 1;
                while (i11 <= 512) {
                    i0.b f7 = i1Var.f(i11);
                    i0.b f10 = l1Var.f43741a.f(i11);
                    int i12 = f7.f10888a;
                    int i13 = f7.d;
                    int i14 = f7.f10890c;
                    int i15 = f7.f10889b;
                    int i16 = f10.f10888a;
                    int i17 = f10.d;
                    int i18 = f10.f10890c;
                    int i19 = f10.f10889b;
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
                    this.f43750b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    l1 l1Var2 = this.f43750b;
                    if ((i20 & 8) != 0) {
                        interpolator = r0.e;
                    } else if ((i21 & 8) != 0) {
                        interpolator = r0.f43752f;
                    } else if ((i20 & 519) != 0) {
                        interpolator = r0.f43753g;
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
                    w0Var.f43765a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w0Var.f43765a.a());
                    i0.b f11 = i1Var.f(i22);
                    i0.b f12 = l1Var2.f43741a.f(i22);
                    int min = Math.min(f11.f10888a, f12.f10888a);
                    int i23 = f11.f10889b;
                    int i24 = f12.f10889b;
                    int min2 = Math.min(i23, i24);
                    int i25 = f11.f10890c;
                    int i26 = f12.f10890c;
                    int min3 = Math.min(i25, i26);
                    int i27 = f11.d;
                    int i28 = f12.d;
                    m4.c cVar = new m4.c(20, i0.b.b(min, min2, min3, Math.min(i27, i28)), i0.b.b(Math.max(f11.f10888a, f12.f10888a), Math.max(i23, i24), Math.max(i25, i26), Math.max(i27, i28)));
                    r0.f(view, h, false);
                    duration.addUpdateListener(new p0(w0Var, h, l1Var2, i22, view));
                    duration.addListener(new ql0(w0Var, view, 19));
                    q.a(view, new com.google.android.gms.internal.cast.p(view, w0Var, cVar, duration, 4));
                    this.f43750b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            }
        }
        return windowInsets;
    }
}
