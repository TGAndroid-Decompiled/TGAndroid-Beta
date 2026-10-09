package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final v0 f46779a;
    public final k1 f46780b;
    public final k1 f46781c;
    public final int d;
    public final View f46782e;

    public o0(v0 v0Var, k1 k1Var, k1 k1Var2, int i10, View view) {
        this.f46779a = v0Var;
        this.f46780b = k1Var;
        this.f46781c = k1Var2;
        this.d = i10;
        this.f46782e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a1 w0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        v0 v0Var = this.f46779a;
        u0 u0Var = v0Var.f46805a;
        u0Var.d(animatedFraction);
        k1 k1Var = this.f46780b;
        h1 h1Var = k1Var.f46777a;
        float b10 = u0Var.b();
        PathInterpolator pathInterpolator = q0.f46789e;
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
                i0.b f10 = this.f46781c.f46777a.f(i11);
                float f11 = 1.0f - b10;
                w0Var.c(i11, k1.e(f7, (int) (((f7.f11576a - f10.f11576a) * f11) + 0.5d), (int) (((f7.f11577b - f10.f11577b) * f11) + 0.5d), (int) (((f7.f11578c - f10.f11578c) * f11) + 0.5d), (int) (((f7.d - f10.d) * f11) + 0.5d)));
            }
        }
        q0.g(this.f46782e, w0Var.b(), Collections.singletonList(v0Var));
    }
}
