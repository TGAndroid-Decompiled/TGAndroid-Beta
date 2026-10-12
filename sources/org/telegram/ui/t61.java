package org.telegram.ui;

import android.animation.ValueAnimator;
public final class t61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42110a;
    public final w61 f42111b;

    public t61(w61 w61Var, int i10) {
        this.f42110a = i10;
        this.f42111b = w61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42110a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61 w61Var = this.f42111b;
                w61Var.N = floatValue;
                w61Var.V.f40275h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61 w61Var2 = this.f42111b;
                w61Var2.N = floatValue2;
                w61Var2.V.f40275h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61 w61Var3 = this.f42111b;
                w61Var3.N = floatValue3;
                w61Var3.V.f40275h0.invalidate();
                return;
        }
    }
}
