package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qn implements ValueAnimator.AnimatorUpdateListener {
    public final int f36946a;
    public final org.telegram.ui.Components.nc0 f36947b;

    public qn(org.telegram.ui.Components.nc0 nc0Var, int i10) {
        this.f36946a = i10;
        this.f36947b = nc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36946a) {
            case 0:
                this.f36947b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f36947b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f36947b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
