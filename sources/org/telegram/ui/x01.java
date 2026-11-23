package org.telegram.ui;

import android.animation.ValueAnimator;
public final class x01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f53820a;
    public final a11 f53821b;

    public x01(a11 a11Var, int i7) {
        this.f53820a = i7;
        this.f53821b = a11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53820a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11 a11Var = this.f53821b;
                a11Var.O = floatValue;
                a11Var.W.f51247i0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11 a11Var2 = this.f53821b;
                a11Var2.O = floatValue2;
                a11Var2.W.f51247i0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11 a11Var3 = this.f53821b;
                a11Var3.O = floatValue3;
                a11Var3.W.f51247i0.invalidate();
                return;
        }
    }
}
