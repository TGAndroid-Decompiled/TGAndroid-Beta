package org.telegram.ui;

import android.animation.ValueAnimator;
public final class x61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41763a;
    public final a71 f41764b;

    public x61(a71 a71Var, int i10) {
        this.f41763a = i10;
        this.f41764b = a71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41763a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a71 a71Var = this.f41764b;
                a71Var.N = floatValue;
                a71Var.V.f39637h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a71 a71Var2 = this.f41764b;
                a71Var2.N = floatValue2;
                a71Var2.V.f39637h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a71 a71Var3 = this.f41764b;
                a71Var3.N = floatValue3;
                a71Var3.V.f39637h0.invalidate();
                return;
        }
    }
}
