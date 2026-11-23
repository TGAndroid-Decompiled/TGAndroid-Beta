package org.telegram.ui;

import android.animation.ValueAnimator;
public final class uy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52759a;
    public final xy0 f52760b;

    public uy0(xy0 xy0Var, int i7) {
        this.f52759a = i7;
        this.f52760b = xy0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52759a) {
            case 0:
                xy0 xy0Var = this.f52760b;
                xy0Var.getClass();
                xy0Var.f54122e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xy0Var.g();
                return;
            case 1:
                xy0 xy0Var2 = this.f52760b;
                xy0Var2.getClass();
                xy0Var2.f54122e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xy0Var2.g();
                return;
            default:
                xy0 xy0Var3 = this.f52760b;
                xy0Var3.getClass();
                xy0Var3.f54122e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xy0Var3.g();
                return;
        }
    }
}
