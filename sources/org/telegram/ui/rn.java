package org.telegram.ui;

import android.animation.ValueAnimator;
public final class rn implements ValueAnimator.AnimatorUpdateListener {
    public final int f36897a;
    public final org.telegram.ui.Components.bc0 f36898b;

    public rn(org.telegram.ui.Components.bc0 bc0Var, int i10) {
        this.f36897a = i10;
        this.f36898b = bc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36897a) {
            case 0:
                this.f36898b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f36898b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f36898b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
