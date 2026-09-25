package org.telegram.ui;

import android.animation.ValueAnimator;
public final class s3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37580a;
    public final v3 f37581b;

    public s3(v3 v3Var, int i10) {
        this.f37580a = i10;
        this.f37581b = v3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37580a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var = this.f37581b;
                v3Var.I = floatValue;
                v3Var.f38621c.invalidate();
                v3Var.i();
                v3Var.h();
                return;
            case 1:
                v3 v3Var2 = this.f37581b;
                v3Var2.getClass();
                v3Var2.f38626w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var2.n();
                v3Var2.i();
                v3Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var3 = this.f37581b;
                v3Var3.f38627x = floatValue2;
                if (!v3Var3.f38623n) {
                    v3Var3.n();
                }
                v3Var3.i();
                v3Var3.h();
                return;
        }
    }
}
