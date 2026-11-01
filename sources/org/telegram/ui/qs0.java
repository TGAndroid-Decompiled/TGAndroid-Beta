package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qs0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40890a;
    public final zs0 f40891b;

    public qs0(zs0 zs0Var, int i10) {
        this.f40890a = i10;
        this.f40891b = zs0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40890a) {
            case 0:
                zs0 zs0Var = this.f40891b;
                zs0Var.getClass();
                zs0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                zs0 zs0Var2 = this.f40891b;
                zs0Var2.getClass();
                zs0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
