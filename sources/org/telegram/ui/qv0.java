package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41269a;
    public final zv0 f41270b;

    public qv0(zv0 zv0Var, int i10) {
        this.f41269a = i10;
        this.f41270b = zv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41269a) {
            case 0:
                zv0 zv0Var = this.f41270b;
                zv0Var.getClass();
                zv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                zv0 zv0Var2 = this.f41270b;
                zv0Var2.getClass();
                zv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
