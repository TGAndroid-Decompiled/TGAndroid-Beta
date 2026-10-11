package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tn implements ValueAnimator.AnimatorUpdateListener {
    public final int f42211a;
    public final org.telegram.ui.Components.dd0 f42212b;

    public tn(org.telegram.ui.Components.dd0 dd0Var, int i10) {
        this.f42211a = i10;
        this.f42212b = dd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42211a) {
            case 0:
                this.f42212b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f42212b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f42212b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
