package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wm implements ValueAnimator.AnimatorUpdateListener {
    public final int f51394a;
    public final org.telegram.ui.Components.qa0 f51395b;

    public wm(org.telegram.ui.Components.qa0 qa0Var, int i7) {
        this.f51394a = i7;
        this.f51395b = qa0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51394a) {
            case 0:
                this.f51395b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f51395b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f51395b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
