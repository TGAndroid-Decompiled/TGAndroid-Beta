package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36241a;
    public final u61 f36242b;

    public r61(u61 u61Var, int i10) {
        this.f36241a = i10;
        this.f36242b = u61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36241a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u61 u61Var = this.f36242b;
                u61Var.N = floatValue;
                u61Var.V.f34570h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u61 u61Var2 = this.f36242b;
                u61Var2.N = floatValue2;
                u61Var2.V.f34570h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u61 u61Var3 = this.f36242b;
                u61Var3.N = floatValue3;
                u61Var3.V.f34570h0.invalidate();
                return;
        }
    }
}
