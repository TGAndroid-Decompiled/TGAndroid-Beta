package org.telegram.ui;

import android.animation.ValueAnimator;
public final class u01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51713a;
    public final x01 f51714b;

    public u01(x01 x01Var, int i7) {
        this.f51713a = i7;
        this.f51714b = x01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51713a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x01 x01Var = this.f51714b;
                x01Var.O = floatValue;
                x01Var.W.f49385i0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x01 x01Var2 = this.f51714b;
                x01Var2.O = floatValue2;
                x01Var2.W.f49385i0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x01 x01Var3 = this.f51714b;
                x01Var3.O = floatValue3;
                x01Var3.W.f49385i0.invalidate();
                return;
        }
    }
}
