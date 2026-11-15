package org.telegram.ui;

import android.animation.ValueAnimator;
public final class um implements ValueAnimator.AnimatorUpdateListener {
    public final int f51968a;
    public final org.telegram.ui.Components.ra0 f51969b;

    public um(org.telegram.ui.Components.ra0 ra0Var, int i7) {
        this.f51968a = i7;
        this.f51969b = ra0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51968a) {
            case 0:
                this.f51969b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f51969b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f51969b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
