package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tn implements ValueAnimator.AnimatorUpdateListener {
    public final int f42245a;
    public final org.telegram.ui.Components.cd0 f42246b;

    public tn(org.telegram.ui.Components.cd0 cd0Var, int i10) {
        this.f42245a = i10;
        this.f42246b = cd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42245a) {
            case 0:
                this.f42246b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f42246b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f42246b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
