package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41370a;
    public final fw0 f41371b;

    public wv0(fw0 fw0Var, int i10) {
        this.f41370a = i10;
        this.f41371b = fw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41370a) {
            case 0:
                fw0 fw0Var = this.f41371b;
                fw0Var.getClass();
                fw0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                fw0 fw0Var2 = this.f41371b;
                fw0Var2.getClass();
                fw0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
