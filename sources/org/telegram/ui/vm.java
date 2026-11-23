package org.telegram.ui;

import android.animation.ValueAnimator;
public final class vm implements ValueAnimator.AnimatorUpdateListener {
    public final int f52849a;
    public final org.telegram.ui.Components.cb0 f52850b;

    public vm(org.telegram.ui.Components.cb0 cb0Var, int i7) {
        this.f52849a = i7;
        this.f52850b = cb0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52849a) {
            case 0:
                this.f52850b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f52850b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f52850b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
