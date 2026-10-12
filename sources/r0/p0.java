package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class p0 implements ValueAnimator.AnimatorUpdateListener {
    public final w0 f43743a;
    public final l1 f43744b;
    public final l1 f43745c;
    public final int d;
    public final View e;

    public p0(w0 w0Var, l1 l1Var, l1 l1Var2, int i10, View view) {
        this.f43743a = w0Var;
        this.f43744b = l1Var;
        this.f43745c = l1Var2;
        this.d = i10;
        this.e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        b1 x0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        w0 w0Var = this.f43743a;
        v0 v0Var = w0Var.f43765a;
        v0Var.d(animatedFraction);
        l1 l1Var = this.f43744b;
        i1 i1Var = l1Var.f43741a;
        float b10 = v0Var.b();
        PathInterpolator pathInterpolator = r0.e;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            x0Var = new a1(l1Var);
        } else if (i10 >= 30) {
            x0Var = new z0(l1Var);
        } else if (i10 >= 29) {
            x0Var = new y0(l1Var);
        } else {
            x0Var = new x0(l1Var);
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.d & i11) == 0) {
                x0Var.c(i11, i1Var.f(i11));
            } else {
                i0.b f7 = i1Var.f(i11);
                i0.b f10 = this.f43745c.f43741a.f(i11);
                float f11 = 1.0f - b10;
                x0Var.c(i11, l1.e(f7, (int) (((f7.f10888a - f10.f10888a) * f11) + 0.5d), (int) (((f7.f10889b - f10.f10889b) * f11) + 0.5d), (int) (((f7.f10890c - f10.f10890c) * f11) + 0.5d), (int) (((f7.d - f10.d) * f11) + 0.5d)));
            }
        }
        r0.g(this.e, x0Var.b(), Collections.singletonList(w0Var));
    }
}
