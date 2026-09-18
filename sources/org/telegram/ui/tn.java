package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tn implements ValueAnimator.AnimatorUpdateListener {
    public final int f37779a;
    public final org.telegram.ui.Components.lc0 f37780b;

    public tn(org.telegram.ui.Components.lc0 lc0Var, int i10) {
        this.f37779a = i10;
        this.f37780b = lc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37779a) {
            case 0:
                this.f37780b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37780b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f37780b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
