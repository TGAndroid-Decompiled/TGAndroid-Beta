package org.telegram.ui;

import android.animation.ValueAnimator;
public final class rn implements ValueAnimator.AnimatorUpdateListener {
    public final int f37160a;
    public final org.telegram.ui.Components.nc0 f37161b;

    public rn(org.telegram.ui.Components.nc0 nc0Var, int i10) {
        this.f37160a = i10;
        this.f37161b = nc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37160a) {
            case 0:
                this.f37161b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37161b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f37161b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
