package org.telegram.ui;

import android.animation.ValueAnimator;
public final class x31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39837a;
    public final a41 f39838b;

    public x31(a41 a41Var, int i10) {
        this.f39837a = i10;
        this.f39838b = a41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39837a) {
            case 0:
                a41 a41Var = this.f39838b;
                a41Var.getClass();
                a41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a41Var.g();
                return;
            case 1:
                a41 a41Var2 = this.f39838b;
                a41Var2.getClass();
                a41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a41Var2.g();
                return;
            default:
                a41 a41Var3 = this.f39838b;
                a41Var3.getClass();
                a41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a41Var3.g();
                return;
        }
    }
}
