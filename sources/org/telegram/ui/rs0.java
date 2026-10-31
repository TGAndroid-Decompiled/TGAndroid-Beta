package org.telegram.ui;

import android.animation.ValueAnimator;
public final class rs0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41278a;
    public final at0 f41279b;

    public rs0(at0 at0Var, int i10) {
        this.f41278a = i10;
        this.f41279b = at0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41278a) {
            case 0:
                at0 at0Var = this.f41279b;
                at0Var.getClass();
                at0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                at0 at0Var2 = this.f41279b;
                at0Var2.getClass();
                at0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
