package org.telegram.ui;

import android.animation.ValueAnimator;
public final class xv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41969a;
    public final gw0 f41970b;

    public xv0(gw0 gw0Var, int i10) {
        this.f41969a = i10;
        this.f41970b = gw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41969a) {
            case 0:
                gw0 gw0Var = this.f41970b;
                gw0Var.getClass();
                gw0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                gw0 gw0Var2 = this.f41970b;
                gw0Var2.getClass();
                gw0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
