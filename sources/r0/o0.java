package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.ui.Components.iw0;
public final class o0 implements View.OnApplyWindowInsetsListener {
    public final hh.e f46140a;
    public j1 f46141b;

    public o0(FrameLayout frameLayout, hh.e eVar) {
        j1 j1Var;
        z0 v0Var;
        this.f46140a = eVar;
        WeakHashMap weakHashMap = h0.f46123a;
        j1 a2 = a0.a(frameLayout);
        if (a2 != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                v0Var = new y0(a2);
            } else if (i10 >= 30) {
                v0Var = new x0(a2);
            } else if (i10 >= 29) {
                v0Var = new w0(a2);
            } else {
                v0Var = new v0(a2);
            }
            j1Var = v0Var.b();
        } else {
            j1Var = null;
        }
        this.f46141b = j1Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j10;
        int[] iArr;
        boolean z10;
        boolean z11;
        if (!view.isLaidOut()) {
            this.f46141b = j1.h(view, windowInsets);
            if (view.getTag(2131296687) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        j1 h = j1.h(view, windowInsets);
        g1 g1Var = h.f46132a;
        if (this.f46141b == null) {
            WeakHashMap weakHashMap = h0.f46123a;
            this.f46141b = a0.a(view);
        }
        if (this.f46141b == null) {
            this.f46141b = h;
            if (view.getTag(2131296687) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            b2.h i10 = p0.i(view);
            if (i10 != null && Objects.equals((j1) i10.f2047a, h)) {
                if (view.getTag(2131296687) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                j1 j1Var = this.f46141b;
                int i11 = 1;
                while (i11 <= 512) {
                    i0.c f7 = g1Var.f(i11);
                    i0.c f10 = j1Var.f46132a.f(i11);
                    int i12 = f7.f7765a;
                    int i13 = f7.d;
                    int i14 = f7.f7767c;
                    int i15 = f7.f7766b;
                    int i16 = f10.f7765a;
                    int i17 = f10.d;
                    int i18 = f10.f7767c;
                    int i19 = f10.f7766b;
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
                    this.f46141b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    j1 j1Var2 = this.f46141b;
                    if ((i20 & 8) != 0) {
                        interpolator = p0.e;
                    } else if ((i21 & 8) != 0) {
                        interpolator = p0.f46143f;
                    } else if ((i20 & 519) != 0) {
                        interpolator = p0.f46144g;
                    } else if ((i21 & 519) != 0) {
                        interpolator = p0.h;
                    } else {
                        interpolator = null;
                    }
                    if ((i22 & 8) != 0) {
                        j10 = 160;
                    } else {
                        j10 = 250;
                    }
                    u0 u0Var = new u0(i22, j10, interpolator);
                    u0Var.f46156a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(u0Var.f46156a.a());
                    i0.c f11 = g1Var.f(i22);
                    i0.c f12 = j1Var2.f46132a.f(i22);
                    int min = Math.min(f11.f7765a, f12.f7765a);
                    int i23 = f11.f7766b;
                    int i24 = f12.f7766b;
                    int min2 = Math.min(i23, i24);
                    int i25 = f11.f7767c;
                    int i26 = f12.f7767c;
                    int min3 = Math.min(i25, i26);
                    int i27 = f11.d;
                    int i28 = f12.d;
                    m5.e eVar = new m5.e(20, i0.c.b(min, min2, min3, Math.min(i27, i28)), i0.c.b(Math.max(f11.f7765a, f12.f7765a), Math.max(i23, i24), Math.max(i25, i26), Math.max(i27, i28)));
                    p0.f(view, h, false);
                    duration.addUpdateListener(new n0(u0Var, h, j1Var2, i22, view));
                    duration.addListener(new iw0(15, view, (Object) u0Var));
                    o.a(view, new com.google.android.gms.internal.cast.o(view, u0Var, eVar, duration, 5));
                    this.f46141b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            }
        }
        return windowInsets;
    }
}
