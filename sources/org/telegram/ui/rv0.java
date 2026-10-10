package org.telegram.ui;

import android.animation.ValueAnimator;
public final class rv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41569a;
    public final aw0 f41570b;

    public rv0(aw0 aw0Var, int i10) {
        this.f41569a = i10;
        this.f41570b = aw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41569a) {
            case 0:
                aw0 aw0Var = this.f41570b;
                aw0Var.getClass();
                aw0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                aw0 aw0Var2 = this.f41570b;
                aw0Var2.getClass();
                aw0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
