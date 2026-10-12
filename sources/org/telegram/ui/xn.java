package org.telegram.ui;

import android.animation.ValueAnimator;
public final class xn implements ValueAnimator.AnimatorUpdateListener {
    public final int f44048a;
    public final org.telegram.ui.Components.gd0 f44049b;

    public xn(org.telegram.ui.Components.gd0 gd0Var, int i10) {
        this.f44048a = i10;
        this.f44049b = gd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44048a) {
            case 0:
                this.f44049b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f44049b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f44049b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
