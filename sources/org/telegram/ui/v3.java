package org.telegram.ui;

import android.animation.ValueAnimator;
public final class v3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39070a;
    public final y3 f39071b;

    public v3(y3 y3Var, int i10) {
        this.f39070a = i10;
        this.f39071b = y3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39070a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3 y3Var = this.f39071b;
                y3Var.F = floatValue;
                y3Var.f40366c.invalidate();
                y3Var.i();
                y3Var.h();
                return;
            case 1:
                y3 y3Var2 = this.f39071b;
                y3Var2.getClass();
                y3Var2.f40371w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var2.n();
                y3Var2.i();
                y3Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3 y3Var3 = this.f39071b;
                y3Var3.f40372x = floatValue2;
                if (!y3Var3.f40368n) {
                    y3Var3.n();
                }
                y3Var3.i();
                y3Var3.h();
                return;
        }
    }
}
