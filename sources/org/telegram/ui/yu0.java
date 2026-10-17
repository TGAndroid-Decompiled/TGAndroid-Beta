package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yu0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43487a;
    public final hv0 f43488b;

    public yu0(hv0 hv0Var, int i10) {
        this.f43487a = i10;
        this.f43488b = hv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43487a) {
            case 0:
                hv0 hv0Var = this.f43488b;
                hv0Var.getClass();
                hv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                hv0 hv0Var2 = this.f43488b;
                hv0Var2.getClass();
                hv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
