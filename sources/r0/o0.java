package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final v0 f56272a;
    public final l1 f56273b;
    public final l1 f56274c;
    public final int d;
    public final View f56275e;

    public o0(v0 v0Var, l1 l1Var, l1 l1Var2, int i7, View view) {
        this.f56272a = v0Var;
        this.f56273b = l1Var;
        this.f56274c = l1Var2;
        this.d = i7;
        this.f56275e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a1 w0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        v0 v0Var = this.f56272a;
        u0 u0Var = v0Var.f56296a;
        u0Var.d(animatedFraction);
        l1 l1Var = this.f56273b;
        i1 i1Var = l1Var.f56268a;
        float b10 = u0Var.b();
        PathInterpolator pathInterpolator = q0.f56279e;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            w0Var = new z0(l1Var);
        } else if (i7 >= 30) {
            w0Var = new y0(l1Var);
        } else if (i7 >= 29) {
            w0Var = new x0(l1Var);
        } else {
            w0Var = new w0(l1Var);
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((this.d & i10) == 0) {
                w0Var.c(i10, i1Var.f(i10));
            } else {
                i0.b f10 = i1Var.f(i10);
                i0.b f11 = this.f56274c.f56268a.f(i10);
                float f12 = 1.0f - b10;
                w0Var.c(i10, l1.e(f10, (int) (((f10.f15883a - f11.f15883a) * f12) + 0.5d), (int) (((f10.f15884b - f11.f15884b) * f12) + 0.5d), (int) (((f10.f15885c - f11.f15885c) * f12) + 0.5d), (int) (((f10.d - f11.d) * f12) + 0.5d)));
            }
        }
        q0.g(this.f56275e, w0Var.b(), Collections.singletonList(v0Var));
    }
}
