package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final v0 f54089a;
    public final k1 f54090b;
    public final k1 f54091c;
    public final int d;
    public final View f54092e;

    public o0(v0 v0Var, k1 k1Var, k1 k1Var2, int i7, View view) {
        this.f54089a = v0Var;
        this.f54090b = k1Var;
        this.f54091c = k1Var2;
        this.d = i7;
        this.f54092e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a1 w0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        v0 v0Var = this.f54089a;
        u0 u0Var = v0Var.f54113a;
        u0Var.d(animatedFraction);
        k1 k1Var = this.f54090b;
        h1 h1Var = k1Var.f54084a;
        float b10 = u0Var.b();
        PathInterpolator pathInterpolator = q0.f54096e;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            w0Var = new z0(k1Var);
        } else if (i7 >= 30) {
            w0Var = new y0(k1Var);
        } else if (i7 >= 29) {
            w0Var = new x0(k1Var);
        } else {
            w0Var = new w0(k1Var);
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((this.d & i10) == 0) {
                w0Var.c(i10, h1Var.f(i10));
            } else {
                i0.b f10 = h1Var.f(i10);
                i0.b f11 = this.f54091c.f54084a.f(i10);
                float f12 = 1.0f - b10;
                w0Var.c(i10, k1.e(f10, (int) (((f10.f15117a - f11.f15117a) * f12) + 0.5d), (int) (((f10.f15118b - f11.f15118b) * f12) + 0.5d), (int) (((f10.f15119c - f11.f15119c) * f12) + 0.5d), (int) (((f10.d - f11.d) * f12) + 0.5d)));
            }
        }
        q0.g(this.f54092e, w0Var.b(), Collections.singletonList(v0Var));
    }
}
