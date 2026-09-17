package org.telegram.ui;

import android.animation.ValueAnimator;
public final class sv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37557a;
    public final cw0 f37558b;

    public sv0(cw0 cw0Var, int i10) {
        this.f37557a = i10;
        this.f37558b = cw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37557a) {
            case 0:
                cw0 cw0Var = this.f37558b;
                cw0Var.getClass();
                cw0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                cw0 cw0Var2 = this.f37558b;
                cw0Var2.getClass();
                cw0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
