package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class p0 implements ValueAnimator.AnimatorUpdateListener {
    public final w0 f46930a;
    public final m1 f46931b;
    public final m1 f46932c;
    public final int d;
    public final View f46933e;

    public p0(w0 w0Var, m1 m1Var, m1 m1Var2, int i9, View view) {
        this.f46930a = w0Var;
        this.f46931b = m1Var;
        this.f46932c = m1Var2;
        this.d = i9;
        this.f46933e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c1 y0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        w0 w0Var = this.f46930a;
        v0 v0Var = w0Var.f46956a;
        v0Var.d(animatedFraction);
        m1 m1Var = this.f46931b;
        j1 j1Var = m1Var.f46929a;
        float b10 = v0Var.b();
        PathInterpolator pathInterpolator = r0.f46940e;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            y0Var = new b1(m1Var);
        } else if (i9 >= 30) {
            y0Var = new a1(m1Var);
        } else if (i9 >= 29) {
            y0Var = new z0(m1Var);
        } else {
            y0Var = new y0(m1Var);
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((this.d & i10) == 0) {
                y0Var.c(i10, j1Var.f(i10));
            } else {
                i0.b f10 = j1Var.f(i10);
                i0.b f11 = this.f46932c.f46929a.f(i10);
                float f12 = 1.0f - b10;
                y0Var.c(i10, m1.e(f10, (int) (((f10.f10848a - f11.f10848a) * f12) + 0.5d), (int) (((f10.f10849b - f11.f10849b) * f12) + 0.5d), (int) (((f10.f10850c - f11.f10850c) * f12) + 0.5d), (int) (((f10.d - f11.d) * f12) + 0.5d)));
            }
        }
        r0.g(this.f46933e, y0Var.b(), Collections.singletonList(w0Var));
    }
}
