package org.telegram.ui;

import android.animation.ValueAnimator;
public final class w21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42333a;
    public final z21 f42334b;

    public w21(z21 z21Var, int i10) {
        this.f42333a = i10;
        this.f42334b = z21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42333a) {
            case 0:
                z21 z21Var = this.f42334b;
                z21Var.getClass();
                z21Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z21Var.g();
                return;
            case 1:
                z21 z21Var2 = this.f42334b;
                z21Var2.getClass();
                z21Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z21Var2.g();
                return;
            default:
                z21 z21Var3 = this.f42334b;
                z21Var3.getClass();
                z21Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z21Var3.g();
                return;
        }
    }
}
