package org.telegram.ui;

import android.animation.ValueAnimator;
public final class vm implements ValueAnimator.AnimatorUpdateListener {
    public final int f52813a;
    public final org.telegram.ui.Components.bb0 f52814b;

    public vm(org.telegram.ui.Components.bb0 bb0Var, int i7) {
        this.f52813a = i7;
        this.f52814b = bb0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52813a) {
            case 0:
                this.f52814b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f52814b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f52814b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
