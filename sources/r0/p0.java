package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class p0 implements ValueAnimator.AnimatorUpdateListener {
    public final w0 f43131a;
    public final m1 f43132b;
    public final m1 f43133c;
    public final int d;
    public final View e;

    public p0(w0 w0Var, m1 m1Var, m1 m1Var2, int i10, View view) {
        this.f43131a = w0Var;
        this.f43132b = m1Var;
        this.f43133c = m1Var2;
        this.d = i10;
        this.e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c1 y0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        w0 w0Var = this.f43131a;
        v0 v0Var = w0Var.f43153a;
        v0Var.d(animatedFraction);
        m1 m1Var = this.f43132b;
        j1 j1Var = m1Var.f43130a;
        float b10 = v0Var.b();
        PathInterpolator pathInterpolator = r0.e;
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
                i0.b f11 = this.f43133c.f43130a.f(i11);
                float f12 = 1.0f - b10;
                y0Var.c(i11, m1.e(f10, (int) (((f10.f7213a - f11.f7213a) * f12) + 0.5d), (int) (((f10.f7214b - f11.f7214b) * f12) + 0.5d), (int) (((f10.f7215c - f11.f7215c) * f12) + 0.5d), (int) (((f10.d - f11.d) * f12) + 0.5d)));
            }
        }
        r0.g(this.e, y0Var.b(), Collections.singletonList(w0Var));
    }
}
