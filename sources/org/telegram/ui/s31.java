package org.telegram.ui;

import android.animation.ValueAnimator;
public final class s31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41125a;
    public final v31 f41126b;

    public s31(v31 v31Var, int i10) {
        this.f41125a = i10;
        this.f41126b = v31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41125a) {
            case 0:
                v31 v31Var = this.f41126b;
                v31Var.getClass();
                v31Var.f42113e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var.g();
                return;
            case 1:
                v31 v31Var2 = this.f41126b;
                v31Var2.getClass();
                v31Var2.f42113e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var2.g();
                return;
            default:
                v31 v31Var3 = this.f41126b;
                v31Var3.getClass();
                v31Var3.f42113e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var3.g();
                return;
        }
    }
}
