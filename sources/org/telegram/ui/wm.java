package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wm implements ValueAnimator.AnimatorUpdateListener {
    public final int f51430a;
    public final org.telegram.ui.Components.ra0 f51431b;

    public wm(org.telegram.ui.Components.ra0 ra0Var, int i7) {
        this.f51430a = i7;
        this.f51431b = ra0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51430a) {
            case 0:
                this.f51431b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f51431b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f51431b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
