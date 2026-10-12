package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yn implements ValueAnimator.AnimatorUpdateListener {
    public final int f42194a;
    public final org.telegram.ui.Components.cd0 f42195b;

    public yn(org.telegram.ui.Components.cd0 cd0Var, int i10) {
        this.f42194a = i10;
        this.f42195b = cd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42194a) {
            case 0:
                this.f42195b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f42195b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f42195b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
