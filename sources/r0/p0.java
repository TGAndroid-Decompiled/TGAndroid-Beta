package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class p0 implements ValueAnimator.AnimatorUpdateListener {
    public final w0 f46453a;
    public final m1 f46454b;
    public final m1 f46455c;
    public final int d;
    public final View f46456e;

    public p0(w0 w0Var, m1 m1Var, m1 m1Var2, int i10, View view) {
        this.f46453a = w0Var;
        this.f46454b = m1Var;
        this.f46455c = m1Var2;
        this.d = i10;
        this.f46456e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c1 y0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        w0 w0Var = this.f46453a;
        v0 v0Var = w0Var.f46479a;
        v0Var.d(animatedFraction);
        m1 m1Var = this.f46454b;
        j1 j1Var = m1Var.f46452a;
        float b10 = v0Var.b();
        PathInterpolator pathInterpolator = r0.f46463e;
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
                i0.b f10 = j1Var.f(i11);
                i0.b f11 = this.f46455c.f46452a.f(i11);
                float f12 = 1.0f - b10;
                y0Var.c(i11, m1.e(f10, (int) (((f10.f7757a - f11.f7757a) * f12) + 0.5d), (int) (((f10.f7758b - f11.f7758b) * f12) + 0.5d), (int) (((f10.f7759c - f11.f7759c) * f12) + 0.5d), (int) (((f10.d - f11.d) * f12) + 0.5d)));
            }
        }
        r0.g(this.f46456e, y0Var.b(), Collections.singletonList(w0Var));
    }
}
