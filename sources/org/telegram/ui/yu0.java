package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yu0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43477a;
    public final hv0 f43478b;

    public yu0(hv0 hv0Var, int i10) {
        this.f43477a = i10;
        this.f43478b = hv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43477a) {
            case 0:
                hv0 hv0Var = this.f43478b;
                hv0Var.getClass();
                hv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                hv0 hv0Var2 = this.f43478b;
                hv0Var2.getClass();
                hv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
