package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class p0 implements ValueAnimator.AnimatorUpdateListener {
    public final w0 f46484a;
    public final m1 f46485b;
    public final m1 f46486c;
    public final int d;
    public final View f46487e;

    public p0(w0 w0Var, m1 m1Var, m1 m1Var2, int i10, View view) {
        this.f46484a = w0Var;
        this.f46485b = m1Var;
        this.f46486c = m1Var2;
        this.d = i10;
        this.f46487e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c1 y0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        w0 w0Var = this.f46484a;
        v0 v0Var = w0Var.f46510a;
        v0Var.d(animatedFraction);
        m1 m1Var = this.f46485b;
        j1 j1Var = m1Var.f46483a;
        float b10 = v0Var.b();
        PathInterpolator pathInterpolator = r0.f46494e;
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
                i0.b f11 = this.f46486c.f46483a.f(i11);
                float f12 = 1.0f - b10;
                y0Var.c(i11, m1.e(f10, (int) (((f10.f7757a - f11.f7757a) * f12) + 0.5d), (int) (((f10.f7758b - f11.f7758b) * f12) + 0.5d), (int) (((f10.f7759c - f11.f7759c) * f12) + 0.5d), (int) (((f10.d - f11.d) * f12) + 0.5d)));
            }
        }
        r0.g(this.f46487e, y0Var.b(), Collections.singletonList(w0Var));
    }
}
