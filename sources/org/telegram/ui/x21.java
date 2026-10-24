package org.telegram.ui;

import android.animation.ValueAnimator;
public final class x21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43458a;
    public final a31 f43459b;

    public x21(a31 a31Var, int i10) {
        this.f43458a = i10;
        this.f43459b = a31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43458a) {
            case 0:
                a31 a31Var = this.f43459b;
                a31Var.getClass();
                a31Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a31Var.g();
                return;
            case 1:
                a31 a31Var2 = this.f43459b;
                a31Var2.getClass();
                a31Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a31Var2.g();
                return;
            default:
                a31 a31Var3 = this.f43459b;
                a31Var3.getClass();
                a31Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a31Var3.g();
                return;
        }
    }
}
