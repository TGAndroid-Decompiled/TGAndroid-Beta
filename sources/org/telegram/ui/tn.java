package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tn implements ValueAnimator.AnimatorUpdateListener {
    public final int f37853a;
    public final org.telegram.ui.Components.kc0 f37854b;

    public tn(org.telegram.ui.Components.kc0 kc0Var, int i10) {
        this.f37853a = i10;
        this.f37854b = kc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37853a) {
            case 0:
                this.f37854b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37854b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f37854b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
