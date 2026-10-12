package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final v0 f46994a;
    public final k1 f46995b;
    public final k1 f46996c;
    public final int d;
    public final View f46997e;

    public o0(v0 v0Var, k1 k1Var, k1 k1Var2, int i10, View view) {
        this.f46994a = v0Var;
        this.f46995b = k1Var;
        this.f46996c = k1Var2;
        this.d = i10;
        this.f46997e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a1 w0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        v0 v0Var = this.f46994a;
        u0 u0Var = v0Var.f47020a;
        u0Var.d(animatedFraction);
        k1 k1Var = this.f46995b;
        h1 h1Var = k1Var.f46992a;
        float b10 = u0Var.b();
        PathInterpolator pathInterpolator = q0.f47004e;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            w0Var = new z0(k1Var);
        } else if (i10 >= 30) {
            w0Var = new y0(k1Var);
        } else if (i10 >= 29) {
            w0Var = new x0(k1Var);
        } else {
            w0Var = new w0(k1Var);
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.d & i11) == 0) {
                w0Var.c(i11, h1Var.f(i11));
            } else {
                i0.b f7 = h1Var.f(i11);
                i0.b f10 = this.f46996c.f46992a.f(i11);
                float f11 = 1.0f - b10;
                w0Var.c(i11, k1.e(f7, (int) (((f7.f11574a - f10.f11574a) * f11) + 0.5d), (int) (((f7.f11575b - f10.f11575b) * f11) + 0.5d), (int) (((f7.f11576c - f10.f11576c) * f11) + 0.5d), (int) (((f7.d - f10.d) * f11) + 0.5d)));
            }
        }
        q0.g(this.f46997e, w0Var.b(), Collections.singletonList(v0Var));
    }
}
