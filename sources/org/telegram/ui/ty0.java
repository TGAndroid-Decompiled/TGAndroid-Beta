package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ty0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50178a;
    public final wy0 f50179b;

    public ty0(wy0 wy0Var, int i7) {
        this.f50178a = i7;
        this.f50179b = wy0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50178a) {
            case 0:
                wy0 wy0Var = this.f50179b;
                wy0Var.getClass();
                wy0Var.f51680e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy0Var.g();
                return;
            case 1:
                wy0 wy0Var2 = this.f50179b;
                wy0Var2.getClass();
                wy0Var2.f51680e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy0Var2.g();
                return;
            default:
                wy0 wy0Var3 = this.f50179b;
                wy0Var3.getClass();
                wy0Var3.f51680e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy0Var3.g();
                return;
        }
    }
}
