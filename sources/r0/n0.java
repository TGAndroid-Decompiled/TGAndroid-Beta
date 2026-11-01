package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class n0 implements ValueAnimator.AnimatorUpdateListener {
    public final u0 f46145a;
    public final j1 f46146b;
    public final j1 f46147c;
    public final int d;
    public final View e;

    public n0(u0 u0Var, j1 j1Var, j1 j1Var2, int i10, View view) {
        this.f46145a = u0Var;
        this.f46146b = j1Var;
        this.f46147c = j1Var2;
        this.d = i10;
        this.e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z0 v0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        u0 u0Var = this.f46145a;
        t0 t0Var = u0Var.f46167a;
        t0Var.d(animatedFraction);
        j1 j1Var = this.f46146b;
        g1 g1Var = j1Var.f46143a;
        float b10 = t0Var.b();
        PathInterpolator pathInterpolator = p0.e;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            v0Var = new y0(j1Var);
        } else if (i10 >= 30) {
            v0Var = new x0(j1Var);
        } else if (i10 >= 29) {
            v0Var = new w0(j1Var);
        } else {
            v0Var = new v0(j1Var);
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.d & i11) == 0) {
                v0Var.c(i11, g1Var.f(i11));
            } else {
                i0.c f7 = g1Var.f(i11);
                i0.c f10 = this.f46147c.f46143a.f(i11);
                float f11 = 1.0f - b10;
                v0Var.c(i11, j1.e(f7, (int) (((f7.f7766a - f10.f7766a) * f11) + 0.5d), (int) (((f7.f7767b - f10.f7767b) * f11) + 0.5d), (int) (((f7.f7768c - f10.f7768c) * f11) + 0.5d), (int) (((f7.d - f10.d) * f11) + 0.5d)));
            }
        }
        p0.g(this.e, v0Var.b(), Collections.singletonList(u0Var));
    }
}
