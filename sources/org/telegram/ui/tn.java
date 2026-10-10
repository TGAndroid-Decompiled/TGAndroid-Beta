package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tn implements ValueAnimator.AnimatorUpdateListener {
    public final int f42076a;
    public final org.telegram.ui.Components.dd0 f42077b;

    public tn(org.telegram.ui.Components.dd0 dd0Var, int i10) {
        this.f42076a = i10;
        this.f42077b = dd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42076a) {
            case 0:
                this.f42077b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f42077b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f42077b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
