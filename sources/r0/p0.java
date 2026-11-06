package r0;

import a8.pa;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.ui.Components.v50;
public final class p0 implements View.OnApplyWindowInsetsListener {
    public final rh.d f54094a;
    public k1 f54095b;

    public p0(FrameLayout frameLayout, rh.d dVar) {
        k1 k1Var;
        a1 w0Var;
        this.f54094a = dVar;
        WeakHashMap weakHashMap = i0.f54073a;
        k1 a10 = b0.a(frameLayout);
        if (a10 != null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                w0Var = new z0(a10);
            } else if (i7 >= 30) {
                w0Var = new y0(a10);
            } else if (i7 >= 29) {
                w0Var = new x0(a10);
            } else {
                w0Var = new w0(a10);
            }
            k1Var = w0Var.b();
        } else {
            k1Var = null;
        }
        this.f54095b = k1Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j3;
        int[] iArr;
        boolean z9;
        boolean z10;
        if (!view.isLaidOut()) {
            this.f54095b = k1.h(view, windowInsets);
            if (view.getTag(2131296687) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        k1 h = k1.h(view, windowInsets);
        h1 h1Var = h.f54084a;
        if (this.f54095b == null) {
            WeakHashMap weakHashMap = i0.f54073a;
            this.f54095b = b0.a(view);
        }
        if (this.f54095b == null) {
            this.f54095b = h;
            if (view.getTag(2131296687) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            bi.b1 i7 = q0.i(view);
            if (i7 != null && Objects.equals((k1) i7.f3500a, h)) {
                if (view.getTag(2131296687) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                k1 k1Var = this.f54095b;
                int i10 = 1;
                while (i10 <= 512) {
                    i0.b f10 = h1Var.f(i10);
                    i0.b f11 = k1Var.f54084a.f(i10);
                    int i11 = f10.f15117a;
                    int i12 = f10.d;
                    int i13 = f10.f15119c;
                    int i14 = f10.f15118b;
                    int i15 = f11.f15117a;
                    int i16 = f11.d;
                    int i17 = f11.f15119c;
                    int i18 = f11.f15118b;
                    if (i11 <= i15 && i14 <= i18 && i13 <= i17 && i12 <= i16) {
                        iArr = iArr2;
                        z9 = false;
                    } else {
                        iArr = iArr2;
                        z9 = true;
                    }
                    if (i11 >= i15 && i14 >= i18 && i13 >= i17 && i12 >= i16) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z9 != z10) {
                        if (z9) {
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
                    this.f54095b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    k1 k1Var2 = this.f54095b;
                    if ((i19 & 8) != 0) {
                        interpolator = q0.f54096e;
                    } else if ((i20 & 8) != 0) {
                        interpolator = q0.f54097f;
                    } else if ((i19 & 519) != 0) {
                        interpolator = q0.f54098g;
                    } else if ((i20 & 519) != 0) {
                        interpolator = q0.h;
                    } else {
                        interpolator = null;
                    }
                    if ((i21 & 8) != 0) {
                        j3 = 160;
                    } else {
                        j3 = 250;
                    }
                    v0 v0Var = new v0(i21, j3, interpolator);
                    v0Var.f54113a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v0Var.f54113a.a());
                    i0.b f12 = h1Var.f(i21);
                    i0.b f13 = k1Var2.f54084a.f(i21);
                    int min = Math.min(f12.f15117a, f13.f15117a);
                    int i22 = f12.f15118b;
                    int i23 = f13.f15118b;
                    int min2 = Math.min(i22, i23);
                    int i24 = f12.f15119c;
                    int i25 = f13.f15119c;
                    int min3 = Math.min(i24, i25);
                    int i26 = f12.d;
                    int i27 = f13.d;
                    j2.n nVar = new j2.n(i0.b.b(min, min2, min3, Math.min(i26, i27)), i0.b.b(Math.max(f12.f15117a, f13.f15117a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27)), false, 28);
                    q0.f(view, h, false);
                    duration.addUpdateListener(new o0(v0Var, h, k1Var2, i21, view));
                    duration.addListener(new v50(v0Var, view, 19));
                    o.a(view, new pa(view, v0Var, nVar, duration, 4));
                    this.f54095b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            }
        }
        return windowInsets;
    }
}
