package org.telegram.ui;

import android.animation.ValueAnimator;
public final class vm implements ValueAnimator.AnimatorUpdateListener {
    public final int f52984a;
    public final org.telegram.ui.Components.za0 f52985b;

    public vm(org.telegram.ui.Components.za0 za0Var, int i7) {
        this.f52984a = i7;
        this.f52985b = za0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52984a) {
            case 0:
                this.f52985b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f52985b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f52985b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
