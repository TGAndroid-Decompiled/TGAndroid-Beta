package org.telegram.ui;

import android.animation.ValueAnimator;
public final class um implements ValueAnimator.AnimatorUpdateListener {
    public final int f50430a;
    public final org.telegram.ui.Components.qa0 f50431b;

    public um(org.telegram.ui.Components.qa0 qa0Var, int i7) {
        this.f50430a = i7;
        this.f50431b = qa0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50430a) {
            case 0:
                this.f50431b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f50431b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f50431b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
