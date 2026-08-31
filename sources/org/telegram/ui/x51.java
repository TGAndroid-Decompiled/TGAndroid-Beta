package org.telegram.ui;

import android.animation.ValueAnimator;
public final class x51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42976a;
    public final a61 f42977b;

    public x51(a61 a61Var, int i10) {
        this.f42976a = i10;
        this.f42977b = a61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42976a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a61 a61Var = this.f42977b;
                a61Var.K = floatValue;
                a61Var.S.f40791e0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a61 a61Var2 = this.f42977b;
                a61Var2.K = floatValue2;
                a61Var2.S.f40791e0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a61 a61Var3 = this.f42977b;
                a61Var3.K = floatValue3;
                a61Var3.S.f40791e0.invalidate();
                return;
        }
    }
}
