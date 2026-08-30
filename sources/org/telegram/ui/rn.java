package org.telegram.ui;

import android.animation.ValueAnimator;
public final class rn implements ValueAnimator.AnimatorUpdateListener {
    public final int f38085a;
    public final org.telegram.ui.Components.dc0 f38086b;

    public rn(org.telegram.ui.Components.dc0 dc0Var, int i10) {
        this.f38085a = i10;
        this.f38086b = dc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38085a) {
            case 0:
                this.f38086b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f38086b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f38086b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
