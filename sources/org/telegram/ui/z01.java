package org.telegram.ui;

import android.animation.ValueAnimator;
public final class z01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f54358a;
    public final c11 f54359b;

    public z01(c11 c11Var, int i7) {
        this.f54358a = i7;
        this.f54359b = c11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54358a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11 c11Var = this.f54359b;
                c11Var.O = floatValue;
                c11Var.W.f51840i0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11 c11Var2 = this.f54359b;
                c11Var2.O = floatValue2;
                c11Var2.W.f51840i0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11 c11Var3 = this.f54359b;
                c11Var3.O = floatValue3;
                c11Var3.W.f51840i0.invalidate();
                return;
        }
    }
}
