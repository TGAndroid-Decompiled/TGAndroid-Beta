package org.telegram.ui;

import android.animation.ValueAnimator;
public final class v3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42108a;
    public final y3 f42109b;

    public v3(y3 y3Var, int i10) {
        this.f42108a = i10;
        this.f42109b = y3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42108a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3 y3Var = this.f42109b;
                y3Var.F = floatValue;
                y3Var.f43532c.invalidate();
                y3Var.i();
                y3Var.h();
                return;
            case 1:
                y3 y3Var2 = this.f42109b;
                y3Var2.getClass();
                y3Var2.f43538w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var2.n();
                y3Var2.i();
                y3Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3 y3Var3 = this.f42109b;
                y3Var3.f43539x = floatValue2;
                if (!y3Var3.f43535n) {
                    y3Var3.n();
                }
                y3Var3.i();
                y3Var3.h();
                return;
        }
    }
}
