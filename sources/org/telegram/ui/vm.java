package org.telegram.ui;

import android.animation.ValueAnimator;
public final class vm implements ValueAnimator.AnimatorUpdateListener {
    public final int f52829a;
    public final org.telegram.ui.Components.cb0 f52830b;

    public vm(org.telegram.ui.Components.cb0 cb0Var, int i7) {
        this.f52829a = i7;
        this.f52830b = cb0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52829a) {
            case 0:
                this.f52830b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f52830b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f52830b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
