package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class p0 implements ValueAnimator.AnimatorUpdateListener {
    public final w0 f46844a;
    public final m1 f46845b;
    public final m1 f46846c;
    public final int d;
    public final View f46847e;

    public p0(w0 w0Var, m1 m1Var, m1 m1Var2, int i10, View view) {
        this.f46844a = w0Var;
        this.f46845b = m1Var;
        this.f46846c = m1Var2;
        this.d = i10;
        this.f46847e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c1 y0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        w0 w0Var = this.f46844a;
        v0 v0Var = w0Var.f46870a;
        v0Var.d(animatedFraction);
        m1 m1Var = this.f46845b;
        j1 j1Var = m1Var.f46843a;
        float b10 = v0Var.b();
        PathInterpolator pathInterpolator = r0.f46854e;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            y0Var = new b1(m1Var);
        } else if (i10 >= 30) {
            y0Var = new a1(m1Var);
        } else if (i10 >= 29) {
            y0Var = new z0(m1Var);
        } else {
            y0Var = new y0(m1Var);
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.d & i11) == 0) {
                y0Var.c(i11, j1Var.f(i11));
            } else {
                i0.b f9 = j1Var.f(i11);
                i0.b f10 = this.f46846c.f46843a.f(i11);
                float f11 = 1.0f - b10;
                y0Var.c(i11, m1.e(f9, (int) (((f9.f8186a - f10.f8186a) * f11) + 0.5d), (int) (((f9.f8187b - f10.f8187b) * f11) + 0.5d), (int) (((f9.f8188c - f10.f8188c) * f11) + 0.5d), (int) (((f9.d - f10.d) * f11) + 0.5d)));
            }
        }
        r0.g(this.f46847e, y0Var.b(), Collections.singletonList(w0Var));
    }
}
