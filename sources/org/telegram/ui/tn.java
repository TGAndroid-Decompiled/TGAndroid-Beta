package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tn implements ValueAnimator.AnimatorUpdateListener {
    public final int f42030a;
    public final org.telegram.ui.Components.cd0 f42031b;

    public tn(org.telegram.ui.Components.cd0 cd0Var, int i10) {
        this.f42030a = i10;
        this.f42031b = cd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42030a) {
            case 0:
                this.f42031b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f42031b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f42031b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
