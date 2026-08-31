package org.telegram.ui;

import android.animation.ValueAnimator;
public final class rn implements ValueAnimator.AnimatorUpdateListener {
    public final int f40997a;
    public final org.telegram.ui.Components.fc0 f40998b;

    public rn(org.telegram.ui.Components.fc0 fc0Var, int i10) {
        this.f40997a = i10;
        this.f40998b = fc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40997a) {
            case 0:
                this.f40998b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f40998b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f40998b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
