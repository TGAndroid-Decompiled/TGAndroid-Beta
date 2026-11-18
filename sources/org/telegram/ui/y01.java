package org.telegram.ui;

import android.animation.ValueAnimator;
public final class y01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f53986a;
    public final b11 f53987b;

    public y01(b11 b11Var, int i7) {
        this.f53986a = i7;
        this.f53987b = b11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53986a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11 b11Var = this.f53987b;
                b11Var.O = floatValue;
                b11Var.W.f51438i0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11 b11Var2 = this.f53987b;
                b11Var2.O = floatValue2;
                b11Var2.W.f51438i0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11 b11Var3 = this.f53987b;
                b11Var3.O = floatValue3;
                b11Var3.W.f51438i0.invalidate();
                return;
        }
    }
}
