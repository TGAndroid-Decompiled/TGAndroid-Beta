package org.telegram.ui;

import android.animation.ValueAnimator;
public final class y21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43704a;
    public final b31 f43705b;

    public y21(b31 b31Var, int i10) {
        this.f43704a = i10;
        this.f43705b = b31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43704a) {
            case 0:
                b31 b31Var = this.f43705b;
                b31Var.getClass();
                b31Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b31Var.g();
                return;
            case 1:
                b31 b31Var2 = this.f43705b;
                b31Var2.getClass();
                b31Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b31Var2.g();
                return;
            default:
                b31 b31Var3 = this.f43705b;
                b31Var3.getClass();
                b31Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b31Var3.g();
                return;
        }
    }
}
