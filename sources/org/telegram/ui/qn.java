package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qn implements ValueAnimator.AnimatorUpdateListener {
    public final int f42752a;
    public final org.telegram.ui.Components.vc0 f42753b;

    public qn(org.telegram.ui.Components.vc0 vc0Var, int i10) {
        this.f42752a = i10;
        this.f42753b = vc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42752a) {
            case 0:
                this.f42753b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f42753b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f42753b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
