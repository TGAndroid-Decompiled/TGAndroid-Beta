package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tn implements ValueAnimator.AnimatorUpdateListener {
    public final int f37854a;
    public final org.telegram.ui.Components.nc0 f37855b;

    public tn(org.telegram.ui.Components.nc0 nc0Var, int i10) {
        this.f37854a = i10;
        this.f37855b = nc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37854a) {
            case 0:
                this.f37855b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37855b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f37855b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
