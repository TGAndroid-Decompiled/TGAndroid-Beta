package org.telegram.ui;

import android.animation.ValueAnimator;
public final class v51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39083a;
    public final y51 f39084b;

    public v51(y51 y51Var, int i10) {
        this.f39083a = i10;
        this.f39084b = y51Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39083a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y51 y51Var = this.f39084b;
                y51Var.K = floatValue;
                y51Var.S.f37605e0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y51 y51Var2 = this.f39084b;
                y51Var2.K = floatValue2;
                y51Var2.S.f37605e0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y51 y51Var3 = this.f39084b;
                y51Var3.K = floatValue3;
                y51Var3.S.f37605e0.invalidate();
                return;
        }
    }
}
