package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final v0 f55687a;
    public final k1 f55688b;
    public final k1 f55689c;
    public final int d;
    public final View f55690e;

    public o0(v0 v0Var, k1 k1Var, k1 k1Var2, int i7, View view) {
        this.f55687a = v0Var;
        this.f55688b = k1Var;
        this.f55689c = k1Var2;
        this.d = i7;
        this.f55690e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a1 w0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        v0 v0Var = this.f55687a;
        u0 u0Var = v0Var.f55711a;
        u0Var.d(animatedFraction);
        k1 k1Var = this.f55688b;
        h1 h1Var = k1Var.f55682a;
        float b10 = u0Var.b();
        PathInterpolator pathInterpolator = q0.f55694e;
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
                i0.c f10 = h1Var.f(i10);
                i0.c f11 = this.f55689c.f55682a.f(i10);
                float f12 = 1.0f - b10;
                w0Var.c(i10, k1.e(f10, (int) (((f10.f15574a - f11.f15574a) * f12) + 0.5d), (int) (((f10.f15575b - f11.f15575b) * f12) + 0.5d), (int) (((f10.f15576c - f11.f15576c) * f12) + 0.5d), (int) (((f10.d - f11.d) * f12) + 0.5d)));
            }
        }
        q0.g(this.f55690e, w0Var.b(), Collections.singletonList(v0Var));
    }
}
