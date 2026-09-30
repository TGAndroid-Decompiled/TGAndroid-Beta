package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qn implements ValueAnimator.AnimatorUpdateListener {
    public final int f37048a;
    public final org.telegram.ui.Components.pc0 f37049b;

    public qn(org.telegram.ui.Components.pc0 pc0Var, int i10) {
        this.f37048a = i10;
        this.f37049b = pc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37048a) {
            case 0:
                this.f37049b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37049b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f37049b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
