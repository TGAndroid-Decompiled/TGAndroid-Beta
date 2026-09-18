package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final w0 f42110a;
    public final m1 f42111b;
    public final m1 f42112c;
    public final int d;
    public final View e;

    public o0(w0 w0Var, m1 m1Var, m1 m1Var2, int i10, View view) {
        this.f42110a = w0Var;
        this.f42111b = m1Var;
        this.f42112c = m1Var2;
        this.d = i10;
        this.e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c1 y0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        w0 w0Var = this.f42110a;
        v0 v0Var = w0Var.f42133a;
        v0Var.d(animatedFraction);
        m1 m1Var = this.f42111b;
        j1 j1Var = m1Var.f42109a;
        float b10 = v0Var.b();
        PathInterpolator pathInterpolator = q0.e;
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
                i0.b f7 = j1Var.f(i11);
                i0.b f10 = this.f42112c.f42109a.f(i11);
                float f11 = 1.0f - b10;
                y0Var.c(i11, m1.e(f7, (int) (((f7.f10591a - f10.f10591a) * f11) + 0.5d), (int) (((f7.f10592b - f10.f10592b) * f11) + 0.5d), (int) (((f7.f10593c - f10.f10593c) * f11) + 0.5d), (int) (((f7.d - f10.d) * f11) + 0.5d)));
            }
        }
        q0.g(this.e, y0Var.b(), Collections.singletonList(w0Var));
    }
}
