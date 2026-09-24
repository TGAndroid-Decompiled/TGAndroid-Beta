package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qn implements ValueAnimator.AnimatorUpdateListener {
    public final int f36932a;
    public final org.telegram.ui.Components.mc0 f36933b;

    public qn(org.telegram.ui.Components.mc0 mc0Var, int i10) {
        this.f36932a = i10;
        this.f36933b = mc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36932a) {
            case 0:
                this.f36933b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f36933b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f36933b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
