package org.telegram.ui;

import android.animation.ValueAnimator;
public final class rv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41523a;
    public final aw0 f41524b;

    public rv0(aw0 aw0Var, int i10) {
        this.f41523a = i10;
        this.f41524b = aw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41523a) {
            case 0:
                aw0 aw0Var = this.f41524b;
                aw0Var.getClass();
                aw0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                aw0 aw0Var2 = this.f41524b;
                aw0Var2.getClass();
                aw0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
