package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tn implements ValueAnimator.AnimatorUpdateListener {
    public final int f38553a;
    public final org.telegram.ui.Components.ec0 f38554b;

    public tn(org.telegram.ui.Components.ec0 ec0Var, int i10) {
        this.f38553a = i10;
        this.f38554b = ec0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38553a) {
            case 0:
                this.f38554b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f38554b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f38554b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
