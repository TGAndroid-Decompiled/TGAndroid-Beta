package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yn implements ValueAnimator.AnimatorUpdateListener {
    public final int f41852a;
    public final org.telegram.ui.Components.cd0 f41853b;

    public yn(org.telegram.ui.Components.cd0 cd0Var, int i10) {
        this.f41852a = i10;
        this.f41853b = cd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41852a) {
            case 0:
                this.f41853b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f41853b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f41853b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
