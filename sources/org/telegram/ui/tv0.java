package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42300a;
    public final cw0 f42301b;

    public tv0(cw0 cw0Var, int i10) {
        this.f42300a = i10;
        this.f42301b = cw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42300a) {
            case 0:
                cw0 cw0Var = this.f42301b;
                cw0Var.getClass();
                cw0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                cw0 cw0Var2 = this.f42301b;
                cw0Var2.getClass();
                cw0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
