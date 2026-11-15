package org.telegram.ui;

import android.animation.ValueAnimator;
public final class um implements ValueAnimator.AnimatorUpdateListener {
    public final int f51969a;
    public final org.telegram.ui.Components.ra0 f51970b;

    public um(org.telegram.ui.Components.ra0 ra0Var, int i7) {
        this.f51969a = i7;
        this.f51970b = ra0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51969a) {
            case 0:
                this.f51970b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f51970b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f51970b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
