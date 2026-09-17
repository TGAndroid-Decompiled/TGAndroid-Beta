package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final v0 f44741a;
    public final l1 f44742b;
    public final l1 f44743c;
    public final int d;
    public final View f44744e;

    public o0(v0 v0Var, l1 l1Var, l1 l1Var2, int i10, View view) {
        this.f44741a = v0Var;
        this.f44742b = l1Var;
        this.f44743c = l1Var2;
        this.d = i10;
        this.f44744e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        b1 x0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        v0 v0Var = this.f44741a;
        u0 u0Var = v0Var.f44767a;
        u0Var.d(animatedFraction);
        l1 l1Var = this.f44742b;
        i1 i1Var = l1Var.f44740a;
        float b10 = u0Var.b();
        PathInterpolator pathInterpolator = q0.f44751e;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            x0Var = new a1(l1Var);
        } else if (i10 >= 30) {
            x0Var = new z0(l1Var);
        } else if (i10 >= 29) {
            x0Var = new y0(l1Var);
        } else {
            x0Var = new x0(l1Var);
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.d & i11) == 0) {
                x0Var.c(i11, i1Var.f(i11));
            } else {
                i0.c f7 = i1Var.f(i11);
                i0.c f10 = this.f44743c.f44740a.f(i11);
                float f11 = 1.0f - b10;
                x0Var.c(i11, l1.e(f7, (int) (((f7.f11451a - f10.f11451a) * f11) + 0.5d), (int) (((f7.f11452b - f10.f11452b) * f11) + 0.5d), (int) (((f7.f11453c - f10.f11453c) * f11) + 0.5d), (int) (((f7.d - f10.d) * f11) + 0.5d)));
            }
        }
        q0.g(this.f44744e, x0Var.b(), Collections.singletonList(v0Var));
    }
}
