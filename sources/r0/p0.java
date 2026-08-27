package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

public final class p0 implements ValueAnimator.AnimatorUpdateListener {

    public final w0 f46620a;

    public final m1 f46621b;

    public final m1 f46622c;
    public final int d;

    public final View f46623e;

    public p0(w0 w0Var, m1 m1Var, m1 m1Var2, int i10, View view) {
        this.f46620a = w0Var;
        this.f46621b = m1Var;
        this.f46622c = m1Var2;
        this.d = i10;
        this.f46623e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c1 z0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        w0 w0Var = this.f46620a;
        v0 v0Var = w0Var.f46646a;
        v0Var.d(animatedFraction);
        m1 m1Var = this.f46621b;
        j1 j1Var = m1Var.f46619a;
        float fB = v0Var.b();
        PathInterpolator pathInterpolator = r0.f46630e;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            z0Var = new b1(m1Var);
        } else if (i10 >= 30) {
            z0Var = new a1(m1Var);
        } else {
            z0Var = i10 >= 29 ? new z0(m1Var) : new y0(m1Var);
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.d & i11) == 0) {
                z0Var.c(i11, j1Var.f(i11));
            } else {
                i0.c cVarF = j1Var.f(i11);
                i0.c cVarF2 = this.f46622c.f46619a.f(i11);
                float f10 = 1.0f - fB;
                z0Var.c(i11, m1.e(cVarF, (int) (((double) ((cVarF.f10489a - cVarF2.f10489a) * f10)) + 0.5d), (int) (((double) ((cVarF.f10490b - cVarF2.f10490b) * f10)) + 0.5d), (int) (((double) ((cVarF.f10491c - cVarF2.f10491c) * f10)) + 0.5d), (int) (((double) ((cVarF.d - cVarF2.d) * f10)) + 0.5d)));
            }
        }
        r0.g(this.f46623e, z0Var.b(), Collections.singletonList(w0Var));
    }
}
