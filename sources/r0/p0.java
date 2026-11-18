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
import org.telegram.ui.Components.h60;
public final class p0 implements View.OnApplyWindowInsetsListener {
    public final rh.d f56267a;
    public l1 f56268b;

    public p0(FrameLayout frameLayout, rh.d dVar) {
        l1 l1Var;
        a1 w0Var;
        this.f56267a = dVar;
        WeakHashMap weakHashMap = i0.f56244a;
        l1 a10 = b0.a(frameLayout);
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
            l1Var = w0Var.b();
        } else {
            l1Var = null;
        }
        this.f56268b = l1Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j3;
        int[] iArr;
        boolean z10;
        boolean z11;
        if (!view.isLaidOut()) {
            this.f56268b = l1.h(view, windowInsets);
            if (view.getTag(2131296687) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        l1 h = l1.h(view, windowInsets);
        i1 i1Var = h.f56258a;
        if (this.f56268b == null) {
            WeakHashMap weakHashMap = i0.f56244a;
            this.f56268b = b0.a(view);
        }
        if (this.f56268b == null) {
            this.f56268b = h;
            if (view.getTag(2131296687) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            com.google.android.gms.common.api.q i7 = q0.i(view);
            if (i7 != null && Objects.equals((l1) i7.f6395a, h)) {
                if (view.getTag(2131296687) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                l1 l1Var = this.f56268b;
                int i10 = 1;
                while (i10 <= 512) {
                    i0.b f10 = i1Var.f(i10);
                    i0.b f11 = l1Var.f56258a.f(i10);
                    int i11 = f10.f15889a;
                    int i12 = f10.d;
                    int i13 = f10.f15891c;
                    int i14 = f10.f15890b;
                    int i15 = f11.f15889a;
                    int i16 = f11.d;
                    int i17 = f11.f15891c;
                    int i18 = f11.f15890b;
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
                    this.f56268b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    l1 l1Var2 = this.f56268b;
                    if ((i19 & 8) != 0) {
                        interpolator = q0.f56269e;
                    } else if ((i20 & 8) != 0) {
                        interpolator = q0.f56270f;
                    } else if ((i19 & 519) != 0) {
                        interpolator = q0.f56271g;
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
                    v0Var.f56286a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v0Var.f56286a.a());
                    i0.b f12 = i1Var.f(i21);
                    i0.b f13 = l1Var2.f56258a.f(i21);
                    int min = Math.min(f12.f15889a, f13.f15889a);
                    int i22 = f12.f15890b;
                    int i23 = f13.f15890b;
                    int min2 = Math.min(i22, i23);
                    int i24 = f12.f15891c;
                    int i25 = f13.f15891c;
                    int min3 = Math.min(i24, i25);
                    int i26 = f12.d;
                    int i27 = f13.d;
                    k8.a aVar = new k8.a(i0.b.b(min, min2, min3, Math.min(i26, i27)), i0.b.b(Math.max(f12.f15889a, f13.f15889a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27)), false, 28);
                    q0.f(view, h, false);
                    duration.addUpdateListener(new o0(v0Var, h, l1Var2, i21, view));
                    duration.addListener(new h60(v0Var, view, 19));
                    o.a(view, new qa(view, v0Var, aVar, duration, 4));
                    this.f56268b = h;
                    if (view.getTag(2131296687) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            }
        }
        return windowInsets;
    }
}
