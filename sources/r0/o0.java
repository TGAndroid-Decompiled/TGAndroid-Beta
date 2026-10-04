package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final v0 f45610a;
    public final l1 f45611b;
    public final l1 f45612c;
    public final int d;
    public final View f45613e;

    public o0(v0 v0Var, l1 l1Var, l1 l1Var2, int i10, View view) {
        this.f45610a = v0Var;
        this.f45611b = l1Var;
        this.f45612c = l1Var2;
        this.d = i10;
        this.f45613e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        b1 x0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        v0 v0Var = this.f45610a;
        u0 u0Var = v0Var.f45636a;
        u0Var.d(animatedFraction);
        l1 l1Var = this.f45611b;
        i1 i1Var = l1Var.f45609a;
        float b10 = u0Var.b();
        PathInterpolator pathInterpolator = q0.f45620e;
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
                i0.b f10 = this.f45612c.f45609a.f(i11);
                float f11 = 1.0f - b10;
                x0Var.c(i11, l1.e(f7, (int) (((f7.f11525a - f10.f11525a) * f11) + 0.5d), (int) (((f7.f11526b - f10.f11526b) * f11) + 0.5d), (int) (((f7.f11527c - f10.f11527c) * f11) + 0.5d), (int) (((f7.d - f10.d) * f11) + 0.5d)));
            }
        }
        q0.g(this.f45613e, x0Var.b(), Collections.singletonList(v0Var));
    }
}
