package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wu0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42956a;
    public final fv0 f42957b;

    public wu0(fv0 fv0Var, int i10) {
        this.f42956a = i10;
        this.f42957b = fv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42956a) {
            case 0:
                fv0 fv0Var = this.f42957b;
                fv0Var.getClass();
                fv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                fv0 fv0Var2 = this.f42957b;
                fv0Var2.getClass();
                fv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
