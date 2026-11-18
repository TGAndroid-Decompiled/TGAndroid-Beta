package org.telegram.ui;

import android.animation.ValueAnimator;
public final class y01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f53954a;
    public final b11 f53955b;

    public y01(b11 b11Var, int i7) {
        this.f53954a = i7;
        this.f53955b = b11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53954a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11 b11Var = this.f53955b;
                b11Var.O = floatValue;
                b11Var.W.f51398i0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11 b11Var2 = this.f53955b;
                b11Var2.O = floatValue2;
                b11Var2.W.f51398i0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11 b11Var3 = this.f53955b;
                b11Var3.O = floatValue3;
                b11Var3.W.f51398i0.invalidate();
                return;
        }
    }
}
