package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qm implements ValueAnimator.AnimatorUpdateListener {
    public final int f48913a;
    public final org.telegram.ui.Components.la0 f48914b;

    public qm(org.telegram.ui.Components.la0 la0Var, int i3) {
        this.f48913a = i3;
        this.f48914b = la0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48913a) {
            case 0:
                this.f48914b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f48914b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f48914b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
