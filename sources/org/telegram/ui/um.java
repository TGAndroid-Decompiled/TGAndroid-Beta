package org.telegram.ui;

import android.animation.ValueAnimator;
public final class um implements ValueAnimator.AnimatorUpdateListener {
    public final int f50452a;
    public final org.telegram.ui.Components.qa0 f50453b;

    public um(org.telegram.ui.Components.qa0 qa0Var, int i7) {
        this.f50452a = i7;
        this.f50453b = qa0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50452a) {
            case 0:
                this.f50453b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f50453b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f50453b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
