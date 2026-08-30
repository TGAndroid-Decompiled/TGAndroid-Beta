package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wu0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39796a;
    public final fv0 f39797b;

    public wu0(fv0 fv0Var, int i10) {
        this.f39796a = i10;
        this.f39797b = fv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39796a) {
            case 0:
                fv0 fv0Var = this.f39797b;
                fv0Var.getClass();
                fv0Var.O.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                fv0 fv0Var2 = this.f39797b;
                fv0Var2.getClass();
                fv0Var2.O.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
