package org.telegram.ui;

import android.animation.ValueAnimator;
public final class xy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51841a;
    public final az0 f51842b;

    public xy0(az0 az0Var, int i7) {
        this.f51841a = i7;
        this.f51842b = az0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51841a) {
            case 0:
                az0 az0Var = this.f51842b;
                az0Var.getClass();
                az0Var.f43847e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                az0Var.g();
                return;
            case 1:
                az0 az0Var2 = this.f51842b;
                az0Var2.getClass();
                az0Var2.f43847e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                az0Var2.g();
                return;
            default:
                az0 az0Var3 = this.f51842b;
                az0Var3.getClass();
                az0Var3.f43847e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                az0Var3.g();
                return;
        }
    }
}
