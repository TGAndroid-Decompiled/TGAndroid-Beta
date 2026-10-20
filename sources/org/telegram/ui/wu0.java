package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wu0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42961a;
    public final fv0 f42962b;

    public wu0(fv0 fv0Var, int i10) {
        this.f42961a = i10;
        this.f42962b = fv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42961a) {
            case 0:
                fv0 fv0Var = this.f42962b;
                fv0Var.getClass();
                fv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                fv0 fv0Var2 = this.f42962b;
                fv0Var2.getClass();
                fv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
