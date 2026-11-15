package r0;

import a8.qa;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.ui.Components.y50;
public final class p0 implements View.OnApplyWindowInsetsListener {
    public final rh.d f55692a;
    public k1 f55693b;

    public p0(FrameLayout frameLayout, rh.d dVar) {
        k1 k1Var;
        a1 w0Var;
        this.f55692a = dVar;
        WeakHashMap weakHashMap = i0.f55671a;
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
        this.f55693b = k1Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j3;
        int[] iArr;
        boolean z10;
        boolean z11;
        if (!view.isLaidOut()) {
            this.f55693b = k1.h(view, windowInsets);
            if (view.getTag(2131296687) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        k1 h = k1.h(view, windowInsets);
        h1 h1Var = h.f55682a;
        if (this.f55693b == null) {
            WeakHashMap weakHashMap = i0.f55671a;
            this.f55693b = b0.a(view);
        }
        if (this.f55693b == null) {
            this.f55693b = h;
            if (view.getTag(2131296687) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            com.google.android.gms.common.api.q i7 = q0.i(view);
            if (i7 != null && Objects.equals((k1) i7.f6115a, h)) {
                if (view.getTag(2131296687) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                k1 k1Var = this.f55693b;
                int i10 = 1;
                while (i10 <= 512) {
                    i0.c f10 = h1Var.f(i10);
                    i0.c f11 = k1Var.f55682a.f(i10);
                    int i11 = f10.f15574a;
                    int i12 = f10.d;
                    int i13 = f10.f15576c;
                    int i14 = f10.f15575b;
                    int i15 = f11.f15574a;
                    int i16 = f11.d;
                    int i17 = f11.f15576c;
                    int i18 = f11.f15575b;
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
                    this.f55693b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    k1 k1Var2 = this.f55693b;
                    if ((i19 & 8) != 0) {
                        interpolator = q0.f55694e;
                    } else if ((i20 & 8) != 0) {
                        interpolator = q0.f55695f;
                    } else if ((i19 & 519) != 0) {
                        interpolator = q0.f55696g;
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
                    v0Var.f55711a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v0Var.f55711a.a());
                    i0.c f12 = h1Var.f(i21);
                    i0.c f13 = k1Var2.f55682a.f(i21);
                    int min = Math.min(f12.f15574a, f13.f15574a);
                    int i22 = f12.f15575b;
                    int i23 = f13.f15575b;
                    int min2 = Math.min(i22, i23);
                    int i24 = f12.f15576c;
                    int i25 = f13.f15576c;
                    int min3 = Math.min(i24, i25);
                    int i26 = f12.d;
                    int i27 = f13.d;
                    k8.a aVar = new k8.a(i0.c.b(min, min2, min3, Math.min(i26, i27)), i0.c.b(Math.max(f12.f15574a, f13.f15574a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27)), false, 28);
                    q0.f(view, h, false);
                    duration.addUpdateListener(new o0(v0Var, h, k1Var2, i21, view));
                    duration.addListener(new y50(v0Var, view, 19));
                    o.a(view, new qa(view, v0Var, aVar, duration, 4));
                    this.f55693b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            }
        }
        return windowInsets;
    }
}
