package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wu0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42965a;
    public final fv0 f42966b;

    public wu0(fv0 fv0Var, int i10) {
        this.f42965a = i10;
        this.f42966b = fv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42965a) {
            case 0:
                fv0 fv0Var = this.f42966b;
                fv0Var.getClass();
                fv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                fv0 fv0Var2 = this.f42966b;
                fv0Var2.getClass();
                fv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
