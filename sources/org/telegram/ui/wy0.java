package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51503a;
    public final zy0 f51504b;

    public wy0(zy0 zy0Var, int i7) {
        this.f51503a = i7;
        this.f51504b = zy0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51503a) {
            case 0:
                zy0 zy0Var = this.f51504b;
                zy0Var.getClass();
                zy0Var.f52708e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy0Var.g();
                return;
            case 1:
                zy0 zy0Var2 = this.f51504b;
                zy0Var2.getClass();
                zy0Var2.f52708e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy0Var2.g();
                return;
            default:
                zy0 zy0Var3 = this.f51504b;
                zy0Var3.getClass();
                zy0Var3.f52708e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy0Var3.g();
                return;
        }
    }
}
