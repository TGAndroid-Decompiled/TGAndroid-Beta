package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wn implements ValueAnimator.AnimatorUpdateListener {
    public final int f42466a;
    public final org.telegram.ui.Components.dc0 f42467b;

    public wn(org.telegram.ui.Components.dc0 dc0Var, int i10) {
        this.f42466a = i10;
        this.f42467b = dc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42466a) {
            case 0:
                this.f42467b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f42467b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f42467b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
