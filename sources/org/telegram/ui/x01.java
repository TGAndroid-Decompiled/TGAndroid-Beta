package org.telegram.ui;

import android.animation.ValueAnimator;
public final class x01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51695a;
    public final a11 f51696b;

    public x01(a11 a11Var, int i7) {
        this.f51695a = i7;
        this.f51696b = a11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51695a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11 a11Var = this.f51696b;
                a11Var.N = floatValue;
                a11Var.V.f49008h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11 a11Var2 = this.f51696b;
                a11Var2.N = floatValue2;
                a11Var2.V.f49008h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11 a11Var3 = this.f51696b;
                a11Var3.N = floatValue3;
                a11Var3.V.f49008h0.invalidate();
                return;
        }
    }
}
