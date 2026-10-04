package org.telegram.ui;

import android.animation.ValueAnimator;
public final class sn implements ValueAnimator.AnimatorUpdateListener {
    public final int f40539a;
    public final org.telegram.ui.Components.pc0 f40540b;

    public sn(org.telegram.ui.Components.pc0 pc0Var, int i10) {
        this.f40539a = i10;
        this.f40540b = pc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40539a) {
            case 0:
                this.f40540b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f40540b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f40540b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
