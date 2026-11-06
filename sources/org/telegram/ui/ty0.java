package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ty0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50179a;
    public final wy0 f50180b;

    public ty0(wy0 wy0Var, int i7) {
        this.f50179a = i7;
        this.f50180b = wy0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50179a) {
            case 0:
                wy0 wy0Var = this.f50180b;
                wy0Var.getClass();
                wy0Var.f51682e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy0Var.g();
                return;
            case 1:
                wy0 wy0Var2 = this.f50180b;
                wy0Var2.getClass();
                wy0Var2.f51682e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy0Var2.g();
                return;
            default:
                wy0 wy0Var3 = this.f50180b;
                wy0Var3.getClass();
                wy0Var3.f51682e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy0Var3.g();
                return;
        }
    }
}
