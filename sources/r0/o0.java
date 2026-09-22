package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final v0 f41852a;
    public final l1 f41853b;
    public final l1 f41854c;
    public final int d;
    public final View e;

    public o0(v0 v0Var, l1 l1Var, l1 l1Var2, int i10, View view) {
        this.f41852a = v0Var;
        this.f41853b = l1Var;
        this.f41854c = l1Var2;
        this.d = i10;
        this.e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        b1 x0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        v0 v0Var = this.f41852a;
        u0 u0Var = v0Var.f41874a;
        u0Var.d(animatedFraction);
        l1 l1Var = this.f41853b;
        i1 i1Var = l1Var.f41851a;
        float b10 = u0Var.b();
        PathInterpolator pathInterpolator = q0.e;
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
                i0.b f7 = i1Var.f(i11);
                i0.b f10 = this.f41854c.f41851a.f(i11);
                float f11 = 1.0f - b10;
                x0Var.c(i11, l1.e(f7, (int) (((f7.f10590a - f10.f10590a) * f11) + 0.5d), (int) (((f7.f10591b - f10.f10591b) * f11) + 0.5d), (int) (((f7.f10592c - f10.f10592c) * f11) + 0.5d), (int) (((f7.d - f10.d) * f11) + 0.5d)));
            }
        }
        q0.g(this.e, x0Var.b(), Collections.singletonList(v0Var));
    }
}
