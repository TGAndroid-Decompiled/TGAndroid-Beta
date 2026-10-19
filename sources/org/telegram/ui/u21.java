package org.telegram.ui;

import android.animation.ValueAnimator;
public final class u21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41789a;
    public final x21 f41790b;

    public u21(x21 x21Var, int i10) {
        this.f41789a = i10;
        this.f41790b = x21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41789a) {
            case 0:
                x21 x21Var = this.f41790b;
                x21Var.getClass();
                x21Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var.g();
                return;
            case 1:
                x21 x21Var2 = this.f41790b;
                x21Var2.getClass();
                x21Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var2.g();
                return;
            default:
                x21 x21Var3 = this.f41790b;
                x21Var3.getClass();
                x21Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var3.g();
                return;
        }
    }
}
