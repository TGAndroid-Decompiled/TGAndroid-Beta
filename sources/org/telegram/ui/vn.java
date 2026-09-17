package org.telegram.ui;

import android.animation.ValueAnimator;
public final class vn implements ValueAnimator.AnimatorUpdateListener {
    public final int f38477a;
    public final org.telegram.ui.Components.cc0 f38478b;

    public vn(org.telegram.ui.Components.cc0 cc0Var, int i10) {
        this.f38477a = i10;
        this.f38478b = cc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38477a) {
            case 0:
                this.f38478b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f38478b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f38478b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
