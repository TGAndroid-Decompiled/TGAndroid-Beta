package org.telegram.ui;

import android.animation.ValueAnimator;
public final class u3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41848a;
    public final x3 f41849b;

    public u3(x3 x3Var, int i10) {
        this.f41848a = i10;
        this.f41849b = x3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41848a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3 x3Var = this.f41849b;
                x3Var.I = floatValue;
                x3Var.f42971c.invalidate();
                x3Var.i();
                x3Var.h();
                return;
            case 1:
                x3 x3Var2 = this.f41849b;
                x3Var2.getClass();
                x3Var2.f42976w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var2.n();
                x3Var2.i();
                x3Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3 x3Var3 = this.f41849b;
                x3Var3.f42977x = floatValue2;
                if (!x3Var3.f42973n) {
                    x3Var3.n();
                }
                x3Var3.i();
                x3Var3.h();
                return;
        }
    }
}
