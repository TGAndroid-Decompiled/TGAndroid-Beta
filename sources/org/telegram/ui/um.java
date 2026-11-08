package org.telegram.ui;

import android.animation.ValueAnimator;
public final class um implements ValueAnimator.AnimatorUpdateListener {
    public final int f50374a;
    public final org.telegram.ui.Components.qa0 f50375b;

    public um(org.telegram.ui.Components.qa0 qa0Var, int i7) {
        this.f50374a = i7;
        this.f50375b = qa0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50374a) {
            case 0:
                this.f50375b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f50375b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f50375b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
