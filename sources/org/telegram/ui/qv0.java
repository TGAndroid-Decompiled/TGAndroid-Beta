package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36945a;
    public final aw0 f36946b;

    public qv0(aw0 aw0Var, int i10) {
        this.f36945a = i10;
        this.f36946b = aw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36945a) {
            case 0:
                aw0 aw0Var = this.f36946b;
                aw0Var.getClass();
                aw0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                aw0 aw0Var2 = this.f36946b;
                aw0Var2.getClass();
                aw0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
