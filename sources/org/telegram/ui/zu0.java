package org.telegram.ui;

import android.animation.ValueAnimator;
public final class zu0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44210a;
    public final iv0 f44211b;

    public zu0(iv0 iv0Var, int i10) {
        this.f44210a = i10;
        this.f44211b = iv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44210a) {
            case 0:
                iv0 iv0Var = this.f44211b;
                iv0Var.getClass();
                iv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                iv0 iv0Var2 = this.f44211b;
                iv0Var2.getClass();
                iv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
