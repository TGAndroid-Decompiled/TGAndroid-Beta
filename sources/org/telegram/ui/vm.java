package org.telegram.ui;

import android.animation.ValueAnimator;
public final class vm implements ValueAnimator.AnimatorUpdateListener {
    public final int f52803a;
    public final org.telegram.ui.Components.bb0 f52804b;

    public vm(org.telegram.ui.Components.bb0 bb0Var, int i7) {
        this.f52803a = i7;
        this.f52804b = bb0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52803a) {
            case 0:
                this.f52804b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f52804b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f52804b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
