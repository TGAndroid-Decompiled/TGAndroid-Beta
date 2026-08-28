package org.telegram.ui;

import android.animation.ValueAnimator;
public final class v3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43372a;
    public final y3 f43373b;

    public v3(y3 y3Var, int i9) {
        this.f43372a = i9;
        this.f43373b = y3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43372a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3 y3Var = this.f43373b;
                y3Var.E = floatValue;
                y3Var.f44700c.invalidate();
                y3Var.i();
                y3Var.h();
                return;
            case 1:
                y3 y3Var2 = this.f43373b;
                y3Var2.getClass();
                y3Var2.f44706w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var2.n();
                y3Var2.i();
                y3Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3 y3Var3 = this.f43373b;
                y3Var3.f44707x = floatValue2;
                if (!y3Var3.f44703n) {
                    y3Var3.n();
                }
                y3Var3.i();
                y3Var3.h();
                return;
        }
    }
}
